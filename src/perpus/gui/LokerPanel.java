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
import static java.util.regex.Pattern.matches;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import perpus.entity.Loker;
import perpus.repository.LokerRepository;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 *
 * @author kevinramadha
 */
public class LokerPanel extends javax.swing.JPanel {

    /**
     * Creates new form LokerPanel
     */
    public LokerPanel() {
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
        
        tabelLoker.getTableHeader().setDefaultRenderer(headRender);
        
        DefaultTableCellRenderer recordRender = new DefaultTableCellRenderer();
        recordRender.setHorizontalAlignment(JLabel.CENTER);
        for (int i=0; i<tabelLoker.getColumnCount();i++){
            tabelLoker.setDefaultRenderer(tabelLoker.getColumnClass(i),recordRender);
        }    
    }
    
    private void setColoumnWidth(){
        TableColumnModel columnModel = tabelLoker.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(100);
        columnModel.getColumn(0).setMaxWidth(100);
        columnModel.getColumn(0).setMinWidth(100);      
    }
    
    private void loadTableData(){
        DefaultTableModel dtm = (DefaultTableModel) 
        tabelLoker.getModel();
        //refresh tabel
        while(dtm.getRowCount()>0){
            dtm.removeRow(0);
        }
        try {
            //isi tabel
            for(Loker lk:LokerRepository.getInstance().getList()){
                String status;
                if (lk.getStatus()==1){
                    status = "Tersedia";
                }else{
                    status = "Dipakai";
                } 
                dtm.addRow(new Object[]{lk.getNoLoker(), status});
            }
            //load dashboard
            showDashboard();
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
        diapakiPanel = new javax.swing.JPanel();
        jumlahDipakaiLabel = new javax.swing.JLabel();
        dashboardLabel = new javax.swing.JLabel();
        tersediaPanel = new javax.swing.JPanel();
        jumlahTersediaLabel = new javax.swing.JLabel();
        tersediaLabel = new javax.swing.JLabel();
        dipakaiLabel = new javax.swing.JLabel();
        noLokerLabel = new javax.swing.JLabel();
        noLokerTextField = new javax.swing.JTextField();
        statusLabel = new javax.swing.JLabel();
        statusComboBox = new javax.swing.JComboBox<>();
        changeButton = new javax.swing.JButton();
        eksportLaporanCsvButton = new javax.swing.JButton();
        ekportLaporanXlsButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelLoker = new javax.swing.JTable();

        sidePanel.setBackground(new java.awt.Color(3, 4, 94));

        diapakiPanel.setBackground(new java.awt.Color(202, 240, 248));
        diapakiPanel.setForeground(new java.awt.Color(20, 108, 148));

        jumlahDipakaiLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jumlahDipakaiLabel.setForeground(new java.awt.Color(3, 4, 94));
        jumlahDipakaiLabel.setText("0");

        javax.swing.GroupLayout diapakiPanelLayout = new javax.swing.GroupLayout(diapakiPanel);
        diapakiPanel.setLayout(diapakiPanelLayout);
        diapakiPanelLayout.setHorizontalGroup(
            diapakiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 164, Short.MAX_VALUE)
            .addGroup(diapakiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(diapakiPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jumlahDipakaiLabel)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        diapakiPanelLayout.setVerticalGroup(
            diapakiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(diapakiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(diapakiPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jumlahDipakaiLabel)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        dashboardLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        dashboardLabel.setForeground(new java.awt.Color(255, 255, 255));
        dashboardLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboardLabel.setText("INFORMASI LOKER");

        tersediaPanel.setBackground(new java.awt.Color(202, 240, 248));
        tersediaPanel.setForeground(new java.awt.Color(20, 108, 148));

        jumlahTersediaLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jumlahTersediaLabel.setForeground(new java.awt.Color(3, 4, 94));
        jumlahTersediaLabel.setText("0");

        javax.swing.GroupLayout tersediaPanelLayout = new javax.swing.GroupLayout(tersediaPanel);
        tersediaPanel.setLayout(tersediaPanelLayout);
        tersediaPanelLayout.setHorizontalGroup(
            tersediaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 164, Short.MAX_VALUE)
            .addGroup(tersediaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tersediaPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jumlahTersediaLabel)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        tersediaPanelLayout.setVerticalGroup(
            tersediaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(tersediaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tersediaPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jumlahTersediaLabel)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        tersediaLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        tersediaLabel.setForeground(new java.awt.Color(255, 255, 255));
        tersediaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tersediaLabel.setText("Loker Tersedia");

        dipakaiLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        dipakaiLabel.setForeground(new java.awt.Color(255, 255, 255));
        dipakaiLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dipakaiLabel.setText("Loker Dipakai");

        noLokerLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        noLokerLabel.setForeground(new java.awt.Color(255, 255, 255));
        noLokerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noLokerLabel.setText("No Loker");

        noLokerTextField.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        noLokerTextField.setForeground(new java.awt.Color(20, 108, 148));

        statusLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        statusLabel.setForeground(new java.awt.Color(255, 255, 255));
        statusLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statusLabel.setText("Status");

        statusComboBox.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        statusComboBox.setForeground(new java.awt.Color(3, 4, 94));
        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tersedia", "Dipakai" }));

        changeButton.setBackground(new java.awt.Color(144, 224, 239));
        changeButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        changeButton.setForeground(new java.awt.Color(3, 4, 94));
        changeButton.setText("Change");
        changeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeButtonActionPerformed(evt);
            }
        });

        eksportLaporanCsvButton.setText("Laporan .csv");
        eksportLaporanCsvButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eksportLaporanCsvButtonActionPerformed(evt);
            }
        });

        ekportLaporanXlsButton.setText("Laporan .Xls");
        ekportLaporanXlsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekportLaporanXlsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidePanelLayout.createSequentialGroup()
                            .addComponent(ekportLaporanXlsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                            .addComponent(eksportLaporanCsvButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(changeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dashboardLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tersediaLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tersediaPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidePanelLayout.createSequentialGroup()
                            .addComponent(noLokerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(sidePanelLayout.createSequentialGroup()
                            .addComponent(noLokerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidePanelLayout.createSequentialGroup()
                                    .addGap(49, 49, 49)
                                    .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(sidePanelLayout.createSequentialGroup()
                                    .addGap(45, 45, 45)
                                    .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(diapakiPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dipakaiLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addComponent(noLokerLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noLokerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addComponent(statusLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(changeButton)
                .addGap(18, 18, 18)
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ekportLaporanXlsButton)
                    .addComponent(eksportLaporanCsvButton))
                .addGap(52, 52, 52)
                .addComponent(dashboardLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tersediaLabel)
                    .addComponent(dipakaiLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tersediaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diapakiPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        tabelLoker.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        tabelLoker.setForeground(new java.awt.Color(20, 108, 148));
        tabelLoker.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "No Loker", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelLoker.setGridColor(new java.awt.Color(252, 255, 178));
        tabelLoker.setSelectionBackground(new java.awt.Color(252, 255, 178));
        tabelLoker.setSelectionForeground(new java.awt.Color(20, 108, 148));
        tabelLoker.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelLokerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelLoker);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void changeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeButtonActionPerformed
        // TODO add your handling code here:
        Loker lk = new Loker();
        lk.setNoLoker(Integer.parseInt(noLokerTextField.getText()));
        int status;
        if (matches(statusComboBox.getSelectedItem().toString(),"Tersedia"))
            status = 1;
        else
            status = 0;
        lk.setStatus(status);
       
        try {
            LokerRepository.getInstance().update(lk);
            clearForm();
            showDashboard();
            JOptionPane.showMessageDialog(this, "Perubahan Tersimpan");
            loadTableData();
        } catch (SQLException ex) {
            System.err.println(ex);
            JOptionPane.showMessageDialog(this, "Gagal mengubah data", "Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_changeButtonActionPerformed

    private void clearForm(){
        noLokerTextField.setText("");
        statusComboBox.setSelectedIndex(-1);
    }
    
    private void showDashboard(){
        try {
            //penghitungan
            int dipakai = 0;
            int tersedia =0;
            for(Loker lk:LokerRepository.getInstance().getList()){
                if (lk.getStatus()==1){
                    tersedia += 1;
                }else{
                    dipakai += 1;
                }     
            }
            jumlahDipakaiLabel.setText(""+dipakai);
            jumlahTersediaLabel.setText(""+tersedia);
        } catch (SQLException ex) {
            System.err.println(ex);
            JOptionPane.showMessageDialog(this, "Gagal mengambil data", "Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void tabelLokerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelLokerMouseClicked
        // TODO add your handling code here:
        int row = tabelLoker.getSelectedRow();
        DefaultTableModel dtm = (DefaultTableModel)tabelLoker.getModel();
        noLokerTextField.setText(dtm.getValueAt(row,0).toString());
        
        if (matches((dtm.getValueAt(row,1).toString()),"Tersedia"))
            statusComboBox.setSelectedIndex(0);
        else 
            statusComboBox.setSelectedIndex(1);
    }//GEN-LAST:event_tabelLokerMouseClicked
    
    public void openFile(String file){
        try{
            File path = new File(file);
            Desktop.getDesktop().open(path);
        }catch(IOException ioe){
            System.out.println(ioe);
        }
    }
    
    private void ekportLaporanXlsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekportLaporanXlsButtonActionPerformed
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
               for(int i=0;i<tabelLoker.getColumnCount();i++){
                   Cell cell = rowCol.createCell(i);
                   cell.setCellValue(tabelLoker.getColumnName(i));
               }
               
               for(int j=0;j<tabelLoker.getRowCount();j++){
                   org.apache.poi.ss.usermodel.Row row = sheet.createRow(j+1);
                   for(int k=0;k<tabelLoker.getColumnCount();k++){
                       Cell cell = row.createCell(k);
                       if(tabelLoker.getValueAt(j, k)!=null){
                           cell.setCellValue(tabelLoker.getValueAt(j, k).toString());
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
    }//GEN-LAST:event_ekportLaporanXlsButtonActionPerformed

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
                for (int i = 0; i < tabelLoker.getColumnCount(); i++) {
                    bw.write(tabelLoker.getColumnName(i) + ",");
                }
                bw.newLine();

                // Menulis data ke file
                for (int i = 0; i < tabelLoker.getRowCount(); i++) {
                    for (int j = 0; j < tabelLoker.getColumnCount(); j++) {
                        Object value = tabelLoker.getValueAt(i, j);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changeButton;
    private javax.swing.JLabel dashboardLabel;
    private javax.swing.JPanel diapakiPanel;
    private javax.swing.JLabel dipakaiLabel;
    private javax.swing.JButton ekportLaporanXlsButton;
    private javax.swing.JButton eksportLaporanCsvButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jumlahDipakaiLabel;
    private javax.swing.JLabel jumlahTersediaLabel;
    private javax.swing.JLabel noLokerLabel;
    private javax.swing.JTextField noLokerTextField;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JComboBox<String> statusComboBox;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JTable tabelLoker;
    private javax.swing.JLabel tersediaLabel;
    private javax.swing.JPanel tersediaPanel;
    // End of variables declaration//GEN-END:variables
}
