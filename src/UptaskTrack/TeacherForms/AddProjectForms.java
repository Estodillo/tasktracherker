/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UptaskTrack.TeacherForms;

import com.formdev.flatlaf.FlatClientProperties;
import controller.addprojectcontroller;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;
import model.projectmodel;
import controller.addprojectcontroller;
import java.util.Arrays;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author adamd
 */
public class AddProjectForms extends javax.swing.JPanel {

    /**
     * Creates new form AddProjectForms
     */
    private DashBoardForms dashboard;
    public AddProjectForms(DashBoardForms dashboard) {
        this.dashboard = dashboard;
        initComponents();
        init();
    }

    private void init(){
        projectNameField.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Add Project");
         subjectField.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Input Subject");
         studentid.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Input Student's ID");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        projectNameField = new javax.swing.JTextField();
        deadlineField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        desField = new javax.swing.JTextPane();
        subjectField = new javax.swing.JTextField();
        studentid = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        projectNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectNameFieldActionPerformed(evt);
            }
        });

        deadlineField.setText("2024-11-19");

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(desField);

        subjectField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectFieldActionPerformed(evt);
            }
        });

        studentid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(deadlineField, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addComponent(projectNameField)
                            .addComponent(jScrollPane1)
                            .addComponent(subjectField)
                            .addComponent(studentid))
                        .addGap(0, 47, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(studentid, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(subjectField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(projectNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deadlineField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    addprojectcontroller addproject = new addprojectcontroller();

try {
    // Parse the deadline from the text field
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDate projectDate = LocalDate.parse(deadlineField.getText(), formatter);

    // Convert LocalDate to Date
    Date projectDateDeadline = Date.from(projectDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

    // Get the subject input from subjectField
    String subjectInput = subjectField.getText().trim();
    String studentID = studentid.getText().trim();

    // Validate the subject input
    List<String> validSubjects = Arrays.asList("Science", "Math", "Filipino", "English");
    if (!validSubjects.contains(subjectInput)) {
        JOptionPane.showMessageDialog(null, 
            "Invalid subject! Please enter one of the following: Science, Math, Filipino, or English.", 
            "Invalid Input", 
            JOptionPane.ERROR_MESSAGE);
        return; // Exit the method, do not proceed further
    }

    // Check if the student ID exists in the database
    boolean studentExists = false;
    try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tasktrack", "root", "root");
         PreparedStatement stmt = connection.prepareStatement("SELECT COUNT(*) FROM user WHERE idnumber = ?")) {
        
        stmt.setString(1, studentID);
        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next() && rs.getInt(1) > 0) {
                studentExists = true;
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
        return; // Exit the method if there's a database error
    }

    if (!studentExists) {
        JOptionPane.showMessageDialog(null, 
            "Student ID does not exist! Please check and try again.", 
            "Invalid Student ID", 
            JOptionPane.ERROR_MESSAGE);
        return; // Exit the method if the student ID is not valid
    }

    // Create a new projectmodel and add it to the database
    projectmodel newProject = new projectmodel(
        subjectInput,
        studentID,
        projectNameField.getText(),
        desField.getText(),
        new java.util.Date(), // Current date
        projectDateDeadline
    );
    
    addproject.addProjectToDatabase(newProject);

    // Show confirmation popup
    JOptionPane.showMessageDialog(null, "Project added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

    // Update the table in the dashboard
    dashboard.populateTable(); // No need to pass JTable anymore

} catch (Exception e) {
    // Show error popup
    JOptionPane.showMessageDialog(null, "Failed to add project: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    e.printStackTrace();
}


    }//GEN-LAST:event_jButton1ActionPerformed

    private void projectNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_projectNameFieldActionPerformed

    private void subjectFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectFieldActionPerformed

    private void studentidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentidActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField deadlineField;
    private javax.swing.JTextPane desField;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField projectNameField;
    private javax.swing.JTextField studentid;
    private javax.swing.JTextField subjectField;
    // End of variables declaration//GEN-END:variables
}
