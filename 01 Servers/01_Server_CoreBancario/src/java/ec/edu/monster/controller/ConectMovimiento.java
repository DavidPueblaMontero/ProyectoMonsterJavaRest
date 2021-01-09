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
import java.util.ArrayList;

/**
 *
 * @author john_
 */
public class ConectMovimiento {

    public ArrayList mostrarMovimientos(String numCuentaSeleccionada) throws SQLException {
        DBConnect connect = new DBConnect();
        String query;
        query = "SELECT * FROM movimiento m, cuenta c WHERE m.INT_CUENCODIGO=c.INT_CUENCODIGO and m.VCH_CUENNUMERO=" + numCuentaSeleccionada;
        PreparedStatement state = connect.connect().prepareStatement(query);
        ResultSet rs = state.executeQuery();
        Movimiento temporalMovimiento;
        ArrayList<Movimiento> movimiento = new ArrayList();

        while (rs.next()) {
            temporaryUser = new User(rs.getString("id_user"), rs.getString("name_user"), rs.getString("pass_user"), rs.getString("id_company"));
            user.add(temporaryUser);
        }
        rs.close();
        state.close();
        return user;
    }
}
