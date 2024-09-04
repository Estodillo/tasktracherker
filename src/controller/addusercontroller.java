package controller;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.modeluser;
import databaseconnector.databaseconnector;



public class addusercontroller {
    
    public addusercontroller(){
}
    
    public  boolean addUserToDatabase(modeluser data) throws ClassNotFoundException {
    try {
        
        String checkSql = "SELECT COUNT(*) AS count FROM user";
        PreparedStatement checkStatement = databaseconnector.getInstance().getConnection().prepareStatement(checkSql);
        ResultSet resultSet = checkStatement.executeQuery();
        resultSet.next();
        int rowCount = resultSet.getInt("count");
        
        String sql;
        if (rowCount == 0) {
            
            sql = "INSERT INTO user (username, password, email, role) VALUES (?, ?, ?, 'ADMIN')";
        } else {
           
            sql = "INSERT INTO user (username, password, email, role) VALUES (?, ?, ?, 'USER')";
        }
        
        PreparedStatement p = databaseconnector.getInstance().getConnection().prepareStatement(sql);
        p.setString(1, data.getUserName());
        p.setString(2, new String(data.getPassword()));
        p.setString(3, data.getEmail());
        p.executeUpdate();
        return true; 
    } catch (SQLException e) {
        e.printStackTrace();
        return false; 
    }
    }
    public modeluser SignIn(modeluser data){
          try {
             
              String sql = "SELECT * FROM user WHERE username LIKE ? AND password LIKE ?";
              PreparedStatement p = databaseconnector.getInstance().getConnection().prepareStatement(sql);
              p.setString(1, data.getUserName());
              p.setString(2, new String(data.getPassword()));
              ResultSet rs = p.executeQuery();
            if (rs.next()) {
                
                return new modeluser(rs.getString("username"), rs.getString("email"), rs.getString("password").toCharArray());
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