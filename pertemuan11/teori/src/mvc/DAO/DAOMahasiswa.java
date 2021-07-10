package mvc.DAO;

import mvc.koneksi.koneksi;
import mvc.model.mahasiswa;
import mvc.DAOInterface.interfacemhs;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DAOMahasiswa implements interfacemhs {
    Connection connection;
    final String insert = "INSERT INTO tblmahasiswa (nim, nama, jk, alamat) VALUES (?, ?, ?, ?);";
    final String update = "UPDATE tblmahasiswa set nim=?, nama=?, jk=?, alamat=? where id=?;";
    final String delete = "DELETE FROM tblmahasiswa where id=?;";
    final String select = "SELECT * FROM tblmahasiswa;";
    final String carinama = "SELECT * FROM tblmahasiswa where nama like ?";
    
    public DAOMahasiswa() {
        connection = Koneksi.connection();
    }
    
    public void insert(mahasiswa b) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert);
            statement.setString(1, b.getNim());
            statement.setString(2, b.getNama());
            statement.setString(3, b.getJk());
            statement.setString(4, b.getAlamat());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while (rs.next()) {
                b.setId(rs.getInt(1));
            }
        } catch (SQLException ex) {
            System.out.println("Berhasil Input");
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("Gagal Input");
            }
        }
    }
    
    public void update(mahasiswa b) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(update);
            statement.setString(1, b.getNim());
            statement.setString(2, b.getNama());
            statement.setString(3, b.getJk());
            statement.setString(4, b.getAlamat());
            statement.setInt(5, b.getId());
            statement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Berhasil Update");
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("Gagal Update");
            }
        }
    }

    public void delete(int id) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(delete);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Berhasil Delete");
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("Gagal Delete");
            }
        }
    }
    
    public List<mahasiswa> getAll() {
        List<mahasiswa> lb = null;
        try {
            lb = new ArrayList<mahasiswa>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {                
                mahasiswa b = new mahasiswa();
                b.setId(rs.getInt("id"));
                b.setNim(rs.getString("nim"));
                b.setNama(rs.getString("nama"));
                b.setJk(rs.getString("jk"));
                b.setAlamat(rs.getString("alamat"));
                lb.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lb;
    }
    
    public List<mahasiswa> getCariNama(String nama) {
        List<mahasiswa> lb = null;
        try {
            lb = new ArrayList<mahasiswa>();
            PreparedStatement st = connection.prepareStatement(carinama);
            st.setString(1, "%" + nama + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {                
                mahasiswa b = new mahasiswa();
                b.setId(rs.getInt("id"));
                b.setNim(rs.getString("nim"));
                b.setNama(rs.getString("nama"));
                b.setJk(rs.getString("jk"));
                b.setAlamat(rs.getString("alamat"));
                lb.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lb;
    }
}