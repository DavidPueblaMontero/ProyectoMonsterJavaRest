/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.monster.controller;

import ec.edu.monster.model.Movimiento;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author john_
 */
public class ConectMovimiento {

    public ArrayList mostrarMovimientos(String numCuentaSeleccionada) throws SQLException {
        DBConnect connect = new DBConnect();
        String query;
        query = "SELECT * FROM movimiento m, cuenta c WHERE m.INT_CUENCODIGO=c.INT_CUENCODIGO and c.VCH_CUENNUMERO=" + numCuentaSeleccionada;
        PreparedStatement state = connect.connect().prepareStatement(query);
        ResultSet rs = state.executeQuery();
        Movimiento temporalMovimiento;
        ArrayList<Movimiento> movimiento = new ArrayList();

        while (rs.next()) {
            temporalMovimiento = new Movimiento(rs.getString("DTT_MOVIFECHA"), rs.getString("VCH_MOVITIPO"), rs.getFloat("DEC_MOVIVALOR"), rs.getFloat("DEC_MOVISALDOFINAL"), rs.getString("VCH_MOVICUENTORIG"), rs.getString("VCH_MOVICUENTDEST"));
            movimiento.add(temporalMovimiento);
        }
        rs.close();
        state.close();
        return movimiento;
    }

    public void transferenciaDinero(String ctaOrigen, String ctaDestino, float valor) throws SQLException {
        DBConnect connect = new DBConnect();

        float valorParaDebitar = 0.0f;
        int cuentaCodDebitar = 0;
        String cuentaDebitar = "SELECT * FROM cuenta c WHERE c.VCH_CUENNUMERO=" + ctaOrigen;
        PreparedStatement stateDebitar = connect.connect().prepareStatement(cuentaDebitar);
        ResultSet rsd = stateDebitar.executeQuery();
        while (rsd.next()) {
            valorParaDebitar = rsd.getFloat("DEC_CUENSALDO");
            cuentaCodDebitar = rsd.getInt("INT_CUENCODIGO");
        }

        float valorParaAcreditar = 0.0f;
        int cuentaCodAcreditar = 0;
        String cuentaAcreditar = "SELECT * FROM cuenta c WHERE c.VCH_CUENNUMERO=" + ctaDestino;
        PreparedStatement stateAcreditar = connect.connect().prepareStatement(cuentaAcreditar);
        ResultSet rsa = stateAcreditar.executeQuery();
        while (rsa.next()) {
            valorParaAcreditar = rsa.getFloat("DEC_CUENSALDO");
            cuentaCodAcreditar = rsa.getInt("INT_CUENCODIGO");
        }

        String debito = "UPDATE cuenta SET DEC_CUENSALDO=? where VCH_CUENNUMERO=" + ctaOrigen;
        PreparedStatement stateDebito = connect.connect().prepareStatement(debito);
        stateDebito.setFloat(1, valorParaDebitar - valor);
        stateDebito.executeUpdate();

        String acredito = "UPDATE cuenta SET DEC_CUENSALDO=? where VCH_CUENNUMERO=" + ctaDestino;
        PreparedStatement stateAcredito = connect.connect().prepareStatement(acredito);
        stateAcredito.setFloat(1, valorParaAcreditar + valor);
        stateAcredito.executeUpdate();

        //MOVIMIENTO
        Calendar c = Calendar.getInstance();//fecha actual

        String queryMovDebito = "INSERT INTO movimiento (INT_CUENCODIGO,DTT_MOVIFECHA,VCH_MOVITIPO,DEC_MOVIVALOR,DEC_MOVISALDOFINAL,VCH_MOVICUENTORIG,VCH_MOVICUENTDEST) values (?,?,?,?,?,?,?)";
        PreparedStatement stateMovDebito;
        stateMovDebito = connect.connect().prepareStatement(queryMovDebito);
        stateMovDebito.setInt(1, cuentaCodDebitar);
        stateMovDebito.setString(2, c.get(Calendar.YEAR) + "/" + (c.get(Calendar.MONTH) + 1) + "/" + c.get(Calendar.DATE));
        stateMovDebito.setString(3, "Débito");
        stateMovDebito.setFloat(4, valor);
        stateMovDebito.setFloat(5, valorParaDebitar - valor);
        stateMovDebito.setString(6, ctaOrigen);
        stateMovDebito.setString(7, ctaDestino);
        stateMovDebito.executeUpdate();

        String queryMovAcreditar = "INSERT INTO movimiento (INT_CUENCODIGO,DTT_MOVIFECHA,VCH_MOVITIPO,DEC_MOVIVALOR,DEC_MOVISALDOFINAL,VCH_MOVICUENTORIG,VCH_MOVICUENTDEST) values (?,?,?,?,?,?,?)";
        PreparedStatement stateMovAcreditar;
        stateMovAcreditar = connect.connect().prepareStatement(queryMovAcreditar);
        stateMovAcreditar.setInt(1, cuentaCodAcreditar);
        stateMovAcreditar.setString(2, c.get(Calendar.YEAR) + "/" + (c.get(Calendar.MONTH) + 1) + "/" + c.get(Calendar.DATE));
        stateMovAcreditar.setString(3, "Crédito");
        stateMovAcreditar.setFloat(4, valor);
        stateMovAcreditar.setFloat(5, valor + valorParaAcreditar);
        stateMovAcreditar.setString(6, ctaOrigen);
        stateMovAcreditar.setString(7, ctaDestino);
        stateMovAcreditar.executeUpdate();
    }

    public static void main(String[] args) {
        ConectMovimiento u = new ConectMovimiento();
        try {
            /*ArrayList<Movimiento> arrcuenta = u.mostrarMovimientos("4542513245");
            for (Movimiento arg : arrcuenta) {
                System.out.println(arg.toString());
            }

            String numNew = "";
            for (int i = 0; i < 10; i++) {
                int numero = (int) (Math.random() * 10);
                numNew += numero + "";
            }

            System.out.println(numNew);*/
            
            u.transferenciaDinero("4542513245", "4564564325", 10);
            
            

        } catch (SQLException ex) {
            Logger.getLogger(ConectCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
