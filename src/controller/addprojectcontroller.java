package controller;

import databaseconnector.databaseconnector;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.projectmodel;
import java.sql.DriverManager;
import java.sql.Connection;

public class addprojectcontroller {
    private PreparedStatement p;
    private DefaultTableModel tableModel;
    private ResultSet rs;
    private Connection conn;

    // Constructor to initialize the database connection
    public addprojectcontroller() {
        conn = initializeConnection();
    }

    // Constructor with DefaultTableModel
    public addprojectcontroller(DefaultTableModel tableModel) {
        this();
        this.tableModel = tableModel;
    }

    // Method to initialize the database connection
    private Connection initializeConnection() {
        databaseconnector databaseCon = new databaseconnector();
        try {
            return databaseCon.getCConnection();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Method to prepare SQL statements
    private PreparedStatement prepareStatement(String sql) throws SQLException {
        if (conn != null) {
            return conn.prepareStatement(sql);
        } else {
            throw new SQLException("Database connection is not established.");
        }
    }

    // Method to add a project to the database
    public void addProjectToDatabase(projectmodel model) {
        String sql = "INSERT INTO projecttable (subject, studentid, projectname, description, date, deadline) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement p = prepareStatement(sql)) {
            p.setString(1, model.getSubject());
            p.setString(2, model.getStudentid());
            p.setString(3, model.getProjectName());
            p.setString(4, model.getDescription());
            p.setDate(5, new java.sql.Date(model.getDate().getTime()));
            p.setDate(6, new java.sql.Date(model.getDeadline().getTime()));
            p.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public List<projectmodel> getProjectsBySubjectAndStudentId(String subject, String studentID) {
    List<projectmodel> filteredProjects = new ArrayList<>();
    try {
        // SQL query to fetch projects based on both subject and student ID
        String sql = "SELECT * FROM projecttable WHERE subject = ? AND studentid = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, subject);
        stmt.setString(2, studentID);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            projectmodel project = new projectmodel();
            // Populate project fields from the result set
            project.setSubject(rs.getString("subject"));
            project.setProjectName(rs.getString("projectname"));
            project.setDescription(rs.getString("description"));
            project.setDate(rs.getDate("date"));
            project.setDeadline(rs.getDate("deadline"));
            project.setStudentid(rs.getString("studentid"));
            filteredProjects.add(project);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return filteredProjects;
}

   public List<projectmodel> getProjectsBySubject(String subject) {
    List<projectmodel> projects = new ArrayList<>();
    String query = "SELECT subject, projectname, description, date, deadline FROM projecttable WHERE subject = ?";

    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tasktrack", "root", "root");
         PreparedStatement stmt = conn.prepareStatement(query)) {

        stmt.setString(1, subject);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            projects.add(new projectmodel(
                rs.getString("subject"),
                rs.getString("studentid"),
                rs.getString("projectname"),
                rs.getString("description"),
                rs.getDate("date"),
                rs.getDate("deadline")
            ));
        }
    } catch (Exception e) {
        e.printStackTrace();
    }

    return projects;
}



    // Method to populate the project list from the database
    public List<projectmodel> populateProject() {
        List<projectmodel> list = new ArrayList<>();
        String sql = "SELECT * FROM projecttable";

        try (PreparedStatement p = prepareStatement(sql); ResultSet rs = p.executeQuery()) {
            while (rs.next()) {
                projectmodel model = new projectmodel();
                model.setSubject(rs.getString("subject"));
                model.setStudentid(rs.getString("studentid"));
                model.setProjectName(rs.getString("projectname"));
                model.setDescription(rs.getString("description"));
                model.setDate(rs.getDate("date"));
                model.setDeadline(rs.getDate("deadline"));
                list.add(model);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
