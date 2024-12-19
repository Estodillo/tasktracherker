
package UptaskTrack.TeacherForms;

import controller.AddGradeController;
import databaseconnector.databaseconnector;
import javax.swing.JOptionPane;
import model.GradeModel;
import raven.glasspanepopup.GlassPanePopup;
import java.sql.Connection;
import java.sql.SQLException;


public class AddGrades extends javax.swing.JPanel {

    public AddGrades() {
        initComponents();
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SaveBtn = new javax.swing.JButton();
        idFld = new javax.swing.JLabel();
        idLbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        scienceFld = new javax.swing.JTextField();
        mathFld = new javax.swing.JTextField();
        englishFld = new javax.swing.JTextField();
        filipinoFld = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        nameLbl = new javax.swing.JLabel();
        nameFld = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        gradeid = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        idFld.setText("ID Number:");

        idLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        idLbl.setText("ID Number");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel3.setText("Science");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Math");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel5.setText("English");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel6.setText("Filipino");

        scienceFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scienceFldActionPerformed(evt);
            }
        });
        scienceFld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                scienceFldKeyTyped(evt);
            }
        });

        mathFld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mathFldKeyTyped(evt);
            }
        });

        englishFld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                englishFldKeyTyped(evt);
            }
        });

        filipinoFld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                filipinoFldKeyTyped(evt);
            }
        });

        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        nameLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nameLbl.setText("Name:");

        nameFld.setText("Name:");

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(304, 304, 304))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton2)
                        .addGap(36, 36, 36)
                        .addComponent(SaveBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scienceFld, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(filipinoFld, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(mathFld, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addComponent(englishFld, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idFld)
                                    .addComponent(nameFld))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jButton1)
                        .addGap(33, 33, 33)
                        .addComponent(gradeid, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idFld)
                    .addComponent(idLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameFld)
                    .addComponent(nameLbl))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(scienceFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(mathFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(englishFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(filipinoFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(SaveBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(gradeid, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void scienceFldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_scienceFldKeyTyped
        char c = evt.getKeyChar();
    if (!Character.isDigit(c)) {
        evt.consume(); 
    }
             
    }//GEN-LAST:event_scienceFldKeyTyped

    private void mathFldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mathFldKeyTyped
        char c = evt.getKeyChar();
    if (!Character.isDigit(c)) {
        evt.consume(); 
    }
    }//GEN-LAST:event_mathFldKeyTyped

    private void englishFldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_englishFldKeyTyped
             char c = evt.getKeyChar();
    if (!Character.isDigit(c)) {
        evt.consume(); 
    }
    }//GEN-LAST:event_englishFldKeyTyped

    private void filipinoFldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filipinoFldKeyTyped
            char c = evt.getKeyChar();
    if (!Character.isDigit(c)) {
        evt.consume(); 
    }
    }//GEN-LAST:event_filipinoFldKeyTyped

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
       String idnumber = idLbl.getText();
        String science = scienceFld.getText();
        String english = englishFld.getText();
        String math = mathFld.getText();
        String filipino = filipinoFld.getText();
   

    if (science.isEmpty() || english.isEmpty() || math.isEmpty()|| filipino.isEmpty() ) {
        JOptionPane.showMessageDialog(this, "All fields must be filled out");
    }
  
    
    GradeModel grade= new GradeModel(idnumber,science, english, math, filipino);

    AddGradeController controller = new AddGradeController();

    try {
        controller.addGradesToDatabase(grade);
        JOptionPane.showMessageDialog(this, "Uploading grades is successful");

        scienceFld.setText("");
        englishFld.setText("");
        mathFld.setText("");
        filipinoFld.setText("");

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "An error occurred during uploading grades");
    }
    Connection connection = getConnection();
    StudentsForms.populateGrade(StudentsForms.gradeTbl, connection);
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void scienceFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scienceFldActionPerformed
      

    }//GEN-LAST:event_scienceFldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        GlassPanePopup.closePopupLast();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       int idgrade = Integer.parseInt(gradeid.getText());
        String idnumber = idLbl.getText();
        String science = scienceFld.getText();
        String english = englishFld.getText();
        String math = mathFld.getText();
        String filipino = filipinoFld.getText();
   

    if (science.isEmpty() || english.isEmpty() || math.isEmpty()|| filipino.isEmpty() ) {
        JOptionPane.showMessageDialog(this, "All fields must be filled out");
    }
  
    
    GradeModel grade= new GradeModel(idnumber,science, english, math, filipino);

    AddGradeController controller = new AddGradeController();

    try {
        controller.updateGradesToDatabase(grade,idgrade);
        JOptionPane.showMessageDialog(this, "Uploading grades is successful");

        scienceFld.setText("");
        englishFld.setText("");
        mathFld.setText("");
        filipinoFld.setText("");

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "An error occurred during uploading grades");
    }
    Connection connection = getConnection();
    StudentsForms.populateGrade(StudentsForms.gradeTbl, connection);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SaveBtn;
    private javax.swing.JTextField englishFld;
    private javax.swing.JTextField filipinoFld;
    public javax.swing.JLabel gradeid;
    private javax.swing.JLabel idFld;
    public javax.swing.JLabel idLbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mathFld;
    private javax.swing.JLabel nameFld;
    public javax.swing.JLabel nameLbl;
    private javax.swing.JTextField scienceFld;
    // End of variables declaration//GEN-END:variables
}
