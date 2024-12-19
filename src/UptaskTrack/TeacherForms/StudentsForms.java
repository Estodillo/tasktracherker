
package UptaskTrack.TeacherForms;

import databaseconnector.databaseconnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import raven.glasspanepopup.GlassPanePopup;


public class StudentsForms extends javax.swing.JPanel {
    private PreparedStatement p;
    private AddGrades addGrade;
  
    public StudentsForms() {
        initComponents();
        addGrade = new AddGrades();
        Connection connection = getConnection();
        populateGrade(gradeTbl, connection);
        //need timer pra direct refresh

    }

    public static void populateGrade(javax.swing.JTable gradeTbl, Connection connection) {
    try {
        String sql = """
            SELECT 
                u.idnumber, 
                u.name,
                COALESCE(g.science, 'N/A') AS science,
                COALESCE(g.english, 'N/A') AS english,
                COALESCE(g.math, 'N/A') AS math,
                COALESCE(g.filipino, 'N/A') AS filipino,
                g.idgradetbl
            FROM user u
            LEFT JOIN gradetbl g ON u.idnumber = g.idnumber
            WHERE u.role = 'student'
        """;

        try (PreparedStatement p = connection.prepareStatement(sql);
             ResultSet rs = p.executeQuery()) {

            DefaultTableModel model = (DefaultTableModel) gradeTbl.getModel();
            model.setRowCount(0); // Clear existing rows

            while (rs.next()) {
                Vector<Object> v = new Vector<>();
                v.add(rs.getString("idnumber"));
                v.add(rs.getString("name"));
                v.add(rs.getString("science"));
                v.add(rs.getString("english"));
                v.add(rs.getString("math"));
                v.add(rs.getString("filipino"));
                v.add(rs.getInt("idgradetbl"));
                model.addRow(v);
            }
        }
    } catch (SQLException ex) {
        ex.printStackTrace(); // Replace with proper logging in production
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        gradeTbl = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setText("Student Grade:");
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        gradeTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Number", "Name", "Science", "English", "Math", "Filipino", "idgrade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        gradeTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gradeTblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(gradeTbl);
        if (gradeTbl.getColumnModel().getColumnCount() > 0) {
            gradeTbl.getColumnModel().getColumn(2).setMinWidth(100);
            gradeTbl.getColumnModel().getColumn(2).setPreferredWidth(100);
            gradeTbl.getColumnModel().getColumn(2).setMaxWidth(100);
            gradeTbl.getColumnModel().getColumn(3).setMinWidth(100);
            gradeTbl.getColumnModel().getColumn(3).setPreferredWidth(100);
            gradeTbl.getColumnModel().getColumn(3).setMaxWidth(100);
            gradeTbl.getColumnModel().getColumn(4).setMinWidth(100);
            gradeTbl.getColumnModel().getColumn(4).setPreferredWidth(100);
            gradeTbl.getColumnModel().getColumn(4).setMaxWidth(100);
            gradeTbl.getColumnModel().getColumn(5).setMinWidth(100);
            gradeTbl.getColumnModel().getColumn(5).setPreferredWidth(100);
            gradeTbl.getColumnModel().getColumn(5).setMaxWidth(100);
            gradeTbl.getColumnModel().getColumn(6).setMinWidth(0);
            gradeTbl.getColumnModel().getColumn(6).setPreferredWidth(0);
            gradeTbl.getColumnModel().getColumn(6).setMaxWidth(0);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void gradeTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradeTblMouseClicked
        DefaultTableModel model = (DefaultTableModel) gradeTbl.getModel();
        int SelectedRows = gradeTbl.getSelectedRow();

     
        addGrade.idLbl.setText(gradeTbl.getValueAt(SelectedRows, 0).toString());
        addGrade.nameLbl.setText(gradeTbl.getValueAt(SelectedRows, 1).toString());
        addGrade.gradeid.setText(gradeTbl.getValueAt(SelectedRows, 6).toString());
        GlassPanePopup.showPopup(addGrade);
    }//GEN-LAST:event_gradeTblMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable gradeTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

   

    
}
