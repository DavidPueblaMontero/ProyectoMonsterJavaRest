/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.monster.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author john, jess, david
 */
public class DBConnect {

    Connection ct;
    String bd = "corebankmysql";
    String url = "jdbc:mysql://localhost/" + bd;
    String user = "root";
    String pass = "";

    public Connection connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            ct = (Connection) DriverManager.getConnection(url, user, pass);
            System.out.println("Successful connection");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("ERROR");
        }
        return ct;
    }

    public boolean confirmConnect() {
        boolean confirm;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            ct = (Connection) DriverManager.getConnection(url, user, pass);
            confirm = true;
        } catch (ClassNotFoundException | SQLException ex) {
            confirm = false;
        }
        return confirm;
    }


    public static void main(String[] args) throws SQLException {
        DBConnect c = new DBConnect();
        c.connect();
        
    }

}
