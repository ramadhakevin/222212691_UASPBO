/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perpus.gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import perpus.entity.Buku;
import perpus.entity.BukuFaktory;
import perpus.repository.BukuRepository;

/**
 *
 * @author kevinramadha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        BukuFaktory bukufaktory = new BukuFaktory();
        Buku buku1 = bukufaktory.buatBuku("S1366", "Statistik Inferensia", "Statistika", "05-02-2010", "Adele", 12);

    Buku buku = BukuRepository.getInstance().getBuku("S0103");
    }
    
}
