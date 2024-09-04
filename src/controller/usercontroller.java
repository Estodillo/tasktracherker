package controller;

import controller.addusercontroller;
import model.modeluser;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import databaseconnector.databaseconnector;
import model.modeluser.UserRole;

public class usercontroller {
    addusercontroller DAO;
    public usercontroller() {
        this.DAO = new addusercontroller();
    }
    public boolean registerUser(modeluser data) throws ClassNotFoundException{
        String encryptedPassword = DAO.encryptPass(new String(data.getPassword()));
        data.setPassword(encryptedPassword.toCharArray());
        return DAO.addUserToDatabase(data);
    }
    public modeluser LogIn(modeluser data){
        String encryptedPassword = DAO.encryptPass(new String(data.getPassword()));
        data.setPassword(encryptedPassword.toCharArray());
        return this.DAO.SignIn(data);
            }
    public boolean isAdmin(modeluser data) throws ClassNotFoundException {
        try {
            String sql = "SELECT role FROM user WHERE username = ?";
            PreparedStatement p = databaseconnector.getInstance().getConnection().prepareStatement(sql);
            p.setString(1, data.getUserName());
            ResultSet rs = p.executeQuery();
            if (rs.next()) {
                return UserRole.valueOf(rs.getString("role")) == UserRole.ADMIN;
            } else {
                return false; 
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}