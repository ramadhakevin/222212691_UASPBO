/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package perpus.gui;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

/**
 *
 * @author kevinramadha
 */
public class MainFrame extends javax.swing.JFrame {
    private static String dbURL = "jdbc:sqlite:/Users/kevinramadha/Documents/[01] TINGKAT II/[07] PEMROGRAMAN BERBASIS OBJEK/UAS/222212691_UAS/uaspbo.db"; // SQLite database URL
    private int statuslogin = 0;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        
        buttonLogout.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelAtas = new javax.swing.JPanel();
        judulAtas = new javax.swing.JLabel();
        panelSamping = new javax.swing.JPanel();
        buttonMahasiswa = new javax.swing.JButton();
        buttonLogout = new javax.swing.JButton();
        buttonBuku = new javax.swing.JButton();
        buttonPeminjaman = new javax.swing.JButton();
        buttonLoker = new javax.swing.JButton();
        buttonDashboard = new javax.swing.JButton();
        panelIsi = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        userTextField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelAtas.setBackground(new java.awt.Color(3, 4, 94));
        panelAtas.setPreferredSize(new java.awt.Dimension(900, 55));

        judulAtas.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        judulAtas.setForeground(new java.awt.Color(255, 255, 255));
        judulAtas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judulAtas.setText("MANAJEMEN PEMINJAMAN PERPUSTAKAAN");

        javax.swing.GroupLayout panelAtasLayout = new javax.swing.GroupLayout(panelAtas);
        panelAtas.setLayout(panelAtasLayout);
        panelAtasLayout.setHorizontalGroup(
            panelAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAtasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judulAtas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelAtasLayout.setVerticalGroup(
            panelAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAtasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judulAtas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelSamping.setPreferredSize(new java.awt.Dimension(900, 36));

        buttonMahasiswa.setBackground(new java.awt.Color(3, 4, 94));
        buttonMahasiswa.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        buttonMahasiswa.setForeground(new java.awt.Color(255, 255, 255));
        buttonMahasiswa.setText("Mahasiswa");
        buttonMahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMahasiswaActionPerformed(evt);
            }
        });

        buttonLogout.setBackground(new java.awt.Color(193, 18, 31));
        buttonLogout.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        buttonLogout.setForeground(new java.awt.Color(255, 255, 255));
        buttonLogout.setText("Logout");
        buttonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogoutActionPerformed(evt);
            }
        });

        buttonBuku.setBackground(new java.awt.Color(3, 4, 94));
        buttonBuku.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        buttonBuku.setForeground(new java.awt.Color(255, 255, 255));
        buttonBuku.setText("Buku");
        buttonBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBukuActionPerformed(evt);
            }
        });

        buttonPeminjaman.setBackground(new java.awt.Color(3, 4, 94));
        buttonPeminjaman.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        buttonPeminjaman.setForeground(new java.awt.Color(255, 255, 255));
        buttonPeminjaman.setText("Peminjaman");
        buttonPeminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPeminjamanActionPerformed(evt);
            }
        });

        buttonLoker.setBackground(new java.awt.Color(3, 4, 94));
        buttonLoker.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        buttonLoker.setForeground(new java.awt.Color(255, 255, 255));
        buttonLoker.setText("Loker");
        buttonLoker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLokerActionPerformed(evt);
            }
        });

        buttonDashboard.setBackground(new java.awt.Color(3, 4, 94));
        buttonDashboard.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        buttonDashboard.setForeground(new java.awt.Color(255, 255, 255));
        buttonDashboard.setText("Dashboard");
        buttonDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDashboardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSampingLayout = new javax.swing.GroupLayout(panelSamping);
        panelSamping.setLayout(panelSampingLayout);
        panelSampingLayout.setHorizontalGroup(
            panelSampingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSampingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonMahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonLoker, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 430, Short.MAX_VALUE)
                .addComponent(buttonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelSampingLayout.setVerticalGroup(
            panelSampingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSampingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSampingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonMahasiswa, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addGroup(panelSampingLayout.createSequentialGroup()
                        .addGroup(panelSampingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonLogout)
                            .addComponent(buttonBuku)
                            .addComponent(buttonPeminjaman)
                            .addComponent(buttonLoker)
                            .addComponent(buttonDashboard))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        panelIsi.setPreferredSize(new java.awt.Dimension(900, 499));
        panelIsi.setLayout(new java.awt.CardLayout());

        loginPanel.setBackground(new java.awt.Color(0, 180, 216));

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/logostis.png"))); // NOI18N

        passLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        passLabel.setForeground(new java.awt.Color(255, 255, 255));
        passLabel.setText("Password ");

        userLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        userLabel.setForeground(new java.awt.Color(255, 255, 255));
        userLabel.setText("Username ");

        userTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTextFieldActionPerformed(evt);
            }
        });

        passwordField.setText("jPasswordField1");

        loginButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        loginButton.setForeground(new java.awt.Color(3, 4, 94));
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(logoLabel)
                .addGap(46, 46, 46)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(userTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(userLabel)
                        .addComponent(passLabel)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(loginButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(477, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(passLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(loginButton))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(logoLabel)))
                .addContainerGap(162, Short.MAX_VALUE))
        );

        panelIsi.add(loginPanel, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSamping, javax.swing.GroupLayout.DEFAULT_SIZE, 1150, Short.MAX_VALUE)
            .addComponent(panelIsi, javax.swing.GroupLayout.DEFAULT_SIZE, 1150, Short.MAX_VALUE)
            .addComponent(panelAtas, javax.swing.GroupLayout.DEFAULT_SIZE, 1150, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelAtas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSamping, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelIsi, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMahasiswaActionPerformed
        // TODO add your handling code here:
        if (statuslogin == 1){
            panelIsi.removeAll();
            panelIsi.add(new MahasiswaPanel());
            panelIsi.repaint();
            panelIsi.revalidate();
        }else{
            JOptionPane.showMessageDialog(this,"Login Terlebih Dahulu");
        }
    }//GEN-LAST:event_buttonMahasiswaActionPerformed

    private void buttonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogoutActionPerformed
        // TODO add your handling code here:
        if (statuslogin == 1){
            panelIsi.removeAll();
            panelIsi.add(loginPanel);
            panelIsi.repaint();
            panelIsi.revalidate();
            statuslogin=0;
            buttonLogout.setVisible(false);
        }
    }//GEN-LAST:event_buttonLogoutActionPerformed

    private void buttonBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBukuActionPerformed
        // TODO add your handling code here:
        if (statuslogin == 1){
            panelIsi.removeAll();
            panelIsi.add(new BukuPanel());
            panelIsi.repaint();
            panelIsi.revalidate();
        }else{
            JOptionPane.showMessageDialog(this,"Login Terlebih Dahulu");
        }
    }//GEN-LAST:event_buttonBukuActionPerformed

    private void buttonPeminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPeminjamanActionPerformed
        // TODO add your handling code here:
        if (statuslogin == 1){
            panelIsi.removeAll();
            panelIsi.add(new PeminjamanPanel());
            panelIsi.repaint();
            panelIsi.revalidate();
        }else{
            JOptionPane.showMessageDialog(this,"Login Terlebih Dahulu");
        } 
    }//GEN-LAST:event_buttonPeminjamanActionPerformed

    private void buttonLokerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLokerActionPerformed
        // TODO add your handling code here:
        if (statuslogin == 1){
            panelIsi.removeAll();
            panelIsi.add(new LokerPanel());
            panelIsi.repaint();
            panelIsi.revalidate();
        }else{
            JOptionPane.showMessageDialog(this,"Login Terlebih Dahulu");
        }
    }//GEN-LAST:event_buttonLokerActionPerformed

    private void userTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTextFieldActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        // Ambil username dan password dari input field
        String inputUsername = userTextField.getText();
        String inputPassword = new String(passwordField.getPassword());

        try {
            // Buat koneksi ke database SQLite
            Connection koneksi = DriverManager.getConnection(dbURL);

            // Eksekusi query SQL untuk memilih dari tabel admin
            String sql = "SELECT * FROM admin WHERE username = ? AND password = ?";
            PreparedStatement stmt = koneksi.prepareStatement(sql);
            stmt.setString(1, inputUsername);
            stmt.setString(2, inputPassword);

            // Eksekusi query
            ResultSet rs = stmt.executeQuery();

            // Periksa apakah ada kecocokan
            if (rs.next()) {
                panelIsi.removeAll();
                panelIsi.add(new HomePanel());
                panelIsi.repaint();
                panelIsi.revalidate();
                buttonLogout.setVisible(true);
                statuslogin = 1;
            } else {
                JOptionPane.showMessageDialog(this, "Password atau username salah");
            }

            // Tutup ResultSet dan Statement
            rs.close();
            stmt.close();
            koneksi.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void buttonDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDashboardActionPerformed
        // TODO add your handling code here:
        if (statuslogin == 1){
            panelIsi.removeAll();
            panelIsi.add(new DashboardPanel());
            panelIsi.repaint();
            panelIsi.revalidate();
        }else{
            JOptionPane.showMessageDialog(this,"Login Terlebih Dahulu");
        }
    }//GEN-LAST:event_buttonDashboardActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBuku;
    private javax.swing.JButton buttonDashboard;
    private javax.swing.JButton buttonLogout;
    private javax.swing.JButton buttonLoker;
    private javax.swing.JButton buttonMahasiswa;
    private javax.swing.JButton buttonPeminjaman;
    private javax.swing.JLabel judulAtas;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel panelAtas;
    private javax.swing.JPanel panelIsi;
    private javax.swing.JPanel panelSamping;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel userLabel;
    private javax.swing.JTextField userTextField;
    // End of variables declaration//GEN-END:variables
}