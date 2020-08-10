/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.gui;

import java.awt.Color;
import java.awt.Font;
import static java.awt.event.ItemEvent.DESELECTED;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import techquizapp.dao.ExamDAO;
import techquizapp.pojo.ExamPojo;
import techquizapp.pojo.UserProfile;

/**
 *
 * @author Sameer
 */
public class PaperSelectionFrame extends javax.swing.JFrame {

    private String subjectName;
    public PaperSelectionFrame() {
        initComponents();
        super.setLocationRelativeTo(null);
        lblUsername.setText("Hello "+UserProfile.getUsername());
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
        lblLogout = new javax.swing.JLabel();
        jcLanguage = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jcExamId = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        btnTakeTest = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        lblLogout.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 153, 0));
        lblLogout.setText("Logout");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
        });

        jcLanguage.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "                   ", "Java", "C", "C++" }));
        jcLanguage.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcLanguageItemStateChanged(evt);
            }
        });
        jcLanguage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcLanguageActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("Choose The Subject");

        jcExamId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcExamIdActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setText("Choose the Exam Id");

        btnTakeTest.setBackground(new java.awt.Color(0, 0, 0));
        btnTakeTest.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnTakeTest.setForeground(new java.awt.Color(255, 153, 0));
        btnTakeTest.setText("Take The Test");
        btnTakeTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTakeTestActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setText("PAPER SELECTION PANEL");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Set Paper Details");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techquizapp/onlineexam/docicon.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        lblUsername.setBackground(new java.awt.Color(153, 0, 204));
        lblUsername.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 153, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTakeTest)
                            .addComponent(jcLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jcExamId, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(126, 126, 126))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLogout))
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jcLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcExamId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnTakeTest)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        LoginFrame lf = new LoginFrame();
        lf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        lblLogout.setForeground(Color.WHITE);
        Font f = new Font("Tahoma",Font.BOLD,12);
        lblLogout.setFont(f);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
        lblLogout.setForeground(new Color(255,153,0));
        Font f = new Font("Tahoma",Font.PLAIN,12);
        lblLogout.setFont(f);
    }//GEN-LAST:event_lblLogoutMouseExited

    private void jcExamIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcExamIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcExamIdActionPerformed

    private void btnTakeTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTakeTestActionPerformed
        int count = 0;
        count = jcLanguage.getSelectedIndex();
         if(count == 0)
        {
            JOptionPane.showMessageDialog(null, "Please select a Subject","Choose!",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        count = jcExamId.getItemCount();
        if(count == 0)
        {
            JOptionPane.showMessageDialog(null, "Please select an Exam Id","Choose!",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        String subject = jcLanguage.getSelectedItem().toString();
        String examId = jcExamId.getSelectedItem().toString();
        int ans; 
        ans = JOptionPane.showConfirmDialog(null, "You have choosen\""+subject+"\"and\""+examId+"\"paper!\n","Is this Ok?",JOptionPane.YES_NO_OPTION);
        
        if(ans == JOptionPane.YES_OPTION)
        {
        try {
            int total = ExamDAO.getQuestionCountByExam(examId.trim());
            ExamPojo exam = new ExamPojo(examId,subject,total);
            System.out.println(exam);
            TakeTestFrame tf = new TakeTestFrame(exam);
            tf.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception123 : " + ex,"Error",JOptionPane.ERROR_MESSAGE);
        }
        }
    }//GEN-LAST:event_btnTakeTestActionPerformed

    private void jcLanguageItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcLanguageItemStateChanged
        if(evt.getStateChange()==DESELECTED)
            return;
             if(validateInputs()==false)
             {
                 JOptionPane.showMessageDialog(null, "Enter Details!!","Warning!",JOptionPane.INFORMATION_MESSAGE);
                 return;
             }
            jcExamId.removeAllItems();
        try {
            ExamDAO ed = new ExamDAO();
            if(ed.isPaperSet(subjectName)==false)
            {
                JOptionPane.showMessageDialog(null,"No Paperset is Available for this Language","Paper not found!",JOptionPane.ERROR_MESSAGE);
                return;
            }
            ArrayList<String> examList = ed.getExamIdBySubject(UserProfile.getUsername(),subjectName);
            if(examList.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "You have given all exam for "+subjectName, "Subject Not Found!",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            for(String s:examList)
            {
                jcExamId.addItem(s);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception : " + ex,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jcLanguageItemStateChanged

    private void jcLanguageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcLanguageActionPerformed

    }//GEN-LAST:event_jcLanguageActionPerformed

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
            java.util.logging.Logger.getLogger(PaperSelectionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaperSelectionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaperSelectionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaperSelectionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaperSelectionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTakeTest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox jcExamId;
    private javax.swing.JComboBox jcLanguage;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblUsername;
    // End of variables declaration//GEN-END:variables
    public boolean validateInputs()
    {
            int selectedIndex=jcLanguage.getSelectedIndex();
        if(selectedIndex==0)
        {
            return false;
        }
        subjectName =jcLanguage.getSelectedItem().toString() ;
        return true;
    }
}