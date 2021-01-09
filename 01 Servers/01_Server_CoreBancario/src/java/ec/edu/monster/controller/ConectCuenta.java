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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author john_
 */
public class ConectCuenta {

    public void econtrarCuenta(String table, String field, String data) throws SQLException {
        DBConnect connect = new DBConnect();
        String query;
        query = "SELECT * from " + table + " where " + field + " = ?";
        PreparedStatement state = connect.connect().prepareStatement(query);
        state.setString(1, data);
        ResultSet rs = state.executeQuery();
        Cuenta cuenta = null;
        // Company company = null;
        // FinancialData financialData = null;
/*
        while (rs.next()) {
            switch (table) {
                case "user":
                    user = new User(rs.getString("id_user"), rs.getString("name_user"), rs.getString("pass_user"), rs.getString("id_company"));
                    break;
                case "company":
                    company = new Company(rs.getString("id_company"), rs.getString("name_company"), rs.getString("description_company"), rs.getString("address_company"), rs.getString("phone_company"));
                    break;
                case "financialdata":
                    financialData = new FinancialData(rs.getString("id_financialData"), rs.getString("id_company"), rs.getInt("year"), rs.getDouble("sales"), rs.getDouble("salesCost"), rs.getDouble("grossProfit"), rs.getDouble("expensesAdmiSales"), rs.getDouble("depreciations"), rs.getDouble("interestPaid"), rs.getDouble("profitBeforeTaxes"), rs.getDouble("taxes"), rs.getDouble("excerciseUtility"));
                    break;
                default:
                    break;
            }
        }

         */
        while (rs.next()) {
            System.out.println(rs.getInt(3) + "");
            /*
    cuenta= new Cuenta(rs.getInt(1),rs.)
        
}
user = new Cuenta(0, 0, query, query, 0, DTT_CUENFECHACREACION)
        rs.close();
        state.close();
        switch (table) {
            case "user":
                return user;
            case "company":
                return company;
            case "financialdata":
                return financialData;
            default:
                return null;
             */
        }
    }

    
    
    public static void main(String[] args) {
        ConectCuenta u=new ConectCuenta();
        try {
            u.econtrarCuenta("cuenta", "VCH_CUENNUMERO", "1234567890");
        } catch (SQLException ex) {
            Logger.getLogger(ConectCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}


