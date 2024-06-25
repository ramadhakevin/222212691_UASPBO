/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package perpus.entity;

/**
 *
 * @author kevinramadha
 */
public class BukuFaktory {
    public Buku buatBuku(String kode, String judul, String jenis, String tanggalTerbit, String pengarang, int jumlah){
        switch(jenis){
            case "Statistika":
                return new BukuStatistika(kode, judul, tanggalTerbit, pengarang, jumlah);
            case "Ekonomi":
                return new BukuEkonomi(kode, judul, tanggalTerbit, pengarang, jumlah);
            case "Demografi":
                return new BukuDemografi(kode, judul, tanggalTerbit, pengarang, jumlah);
            case "Teknologi":
                return new BukuTeknologi(kode, judul, tanggalTerbit, pengarang, jumlah);
            case "Umum":
                return new BukuUmum(kode, judul, tanggalTerbit, pengarang, jumlah);
            default :
                return null;
        } 
    }
}
