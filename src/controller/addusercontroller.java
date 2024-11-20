    package controller;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.modeluser;
import databaseconnector.databaseconnector;
import java.sql.Connection;
import javax.swing.JOptionPane;


public class addusercontroller {
    
    PreparedStatement ps;
    ResultSet rs;
       private Connection getConnection() {
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
            Connection con = getConnection();
            if (con != null) {
                return con.prepareStatement(sql);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public addusercontroller(){
}
    
    public  boolean addUserToDatabase(modeluser data) throws ClassNotFoundException {
    try {
        
        String checkSql = "SELECT COUNT(*) AS count FROM user";
    ps = prepareStatement(checkSql);
        ResultSet resultSet = ps.executeQuery();
        resultSet.next();
        int rowCount = resultSet.getInt("count");
        
        String sql;
       if (rowCount == 0) {
            sql = "INSERT INTO user (username, password, role) VALUES (?, ?, 'TEACHER')";
        } else {
            sql = "INSERT INTO user (username, password, role) VALUES (?, ?, 'STUDENT')";
        }
        
        PreparedStatement p = prepareStatement(sql);
        p.setString(1, data.getUserName());
        p.setString(2, new String(data.getPassword()));

        p.executeUpdate();
        JOptionPane.showMessageDialog(null, "Succesfully Register");
        return true; 
    } catch (SQLException e) {
        e.printStackTrace();
        return false; 
    }
    }
    public modeluser SignIn(modeluser data){
          try {
             
              String sql = "SELECT * FROM user WHERE username LIKE ? AND password LIKE ?";
              ps = prepareStatement(sql);
              ps.setString(1, data.getUserName());
              ps.setString(2, new String(data.getPassword()));
              ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                
                return new modeluser(rs.getString("username"), rs.getString("password").toCharArray());
            } else {
                
                return null;
            }
          } catch (Exception e) {
              e.printStackTrace();
              return null;
          }
        
     
      }
   public String encryptPass(String password){
        try {
            MessageDigest digestor = MessageDigest.getInstance("SHA-256");
            byte [] encodeHash = digestor.digest(password.getBytes(StandardCharsets.UTF_8));
            StringBuilder encryptionValue = new StringBuilder(2 * encodeHash.length);
            
             for (int i = 0; i < encodeHash.length; i++) {
                String hexVal = Integer.toHexString(0xff & encodeHash[i]);
                if (hexVal.length() == 1) {
                    encryptionValue.append('0');
                }
                encryptionValue.append(hexVal);
            }
             return encryptionValue.toString();
        } catch (Exception e) {
             return e.getMessage();
        }
    }

   
}