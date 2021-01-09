/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.monster.controller;

import ec.edu.monster.model.Cuenta;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author john_
 */
public class ConectCuenta {

    public boolean existeCuenta(String numCuenta) throws SQLException {
        boolean retorno = false;
        DBConnect connect = new DBConnect();
        String query;
        query = "SELECT * from cuenta where VCH_CUENNUMERO = ?";
        PreparedStatement state = connect.connect().prepareStatement(query);
        state.setString(1, numCuenta);
        ResultSet rs = state.executeQuery();
        Cuenta cuenta = null;
        int i = 0;
        while (rs.next()) {
            i++;
            if (i == 1) {
                rs.close();
                return true;
            }

        }
        rs.close();
        return retorno;

    }

    public ArrayList obtenerListaCuentas(String cedula) throws SQLException {
        DBConnect connect = new DBConnect();
        String query;
        query = "SELECT cuenta.* FROM cuenta ,cliente where cuenta.INT_CLIECODIGO=cliente.INT_CLIECODIGO and cliente.VCH_CLIECEDULA='" + cedula + "'";
        PreparedStatement state = connect.connect().prepareStatement(query);
        ResultSet rs = state.executeQuery();
        Cuenta tempcuenta;
        ArrayList<Cuenta> arrcuenta = new ArrayList();
        while (rs.next()) {
            tempcuenta = new Cuenta(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getFloat(5), rs.getDate(6));
            arrcuenta.add(tempcuenta);
        }
        rs.close();
        state.close();
        return arrcuenta;
    }

    public boolean haylosuficiente(String cuenta, float monto) {
        try {

            //If monto >
            float saldo = 0;
            DBConnect connect = new DBConnect();
            String query;
            query = "SELECT DEC_CUENSALDO from cuenta where VCH_CUENNUMERO='" + cuenta + "'";
            PreparedStatement state = connect.connect().prepareStatement(query);
            ResultSet rs = state.executeQuery();

            while (rs.next()) {
                saldo = rs.getFloat(1);
            }
            System.out.println(saldo + "");
            if (saldo <= monto) {
                return false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConectCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;

    }

    public boolean crearCuenta(String tipo, int cliente) {

        String numNew = "";
        for (int i = 0; i < 10; i++) {
            int numero = (int) (Math.random() * 10);
            numNew += numero + "";
        }

        try {
            DBConnect connect = new DBConnect();
            String query;
            PreparedStatement state;
            long millis = System.currentTimeMillis();
            java.sql.Date date = new java.sql.Date(millis);
            query = "INSERT INTO `cuenta` ( `INT_CLIECODIGO`, `VCH_CUENNUMERO`, `VCH_CUENTIPO`, `DEC_CUENSALDO`, `DTT_CUENFECHACREACION`) VALUES ( ?,?,?,?,?); ";
            state = connect.connect().prepareStatement(query);
            state.setInt(1, cliente);
            state.setString(2, numNew);
            state.setString(3, tipo);
            state.setFloat(4, 0);
            state.setDate(5, date);
            state.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ConectCuenta.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    public boolean hacerTransferencia(String cuenta1, String cuenta2, float monto) throws SQLException {
        //Se debe validar en cliente si existe la segunda cuenta
        return true;

    }

    public static void main(String[] args) throws SQLException {
        ConectCuenta u = new ConectCuenta();

        /*
        try {
            //System.out.println("Respuesta");
            //System.out.println(u.existeCuenta("cuenta", "VCH_CUENNUMERO", "1234567890") + "");
            ArrayList<Cuenta> arrcuenta = u.obtenerListaCuentas("1723428304");
            for (Cuenta arg : arrcuenta) {
                System.out.println(arg.toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConectCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
         */
 /*
        try {
            float n = 149.5f;
            System.out.println(u.haylosuficiente("1234567890", n) + "1");
        } catch (Exception ex) {
            Logger.getLogger(ConectCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        //System.out.println(u.crearCuenta("CORRIENTE", 1) + "");
        System.out.println(u.existeCuenta("1234567890") + "");
    }
}
