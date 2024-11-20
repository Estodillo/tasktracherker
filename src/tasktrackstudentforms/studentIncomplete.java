/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tasktrackstudentforms;

import controller.addprojectcontroller;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.projectmodel;

/**
 *
 * @author Lenovo
 */
public class studentIncomplete extends javax.swing.JFrame {

    
    public studentIncomplete() {
        initComponents();
        taskData();
    }

  public void taskData(){
       addprojectcontroller controller = new addprojectcontroller();
    List<projectmodel> list = controller.populateProject();

    // Get the table's model
    DefaultTableModel model = (DefaultTableModel) studentTable.getModel();

    // Clear any existing rows in the table
    model.setRowCount(0);

    // Add data from the list to the table model
    for (projectmodel object : list) {
        Object[] row = {
            object.getProjectName(),  // Replace with actual getter
                     // Replace with actual getter
            object.getDeadline()      // Replace with actual getter
        };
        model.addRow(row);
    }
 
  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        roundpanel1 = new tasktrackswing.roundpanel();
        roundpanel2 = new tasktrackswing.roundpanel();
        roundpanel3 = new tasktrackswing.roundpanel();
        roundpanel4 = new tasktrackswing.roundpanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        roundpanel1.setBackground(new java.awt.Color(153, 255, 255));
        roundpanel1.setText("SCIENCE");
        roundpanel1.setRolloverEnabled(false);
        roundpanel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundpanel1ActionPerformed(evt);
            }
        });

        roundpanel2.setBackground(new java.awt.Color(153, 255, 255));
        roundpanel2.setText("ENGLISH");
        roundpanel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundpanel2ActionPerformed(evt);
            }
        });

        roundpanel3.setBackground(new java.awt.Color(153, 255, 255));
        roundpanel3.setText("FILIPINO");
        roundpanel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundpanel3ActionPerformed(evt);
            }
        });

        roundpanel4.setBackground(new java.awt.Color(153, 255, 255));
        roundpanel4.setText("MATH");
        roundpanel4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundpanel4ActionPerformed(evt);
            }
        });

        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Project Name", "Deadline"
            }
        ));
        jScrollPane1.setViewportView(studentTable);
        if (studentTable.getColumnModel().getColumnCount() > 0) {
            studentTable.getColumnModel().getColumn(0).setResizable(false);
            studentTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            studentTable.getColumnModel().getColumn(1).setResizable(false);
            studentTable.getColumnModel().getColumn(1).setPreferredWidth(50);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roundpanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundpanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundpanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundpanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(roundpanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(roundpanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(roundpanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(roundpanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 51, -1, 400));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Incompleted Task");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(593, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void roundpanel4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundpanel4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundpanel4ActionPerformed

    private void roundpanel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundpanel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundpanel1ActionPerformed

    private void roundpanel3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundpanel3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundpanel3ActionPerformed

    private void roundpanel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundpanel2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundpanel2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(studentIncomplete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentIncomplete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentIncomplete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentIncomplete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentIncomplete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private tasktrackswing.roundpanel roundpanel1;
    private tasktrackswing.roundpanel roundpanel2;
    private tasktrackswing.roundpanel roundpanel3;
    private tasktrackswing.roundpanel roundpanel4;
    private javax.swing.JTable studentTable;
    // End of variables declaration//GEN-END:variables
}
