
package controller;

import databaseconnector.databaseconnector;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class retrievedUser {
    public DefaultTableModel retrievedUserNames() {
        String query = "SELECT name FROM user"; 
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Name"); 

        try (PreparedStatement ps = prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                String name = rs.getString("name");
                model.addRow(new Object[]{name}); 
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to retrieve user names.");
        }
        return model;
    }

    
     PreparedStatement ps;
    ResultSet rs;
       private java.sql.Connection getConnection() {
       databaseconnector databasecon = new databaseconnector();
        try {
            return databasecon.getCConnection();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
     private PreparedStatement prepareStatement(String sql) {
        try {
            java.sql.Connection con = getConnection();
            if (con != null) {
                return con.prepareStatement(sql);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
