/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpus.entity;

/**
 *
 * @author kevinramadha
 */
public class BukuDemografi extends Buku{
    public BukuDemografi(String kode, String judul, String tanggalTerbit, String pengarang, int jumlah){
       setKode(kode);
       setJudul(judul);
       setJenis("Demografi");
       setTanggalTerbit(tanggalTerbit);
       setPengarang(pengarang);
       setJumlah(jumlah);
       setRak(3);
    }
}
