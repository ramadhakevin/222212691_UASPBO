package perpus.repository;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import perpus.entity.Mahasiswa;

public class MahasiswaRepository implements Serializable, Repository<Mahasiswa> {
    public static MahasiswaRepository instance;
    // Path ke database SQLite
    private final String DB_URL = "jdbc:sqlite:/Users/kevinramadha/Documents/[01] TINGKAT II/[07] PEMROGRAMAN BERBASIS OBJEK/UAS/222212691_UAS/uaspbo.db";
    
    private MahasiswaRepository() {
    }

    public static synchronized MahasiswaRepository getInstance() {
        if (instance == null) {
            instance = new MahasiswaRepository();
        }
        return instance;
    }

    @Override
    public List<Mahasiswa> getList() throws SQLException {
        List<Mahasiswa> mhsList = new ArrayList<>();
        Connection conn = getConnection();
        try {
            String sql = "SELECT * FROM mahasiswa";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNim(rs.getString("nim"));
                mhs.setNama(rs.getString("nama"));
                mhs.setKelas(rs.getString("kelas"));
                mhs.setProdi(rs.getString("prodi"));
                mhs.setJumlahPinjam(rs.getInt("jumlahpinjam"));
                mhsList.add(mhs);
            }
        } catch (SQLException ex) {
            throw ex;
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return mhsList;
    }

    @Override
    public void insert(Mahasiswa t) throws SQLException {
        Connection conn = getConnection();
        try {
            String sql = "INSERT INTO mahasiswa VALUES(?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, t.getNim());
            pstmt.setString(2, t.getNama());
            pstmt.setString(3, t.getKelas());
            pstmt.setString(4, t.getProdi());
            pstmt.setInt(5, t.getJumlahPinjam());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            throw ex;
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
    }

    @Override
    public void update(Mahasiswa t) throws SQLException {
        Connection conn = getConnection();
        try {
            String sql = "UPDATE mahasiswa SET nama=?, kelas=?, prodi=?, jumlahpinjam=? WHERE nim=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, t.getNama());
            pstmt.setString(2, t.getKelas());
            pstmt.setString(3, t.getProdi());
            pstmt.setInt(4, t.getJumlahPinjam());
            pstmt.setString(5, t.getNim());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            throw ex;
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
    }

    @Override
    public void delete(Mahasiswa t) throws SQLException {
        Connection conn = getConnection();
        try {
            String sql = "DELETE FROM mahasiswa WHERE nim=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, t.getNim());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            throw ex;
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
    }

    public Mahasiswa getMahasiswa(String nim) throws SQLException {
        Connection conn = getConnection();
        Mahasiswa mhs = new Mahasiswa();
        try {
            String sql = "SELECT * FROM mahasiswa WHERE nim = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, nim);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                mhs.setNim(rs.getString("nim"));
                mhs.setNama(rs.getString("nama"));
                mhs.setKelas(rs.getString("kelas"));
                mhs.setProdi(rs.getString("prodi"));
                mhs.setJumlahPinjam(rs.getInt("jumlahpinjam"));
            }
        } catch (SQLException ex) {
            throw ex;
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return mhs;
    }

    public void updateJumlahPinjam(String nim, int jumlahpinjam) throws SQLException {
        Connection conn = getConnection();
        try {
            String sql = "UPDATE mahasiswa SET jumlahpinjam=? WHERE nim=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, jumlahpinjam);
            pstmt.setString(2, nim);
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
