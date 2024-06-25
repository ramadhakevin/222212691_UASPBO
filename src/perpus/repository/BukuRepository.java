package perpus.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import perpus.entity.Buku;

public class BukuRepository implements Serializable, Repository<Buku> {
    public static BukuRepository instance;
    private final String DB_URL = "jdbc:sqlite:/Users/kevinramadha/Documents/[01] TINGKAT II/[07] PEMROGRAMAN BERBASIS OBJEK/UAS/222212691_UAS/uaspbo.db";
    
    private BukuRepository() {
    }

    public static synchronized BukuRepository getInstance() {
        if (instance == null) {
            instance = new BukuRepository();
        }
        return instance;
    }

    @Override
    public List<Buku> getList() throws SQLException{
        List<Buku> bukuList = new ArrayList<>();
        Connection conn = getConnection();
        try{
            String sql = "SELECT * FROM buku";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Buku buku = new Buku();
                buku.setKode(rs.getString("kode"));
                buku.setJudul(rs.getString("judul"));
                buku.setJenis(rs.getString("jenis"));
                buku.setTanggalTerbit(rs.getString("tanggal"));
                buku.setPengarang(rs.getString("pengarang"));
                buku.setJumlah(rs.getInt("jumlah"));
                buku.setRak(rs.getInt("rak"));
                buku.setDipinjam(rs.getInt("dipinjam"));
                buku.setTersedia(rs.getInt("tersedia"));
                buku.setRak(rs.getInt("rak"));
                bukuList.add(buku);
            }
        }catch(SQLException ex){
            throw ex;
        } finally{
            if (conn!=null){
            conn.close();
            }
        }
        return bukuList;
    }

    @Override
    public void insert(Buku t) throws SQLException{
        Connection conn = getConnection();
        try{
            String sql="INSERT INTO buku VALUES(?,?,?,?,?,?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, t.getKode());
            pstmt.setString(2, t.getJudul());
            pstmt.setString(3, t.getJenis());
            pstmt.setString(4, t.getTanggalTerbit());
            pstmt.setString(5, t.getPengarang());
            pstmt.setInt(6, t.getJumlah());
            pstmt.setInt(7, t.getRak());
            pstmt.setInt(8, 0);
            pstmt.setInt(9, t.getJumlah());
            pstmt.executeUpdate();
        } catch(SQLException ex){
            throw ex;
        } finally{
            if(conn!=null){
            conn.close();
            }
        }
    }

    @Override
    public void update(Buku t) throws SQLException{
        Connection conn = getConnection();
        try{
            String sql = "UPDATE buku SET judul=?, jenis=?, tanggal=?, pengarang=?, jumlah=? WHERE kode=?";
            PreparedStatement pstmt = conn.prepareStatement(sql); 
            pstmt.setString(1, t.getJudul());
            pstmt.setString(2, t.getJenis());
            pstmt.setString(3, t.getTanggalTerbit());
            pstmt.setString(4, t.getPengarang());
            pstmt.setInt(5, t.getJumlah());
            pstmt.setString(6, t.getKode());
            pstmt.executeUpdate();
        } catch(SQLException ex){
            throw ex;
        } finally{
            if(conn!=null){
            conn.close();
            }
        }
    }

    @Override
    public void delete(Buku t) throws SQLException {
        Connection conn = getConnection();
        try {
            String sql = "DELETE FROM buku WHERE kode=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, t.getKode());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            throw ex;
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
    }

    public Buku getBuku(String kode) throws SQLException{
        Connection conn = getConnection();
        Buku buku = new Buku();
        try{
            String sql = "SELECT * FROM buku WHERE kode='"+kode+"'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                buku.setKode(rs.getString("kode"));
                buku.setJudul(rs.getString("judul"));
                buku.setJenis(rs.getString("jenis"));
                buku.setTanggalTerbit(rs.getString("tanggal"));
                buku.setPengarang(rs.getString("pengarang"));
                buku.setJumlah(rs.getInt("jumlah"));
                buku.setRak(rs.getInt("rak"));
                buku.setDipinjam(rs.getInt("dipinjam"));
                buku.setTersedia(rs.getInt("tersedia"));
            }
        }catch(SQLException ex){
            throw ex;
        } finally{
            if (conn!=null){
            conn.close();
            }
        }
        return buku;
    }

    public void updateJumlahBuku(String kode, int jumlahdipinjam, int jumlahtersedia) throws SQLException {
        Connection conn = getConnection();
        try {
            String sql = "UPDATE buku SET dipinjam=?, tersedia=? WHERE kode=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, jumlahdipinjam);
            pstmt.setInt(2, jumlahtersedia);
            pstmt.setString(3, kode);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            throw ex;
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL);
    }
}
