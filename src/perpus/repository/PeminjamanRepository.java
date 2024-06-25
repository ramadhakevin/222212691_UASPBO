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
import java.util.logging.Level;
import java.util.logging.Logger;
import perpus.entity.Buku;
import perpus.entity.Mahasiswa;
import perpus.entity.Peminjaman;
import perpus.gui.PeminjamanPanel;

public class PeminjamanRepository implements Serializable, Repository<Peminjaman> {
    public static PeminjamanRepository instance;
    // Path ke database SQLite
    private final String DB_URL = "jdbc:sqlite:/Users/kevinramadha/Documents/[01] TINGKAT II/[07] PEMROGRAMAN BERBASIS OBJEK/UAS/222212691_UAS/uaspbo.db";
    
    private PeminjamanRepository() {
    }

    public static synchronized PeminjamanRepository getInstance() {
        if (instance == null) {
            instance = new PeminjamanRepository();
        }
        return instance;
    }

    @Override
    public List<Peminjaman> getList() throws SQLException {
        List<Peminjaman> pjmList = new ArrayList<>();
        Connection conn = getConnection();
        try {
            String sql = "SELECT * FROM peminjaman";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Peminjaman pjm = new Peminjaman();
                pjm.setKodePinjam(rs.getString("kodepinjam"));

                // buku
                try {
                    Buku buku = BukuRepository.getInstance().getBuku(rs.getString("kodebuku"));
                    pjm.setBuku(buku);
                } catch (SQLException ex) {
                    Logger.getLogger(PeminjamanPanel.class.getName()).log(Level.SEVERE, null, ex);
                }

                // mahasiswa
                try {
                    Mahasiswa mahasiswa = MahasiswaRepository.getInstance().getMahasiswa(rs.getString("nimmhs"));
                    pjm.setMahasiswa(mahasiswa);
                } catch (SQLException ex) {
                    Logger.getLogger(PeminjamanPanel.class.getName()).log(Level.SEVERE, null, ex);
                }

                pjm.setTanggalPinjam(rs.getString("tanggalpinjam"));
                pjm.setTanggalBalik(rs.getString("tanggalbalik"));
                pjmList.add(pjm);
            }
        } catch (SQLException ex) {
            throw ex;
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return pjmList;
    }

    @Override
    public void insert(Peminjaman t) throws SQLException {
        Connection conn = getConnection();
        try {
            String sql = "INSERT INTO peminjaman VALUES(?,?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, t.getKodePinjam());
            pstmt.setString(2, t.getBuku().getKode());
            pstmt.setString(3, t.getMahasiswa().getNim());
            pstmt.setString(4, t.getTanggalPinjam());
            pstmt.setString(5, t.getTanggalBalik());
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
    public void update(Peminjaman t) throws SQLException {
        Connection conn = getConnection();
        try {
            String sql = "UPDATE peminjaman SET kodebuku=?, nimmhs=?, tanggalpinjam=?, tanggalbalik=? WHERE kodepinjam=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, t.getBuku().getKode());
            pstmt.setString(2, t.getMahasiswa().getNim());
            pstmt.setString(3, t.getTanggalPinjam());
            pstmt.setString(4, t.getTanggalBalik());
            pstmt.setString(5, t.getKodePinjam());
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
    public void delete(Peminjaman t) throws SQLException {
        Connection conn = getConnection();
        try {
            String sql = "DELETE FROM peminjaman WHERE kodepinjam=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, t.getKodePinjam());
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
