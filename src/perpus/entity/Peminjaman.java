/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpus.entity;

/**
 *
 * @author kevinramadha
 */
public class Peminjaman {
    private String kodePinjam, tanggalPinjam, tanggalBalik;
    private Mahasiswa mahasiswa;
    private Buku buku;
    
    public Peminjaman(){
        
    }
    
    public String getKodePinjam() {
        return this.kodePinjam;
    }
 
    public void setKodePinjam(String kodePinjam) {
        this.kodePinjam = kodePinjam;
    }
    
    public Mahasiswa getMahasiswa(){
        return this.mahasiswa;
    }
    
    public void setMahasiswa(Mahasiswa mahasiswa){
        this.mahasiswa = mahasiswa;
    }
    
    public Buku getBuku(){
        return this.buku;
    }
    
    public void setBuku(Buku buku){
        this.buku = buku;
    }
    
    public String getTanggalPinjam() {
        return this.tanggalPinjam;
    }
 
    public void setTanggalPinjam(String tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }
    
    public String getTanggalBalik() {
        return this.tanggalBalik;
    }
 
    public void setTanggalBalik(String tanggalBalik) {
        this.tanggalBalik = tanggalBalik;
    }
}
