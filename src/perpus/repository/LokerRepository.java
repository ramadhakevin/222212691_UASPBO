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
import perpus.entity.Loker;

public class LokerRepository implements Serializable, Repository<Loker> {
    public static LokerRepository instance;
    // Path ke database SQLite
    private final String DB_URL = "jdbc:sqlite:/Users/kevinramadha/Documents/[01] TINGKAT II/[07] PEMROGRAMAN BERBASIS OBJEK/UAS/222212691_UAS/uaspbo.db";
    
    private LokerRepository() {
    }

    public static synchronized LokerRepository getInstance() {
        if (instance == null) {
            instance = new LokerRepository();
        }
        return instance;
    }

    @Override
    public List<Loker> getList() throws SQLException {
        List<Loker> lkList = new ArrayList<>();
        Connection conn = getConnection();
        try {
            String sql = "SELECT * FROM loker";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Loker lk = new Loker();
                lk.setNoLoker(rs.getInt("noloker"));
                lk.setStatus(rs.getInt("status"));
                lkList.add(lk);
            }
        } catch (SQLException ex) {
            throw ex;
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return lkList;
    }

    @Override
    public void insert(Loker t) throws SQLException {
        Connection conn = getConnection();
        try {
            String sql = "INSERT INTO loker VALUES(?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, t.getNoLoker());
            pstmt.setInt(2, t.getStatus());
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
    public void update(Loker t) throws SQLException {
        Connection conn = getConnection();
        try {
            String sql = "UPDATE loker SET status=? WHERE noloker=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, t.getStatus());
            pstmt.setInt(2, t.getNoLoker());
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
    public void delete(Loker t) throws SQLException {
        Connection conn = getConnection();
        try {
            String sql = "DELETE FROM loker WHERE noloker=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, t.getNoLoker());
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
