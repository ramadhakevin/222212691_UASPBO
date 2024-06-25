/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package perpus.gui;


import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import static java.util.regex.Pattern.matches;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;
import perpus.entity.Buku;
import perpus.entity.Mahasiswa;
import perpus.entity.Peminjaman;
import perpus.repository.BukuRepository;
import perpus.repository.MahasiswaRepository;
import perpus.repository.PeminjamanRepository;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 *
 * @author kevinramadha
 */
public class PeminjamanPanel extends javax.swing.JPanel {
    private Buku bukuPinjam;
    private Mahasiswa mahasiswaPinjam;
    /**
     * Creates new form PeminjamanPanel
     */
    public PeminjamanPanel() {
        initComponents();
        
        afterInitComponent();
        setColoumnWidth();
        loadTableData();
        loadComboBox();
    }
    
    private void afterInitComponent(){
        DefaultTableCellRenderer headRender = new DefaultTableCellRenderer();
        headRender.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
        headRender.setBackground(new Color(20, 108, 148));
        headRender.setForeground(new Color(255, 255, 255));
        headRender.setHorizontalAlignment( JLabel.CENTER );
        peminjamanTable.getTableHeader().setDefaultRenderer(headRender);
        
        DefaultTableCellRenderer recordRender = new DefaultTableCellRenderer();
        recordRender.setHorizontalAlignment(JLabel.CENTER);
        for (int i=0; i<peminjamanTable.getColumnCount();i++){
            peminjamanTable.setDefaultRenderer(peminjamanTable.getColumnClass(i),recordRender);
        }    
    }
    
    private void setColoumnWidth(){
        TableColumnModel columnModel = peminjamanTable.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(81);
        columnModel.getColumn(0).setMaxWidth(1000);
        columnModel.getColumn(0).setMinWidth(81);
        
        columnModel.getColumn(1).setPreferredWidth(60);
        columnModel.getColumn(1).setMaxWidth(1000);
        columnModel.getColumn(1).setMinWidth(66);
        
        columnModel.getColumn(2).setPreferredWidth(85);
        columnModel.getColumn(2).setMaxWidth(1000);
        columnModel.getColumn(2).setMinWidth(85);
        
        columnModel.getColumn(3).setPreferredWidth(110);
        columnModel.getColumn(3).setMaxWidth(1000);
        columnModel.getColumn(3).setMinWidth(110);
        
        columnModel.getColumn(4).setPreferredWidth(110);
        columnModel.getColumn(4).setMaxWidth(1000);
        columnModel.getColumn(4).setMinWidth(110);
    }
    
    private void loadTableData(){
        DefaultTableModel dtm = (DefaultTableModel) 
        peminjamanTable.getModel();
        //refresh tabel
        while(dtm.getRowCount()>0){
            dtm.removeRow(0);
        }
        try {
            //isi tabel
            for(Peminjaman pjm:PeminjamanRepository.getInstance().getList()){
                dtm.addRow(new Object[]{pjm.getKodePinjam(),pjm.getBuku().getKode(),pjm.getMahasiswa().getNim(),pjm.getTanggalPinjam(),pjm.getTanggalBalik()});
            }
        } catch (SQLException ex) {
            System.err.println(ex);
            JOptionPane.showMessageDialog(this, "Gagal mengambil data", "Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void loadComboBox(){
        try {
            //isi tabel
            for(Buku buku:BukuRepository.getInstance().getList()){
               kodeBukuComboBox.addItem(buku.getKode());
            }
        } catch (SQLException ex) {
            System.err.println(ex);
            JOptionPane.showMessageDialog(this, "Gagal mengambil data", "Gagal", JOptionPane.ERROR_MESSAGE);
        }
        
        try {
            //isi tabel
            for(Mahasiswa mhs:MahasiswaRepository.getInstance().getList()){
                nimComboBox.addItem(mhs.getNim());
            }
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

        jFileChooser = new javax.swing.JFileChooser();
        sidePanel = new javax.swing.JPanel();
        kodeLabel = new javax.swing.JLabel();
        kodeTextField = new javax.swing.JTextField();
        kodeBukuLabel = new javax.swing.JLabel();
        nimLabel = new javax.swing.JLabel();
        pinjamLabel = new javax.swing.JLabel();
        editButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        balikLabel = new javax.swing.JLabel();
        clearButton = new javax.swing.JButton();
        tanggalPinjamDateChooser = new com.toedter.calendar.JDateChooser();
        tanggalBalikDateChooser = new com.toedter.calendar.JDateChooser();
        kodeBukuComboBox = new javax.swing.JComboBox<>();
        nimComboBox = new javax.swing.JComboBox<>();
        eksportLaporaButton = new javax.swing.JButton();
        eksportLaporanCsvButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        peminjamanTable = new javax.swing.JTable();

        sidePanel.setBackground(new java.awt.Color(3, 4, 94));

        kodeLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        kodeLabel.setForeground(new java.awt.Color(255, 255, 255));
        kodeLabel.setText("Kode Peminjaman");

        kodeTextField.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        kodeTextField.setForeground(new java.awt.Color(20, 108, 148));

        kodeBukuLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        kodeBukuLabel.setForeground(new java.awt.Color(255, 255, 255));
        kodeBukuLabel.setText("Kode Buku");

        nimLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        nimLabel.setForeground(new java.awt.Color(255, 255, 255));
        nimLabel.setText("NIM Mahasiswa");

        pinjamLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        pinjamLabel.setForeground(new java.awt.Color(255, 255, 255));
        pinjamLabel.setText("Tanggal Pinjam");

        editButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        editButton.setForeground(new java.awt.Color(3, 4, 94));
        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        removeButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        removeButton.setForeground(new java.awt.Color(3, 4, 94));
        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        addButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        addButton.setForeground(new java.awt.Color(3, 4, 94));
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        balikLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        balikLabel.setForeground(new java.awt.Color(255, 255, 255));
        balikLabel.setText("Jadwal Pengembalian");

        clearButton.setBackground(new java.awt.Color(0, 180, 216));
        clearButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        eksportLaporaButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        eksportLaporaButton.setForeground(new java.awt.Color(3, 4, 94));
        eksportLaporaButton.setText("Laporan .xls");
        eksportLaporaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eksportLaporaButtonActionPerformed(evt);
            }
        });

        eksportLaporanCsvButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        eksportLaporanCsvButton.setForeground(new java.awt.Color(3, 4, 94));
        eksportLaporanCsvButton.setText("Laporan .csv");
        eksportLaporanCsvButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eksportLaporanCsvButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(eksportLaporaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(balikLabel)
                    .addComponent(kodeBukuLabel)
                    .addComponent(kodeLabel)
                    .addComponent(kodeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(pinjamLabel)
                    .addComponent(nimLabel)
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clearButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(tanggalPinjamDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tanggalBalikDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kodeBukuComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nimComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eksportLaporanCsvButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(kodeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kodeBukuLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kodeBukuComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(nimLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nimComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(pinjamLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tanggalPinjamDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(balikLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tanggalBalikDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton)
                    .addComponent(removeButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clearButton)
                    .addComponent(addButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eksportLaporaButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eksportLaporanCsvButton)
                .addGap(32, 32, 32))
        );

        peminjamanTable.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        peminjamanTable.setForeground(new java.awt.Color(20, 108, 148));
        peminjamanTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Peminjaman", "Kode Buku", "NIM", "Tanggal Pinjam", "Pengembalian"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        peminjamanTable.setSelectionBackground(new java.awt.Color(252, 255, 178));
        peminjamanTable.setSelectionForeground(new java.awt.Color(20, 108, 148));
        peminjamanTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                peminjamanTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(peminjamanTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        // TODO add your handling code here:
        if (matches(kodeTextField.getText(),"")){
            JOptionPane.showMessageDialog(this, "Pastikan Pilih Data Peminjaman");
        } else{
            Peminjaman pjm = new Peminjaman();
            
            //kode peminjaman
            pjm.setKodePinjam(kodeTextField.getText());
            
            //kode buku
            try {
                Buku buku = BukuRepository.getInstance().getBuku(kodeBukuComboBox.getSelectedItem().toString());
                pjm.setBuku(buku);
            } catch (SQLException ex) {
                Logger.getLogger(PeminjamanPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            //nim
            try {
                Mahasiswa mahasiswa=MahasiswaRepository.getInstance().getMahasiswa(nimComboBox.getSelectedItem().toString());
                pjm.setMahasiswa(mahasiswa);
            } catch (SQLException ex) {
                Logger.getLogger(PeminjamanPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            //tanggal pinjam
            SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
            String date = dcn.format(tanggalPinjamDateChooser.getDate());
            pjm.setTanggalPinjam(date);
            
            //tanggal balik
            SimpleDateFormat dcn2 = new SimpleDateFormat("yyyy-MM-dd");
            String date2 = dcn2.format(tanggalBalikDateChooser.getDate());
            pjm.setTanggalBalik(date2);

            try {
                PeminjamanRepository.getInstance().delete(pjm);
                clearForm();
                JOptionPane.showMessageDialog(this, "Sukses Terhapus");
                loadTableData();
                prosesRemovePinjam(pjm.getBuku(),pjm.getMahasiswa());
            } catch (SQLException ex) {
                System.err.println(ex);
                JOptionPane.showMessageDialog(this, "Gagal menghapus data", "Gagal", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_removeButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        if (matches(kodeTextField.getText(),"")){
            JOptionPane.showMessageDialog(this, "Pastikan Pilih Data Peminjaman");
        } else{
            Peminjaman pjm = new Peminjaman();
            
            //kode peminjaman
            pjm.setKodePinjam(kodeTextField.getText());
            
            //kode buku
            try {
                Buku buku = BukuRepository.getInstance().getBuku(kodeBukuComboBox.getSelectedItem().toString());
                pjm.setBuku(buku);
            } catch (SQLException ex) {
                Logger.getLogger(PeminjamanPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            //nim
            try {
                Mahasiswa mahasiswa=MahasiswaRepository.getInstance().getMahasiswa(nimComboBox.getSelectedItem().toString());
                pjm.setMahasiswa(mahasiswa);
            } catch (SQLException ex) {
                Logger.getLogger(PeminjamanPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            //tanggal pinjam
            SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
            String date = dcn.format(tanggalPinjamDateChooser.getDate());
            pjm.setTanggalPinjam(date);
            
            //tanggal balik
            SimpleDateFormat dcn2 = new SimpleDateFormat("yyyy-MM-dd");
            String date2 = dcn2.format(tanggalBalikDateChooser.getDate());
            pjm.setTanggalBalik(date2);

            try {
                PeminjamanRepository.getInstance().update(pjm);
                clearForm();
                JOptionPane.showMessageDialog(this, "Perubahan Tersimpan");
                loadTableData();
                prosesEditPinjam(pjm.getBuku(),pjm.getMahasiswa());
            } catch (SQLException ex) {
                System.err.println(ex);
                JOptionPane.showMessageDialog(this, "Gagal mengubah data", "Gagal", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_editButtonActionPerformed
    
    private void prosesEditPinjam(Buku buku, Mahasiswa mahasiswa) throws SQLException{
        String bukuLama = bukuPinjam.getKode();
        String bukuBaru = buku.getKode();
        String mhsLama = mahasiswaPinjam.getNim();
        String mhsBaru = mahasiswa.getNim();
        
        if (!bukuLama.equals(bukuBaru) && !mhsLama.equals(mhsBaru)){ // dua duanya beda
            // remove yang lama
            int jumlahtersedia = bukuPinjam.getTersedia()+1;
            int jumlahdipinjam = bukuPinjam.getDipinjam()-1;
            BukuRepository.getInstance().updateJumlahBuku(bukuPinjam.getKode(),jumlahdipinjam, jumlahtersedia);

            int jumlahpinjam = mahasiswaPinjam.getJumlahPinjam()-1;
            MahasiswaRepository.getInstance().updateJumlahPinjam(mahasiswaPinjam.getNim(), jumlahpinjam);

            //add yang baru
            int jumlahtersedia1 = buku.getTersedia()-1;
            int jumlahdipinjam1 = buku.getDipinjam()+1;
            BukuRepository.getInstance().updateJumlahBuku(buku.getKode(),jumlahdipinjam1, jumlahtersedia1);

            int jumlahpinjam1 = mahasiswa.getJumlahPinjam()+1;
            MahasiswaRepository.getInstance().updateJumlahPinjam(mahasiswa.getNim(), jumlahpinjam1);
        } else if (bukuLama.equals(bukuBaru) && !mhsLama.equals(mhsBaru)){ //buku sama mahasiswa beda
            int jumlahpinjam = mahasiswaPinjam.getJumlahPinjam()-1;
            MahasiswaRepository.getInstance().updateJumlahPinjam(mahasiswaPinjam.getNim(), jumlahpinjam);
            
            int jumlahpinjam1 = mahasiswa.getJumlahPinjam()+1;
            MahasiswaRepository.getInstance().updateJumlahPinjam(mahasiswa.getNim(), jumlahpinjam1);
        } else if (!bukuLama.equals(bukuBaru) && mhsLama.equals(mhsBaru)){ //buku beda mahasiswa sama 
            int jumlahtersedia = bukuPinjam.getTersedia()+1;
            int jumlahdipinjam = bukuPinjam.getDipinjam()-1;
            BukuRepository.getInstance().updateJumlahBuku(bukuPinjam.getKode(),jumlahdipinjam, jumlahtersedia);
            
            int jumlahtersedia1 = buku.getTersedia()-1;
            int jumlahdipinjam1 = buku.getDipinjam()+1;
            BukuRepository.getInstance().updateJumlahBuku(buku.getKode(),jumlahdipinjam1, jumlahtersedia1);
        }
    }
    
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        if (matches(kodeTextField.getText(),"")){
            JOptionPane.showMessageDialog(this, "Pastikan Form Terisi");
        } else{
            Peminjaman pjm = new Peminjaman();
            
            //set kode peminjaman
            pjm.setKodePinjam(kodeTextField.getText());
            
            //set kode buku
            try {
                Buku buku = BukuRepository.getInstance().getBuku(kodeBukuComboBox.getSelectedItem().toString());
                pjm.setBuku(buku);
            } catch (SQLException ex) {
                Logger.getLogger(PeminjamanPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            //set mahasiswa
            try {
                Mahasiswa mahasiswa=MahasiswaRepository.getInstance().getMahasiswa(nimComboBox.getSelectedItem().toString());
                pjm.setMahasiswa(mahasiswa);
            } catch (SQLException ex) {
                Logger.getLogger(PeminjamanPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            //set tanggal pinjam
            SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
            String date = dcn.format(tanggalPinjamDateChooser.getDate());
            pjm.setTanggalPinjam(date);
            
            //set tanggal balik
            SimpleDateFormat dcn2 = new SimpleDateFormat("yyyy-MM-dd");
            String date2 = dcn2.format(tanggalBalikDateChooser.getDate());
            pjm.setTanggalBalik(date2);

            try {
                PeminjamanRepository.getInstance().insert(pjm);
                clearForm();
                JOptionPane.showMessageDialog(this, "Sukses Tersimpan");
                loadTableData();
                prosesAddPinjam(pjm.getBuku(),pjm.getMahasiswa());
            } catch (SQLException ex) {
                System.err.println(ex);
                JOptionPane.showMessageDialog(this, "Gagal menyimpan data", "Gagal", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void prosesAddPinjam(Buku buku, Mahasiswa mahasiswa) throws SQLException{
        int jumlahtersedia = buku.getTersedia()-1;
        int jumlahdipinjam = buku.getDipinjam()+1;
        BukuRepository.getInstance().updateJumlahBuku(buku.getKode(),jumlahdipinjam, jumlahtersedia);
        
        int jumlahpinjam = mahasiswa.getJumlahPinjam()+1;
        MahasiswaRepository.getInstance().updateJumlahPinjam(mahasiswa.getNim(), jumlahpinjam);
    }
    
    private void prosesRemovePinjam(Buku buku, Mahasiswa mahasiswa) throws SQLException{
        int jumlahtersedia = buku.getTersedia()+1;
        int jumlahdipinjam = buku.getDipinjam()-1;
        BukuRepository.getInstance().updateJumlahBuku(buku.getKode(),jumlahdipinjam, jumlahtersedia);
        
        int jumlahpinjam = mahasiswa.getJumlahPinjam()-1;
        MahasiswaRepository.getInstance().updateJumlahPinjam(mahasiswa.getNim(), jumlahpinjam);
    }
    
    private void peminjamanTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peminjamanTableMouseClicked
        // TODO add your handling code here:
        int row = peminjamanTable.getSelectedRow();
        DefaultTableModel dtm = (DefaultTableModel)peminjamanTable.getModel();
        
        //kode pinjam
        kodeTextField.setText(dtm.getValueAt(row,0).toString());
        
        //kode buku
        try {
            int i =0;
            String kode = dtm.getValueAt(row,1).toString();
            List<Buku> bukuList=BukuRepository.getInstance().getList();
            while(!matches((bukuList.get(i).getKode()),kode)){
              i++;
            }
            kodeBukuComboBox.setSelectedIndex(i);
            Buku buku=BukuRepository.getInstance().getBuku(kodeBukuComboBox.getSelectedItem().toString());
            bukuPinjam = buku;
        } catch (SQLException ex) {
            System.err.println(ex);
            JOptionPane.showMessageDialog(this, "Gagal mengambil data", "Gagal", JOptionPane.ERROR_MESSAGE);
        }
        
        //nim
        try {
            int i =0;
            String nim = dtm.getValueAt(row,2).toString();
            List<Mahasiswa> mhsList=MahasiswaRepository.getInstance().getList();
            while(!matches((mhsList.get(i).getNim()),nim)){
              i++;
            }
            nimComboBox.setSelectedIndex(i);
            Mahasiswa mahasiswa=MahasiswaRepository.getInstance().getMahasiswa(nimComboBox.getSelectedItem().toString());
            mahasiswaPinjam = mahasiswa;
        } catch (SQLException ex) {
            System.err.println(ex);
            JOptionPane.showMessageDialog(this, "Gagal mengambil data", "Gagal", JOptionPane.ERROR_MESSAGE);
        }
        
        //tanggal pinjam
        java.util.Date date;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse((String) dtm.getValueAt(row,3));
            tanggalPinjamDateChooser.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(BukuPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //tanggal balik
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse((String) dtm.getValueAt(row,4));
            tanggalBalikDateChooser.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(BukuPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_peminjamanTableMouseClicked

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_clearButtonActionPerformed

    public void openFile(String file){
            try{
                File path = new File(file);
                Desktop.getDesktop().open(path);
            }catch(IOException ioe){
                System.out.println(ioe);
            }
    }
    private void eksportLaporaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eksportLaporaButtonActionPerformed
        // TODO add your handling code here
        try{
           JFileChooser jFileChooser = new JFileChooser();
           jFileChooser.showSaveDialog(this);
           File saveFile = jFileChooser.getSelectedFile();
           
           if(saveFile != null){
               saveFile = new File(saveFile.toString()+".xlsx");
               Workbook wb = new XSSFWorkbook();
               Sheet sheet = wb.createSheet("Laporan");
               
               org.apache.poi.ss.usermodel.Row rowCol = sheet.createRow(0);
               for(int i=0;i<peminjamanTable.getColumnCount();i++){
                   Cell cell = rowCol.createCell(i);
                   cell.setCellValue(peminjamanTable.getColumnName(i));
               }
               
               for(int j=0;j<peminjamanTable.getRowCount();j++){
                   org.apache.poi.ss.usermodel.Row row = sheet.createRow(j+1);
                   for(int k=0;k<peminjamanTable.getColumnCount();k++){
                       Cell cell = row.createCell(k);
                       if(peminjamanTable.getValueAt(j, k)!=null){
                           cell.setCellValue(peminjamanTable.getValueAt(j, k).toString());
                       }
                   }
               }
               FileOutputStream out = new FileOutputStream(new File(saveFile.toString()));
               wb.write(out);
               wb.close();
               out.close();
               openFile(saveFile.toString());
           }else{
               JOptionPane.showMessageDialog(null,"Dibatalkan");
           }
       }catch(FileNotFoundException e){
           System.out.println(e);
       }catch(IOException io){
           System.out.println(io);
       }
    }//GEN-LAST:event_eksportLaporaButtonActionPerformed

    private void eksportLaporanCsvButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eksportLaporanCsvButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file save");
        fileChooser.setFileFilter(new FileNameExtensionFilter("CSV Files", "csv")); // Menambahkan filter file CSV
        int userSelection = fileChooser.showSaveDialog(this);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            String filePath = fileToSave.getAbsolutePath();

            // Menambahkan ekstensi .csv jika belum ada
            if (!filePath.toLowerCase().endsWith(".csv")) {
                fileToSave = new File(filePath + ".csv");
            }

            try {
                FileWriter fw = new FileWriter(fileToSave);
                BufferedWriter bw = new BufferedWriter(fw);

                // Menulis judul kolom
                for (int i = 0; i < peminjamanTable.getColumnCount(); i++) {
                    bw.write(peminjamanTable.getColumnName(i) + ",");
                }
                bw.newLine();

                // Menulis data ke file
                for (int i = 0; i < peminjamanTable.getRowCount(); i++) {
                    for (int j = 0; j < peminjamanTable.getColumnCount(); j++) {
                        Object value = peminjamanTable.getValueAt(i, j);
                        if (value != null) {
                            bw.write(value.toString() + ",");
                        } else {
                            bw.write("NULL,");
                        }
                    }
                    bw.newLine();
                }

                bw.close();
                fw.close();
                JOptionPane.showMessageDialog(this, "SUCCESSFULLY SAVED", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);

                // Membuka file setelah penulisan selesai
                openFile(fileToSave.getAbsolutePath());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "ERROR", "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_eksportLaporanCsvButtonActionPerformed

    private void clearForm(){
        kodeTextField.setText("");
        kodeBukuComboBox.setSelectedIndex(-1);
        nimComboBox.setSelectedIndex(-1);
        Date date = new Date();
        tanggalPinjamDateChooser.setDate(date);
        tanggalBalikDateChooser.setDate(date);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel balikLabel;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton editButton;
    private javax.swing.JButton eksportLaporaButton;
    private javax.swing.JButton eksportLaporanCsvButton;
    private javax.swing.JFileChooser jFileChooser;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> kodeBukuComboBox;
    private javax.swing.JLabel kodeBukuLabel;
    private javax.swing.JLabel kodeLabel;
    private javax.swing.JTextField kodeTextField;
    private javax.swing.JComboBox<String> nimComboBox;
    private javax.swing.JLabel nimLabel;
    private javax.swing.JTable peminjamanTable;
    private javax.swing.JLabel pinjamLabel;
    private javax.swing.JButton removeButton;
    private javax.swing.JPanel sidePanel;
    private com.toedter.calendar.JDateChooser tanggalBalikDateChooser;
    private com.toedter.calendar.JDateChooser tanggalPinjamDateChooser;
    // End of variables declaration//GEN-END:variables
}
