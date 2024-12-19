
package controller;

import databaseconnector.databaseconnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.GradeModel;


public class AddGradeController {
     public AddGradeController() {
        
        
    }
    public  boolean addGradesToDatabase(GradeModel data) throws ClassNotFoundException {
    try {
        
        String sql = "INSERT INTO gradetbl(idnumber, science,english, math, filipino) VALUES (?,?,?,?,?)";
        PreparedStatement p = prepareStatement(sql);
        p.setString(1, data.getIdNumber()); 
        p.setString(2, data.getScience()); 
        p.setString(3, data.getEnglish());
        p.setString(4, data.getMath());
        p.setString(5, data.getFilipino());
       

        p.executeUpdate();
        
        return true; 
        
    } catch (SQLException e) {
        e.printStackTrace();
        return false; 
    }
    }
    public  boolean updateGradesToDatabase(GradeModel data, int idgradetbl) throws ClassNotFoundException {
    try {
        
        String sql = "UPDATE gradetbl SET idnumber = ?, science = ?, english = ?, math = ?, filipino = ? WHERE idgradetbl = ?";
        PreparedStatement p = prepareStatement(sql);
        p.setString(1, data.getIdNumber()); 
        p.setString(2, data.getScience()); 
        p.setString(3, data.getEnglish());
        p.setString(4, data.getMath());
        p.setString(5, data.getFilipino());
       p.setInt(6, idgradetbl);

        p.executeUpdate();
        
        return true; 
        
    } catch (SQLException e) {
        e.printStackTrace();
        return false; 
    }
    }

    private PreparedStatement prepareStatement(String sql) {
         try {
            Connection con = getConnection();
            if (con != null) {
                return con.prepareStatement(sql);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
         return null;

    }

    private Connection getConnection() {
    databaseconnector databasecon = new databaseconnector();
        try {
            return databasecon.getCConnection();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
    }
}
}
