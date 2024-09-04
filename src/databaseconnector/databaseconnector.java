/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databaseconnector;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
/**
 *
 * @author adamd
 */
public class databaseconnector {
    private static databaseconnector instance;
    private Connection connection;
    private String url = "jdbc:mysql://localhost:3306/tasktrack";
    private String username = "root";
    private String password = "root";

    private databaseconnector() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static databaseconnector getInstance() throws SQLException {
        if (instance == null) {
            instance = new databaseconnector();
        } else if (instance.getConnection().isClosed()) {
            instance = new databaseconnector();
        }
        return instance;
    }
}