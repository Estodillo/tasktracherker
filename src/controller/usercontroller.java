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
     

    public void saveGrade(GradeModel grade) {
       
        
        String query = "INSERT INTO grades (idNumber, name, science, english, math, filipino) VALUES (?, ?, ?, ?, ?, ?)";
        try (
             PreparedStatement stmt = connection.prepareStatement(query)) {

            stmt.setString(1, grade.getIdNumber());
            stmt.setString(2, grade.getName());
            stmt.setDouble(3, grade.getScience());
            stmt.setDouble(4, grade.getEnglish());
            stmt.setDouble(5, grade.getFilipino());
            stmt.setDouble(6, grade.getMath());

            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Grade saved successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to save grade.");
        }
    }
    
    
}
