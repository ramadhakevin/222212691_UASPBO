/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package perpus.gui;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import perpus.entity.Buku;
import perpus.repository.BukuRepository;

/**
 *
 * @author kevinramadha
 */
public class DashboardPanel extends javax.swing.JPanel {

    /**
     * Creates new form DashboardPanel
     */
    public DashboardPanel() {
        initComponents();
        
        loadDashboard();
    }
   
    
    private void loadDashboard(){
        try {
            //isi tabel
            int jmlbuku=0;
            int jmlStat=0; 
            int jmlEko=0; 
            int jmlDemo=0; 
            int jmlTk=0; 
            int jmlUmum=0;
            for(Buku buku:BukuRepository.getInstance().getList()){
                jmlbuku += buku.getJumlah();
                if (null != buku.getJenis())
                    switch (buku.getJenis()) {
                    case "Statistika" -> jmlStat += buku.getJumlah();
                    case "Ekonomi" -> jmlEko += buku.getJumlah();
                    case "Demografi" -> jmlDemo += buku.getJumlah();
                    case "Teknologi" -> jmlTk += buku.getJumlah();
                    case "Umum" -> jmlUmum += buku.getJumlah();
                    default -> {
                    }
                }
            }
            //Tampilkan Jumlah Buku
            jumlah.setText(""+jmlbuku);
   
            
            //Tampilkan Jumlah Buku Per Jenis
            aStatistika.setText(""+jmlStat);
            aEkonomi.setText(""+jmlEko);
            aDemografi.setText(""+jmlDemo);
            aTeknologi.setText(""+jmlTk);
            aUmum.setText(""+jmlUmum);
            
        } catch (SQLException ex) {
            System.err.println(ex);
            JOptionPane.showMessageDialog(this, "Gagal mengambil data", "Gagal", JOptionPane.ERROR_MESSAGE);
        }
        
        try {
            //isi tabel
            int jmlbuku=0;
            int jmlStat=0; 
            int jmlEko=0; 
            int jmlDemo=0; 
            int jmlTk=0; 
            int jmlUmum=0;
            for(Buku buku:BukuRepository.getInstance().getList()){
                jmlbuku += buku.getDipinjam();
                if (null != buku.getJenis())
                    switch (buku.getJenis()) {
                    case "Statistika" -> jmlStat += buku.getDipinjam();
                    case "Ekonomi" -> jmlEko += buku.getDipinjam();
                    case "Demografi" -> jmlDemo += buku.getDipinjam();
                    case "Teknologi" -> jmlTk += buku.getDipinjam();
                    case "Umum" -> jmlUmum += buku.getDipinjam();
                    default -> {
                    }
                }
            }
            //Tampilkan Jumlah Buku yang Dipinjam
            jumlahDipinjam.setText(""+jmlbuku);
   
            
            //Tampilkan Jumlah Buku yang Dipinjam Per Jenis
            bStatistika.setText(""+jmlStat);
            bEkonomi.setText(""+jmlEko);
            bDemografi.setText(""+jmlDemo);
            bTeknologi.setText(""+jmlTk);
            bUmum.setText(""+jmlUmum);
            
        } catch (SQLException ex) {
            System.err.println(ex);
            JOptionPane.showMessageDialog(this, "Gagal mengambil data", "Gagal", JOptionPane.ERROR_MESSAGE);
        }
        
        try {
            //isi tabel
            int jmlbuku=0;
            int jmlStat=0; 
            int jmlEko=0; 
            int jmlDemo=0; 
            int jmlTk=0; 
            int jmlUmum=0;
            for(Buku buku:BukuRepository.getInstance().getList()){
                jmlbuku += buku.getTersedia();
                if (null != buku.getJenis())
                    switch (buku.getJenis()) {
                    case "Statistika" -> jmlStat += buku.getTersedia();
                    case "Ekonomi" -> jmlEko += buku.getTersedia();
                    case "Demografi" -> jmlDemo += buku.getTersedia();
                    case "Teknologi" -> jmlTk += buku.getTersedia();
                    case "Umum" -> jmlUmum += buku.getTersedia();
                    default -> {
                    }
                }
            }
            //Tampilkan Jumlah Buku yang Tersedia
            jumlahTersedia.setText(""+jmlbuku);
   
            
            //Tampilkan Jumlah Buku yang Tersedia Per Jenis
            cStatistika.setText(""+jmlStat);
            cEkonomi.setText(""+jmlEko);
            cDemografi.setText(""+jmlDemo);
            cTeknologi.setText(""+jmlTk);
            cUmum.setText(""+jmlUmum);
            
        } catch (SQLException ex) {
            System.err.println(ex);
            JOptionPane.showMessageDialog(this, "Gagal mengambil data", "Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jmlJenisLabel = new javax.swing.JLabel();
        jmlLabel = new javax.swing.JLabel();
        jmlPanel = new javax.swing.JPanel();
        jumlah = new javax.swing.JLabel();
        jmlPinjamLabel = new javax.swing.JLabel();
        jmlPinjamJenisLabel1 = new javax.swing.JLabel();
        jmlTersediaLabel = new javax.swing.JLabel();
        jmlPinjamPanel = new javax.swing.JPanel();
        jumlahDipinjam = new javax.swing.JLabel();
        jmlTersediaJenisLabel = new javax.swing.JLabel();
        jmlTersediaPanel = new javax.swing.JPanel();
        jumlahTersedia = new javax.swing.JLabel();
        jStatistika = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        aStatistika = new javax.swing.JLabel();
        jEkonomi = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        aEkonomi = new javax.swing.JLabel();
        jDemografi = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        aDemografi = new javax.swing.JLabel();
        jTekno = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        aTeknologi = new javax.swing.JLabel();
        jUmum = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        aUmum = new javax.swing.JLabel();
        dStatistika = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        bStatistika = new javax.swing.JLabel();
        dEkonomi = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        bEkonomi = new javax.swing.JLabel();
        dDemografi = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        bDemografi = new javax.swing.JLabel();
        dTekno = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        bTeknologi = new javax.swing.JLabel();
        dUmum = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        bUmum = new javax.swing.JLabel();
        tStatistika = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cStatistika = new javax.swing.JLabel();
        tEkonomi = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cEkonomi = new javax.swing.JLabel();
        tDemografi = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cDemografi = new javax.swing.JLabel();
        tTekno = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        cTeknologi = new javax.swing.JLabel();
        tUmum = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        cUmum = new javax.swing.JLabel();

        setBackground(new java.awt.Color(3, 4, 94));
        setForeground(new java.awt.Color(246, 241, 241));

        jmlJenisLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jmlJenisLabel.setForeground(new java.awt.Color(246, 241, 241));
        jmlJenisLabel.setText("Jumlah Buku Berdasarkan Jenis");

        jmlLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jmlLabel.setForeground(new java.awt.Color(246, 241, 241));
        jmlLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jmlLabel.setText("JUMLAH BUKU");

        jmlPanel.setBackground(new java.awt.Color(202, 240, 248));
        jmlPanel.setMaximumSize(new java.awt.Dimension(120, 70));
        jmlPanel.setMinimumSize(new java.awt.Dimension(120, 70));
        jmlPanel.setPreferredSize(new java.awt.Dimension(120, 70));

        jumlah.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jumlah.setText("0");

        javax.swing.GroupLayout jmlPanelLayout = new javax.swing.GroupLayout(jmlPanel);
        jmlPanel.setLayout(jmlPanelLayout);
        jmlPanelLayout.setHorizontalGroup(
            jmlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jmlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jmlPanelLayout.createSequentialGroup()
                    .addGap(0, 67, Short.MAX_VALUE)
                    .addComponent(jumlah)
                    .addGap(0, 68, Short.MAX_VALUE)))
        );
        jmlPanelLayout.setVerticalGroup(
            jmlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jmlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jmlPanelLayout.createSequentialGroup()
                    .addGap(0, 23, Short.MAX_VALUE)
                    .addComponent(jumlah)
                    .addGap(0, 24, Short.MAX_VALUE)))
        );

        jmlPinjamLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jmlPinjamLabel.setForeground(new java.awt.Color(246, 241, 241));
        jmlPinjamLabel.setText("JUMLAH BUKU DIPINJAM");

        jmlPinjamJenisLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jmlPinjamJenisLabel1.setForeground(new java.awt.Color(246, 241, 241));
        jmlPinjamJenisLabel1.setText("Jumlah Buku dalam Peminjaman Berdasarkan Jenis");

        jmlTersediaLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jmlTersediaLabel.setForeground(new java.awt.Color(246, 241, 241));
        jmlTersediaLabel.setText("JUMLAH BUKU TERSEDIA");

        jmlPinjamPanel.setBackground(new java.awt.Color(202, 240, 248));
        jmlPinjamPanel.setForeground(new java.awt.Color(20, 108, 148));

        jumlahDipinjam.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jumlahDipinjam.setText("0");

        javax.swing.GroupLayout jmlPinjamPanelLayout = new javax.swing.GroupLayout(jmlPinjamPanel);
        jmlPinjamPanel.setLayout(jmlPinjamPanelLayout);
        jmlPinjamPanelLayout.setHorizontalGroup(
            jmlPinjamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jmlPinjamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jmlPinjamPanelLayout.createSequentialGroup()
                    .addGap(0, 67, Short.MAX_VALUE)
                    .addComponent(jumlahDipinjam)
                    .addGap(0, 68, Short.MAX_VALUE)))
        );
        jmlPinjamPanelLayout.setVerticalGroup(
            jmlPinjamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jmlPinjamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jmlPinjamPanelLayout.createSequentialGroup()
                    .addGap(0, 27, Short.MAX_VALUE)
                    .addComponent(jumlahDipinjam)
                    .addGap(0, 27, Short.MAX_VALUE)))
        );

        jmlTersediaJenisLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jmlTersediaJenisLabel.setForeground(new java.awt.Color(246, 241, 241));
        jmlTersediaJenisLabel.setText("Jumlah Buku Tersedia Berdasarkan Jenis");

        jmlTersediaPanel.setBackground(new java.awt.Color(202, 240, 248));
        jmlTersediaPanel.setForeground(new java.awt.Color(20, 108, 148));

        jumlahTersedia.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jumlahTersedia.setText("0");

        javax.swing.GroupLayout jmlTersediaPanelLayout = new javax.swing.GroupLayout(jmlTersediaPanel);
        jmlTersediaPanel.setLayout(jmlTersediaPanelLayout);
        jmlTersediaPanelLayout.setHorizontalGroup(
            jmlTersediaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jmlTersediaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jmlTersediaPanelLayout.createSequentialGroup()
                    .addGap(0, 82, Short.MAX_VALUE)
                    .addComponent(jumlahTersedia)
                    .addGap(0, 82, Short.MAX_VALUE)))
        );
        jmlTersediaPanelLayout.setVerticalGroup(
            jmlTersediaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jmlTersediaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jmlTersediaPanelLayout.createSequentialGroup()
                    .addGap(0, 26, Short.MAX_VALUE)
                    .addComponent(jumlahTersedia)
                    .addGap(0, 25, Short.MAX_VALUE)))
        );

        jStatistika.setBackground(new java.awt.Color(0, 180, 216));
        jStatistika.setMaximumSize(new java.awt.Dimension(120, 70));
        jStatistika.setMinimumSize(new java.awt.Dimension(120, 70));
        jStatistika.setPreferredSize(new java.awt.Dimension(120, 70));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Statistika");

        aStatistika.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        aStatistika.setForeground(new java.awt.Color(255, 255, 255));
        aStatistika.setText("0");

        javax.swing.GroupLayout jStatistikaLayout = new javax.swing.GroupLayout(jStatistika);
        jStatistika.setLayout(jStatistikaLayout);
        jStatistikaLayout.setHorizontalGroup(
            jStatistikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jStatistikaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jStatistikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jStatistikaLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(aStatistika)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jStatistikaLayout.setVerticalGroup(
            jStatistikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jStatistikaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aStatistika)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jEkonomi.setBackground(new java.awt.Color(0, 180, 216));
        jEkonomi.setMaximumSize(new java.awt.Dimension(120, 70));
        jEkonomi.setMinimumSize(new java.awt.Dimension(120, 70));
        jEkonomi.setPreferredSize(new java.awt.Dimension(120, 70));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(246, 241, 241));
        jLabel4.setText("Ekonomi");

        aEkonomi.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        aEkonomi.setForeground(new java.awt.Color(246, 241, 241));
        aEkonomi.setText("0");

        javax.swing.GroupLayout jEkonomiLayout = new javax.swing.GroupLayout(jEkonomi);
        jEkonomi.setLayout(jEkonomiLayout);
        jEkonomiLayout.setHorizontalGroup(
            jEkonomiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEkonomiLayout.createSequentialGroup()
                .addGroup(jEkonomiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jEkonomiLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(jEkonomiLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(aEkonomi)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jEkonomiLayout.setVerticalGroup(
            jEkonomiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEkonomiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aEkonomi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDemografi.setBackground(new java.awt.Color(0, 180, 216));
        jDemografi.setMaximumSize(new java.awt.Dimension(120, 70));
        jDemografi.setMinimumSize(new java.awt.Dimension(120, 70));
        jDemografi.setPreferredSize(new java.awt.Dimension(120, 70));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Demografi");

        aDemografi.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        aDemografi.setForeground(new java.awt.Color(255, 255, 255));
        aDemografi.setText("0");

        javax.swing.GroupLayout jDemografiLayout = new javax.swing.GroupLayout(jDemografi);
        jDemografi.setLayout(jDemografiLayout);
        jDemografiLayout.setHorizontalGroup(
            jDemografiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDemografiLayout.createSequentialGroup()
                .addGroup(jDemografiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDemografiLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3))
                    .addGroup(jDemografiLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(aDemografi)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDemografiLayout.setVerticalGroup(
            jDemografiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDemografiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aDemografi)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jTekno.setBackground(new java.awt.Color(0, 180, 216));
        jTekno.setMaximumSize(new java.awt.Dimension(120, 70));
        jTekno.setMinimumSize(new java.awt.Dimension(120, 70));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(246, 241, 241));
        jLabel2.setText("Teknologi");

        aTeknologi.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        aTeknologi.setForeground(new java.awt.Color(246, 241, 241));
        aTeknologi.setText("0");

        javax.swing.GroupLayout jTeknoLayout = new javax.swing.GroupLayout(jTekno);
        jTekno.setLayout(jTeknoLayout);
        jTeknoLayout.setHorizontalGroup(
            jTeknoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTeknoLayout.createSequentialGroup()
                .addGroup(jTeknoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jTeknoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(jTeknoLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(aTeknologi)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jTeknoLayout.setVerticalGroup(
            jTeknoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTeknoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aTeknologi)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jUmum.setBackground(new java.awt.Color(0, 180, 216));
        jUmum.setMaximumSize(new java.awt.Dimension(120, 70));
        jUmum.setMinimumSize(new java.awt.Dimension(120, 70));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Umum");

        aUmum.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        aUmum.setForeground(new java.awt.Color(255, 255, 255));
        aUmum.setText("0");

        javax.swing.GroupLayout jUmumLayout = new javax.swing.GroupLayout(jUmum);
        jUmum.setLayout(jUmumLayout);
        jUmumLayout.setHorizontalGroup(
            jUmumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jUmumLayout.createSequentialGroup()
                .addGroup(jUmumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jUmumLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel5))
                    .addGroup(jUmumLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(aUmum)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jUmumLayout.setVerticalGroup(
            jUmumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jUmumLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aUmum)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        dStatistika.setBackground(new java.awt.Color(0, 180, 216));
        dStatistika.setMaximumSize(new java.awt.Dimension(120, 70));
        dStatistika.setMinimumSize(new java.awt.Dimension(120, 70));

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(246, 241, 241));
        jLabel11.setText("Statistika");

        bStatistika.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        bStatistika.setForeground(new java.awt.Color(246, 241, 241));
        bStatistika.setText("0");

        javax.swing.GroupLayout dStatistikaLayout = new javax.swing.GroupLayout(dStatistika);
        dStatistika.setLayout(dStatistikaLayout);
        dStatistikaLayout.setHorizontalGroup(
            dStatistikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dStatistikaLayout.createSequentialGroup()
                .addGroup(dStatistikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dStatistikaLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(bStatistika))
                    .addGroup(dStatistikaLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dStatistikaLayout.setVerticalGroup(
            dStatistikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dStatistikaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bStatistika)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dEkonomi.setBackground(new java.awt.Color(0, 180, 216));
        dEkonomi.setMaximumSize(new java.awt.Dimension(120, 70));
        dEkonomi.setMinimumSize(new java.awt.Dimension(120, 70));

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Ekonomi");

        bEkonomi.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        bEkonomi.setForeground(new java.awt.Color(255, 255, 255));
        bEkonomi.setText("0");

        javax.swing.GroupLayout dEkonomiLayout = new javax.swing.GroupLayout(dEkonomi);
        dEkonomi.setLayout(dEkonomiLayout);
        dEkonomiLayout.setHorizontalGroup(
            dEkonomiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dEkonomiLayout.createSequentialGroup()
                .addGroup(dEkonomiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dEkonomiLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel12))
                    .addGroup(dEkonomiLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(bEkonomi)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dEkonomiLayout.setVerticalGroup(
            dEkonomiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dEkonomiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bEkonomi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dDemografi.setBackground(new java.awt.Color(0, 180, 216));

        jLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(246, 241, 241));
        jLabel13.setText("Demografi");

        bDemografi.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        bDemografi.setForeground(new java.awt.Color(246, 241, 241));
        bDemografi.setText("0");

        javax.swing.GroupLayout dDemografiLayout = new javax.swing.GroupLayout(dDemografi);
        dDemografi.setLayout(dDemografiLayout);
        dDemografiLayout.setHorizontalGroup(
            dDemografiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dDemografiLayout.createSequentialGroup()
                .addGroup(dDemografiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dDemografiLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel13))
                    .addGroup(dDemografiLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(bDemografi)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        dDemografiLayout.setVerticalGroup(
            dDemografiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dDemografiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bDemografi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dTekno.setBackground(new java.awt.Color(0, 180, 216));

        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Teknologi");

        bTeknologi.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        bTeknologi.setForeground(new java.awt.Color(255, 255, 255));
        bTeknologi.setText("0");

        javax.swing.GroupLayout dTeknoLayout = new javax.swing.GroupLayout(dTekno);
        dTekno.setLayout(dTeknoLayout);
        dTeknoLayout.setHorizontalGroup(
            dTeknoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dTeknoLayout.createSequentialGroup()
                .addGroup(dTeknoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dTeknoLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel14))
                    .addGroup(dTeknoLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(bTeknologi)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        dTeknoLayout.setVerticalGroup(
            dTeknoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dTeknoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bTeknologi)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        dUmum.setBackground(new java.awt.Color(0, 180, 216));

        jLabel15.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(246, 241, 241));
        jLabel15.setText("Umum");

        bUmum.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        bUmum.setForeground(new java.awt.Color(246, 241, 241));
        bUmum.setText("0");

        javax.swing.GroupLayout dUmumLayout = new javax.swing.GroupLayout(dUmum);
        dUmum.setLayout(dUmumLayout);
        dUmumLayout.setHorizontalGroup(
            dUmumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dUmumLayout.createSequentialGroup()
                .addGroup(dUmumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dUmumLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel15))
                    .addGroup(dUmumLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(bUmum)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        dUmumLayout.setVerticalGroup(
            dUmumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dUmumLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bUmum)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tStatistika.setBackground(new java.awt.Color(0, 180, 216));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Statistika");

        cStatistika.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        cStatistika.setForeground(new java.awt.Color(255, 255, 255));
        cStatistika.setText("0");

        javax.swing.GroupLayout tStatistikaLayout = new javax.swing.GroupLayout(tStatistika);
        tStatistika.setLayout(tStatistikaLayout);
        tStatistikaLayout.setHorizontalGroup(
            tStatistikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tStatistikaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel6)
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tStatistikaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cStatistika)
                .addGap(42, 42, 42))
        );
        tStatistikaLayout.setVerticalGroup(
            tStatistikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tStatistikaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cStatistika)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tEkonomi.setBackground(new java.awt.Color(0, 180, 216));

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(246, 241, 241));
        jLabel7.setText("Ekonomi");

        cEkonomi.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        cEkonomi.setForeground(new java.awt.Color(246, 241, 241));
        cEkonomi.setText("0");

        javax.swing.GroupLayout tEkonomiLayout = new javax.swing.GroupLayout(tEkonomi);
        tEkonomi.setLayout(tEkonomiLayout);
        tEkonomiLayout.setHorizontalGroup(
            tEkonomiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tEkonomiLayout.createSequentialGroup()
                .addGroup(tEkonomiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tEkonomiLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel7))
                    .addGroup(tEkonomiLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(cEkonomi)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        tEkonomiLayout.setVerticalGroup(
            tEkonomiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tEkonomiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cEkonomi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tDemografi.setBackground(new java.awt.Color(0, 180, 216));

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Demografi");

        cDemografi.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        cDemografi.setForeground(new java.awt.Color(255, 255, 255));
        cDemografi.setText("0");

        javax.swing.GroupLayout tDemografiLayout = new javax.swing.GroupLayout(tDemografi);
        tDemografi.setLayout(tDemografiLayout);
        tDemografiLayout.setHorizontalGroup(
            tDemografiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tDemografiLayout.createSequentialGroup()
                .addGroup(tDemografiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tDemografiLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel8))
                    .addGroup(tDemografiLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(cDemografi)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        tDemografiLayout.setVerticalGroup(
            tDemografiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tDemografiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cDemografi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tTekno.setBackground(new java.awt.Color(0, 180, 216));

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(246, 241, 241));
        jLabel9.setText("Teknologi");

        cTeknologi.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        cTeknologi.setForeground(new java.awt.Color(246, 241, 241));
        cTeknologi.setText("0");

        javax.swing.GroupLayout tTeknoLayout = new javax.swing.GroupLayout(tTekno);
        tTekno.setLayout(tTeknoLayout);
        tTeknoLayout.setHorizontalGroup(
            tTeknoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tTeknoLayout.createSequentialGroup()
                .addGroup(tTeknoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tTeknoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel9))
                    .addGroup(tTeknoLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(cTeknologi)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        tTeknoLayout.setVerticalGroup(
            tTeknoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tTeknoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cTeknologi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tUmum.setBackground(new java.awt.Color(0, 180, 216));

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Umum");

        cUmum.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        cUmum.setForeground(new java.awt.Color(255, 255, 255));
        cUmum.setText("0");

        javax.swing.GroupLayout tUmumLayout = new javax.swing.GroupLayout(tUmum);
        tUmum.setLayout(tUmumLayout);
        tUmumLayout.setHorizontalGroup(
            tUmumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tUmumLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel10)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tUmumLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cUmum)
                .addGap(42, 42, 42))
        );
        tUmumLayout.setVerticalGroup(
            tUmumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tUmumLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cUmum)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jmlTersediaLabel)
                    .addComponent(jmlLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jmlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jmlPinjamPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jmlPinjamLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jmlTersediaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jmlJenisLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jStatistika, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jEkonomi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dStatistika, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dEkonomi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jDemografi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTekno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dDemografi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dTekno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jUmum, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dUmum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tStatistika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tEkonomi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tDemografi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tTekno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tUmum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jmlPinjamJenisLabel1)
                    .addComponent(jmlTersediaJenisLabel))
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jmlJenisLabel)
                    .addComponent(jmlLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jEkonomi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                        .addComponent(jStatistika, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                        .addComponent(jUmum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jmlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(jTekno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jmlPinjamLabel)
                            .addComponent(jmlPinjamJenisLabel1)))
                    .addComponent(jDemografi, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dTekno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dStatistika, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dEkonomi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dDemografi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jmlPinjamPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dUmum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jmlTersediaLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jmlTersediaJenisLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tUmum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tTekno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jmlTersediaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tStatistika, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tEkonomi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tDemografi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aDemografi;
    private javax.swing.JLabel aEkonomi;
    private javax.swing.JLabel aStatistika;
    private javax.swing.JLabel aTeknologi;
    private javax.swing.JLabel aUmum;
    private javax.swing.JLabel bDemografi;
    private javax.swing.JLabel bEkonomi;
    private javax.swing.JLabel bStatistika;
    private javax.swing.JLabel bTeknologi;
    private javax.swing.JLabel bUmum;
    private javax.swing.JLabel cDemografi;
    private javax.swing.JLabel cEkonomi;
    private javax.swing.JLabel cStatistika;
    private javax.swing.JLabel cTeknologi;
    private javax.swing.JLabel cUmum;
    private javax.swing.JPanel dDemografi;
    private javax.swing.JPanel dEkonomi;
    private javax.swing.JPanel dStatistika;
    private javax.swing.JPanel dTekno;
    private javax.swing.JPanel dUmum;
    private javax.swing.JPanel jDemografi;
    private javax.swing.JPanel jEkonomi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jStatistika;
    private javax.swing.JPanel jTekno;
    private javax.swing.JPanel jUmum;
    private javax.swing.JLabel jmlJenisLabel;
    private javax.swing.JLabel jmlLabel;
    private javax.swing.JPanel jmlPanel;
    private javax.swing.JLabel jmlPinjamJenisLabel1;
    private javax.swing.JLabel jmlPinjamLabel;
    private javax.swing.JPanel jmlPinjamPanel;
    private javax.swing.JLabel jmlTersediaJenisLabel;
    private javax.swing.JLabel jmlTersediaLabel;
    private javax.swing.JPanel jmlTersediaPanel;
    private javax.swing.JLabel jumlah;
    private javax.swing.JLabel jumlahDipinjam;
    private javax.swing.JLabel jumlahTersedia;
    private javax.swing.JPanel tDemografi;
    private javax.swing.JPanel tEkonomi;
    private javax.swing.JPanel tStatistika;
    private javax.swing.JPanel tTekno;
    private javax.swing.JPanel tUmum;
    // End of variables declaration//GEN-END:variables
}
