/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.monster.controller;

import ec.edu.monster.model.Cuenta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author john_
 */
public class ConectCuenta {

    public boolean existeCuenta(String table, String field, String data) throws SQLException {
        boolean retorno = false;
        DBConnect connect = new DBConnect();
        String query;
        query = "SELECT * from " + table + " where " + field + " = ?";
        PreparedStatement state = connect.connect().prepareStatement(query);
        state.setString(1, data);
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
        query = "SELECT cuenta.* FROM cuenta ,cliente where cuenta.INT_CLIECODIGO=cliente.INT_CLIECODIGO and cliente.VCH_CLIECEDULA='" + cedula+"'";
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

    public static void main(String[] args) {
        ConectCuenta u = new ConectCuenta();
        try {
            //System.out.println("Respuesta");
            //System.out.println(u.existeCuenta("cuenta", "VCH_CUENNUMERO", "1234567890") + "");
            ArrayList<Cuenta> arrcuenta=u.obtenerListaCuentas("1723428304");
            for (Cuenta arg : arrcuenta) {
                System.out.println(arg.toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConectCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
