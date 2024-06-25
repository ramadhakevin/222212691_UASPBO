/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpus.entity;

import java.io.Serializable;
/**
 *
 * @author kevinramadha
 */
public class Mahasiswa implements Serializable{
    private String nim,nama,kelas, prodi;
    private int jumlahPinjam;
    
    public Mahasiswa(){
        
    }
    
    public String getNim() {
        return this.nim;
    }
 
    public void setNim(String nim) {
        this.nim = nim;
    }
    
    public String getNama() {
        return this.nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getKelas() {
        return this.kelas;
    }
    
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    public String getProdi() {
        return this.prodi;
    }
    
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
    
    public int getJumlahPinjam() {
        return this.jumlahPinjam;
    }
    
    public void setJumlahPinjam(int jumlahPinjam ) {
        this.jumlahPinjam = jumlahPinjam;
    }
}
