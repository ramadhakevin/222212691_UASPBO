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
import java.util.Date;
import static java.util.regex.Pattern.matches;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import perpus.entity.Buku;
import perpus.entity.BukuFaktory;
import perpus.repository.BukuRepository;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


/**
 *
 * @author asus
 */
public class BukuPanel extends javax.swing.JPanel {

    /**
     * Creates new form BukuPanel
     */
    public BukuPanel() {
        initComponents();
        
        afterInitComponent();
        setColoumnWidth();
        loadTableData();
    }
    
    private void afterInitComponent(){
        DefaultTableCellRenderer headRender = new DefaultTableCellRenderer();
        headRender.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
        headRender.setBackground(new Color(20, 108, 148));
        headRender.setForeground(new Color(255, 255, 255));
        headRender.setHorizontalAlignment( JLabel.CENTER );
        bukuTable.getTableHeader().setDefaultRenderer(headRender);
        
        DefaultTableCellRenderer recordRender = new DefaultTableCellRenderer();
        recordRender.setHorizontalAlignment(JLabel.CENTER);
        for (int i=0; i<bukuTable.getColumnCount();i++){
            bukuTable.setDefaultRenderer(bukuTable.getColumnClass(i),recordRender);
        }    
    }
    
    private void setColoumnWidth(){
        TableColumnModel columnModel = bukuTable.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(50);
        columnModel.getColumn(0).setMaxWidth(1000);
        columnModel.getColumn(0).setMinWidth(50);
        
        columnModel.getColumn(1).setPreferredWidth(190);
        columnModel.getColumn(1).setMaxWidth(1000);
        columnModel.getColumn(1).setMinWidth(190);
        
        columnModel.getColumn(2).setPreferredWidth(79);
        columnModel.getColumn(2).setMaxWidth(1000);
        columnModel.getColumn(2).setMinWidth(79);
        
        columnModel.getColumn(3).setPreferredWidth(95);
        columnModel.getColumn(3).setMaxWidth(1000);
        columnModel.getColumn(3).setMinWidth(95);
        
        columnModel.getColumn(4).setPreferredWidth(105);
        columnModel.getColumn(4).setMaxWidth(1000);
        columnModel.getColumn(4).setMinWidth(105);
        
        columnModel.getColumn(5).setPreferredWidth(55);
        columnModel.getColumn(5).setMaxWidth(1000);
        columnModel.getColumn(5).setMinWidth(55);
        
        columnModel.getColumn(6).setPreferredWidth(70);
        columnModel.getColumn(6).setMaxWidth(1000);
        columnModel.getColumn(6).setMinWidth(70);
        
        columnModel.getColumn(7).setPreferredWidth(40);
        columnModel.getColumn(7).setMaxWidth(1000);
        columnModel.getColumn(7).setMinWidth(40);
    }
    
    private void loadTableData(){
        DefaultTableModel dtm = (DefaultTableModel) 
        bukuTable.getModel();
        //refresh tabel
        while(dtm.getRowCount()>0){
            dtm.removeRow(0);
        }
        try {
            //isi tabel
            for(Buku buku:BukuRepository.getInstance().getList()){
                dtm.addRow(new Object[]{buku.getKode(),buku.getJudul(),buku.getJenis(),buku.getTanggalTerbit(),buku.getPengarang(), buku.getJumlah(), buku.getTersedia(),buku.getRak()});
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

        sidePanel = new javax.swing.JPanel();
        kodeLabel = new javax.swing.JLabel();
        kodeTextField = new javax.swing.JTextField();
        judulLabel = new javax.swing.JLabel();
        judulTextField = new javax.swing.JTextField();
        jenisLabel = new javax.swing.JLabel();
        jenisComboBox = new javax.swing.JComboBox<>();
        tanggalLabel = new javax.swing.JLabel();
        pengarangLabel = new javax.swing.JLabel();
        pengarangTextField = new javax.swing.JTextField();
        editButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        pengarangLabel1 = new javax.swing.JLabel();
        jumlahSpinner = new javax.swing.JSpinner();
        addButton1 = new javax.swing.JButton();
        tanggalTerbitDateChooser = new com.toedter.calendar.JDateChooser();
        exportLaporanXlsButton = new javax.swing.JButton();
        exportLaporanCsvButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        bukuTable = new javax.swing.JTable();

        sidePanel.setBackground(new java.awt.Color(3, 4, 94));
        sidePanel.setPreferredSize(new java.awt.Dimension(230, 499));

        kodeLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        kodeLabel.setForeground(new java.awt.Color(255, 255, 255));
        kodeLabel.setText("Kode Buku");

        kodeTextField.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        kodeTextField.setForeground(new java.awt.Color(20, 108, 148));

        judulLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        judulLabel.setForeground(new java.awt.Color(255, 255, 255));
        judulLabel.setText("Judul Buku");

        judulTextField.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        judulTextField.setForeground(new java.awt.Color(20, 108, 148));
        judulTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                judulTextFieldActionPerformed(evt);
            }
        });

        jenisLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jenisLabel.setForeground(new java.awt.Color(255, 255, 255));
        jenisLabel.setText("Jenis Buku");

        jenisComboBox.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jenisComboBox.setForeground(new java.awt.Color(20, 108, 148));
        jenisComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Statistika", "Ekonomi", "Demografi", "Teknologi", "Umum" }));

        tanggalLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        tanggalLabel.setForeground(new java.awt.Color(255, 255, 255));
        tanggalLabel.setText("Tanggal Terbit");

        pengarangLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        pengarangLabel.setForeground(new java.awt.Color(255, 255, 255));
        pengarangLabel.setText("Pengarang");

        pengarangTextField.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        pengarangTextField.setForeground(new java.awt.Color(20, 108, 148));

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

        pengarangLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        pengarangLabel1.setForeground(new java.awt.Color(255, 255, 255));
        pengarangLabel1.setText("Jumlah");

        addButton1.setBackground(new java.awt.Color(0, 180, 216));
        addButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        addButton1.setForeground(new java.awt.Color(255, 255, 255));
        addButton1.setText("Clear");
        addButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton1ActionPerformed(evt);
            }
        });

        exportLaporanXlsButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        exportLaporanXlsButton.setForeground(new java.awt.Color(3, 4, 94));
        exportLaporanXlsButton.setText(".Xls");
        exportLaporanXlsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportLaporanXlsButtonActionPerformed(evt);
            }
        });

        exportLaporanCsvButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        exportLaporanCsvButton.setForeground(new java.awt.Color(3, 4, 94));
        exportLaporanCsvButton.setText(".Csv");
        exportLaporanCsvButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportLaporanCsvButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tanggalTerbitDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(sidePanelLayout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(kodeLabel)
                                .addComponent(judulLabel)
                                .addComponent(jenisLabel)
                                .addComponent(judulTextField)
                                .addComponent(jenisComboBox, 0, 180, Short.MAX_VALUE)
                                .addComponent(kodeTextField)))
                        .addGroup(sidePanelLayout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(exportLaporanCsvButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                .addComponent(editButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(addButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(removeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exportLaporanXlsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pengarangLabel)
                        .addComponent(pengarangTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pengarangLabel1)
                        .addComponent(jumlahSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addComponent(tanggalLabel)
                        .addGap(82, 82, 82)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(kodeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(judulLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(judulTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jenisLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jenisComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tanggalLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tanggalTerbitDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(pengarangLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pengarangTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pengarangLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jumlahSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeButton)
                    .addComponent(editButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(addButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exportLaporanCsvButton)
                    .addComponent(exportLaporanXlsButton))
                .addGap(13, 13, 13))
        );

        bukuTable.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        bukuTable.setForeground(new java.awt.Color(20, 108, 148));
        bukuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Kode", "Judul", "Jenis", "Tanggal Terbit", "Pengarang", "Jumlah", "Tersedia", "Rak"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        bukuTable.setSelectionBackground(new java.awt.Color(252, 255, 178));
        bukuTable.setSelectionForeground(new java.awt.Color(20, 108, 148));
        bukuTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bukuTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(bukuTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bukuTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bukuTableMouseClicked
        // TODO add your handling code here:
        int row = bukuTable.getSelectedRow();
        DefaultTableModel dtm = (DefaultTableModel)bukuTable.getModel();
        kodeTextField.setText(dtm.getValueAt(row,0).toString());
        judulTextField.setText(dtm.getValueAt(row,1).toString());
        
        if (matches((dtm.getValueAt(row,2).toString()),"Statistika"))
            jenisComboBox.setSelectedIndex(0);
        else if (matches((dtm.getValueAt(row,2).toString()),"Ekonomi"))
            jenisComboBox.setSelectedIndex(1);
        else if (matches((dtm.getValueAt(row,2).toString()),"Demografi"))
            jenisComboBox.setSelectedIndex(2);
        else if (matches((dtm.getValueAt(row,2).toString()),"Teknologi"))
            jenisComboBox.setSelectedIndex(3);
        else if (matches((dtm.getValueAt(row,2).toString()),"Umum"))
            jenisComboBox.setSelectedIndex(4);
        
        java.util.Date date;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse((String) dtm.getValueAt(row,3));
            tanggalTerbitDateChooser.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(BukuPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        pengarangTextField.setText(dtm.getValueAt(row,4).toString());
        jumlahSpinner.setValue(dtm.getValueAt(row,5));
    }//GEN-LAST:event_bukuTableMouseClicked

    private void addButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton1ActionPerformed
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_addButton1ActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        if (matches(kodeTextField.getText(),"")){
            JOptionPane.showMessageDialog(this, "Pastikan Form Terisi");
        } else{
            BukuFaktory bukufaktory = new BukuFaktory();
            SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
            String date = dcn.format(tanggalTerbitDateChooser.getDate());
            Buku buku = bukufaktory.buatBuku(kodeTextField.getText(), judulTextField.getText(), jenisComboBox.getSelectedItem().toString(), date.toString(), pengarangTextField.getText(), (Integer) jumlahSpinner.getValue());

            try {
                BukuRepository.getInstance().insert(buku);
                clearForm();
                JOptionPane.showMessageDialog(this, "Sukses Tersimpan");
                loadTableData();
            } catch (SQLException ex) {
                System.err.println(ex);
                JOptionPane.showMessageDialog(this, "Gagal menyimpan data", "Gagal", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        // TODO add your handling code here:
        if (matches(kodeTextField.getText(),"")){
            JOptionPane.showMessageDialog(this, "Pastikan Pilih Data Buku");
        } else{
            Buku buku = new Buku();
            buku.setKode(kodeTextField.getText());
            buku.setJudul(judulTextField.getText());
            buku.setJenis(jenisComboBox.getSelectedItem().toString());
            
            SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
            String date = dcn.format(tanggalTerbitDateChooser.getDate());
            buku.setTanggalTerbit(date.toString());
            buku.setPengarang(pengarangTextField.getText());
            buku.setJumlah((Integer) jumlahSpinner.getValue());

            try {
                BukuRepository.getInstance().delete(buku);
                clearForm();
                JOptionPane.showMessageDialog(this, "Sukses Terhapus");
                loadTableData();
            } catch (SQLException ex) {
                System.err.println(ex);
                JOptionPane.showMessageDialog(this, "Gagal menghapus data", "Gagal", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_removeButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        if (matches(kodeTextField.getText(),"")){
            JOptionPane.showMessageDialog(this, "Pastikan Pilih Data Buku");
        } else{
            Buku buku = new Buku();
            buku.setKode(kodeTextField.getText());
            buku.setJudul(judulTextField.getText());
            buku.setJenis(jenisComboBox.getSelectedItem().toString());
            
            SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
            String date = dcn.format(tanggalTerbitDateChooser.getDate());
            buku.setTanggalTerbit(date.toString());
            buku.setPengarang(pengarangTextField.getText());
            buku.setJumlah((Integer) jumlahSpinner.getValue());

            try {
                BukuRepository.getInstance().update(buku);
                clearForm();
                JOptionPane.showMessageDialog(this, "Perubahan Tersimpan");
                loadTableData();
            } catch (SQLException ex) {
                System.err.println(ex);
                JOptionPane.showMessageDialog(this, "Gagal mengubah data", "Gagal", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void judulTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_judulTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_judulTextFieldActionPerformed

    public void openFile(String file){
        try{
            File path = new File(file);
            Desktop.getDesktop().open(path);
        }catch(IOException ioe){
            System.out.println(ioe);
        }
    }
    
    private void exportLaporanXlsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportLaporanXlsButtonActionPerformed
        // TODO add your handling code here:
        try{
           JFileChooser jFileChooser = new JFileChooser();
           jFileChooser.showSaveDialog(this);
           File saveFile = jFileChooser.getSelectedFile();
           
           if(saveFile != null){
               saveFile = new File(saveFile.toString()+".xlsx");
               Workbook wb = new XSSFWorkbook();
               Sheet sheet = wb.createSheet("Laporan");
               
               org.apache.poi.ss.usermodel.Row rowCol = sheet.createRow(0);
               for(int i=0;i<bukuTable.getColumnCount();i++){
                   Cell cell = rowCol.createCell(i);
                   cell.setCellValue(bukuTable.getColumnName(i));
               }
               
               for(int j=0;j<bukuTable.getRowCount();j++){
                   org.apache.poi.ss.usermodel.Row row = sheet.createRow(j+1);
                   for(int k=0;k<bukuTable.getColumnCount();k++){
                       Cell cell = row.createCell(k);
                       if(bukuTable.getValueAt(j, k)!=null){
                           cell.setCellValue(bukuTable.getValueAt(j, k).toString());
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
    }//GEN-LAST:event_exportLaporanXlsButtonActionPerformed

    private void exportLaporanCsvButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportLaporanCsvButtonActionPerformed
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
                for (int i = 0; i < bukuTable.getColumnCount(); i++) {
                    bw.write(bukuTable.getColumnName(i) + ",");
                }
                bw.newLine();

                // Menulis data ke file
                for (int i = 0; i < bukuTable.getRowCount(); i++) {
                    for (int j = 0; j < bukuTable.getColumnCount(); j++) {
                        Object value = bukuTable.getValueAt(i, j);
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
    }//GEN-LAST:event_exportLaporanCsvButtonActionPerformed
    
    private void clearForm(){
        kodeTextField.setText("");
        judulTextField.setText("");
        jenisComboBox.setSelectedIndex(-1);
        Date date = new Date();
        tanggalTerbitDateChooser.setDate(date);
        pengarangTextField.setText("");
        jumlahSpinner.setValue(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton addButton1;
    private javax.swing.JTable bukuTable;
    private javax.swing.JButton editButton;
    private javax.swing.JButton exportLaporanCsvButton;
    private javax.swing.JButton exportLaporanXlsButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jenisComboBox;
    private javax.swing.JLabel jenisLabel;
    private javax.swing.JLabel judulLabel;
    private javax.swing.JTextField judulTextField;
    private javax.swing.JSpinner jumlahSpinner;
    private javax.swing.JLabel kodeLabel;
    private javax.swing.JTextField kodeTextField;
    private javax.swing.JLabel pengarangLabel;
    private javax.swing.JLabel pengarangLabel1;
    private javax.swing.JTextField pengarangTextField;
    private javax.swing.JButton removeButton;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JLabel tanggalLabel;
    private com.toedter.calendar.JDateChooser tanggalTerbitDateChooser;
    // End of variables declaration//GEN-END:variables
}
