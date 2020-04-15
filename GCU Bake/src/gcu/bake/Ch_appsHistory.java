/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcu.bake;
    
import java.awt.BorderLayout;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;


/**
 *
 * @author GroupA1
 */
public class Ch_appsHistory extends javax.swing.JFrame {

    /**
     * Creates new form upcApps
     */
    private final String schID;
    public Ch_appsHistory(String chID) {
        initComponents();
        schID = chID;
        dataFill();
       /* Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        System.out.println(schID);
        try {
            //https://www.youtube.com/watch?v=G4JeKZ6nDUI
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/GCUBake","adam","adam");
            /*  SELECT L.LESSONNAME AS "Lesson Name",(Cu.FIRSTNAME || ' ' || Cu.LASTNAME) AS Name, A.DATE AS Date, A.STATUS as Status
                FROM APPOINTMENTS A
                INNER JOIN CUSTOMERS Cu ON A.CUSTOMERID = Cu.IDCUSTOMER
                INNER JOIN LESSONS L ON A.LESSONID = L.IDLESSON
                WHERE L.CHEFID = 200008; 
            
            String getApps = "SELECT A.IDAPPOINTMENT AS \"Appointment ID\", L.LESSONNAME AS \"Lesson Name\",(Cu.FIRSTNAME || ' ' || Cu.LASTNAME) AS \"Name\", A.DATE AS \"Date\", A.STATUS as \"Status\" FROM APPOINTMENTS A INNER JOIN CUSTOMERS Cu ON A.CUSTOMERID = Cu.IDCUSTOMER INNER JOIN LESSONS L ON A.LESSONID = L.IDLESSON WHERE L.CHEFID = ? AND DATE<CURRENT_DATE";
            pst = conn.prepareStatement(getApps);
            pst.setString(1, schID);
            rs = pst.executeQuery();
            ResultSetMetaData rsmt = rs.getMetaData();
            int c = rsmt.getColumnCount();
            Vector column = new Vector(c);
            for (int i=1;i<=c;i++){
                column.add(rsmt.getColumnName(i));
            }
            Vector data = new Vector();
            Vector row = new Vector();
            while (rs.next()){
                row = new Vector(c);
                for (int i =1;i<=c;i++){
                    row.add(rs.getString(i));
                }
                data.add(row);
            }
            //JFrame frame = new JFrame();
            //frame.setSize(600,120);
            //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //JPanel panel = new JPanel();
            JTable table = new JTable (data,column);
            JScrollPane jsp = new JScrollPane(table);
            jPanel4.setLayout(new BorderLayout());
            jPanel4.add(jsp,BorderLayout.CENTER);
            //frame.setContentPane(panel);
            //frame.setVisible(true);
                    
            
            
            
        } catch (SQLException e) {
            System.out.println(e);
        }  finally {
            try {
            conn.close();
            pst.close();
            rs.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"ERROR");
            }
        } */
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Close = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        Minimize = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        chStatus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));

        Close.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Close.setForeground(new java.awt.Color(255, 255, 255));
        Close.setText("X");
        Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });

        Title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("GCUBake");

        Minimize.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        Minimize.setForeground(new java.awt.Color(255, 255, 255));
        Minimize.setText("-");
        Minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizeMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));

        backButton.setText("Back");
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });

        jPanel4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel4FocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 299, Short.MAX_VALUE)
        );

        chStatus.setText("Change status to Not-complete");
        chStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chStatusMouseClicked(evt);
            }
        });
        chStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(chStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(chStatus))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(318, Short.MAX_VALUE)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167)
                .addComponent(Minimize)
                .addGap(33, 33, 33)
                .addComponent(Close)
                .addGap(34, 34, 34))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Minimize)
                            .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addGap(9, 9, 9)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CloseMouseClicked

    private void dataFill (){
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        System.out.println(schID);
        try {
            //https://www.youtube.com/watch?v=G4JeKZ6nDUI
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/GCUBake","adam","adam");
            /*  SELECT L.LESSONNAME AS "Lesson Name",(Cu.FIRSTNAME || ' ' || Cu.LASTNAME) AS Name, A.DATE AS Date, A.STATUS as Status
                FROM APPOINTMENTS A
                INNER JOIN CUSTOMERS Cu ON A.CUSTOMERID = Cu.IDCUSTOMER
                INNER JOIN LESSONS L ON A.LESSONID = L.IDLESSON
                WHERE L.CHEFID = 200008; 
            */
            String getApps = "SELECT A.IDAPPOINTMENT AS \"Appointment ID\", L.LESSONNAME AS \"Lesson Name\",(Cu.FIRSTNAME || ' ' || Cu.LASTNAME) AS \"Name\", A.DATE AS \"Date\", A.STATUS as \"Status\" FROM APPOINTMENTS A INNER JOIN CUSTOMERS Cu ON A.CUSTOMERID = Cu.IDCUSTOMER INNER JOIN LESSONS L ON A.LESSONID = L.IDLESSON WHERE L.CHEFID = ? AND DATE<CURRENT_DATE ORDER BY 4";
            pst = conn.prepareStatement(getApps);
            pst.setString(1, schID);
            rs = pst.executeQuery();
            ResultSetMetaData rsmt = rs.getMetaData();
            int c = rsmt.getColumnCount();
            Vector column = new Vector(c);
            for (int i=1;i<=c;i++){
                column.add(rsmt.getColumnName(i));
            }
            Vector data = new Vector();
            Vector row = new Vector();
            while (rs.next()){
                row = new Vector(c);
                for (int i =1;i<=c;i++){
                    row.add(rs.getString(i));
                }
                data.add(row);
            }
            //JFrame frame = new JFrame();
            //frame.setSize(600,120);
            //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //JPanel panel = new JPanel();
            JTable table = new JTable (data,column);
            JScrollPane jsp = new JScrollPane(table);
            jPanel4.setLayout(new BorderLayout());
            jPanel4.add(jsp,BorderLayout.CENTER);
            //frame.setContentPane(panel);
            //frame.setVisible(true);
            } catch (SQLException e) {
            System.out.println(e);
        } /* finally {
            try {
            conn.close();
            pst.close();
            rs.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"ERROR");
            }
        } */
    }
    private void MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_MinimizeMouseClicked

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        Ch_Dashboard mainCh = new Ch_Dashboard(schID);
        mainCh.setVisible(true);
        mainCh.pack();
        mainCh.setLocationRelativeTo(null);
        mainCh.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_backButtonMouseClicked

    private void chStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chStatusActionPerformed

    private void chStatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chStatusMouseClicked
        JFrame frame = new JFrame();
        String tempString = JOptionPane.showInputDialog (frame,"Enter Appointment ID");
        if (tempString != null) {
        int id = Integer.parseInt(tempString);
        System.out.println(id);
        Connection conn=null;
        PreparedStatement pst = null;
        try {
            System.out.println("here1");
            String updateStatus = "UPDATE APPOINTMENTS A SET A.STATUS = 'Not-complete' WHERE IDAPPOINTMENT = ?";
            conn= DriverManager.getConnection("jdbc:derby://localhost:1527/GCUBake","adam","adam");
            pst=conn.prepareStatement(updateStatus);
            pst.setInt(1, id);
            pst.executeUpdate();
            Ch_appsHistory appsHistory = new Ch_appsHistory(schID);
            appsHistory.setVisible(true);
            appsHistory.pack();
            appsHistory.setLocationRelativeTo(null);
            appsHistory.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                if (conn != null) conn.close();
                if (pst != null) pst.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
        } else {
            JOptionPane.showMessageDialog(null,"No ID submitted");
        }
    }//GEN-LAST:event_chStatusMouseClicked

    private void jPanel4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel4FocusGained
       
    }//GEN-LAST:event_jPanel4FocusGained



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close;
    private javax.swing.JLabel Minimize;
    private javax.swing.JLabel Title;
    private javax.swing.JButton backButton;
    private javax.swing.JButton chStatus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
