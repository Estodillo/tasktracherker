package controller;

import model.modeluser;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import databaseconnector.databaseconnector;
import java.sql.Connection;
import model.GradeModel;
import model.modeluser.UserRole;

public class usercontroller {
        private Connection connection;
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
            ps = prepareStatement(sql);
            ps.setString(1, data.getUserName());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return UserRole.valueOf(rs.getString("role")) == UserRole.TEACHER;
            } else {
                return false; 
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean isStudent(modeluser data) throws ClassNotFoundException {
        try {
            String sql = "SELECT role FROM user WHERE username = ?";
            ps = prepareStatement(sql);
            ps.setString(1, data.getUserName());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return UserRole.valueOf(rs.getString("role")) == UserRole.STUDENT;
            } else {
                return false; 
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
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
     

     public GradeModel getGradeData(String idnumber) throws ClassNotFoundException {
    GradeModel gradeData = null;
    try {
       
        String sql = "SELECT science, english, math, filipino FROM gradetbl WHERE idnumber = ?";
        PreparedStatement ps = prepareStatement(sql);
        ps.setString(1, idnumber);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            gradeData = new GradeModel();
            gradeData.setScience(rs.getString("science"));
            gradeData.setEnglish(rs.getString("english"));
            gradeData.setMath(rs.getString("math"));
            gradeData.setFilipino(rs.getString("filipino"));
        }
    } catch (SQLException e) {
        e.printStackTrace(); 
    } 
    return gradeData;
}
    
    
}
