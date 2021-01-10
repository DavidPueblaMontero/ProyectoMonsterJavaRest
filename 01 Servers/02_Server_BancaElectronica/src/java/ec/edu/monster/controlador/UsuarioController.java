/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.monster.controlador;

import ec.edu.monster.modelo.Movimiento;
import ec.edu.monster.services.ServiciosExternos;
import ec.edu.servicios.CoreServicios;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
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
public class UsuarioController {

    public boolean CrearCuenta(String cedula, String cuenta, String password) {

        try {
            DBConnect connect = new DBConnect();
            String query;
            PreparedStatement state;
            long millis = System.currentTimeMillis();
            java.sql.Date date = new java.sql.Date(millis);
            query = "INSERT INTO `usuario` (`INT_USUCODIGO`, `VCH_USUNOMBRE`, `VCH_USUAPELLIDO`, `VCH_USUCEDULA`, `VCH_USUDIRECCION`, `VCH_USUTELEFONO`, `VCH_USUEMAIL`, `VCH_USUUSUARIO`, `VCH_USUPASSWORD`) VALUES (NULL, NULL, NULL, ?, NULL, NULL, NULL, NULL,?); ";
            state = connect.connect().prepareStatement(query);
            state.setString(1, cedula);
            state.setString(2, password);
            state.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
        }

        //s.verificarExistenciaCuenta(Boolean.class, cuenta);
        return false;
    }

    public void probandoServicio() {

        CoreServicios s = new CoreServicios();
        try {
            System.out.println(s.verificarExistenciaCuenta1("1") + "");
        } catch (Exception ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public boolean login(String cedula, String password) {
        try {

            DBConnect connect = new DBConnect();
            String query;
            query = "select * from usuario WHERE VCH_USUCEDULA =? and VCH_USUPASSWORD=? ";
            PreparedStatement state = connect.connect().prepareStatement(query);
            state.setString(1, cedula);
            state.setString(2, password);

            ResultSet rs = state.executeQuery();
            int i = 0;
            while (rs.next()) {
                i++;
                if (i == 1) {
                    rs.close();
                    return true;
                }
            }
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static void main(String[] args) {
        /*
        NewJerseyClient s = new NewJerseyClient();
        UsuarioController u = new UsuarioController();

        // u.CrearCuenta("1723428304", "1234567890", "123456");
        //System.out.println("" + u.Login("1723428304", "123456"));
        long millis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);
        //Movimiento m = new Movimiento(null, null, date, null, null, null, "4542513245", "4564564325");
        Movimiento m1 = new Movimiento(15, "1234567890", "1234567891");
        s.transferencia(m1);
         */
        UsuarioController u = new UsuarioController();
        u.probandoServicio();
    }
}
