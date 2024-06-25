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
public class Buku implements Serializable{
    private String kode, judul, jenis, tanggalTerbit, pengarang;
    private int jumlah, rak, dipinjam, tersedia;
    
    public String getKode() {
        return this.kode;
    }
 
    public void setKode(String kode) {
        this.kode = kode;
    }
    
    public String getJudul() {
        return this.judul;
    }
 
    public void setJudul(String judul) {
        this.judul = judul;
    }
    
    public String getJenis() {
        return this.jenis;
    }
 
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    public String getTanggalTerbit() {
        return this.tanggalTerbit;
    }
 
    public void setTanggalTerbit(String tanggalTerbit) {
        this.tanggalTerbit = tanggalTerbit;
    }
    
    public String getPengarang() {
        return this.pengarang;
    }
 
    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }
    
    public int getJumlah(){
        return this.jumlah;
    }
    
    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }
    
    public int getDipinjam(){
        return this.dipinjam;
    }
    
    public void setDipinjam(int dipinjam){
        this.dipinjam = dipinjam;
    }
    
    public int getTersedia(){
        return this.tersedia;
    }
    
    public void setTersedia(int tersedia){
        this.tersedia = tersedia;
    }
    
    public int getRak(){
        return this.rak;
    }
    
    public void setRak(int rak){
        this.rak = rak;
    }
}
