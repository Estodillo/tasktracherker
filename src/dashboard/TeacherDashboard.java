/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dashboard;

import UptaskTrack.TeacherForms.DashBoardForms;
import UptaskTrack.TeacherForms.DateTableForms;
import UptaskTrack.TeacherForms.ProjectForms;
import UptaskTrack.TeacherForms.SettingsForms;
import UptaskTrack.TeacherForms.StudentsForms;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.EventListener;
import javax.swing.JPopupMenu;
import loginandsignup.LoginTeacher;
import loginandsignup.SignUp;
import raven.glasspanepopup.GlassPanePopup;
import tasktrackteacherforms.ADD;
import tasktrackteacherforms.Project;
import tasktrackteacherforms.Setting;
import tasktrackteacherforms.datetable;
import tasktrackteacherforms.students;


/**
 *
 * @author Lenovo
 */
public class TeacherDashboard extends javax.swing.JFrame {
   
     Color DefaultColor,ClickedColor;
     private ADD add;
     private Setting se;
     private datetable tab;
     private students stu;
     private Project proj;
    
    public TeacherDashboard() {
        initComponents();
        mainPanel.setLayout(new BorderLayout());
         GlassPanePopup.install(this);
//         ADD.setVisible(false);
        DefaultColor=new Color(255,255,255);
        ClickedColor=new Color(0,204,204);
//                POP.setVisible(false);

        
        date.setBackground(DefaultColor);
        stud.setBackground(DefaultColor);
        settings.setBackground(DefaultColor);
        classes.setBackground(DefaultColor);
        update.setBackground(DefaultColor);
        showForms(new DashBoardForms());
     
  

    }
    private void showForms(Component com){
        mainPanel.removeAll();
        mainPanel.add(com);
        repaint();
        revalidate();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pop = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();
        datePicker2 = new com.github.lgooddatepicker.components.DatePicker();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        update = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        settings = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        date = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        stud = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        classes = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        settings1 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();

        pop.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Project Name");

        jLabel3.setText("Date");

        jLabel4.setText("Due Date");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Math", "Science", "English", "Filipino" }));

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout popLayout = new javax.swing.GroupLayout(pop);
        pop.setLayout(popLayout);
        popLayout.setHorizontalGroup(
            popLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(popLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(datePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(popLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        popLayout.setVerticalGroup(
            popLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(datePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(datePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(1, 105, 105));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("  TASK TRACK");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel9.setAlignmentY(0.0F);
        jLabel9.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIconTextGap(3);
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 49, 128, 33));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/feesss.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 31, -1, -1));

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jDesktopPane1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout1.png"))); // NOI18N

        jLabel6.setText("Recent Project:");
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/newupdate.png"))); // NOI18N
        update.setText("Update");
        update.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N

        jPanel14.setBackground(new java.awt.Color(0, 204, 204));
        jPanel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel14MousePressed(evt);
            }
        });

        settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/settings.png"))); // NOI18N
        settings.setText("Dashboard");
        settings.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        settings.setForeground(new java.awt.Color(255, 255, 255));
        settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(settings, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(settings, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(0, 204, 204));
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel11MousePressed(evt);
            }
        });

        date.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/taskmanagement.png"))); // NOI18N
        date.setText("DateTable");
        date.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        date.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
        );

        jPanel13.setBackground(new java.awt.Color(0, 204, 204));
        jPanel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel13MousePressed(evt);
            }
        });

        stud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/newstudents.png"))); // NOI18N
        stud.setText("Students");
        stud.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        stud.setForeground(new java.awt.Color(255, 255, 255));
        stud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                studMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(stud, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(stud, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(0, 204, 204));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
        });

        classes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/newclasses.png"))); // NOI18N
        classes.setText("Project");
        classes.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        classes.setForeground(new java.awt.Color(255, 255, 255));
        classes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                classesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(classes, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(classes, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
        );

        jPanel15.setBackground(new java.awt.Color(0, 204, 204));
        jPanel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel15MousePressed(evt);
            }
        });

        settings1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/settings.png"))); // NOI18N
        settings1.setText("Settings");
        settings1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        settings1.setForeground(new java.awt.Color(255, 255, 255));
        settings1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settings1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(settings1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(settings1, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(update, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(mainPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(246, 246, 246)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(584, 584, 584)
                                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)))
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        jPanel3.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 145, 1050, 510));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 1050, 690));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MousePressed
        showForms(new DateTableForms());
    }//GEN-LAST:event_jPanel11MousePressed

    private void jPanel13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MousePressed
        showForms(new StudentsForms());
    }//GEN-LAST:event_jPanel13MousePressed

    private void jPanel14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MousePressed
        showForms(new DashBoardForms());
    }//GEN-LAST:event_jPanel14MousePressed

    private void studMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_studMousePressed

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        showForms(new ProjectForms());
    }//GEN-LAST:event_jPanel5MousePressed

    private void settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseClicked
showForms(new DashBoardForms());     
    }//GEN-LAST:event_settingsMouseClicked

    private void studMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studMouseClicked
        showForms(new StudentsForms());
    }//GEN-LAST:event_studMouseClicked

    private void dateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateMouseClicked
       showForms(new DateTableForms());
    }//GEN-LAST:event_dateMouseClicked

    private void classesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classesMouseClicked
        showForms(new ProjectForms());
    }//GEN-LAST:event_classesMouseClicked

    private void settings1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settings1MouseClicked
        showForms(new SettingsForms());
    }//GEN-LAST:event_settings1MouseClicked

    private void jPanel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel15MousePressed

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
            java.util.logging.Logger.getLogger(TeacherDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel classes;
    private javax.swing.JLabel date;
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private com.github.lgooddatepicker.components.DatePicker datePicker2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel pop;
    private javax.swing.JLabel settings;
    private javax.swing.JLabel settings1;
    private javax.swing.JLabel stud;
    private javax.swing.JLabel update;
    // End of variables declaration//GEN-END:variables
}
