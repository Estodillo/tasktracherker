
package UptaskTrack.TeacherForms;


import controller.addprojectcontroller;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.projectmodel;
import raven.glasspanepopup.GlassPanePopup;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;


public class DashBoardForms extends javax.swing.JPanel {

     public DashBoardForms() {
        initComponents();
        populateTable();
        date.setVisible(false);
        projectName.setVisible(false);
        studentid.setVisible(false);
        subject.setVisible(false);
    }

    /**
     * Populates the table with data from the database.
     */
    public void populateTable() {
        addprojectcontroller controller = new addprojectcontroller();
        List<projectmodel> list = controller.populateProject();

        // Get the table's model
        DefaultTableModel model = (DefaultTableModel) dataTable.getModel();

        // Clear any existing rows in the table
        model.setRowCount(0);

        // Add data from the list to the table model
        for (projectmodel object : list) {
            Object[] row = {
                object.getSubject(),
                object.getStudentid(),
                object.getProjectName(),
                object.getDescription(),
                object.getDate(),
                object.getDeadline()
            };
            model.addRow(row);
        }
    }
private void SetFieldsEmpty(){
    date.setText("");
    projectName.setText("");
    studentid.setText("");
    subject.setText("");
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        completed = new javax.swing.JButton();
        projectName = new javax.swing.JLabel();
        subject = new javax.swing.JLabel();
        studentid = new javax.swing.JLabel();
        date = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        dataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dataTable);

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        completed.setText("Completed");
        completed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(studentid, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(subject, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(projectName, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(completed)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(studentid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(completed)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addComponent(subject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(projectName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
GlassPanePopup.showPopup(new AddProjectForms(this));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void completedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completedActionPerformed
        
    String dateLbl = date.getText(); // Replace with your JLabel for date
    String projectNameLbl = projectName.getText(); // Replace with your JLabel for projectName
    String studentId = studentid.getText(); // Replace with your JLabel for studentid
    String subjectLbl = subject.getText(); // Replace with your JLabel for subject

    // Check if any of the JLabels are empty
    if (dateLbl.isEmpty() || projectNameLbl.isEmpty() || studentId.isEmpty() || subjectLbl.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please select a project", "Error", JOptionPane.ERROR_MESSAGE);
        return; // Exit the method if any field is empty
    }

    // Database connection
    Connection conn = null;
    PreparedStatement insertStmt = null;
    PreparedStatement deleteStmt = null;

    try {
        // Establish connection
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tasktrack", "root", "root");

        // Insert into completed table
        String insertSQL = "INSERT INTO completed (subject, studentid, projectname, date) VALUES (?, ?, ?, ?)";
        insertStmt = conn.prepareStatement(insertSQL);
        insertStmt.setString(1, subjectLbl);
        insertStmt.setString(2, studentId);
        insertStmt.setString(3, projectNameLbl);
        insertStmt.setString(4, dateLbl);
        insertStmt.executeUpdate();

        // Delete from projecttable
        String deleteSQL = "DELETE FROM projecttable WHERE subject = ? AND studentid = ? AND projectname = ? AND date = ?";
        deleteStmt = conn.prepareStatement(deleteSQL);
        deleteStmt.setString(1, subjectLbl);
        deleteStmt.setString(2, studentId);
        deleteStmt.setString(3, projectNameLbl);
        deleteStmt.setString(4, dateLbl);
        deleteStmt.executeUpdate();

        // Show success message
        JOptionPane.showMessageDialog(this, "Project moved to completed successfully!");

    } catch (SQLException e) {
        // Handle SQL exception
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    } finally {
        // Close resources
        try {
            if (insertStmt != null) insertStmt.close();
            if (deleteStmt != null) deleteStmt.close();
            if (conn != null) conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        populateTable();
        SetFieldsEmpty();
    }

    }//GEN-LAST:event_completedActionPerformed

    private void dataTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataTableMouseClicked
        // TODO add your handling code here:
         int selectedRow = dataTable.getSelectedRow();

    // Ensure a row is selected
    if (selectedRow != -1) {
        // Retrieve data from the selected row for each column
        String datelabel= dataTable.getValueAt(selectedRow, 4).toString(); // Assuming column 0 has the data for JLabel 'data'
        String studentId = dataTable.getValueAt(selectedRow, 1).toString(); // Assuming column 1 has the student ID
        String projectNameLabel = dataTable.getValueAt(selectedRow, 2).toString(); // Assuming column 2 has the project name
        String subjectLabel = dataTable.getValueAt(selectedRow, 0).toString(); // Assuming column 3 has the subject

        // Set the text for each JLabel
        date.setText(datelabel);
        studentid.setText(studentId);
        projectName.setText(projectNameLabel);
        subject.setText(subjectLabel);
    }
    }//GEN-LAST:event_dataTableMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton completed;
    public javax.swing.JTable dataTable;
    private javax.swing.JLabel date;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel projectName;
    private javax.swing.JLabel studentid;
    private javax.swing.JLabel subject;
    // End of variables declaration//GEN-END:variables
}
