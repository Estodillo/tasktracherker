/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package tasktrackstudentforms;

import databaseconnector.databaseconnector;
import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class studentcomplete extends javax.swing.JPanel {

   private String studentID;
   private databaseconnector dbConnector;
    public studentcomplete(String studentID) {
        initComponents();
        this.studentID = studentID;
        dbConnector = new databaseconnector();  // Initialize databaseconnector
        populateTable(studentID);
        
    }
private void populateTable(String studentID) {
        // Database query to fetch data for the specific studentID
        String query = "SELECT subject, studentid, projectname, date FROM completed WHERE studentid = ?";

        // Clear the existing rows in the table before adding new data
        DefaultTableModel model = (DefaultTableModel) completedTable.getModel();
        model.setRowCount(0);

        Connection conn = null; // Declare the connection here

        try {
            conn = dbConnector.getCConnection();  // Get connection using databaseconnector
            PreparedStatement stmt = conn.prepareStatement(query);

            // Set the studentID parameter for the query
            stmt.setString(1, studentID);

            // Execute the query
            ResultSet rs = stmt.executeQuery();

            // Loop through the result set and populate the table
            while (rs.next()) {
                // Get data from the result set
                String subject = rs.getString("subject");
                String studentId = rs.getString("studentid");
                String projectName = rs.getString("projectname");
                String date = rs.getString("date");

                // Add a row to the table
                model.addRow(new Object[]{subject, studentId, projectName, date});
            }

            rs.close();
            stmt.close();

        } catch (SQLException e) {
            // Handle any database exceptions
            e.printStackTrace();
        } finally {
            // Close the connection safely using the databaseconnector's closeConnection method
            dbConnector.closeConnection(conn);
        }
    }
private void populateTableBySubject(String subject) {
    // Database query to fetch data for the specific studentID and subject
    String query = "SELECT subject, studentid, projectname, date FROM completed WHERE studentid = ? AND subject = ?";

    // Clear the existing rows in the table before adding new data
    DefaultTableModel model = (DefaultTableModel) completedTable.getModel();
    model.setRowCount(0);

    Connection conn = null; // Declare the connection here
    boolean hasResults = false; // Flag to track if there are results

    try {
        conn = dbConnector.getCConnection();  // Get connection using databaseconnector
        PreparedStatement stmt = conn.prepareStatement(query);

        // Set the studentID and subject parameters for the query
        stmt.setString(1, studentID);  // Assuming studentID is already set
        stmt.setString(2, subject);    // Set the selected subject

        // Execute the query
        ResultSet rs = stmt.executeQuery();

        // Loop through the result set and populate the table
        while (rs.next()) {
            // Get data from the result set
            String subj = rs.getString("subject");
            String studentId = rs.getString("studentid");
            String projectName = rs.getString("projectname");
            String date = rs.getString("date");

            // Add a row to the table
            model.addRow(new Object[]{subj, studentId, projectName, date});
            hasResults = true; // Data found, set the flag to true
        }

        // If no results were found, show a message in the table
        if (!hasResults) {
            JOptionPane.showMessageDialog(this, "No project is completed in this subject yet.", "No Results", JOptionPane.INFORMATION_MESSAGE);
        }

        rs.close();
        stmt.close();

    } catch (SQLException e) {
        // Handle any database exceptions
        e.printStackTrace();
    } finally {
        // Close the connection safely using the databaseconnector's closeConnection method
        dbConnector.closeConnection(conn);
    }
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        completedTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        subjectField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        completedTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Subject", "studentid", "Project Name", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(completedTable);
        if (completedTable.getColumnModel().getColumnCount() > 0) {
            completedTable.getColumnModel().getColumn(1).setMinWidth(0);
            completedTable.getColumnModel().getColumn(1).setPreferredWidth(0);
            completedTable.getColumnModel().getColumn(1).setMaxWidth(0);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 780, 290));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Input Subject: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 20));

        subjectField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                subjectFieldKeyPressed(evt);
            }
        });
        jPanel1.add(subjectField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 100, -1));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Completed Task");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void subjectFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_subjectFieldKeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
    String inputText = subjectField.getText().trim();

    // Valid subjects
    String[] validSubjects = {"Science", "Math", "Filipino", "English"};

    // Check if the input matches any valid subject
    boolean isValidSubject = false;
    for (String subject : validSubjects) {
        if (inputText.equalsIgnoreCase(subject)) {
            isValidSubject = true;
            break;
        }
    }

    if (isValidSubject) {
        // If the input is valid, populate the table with data for the specific subject
        populateTableBySubject(inputText);
    } else {
        // If the input is not valid, show an error message
        JOptionPane.showMessageDialog(this, "Invalid subject! Please enter a valid subject.", "Error", JOptionPane.ERROR_MESSAGE);
    }
         }
    }//GEN-LAST:event_subjectFieldKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable completedTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField subjectField;
    // End of variables declaration//GEN-END:variables
}
