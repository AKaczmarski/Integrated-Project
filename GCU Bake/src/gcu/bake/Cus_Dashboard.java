 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcu.bake;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import javax.swing.JFrame;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import java.util.Date;

/**
 *
 * @author Dziugas
 */
public class Cus_Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Cus_Dashboard
     * @param CustID
     */
    private final String cusID;
    public Cus_Dashboard(String CustID){
        initComponents();
        cusID = CustID;
        this.setLocationRelativeTo(null);
        lessonsComboBoxFillUp();
    }
    
    private void lessonsComboBoxFillUp(){
        //appointmentButton
        try {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/GCUBake","adam","adam");
            String q = "SELECT LESSONNAME AS \"Name\" FROM LESSONS";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(q);
            while(rs.next()){
                String o = rs.getString(1);
                comboBox.addItem(o);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    

    private Cus_Dashboard() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialise the form.
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
        comboBox = new javax.swing.JComboBox<>();
        appointmentButton = new javax.swing.JButton();
        checkAppointmentStatus = new javax.swing.JButton();
        checkAppointmentStatus1 = new javax.swing.JButton();
        checkAppointmentStatus2 = new javax.swing.JButton();
        upcAppDate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

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

        comboBox.setBackground(new java.awt.Color(102, 0, 102));
        comboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboBox.setForeground(new java.awt.Color(240, 240, 240));
        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });

        appointmentButton.setBackground(new java.awt.Color(102, 0, 102));
        appointmentButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        appointmentButton.setForeground(new java.awt.Color(240, 240, 240));
        appointmentButton.setText("Book an Appointment");
        appointmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentButtonActionPerformed(evt);
            }
        });

        checkAppointmentStatus.setBackground(new java.awt.Color(102, 0, 102));
        checkAppointmentStatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        checkAppointmentStatus.setForeground(new java.awt.Color(240, 240, 240));
        checkAppointmentStatus.setText("Upcoming Appointments");
        checkAppointmentStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkAppointmentStatusMouseClicked(evt);
            }
        });
        checkAppointmentStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAppointmentStatusActionPerformed(evt);
            }
        });

        checkAppointmentStatus1.setBackground(new java.awt.Color(102, 0, 102));
        checkAppointmentStatus1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        checkAppointmentStatus1.setForeground(new java.awt.Color(240, 240, 240));
        checkAppointmentStatus1.setText("Cancel Appointment");
        checkAppointmentStatus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAppointmentStatus1ActionPerformed(evt);
            }
        });

        checkAppointmentStatus2.setBackground(new java.awt.Color(102, 0, 102));
        checkAppointmentStatus2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        checkAppointmentStatus2.setForeground(new java.awt.Color(240, 240, 240));
        checkAppointmentStatus2.setText("History of Appointments");
        checkAppointmentStatus2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAppointmentStatus2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboBox, 0, 255, Short.MAX_VALUE)
                    .addComponent(upcAppDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(appointmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(checkAppointmentStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(checkAppointmentStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkAppointmentStatus2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(appointmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkAppointmentStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(checkAppointmentStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(checkAppointmentStatus2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(upcAppDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Minimize)
                .addGap(33, 33, 33)
                .addComponent(Close)
                .addGap(34, 34, 34))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_MinimizeMouseClicked

    private void checkAppointmentStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAppointmentStatusActionPerformed
        
    }//GEN-LAST:event_checkAppointmentStatusActionPerformed

    private void checkAppointmentStatus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAppointmentStatus1ActionPerformed
        String selection = comboBox.getSelectedItem().toString();
        Connection conn;
        Integer ID = 0;
        String url = "jdbc:derby://localhost:1527/GCUBake";
        try {
            conn = DriverManager.getConnection(url,"adam","adam");
            String getIDQuery = "SELECT IDLESSON FROM \"LESSONS\" WHERE \"LESSONNAME\" = ?";
            PreparedStatement stmnt = conn.prepareStatement(getIDQuery);
            stmnt.setString(1, selection);
            ResultSet rs = stmnt.executeQuery();
            while (rs.next()){
                ID=rs.getInt(1);
            }
            String sendIDQuery = "DELETE FROM \"APPOINTMENTS\" WHERE \"LESSONID\" = ? ";
            PreparedStatement stSendIDQuery = conn.prepareStatement(sendIDQuery);
            stSendIDQuery.setInt(1, ID);
            stSendIDQuery.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }
        JOptionPane.showMessageDialog(null,"Appointment Canceled Successfuly!");
    }//GEN-LAST:event_checkAppointmentStatus1ActionPerformed

    private void appointmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentButtonActionPerformed
        String selection = comboBox.getSelectedItem().toString();
        Integer ID = 0;
        Connection conn=null;
        String url = "jdbc:derby://localhost:1527/GCUBake";
        try {
        conn = DriverManager.getConnection(url,"adam","adam");
                String getIDQuery = "SELECT IDLESSON FROM \"LESSONS\" WHERE \"LESSONNAME\" = ?";
                PreparedStatement stmnt = conn.prepareStatement(getIDQuery);
                stmnt.setString(1, selection);
                ResultSet rs = stmnt.executeQuery();
                while (rs.next()){
                    ID=rs.getInt(1);
                }
        } catch (SQLException e){
            System.out.println(e);
        }
                
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String appDate = sdf.format(upcAppDate.getDate());
            Date currDate = new Date();
            Date appDate1 = null;
            try {
            appDate1 = new SimpleDateFormat("yyyy-MM-dd").parse(appDate);   
            } catch (ParseException e) {
                System.out.println(e);
            }
            if (appDate1.compareTo(currDate)>0){               
                SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
                String appDate2 = sdf2.format(upcAppDate.getDate());
                String sendData = "INSERT INTO \"APPOINTMENTS\" (\"CUSTOMERID\", \"LESSONID\", \"DATE\", \"STATUS\") VALUES (?,?,?,?)";
                PreparedStatement stSendData = conn.prepareStatement(sendData);
                stSendData.setString(1, cusID);
                stSendData.setInt(2, ID);
                stSendData.setString(3, appDate);
                stSendData.setString(4, "Beginner");
                stSendData.execute();
                JOptionPane.showMessageDialog(null,"Appointment Booking Completed!");
            } else if (appDate1.compareTo(currDate)<0) {
                JOptionPane.showMessageDialog(null,"Wrong date");
            }

            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_appointmentButtonActionPerformed

    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxActionPerformed

    }//GEN-LAST:event_comboBoxActionPerformed

    private void checkAppointmentStatus2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAppointmentStatus2ActionPerformed
        Cus_historyApps historyApps = new Cus_historyApps(cusID);
        historyApps.setVisible(true);
        historyApps.pack();
        historyApps.setLocationRelativeTo(null);
        historyApps.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_checkAppointmentStatus2ActionPerformed

    private void checkAppointmentStatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkAppointmentStatusMouseClicked
        Cus_upcApps upcApps = new Cus_upcApps(cusID);
        upcApps.setVisible(true);
        upcApps.pack();
        upcApps.setLocationRelativeTo(null);
        upcApps.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_checkAppointmentStatusMouseClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close;
    private javax.swing.JLabel Minimize;
    private javax.swing.JLabel Title;
    private javax.swing.JButton appointmentButton;
    private javax.swing.JButton checkAppointmentStatus;
    private javax.swing.JButton checkAppointmentStatus1;
    private javax.swing.JButton checkAppointmentStatus2;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.toedter.calendar.JDateChooser upcAppDate;
    // End of variables declaration//GEN-END:variables
}