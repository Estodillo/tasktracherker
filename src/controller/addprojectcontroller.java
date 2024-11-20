
package controller;
import databaseconnector.databaseconnector;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.projectmodel;

public class addprojectcontroller {
    private PreparedStatement p;
    private DefaultTableModel tableModel;
    ResultSet rs;

    public addprojectcontroller() {
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

    public addprojectcontroller(DefaultTableModel tableModel) {
        this.tableModel = tableModel;
    }
public void addProjectToDatabase(projectmodel addData){
     String insertSql = "INSERT INTO projecttable (projectname, description, date, dealine) VALUES (?, ?, ?, ?)";

    try {
        
        p = prepareStatement(insertSql);
        // Set the parameters for the INSERT query
        p.setString(1, addData.getProjectName());
        p.setString(2, addData.getDescription());
        p.setDate(3, new java.sql.Date(addData.getDate().getTime())); // Convert date
    p.setDate(4, new java.sql.Date(addData.getDeadline().getTime())); 

     p.executeUpdate();
        System.out.println("SUcces");
    } catch (SQLException e) {
        e.printStackTrace();
        System.err.println("Error while adding project to the database: " + e.getMessage());
    } finally {
        try {
            if (p != null) p.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

public List<projectmodel> populateProject(){
    List<projectmodel>list = new ArrayList<>();
    projectmodel model = new projectmodel();
    try {
        String sql = "SELECT * FROM projecttable";
        p = prepareStatement(sql);
        
        rs = p.executeQuery();
        while (rs.next()) {            
           model.setProjectName(rs.getString("projectname"));
           model.setDescription(rs.getString("description"));
           model.setDate(rs.getDate("date"));
           model.setDeadline(rs.getDate("dealine"));
           list.add(model);
        }
        
    } catch (Exception e) {
        e.printStackTrace();
    }
    
    return list;
}
    
    
}

