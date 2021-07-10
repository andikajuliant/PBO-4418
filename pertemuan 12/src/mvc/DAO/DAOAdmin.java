package mvc.DAO;
import mvc.koneksi.koneksi;
import mvc.model.admin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mvc.DAOinterface.Iadmin;


public class DAOadmin implements Iadmin{
    Connection connection;
    final String insert = "INSERT INTO tbl_pendaftaran (nik, nama, jk, alamat, usia, alasan) VALUES (?, ?, ?, ?, ?, ?);";
    final String update = "UPDATE tbl_pendaftaran set nik=?, nama=?, jk=?, alamat=?, usia=?, alasan=? WHERE id=?;";
    final String delete = "DELETE FROM tbl_pendaftaran WHERE id=?;";
    final String select = "SELECT * FROM tbl_pendaftaran";
    final String carinama = "SELECT * FROM tbl_pendaftaran WHERE nama like ?";
     
    public DAOadmin(){
        connection = koneksi.connection();
    }
    public void insert(admin u){
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(insert);
            statement.setString(1, u.getNIK());
            statement.setString(2, u.getNama());
            statement.setString(3, u.getJk());
            statement.setString(4, u.getAlamat());
            statement.setInt(5, u.getUsia());
            statement.setString(6, u.getAlasan());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while (rs.next()){
                u.setNIK(rs.getString(1));
            }
        }catch (SQLException ex){
            System.out.println("Berhasil Input");
        } finally {
            try {
                statement.close();
            } catch (SQLException ex){
                System.out.println("Gagal Input");
            }
        }
    }
    public void update (admin u){
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(update);
            statement.setString(1, u.getNIK());
            statement.setString(2, u.getNama());
            statement.setString(3, u.getJk());
            statement.setString(4, u.getAlamat());
            statement.setInt(5, u.getUsia());
            statement.setString(6, u.getAlasan());
            statement.setInt(7, u.getId());
            statement.executeUpdate();
        } catch (SQLException ex){
            System.out.println("Berhasil Update");
        } finally {
            try {
                statement.close();
            }catch(SQLException ex){
                System.out.println("Gagal Input");
            }
        }
    }
    public void delete(String nik){
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(delete);
            statement.setString(1, nik);
            statement.executeUpdate();
        } catch (SQLException ex){
            System.out.println("Berhasil Delete");
        } finally {
            try {
                statement.close();
            } catch (SQLException ex){
                System.out.println("Gagal Update");
            }
        }
    }
    public List<admin> getAll(){
        List<admin> lb = null;
        try {
            lb = new ArrayList<admin>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()){
                admin b = new admin();
                b.setId(rs.getInt("id"));
                b.setNIK(rs.getString("nik"));
                b.setNama(rs.getString("nama"));
                b.setJk(rs.getString("jk"));
                b.setAlamat(rs.getString("alamat"));
                b.setUsia(rs.getInt("usia"));
                b.setAlasan(rs.getString("alasan"));
                lb.add(b);
            } 
        }catch (SQLException ex) {
                Logger.getLogger(DAOadmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lb;
    }
    public List<admin> getCariNama(String nama){
        List<admin> lb = null;
        try {
            lb = new ArrayList<admin>();
            PreparedStatement st = connection.prepareStatement(carinama);
            st.setString(1, "%" + nama + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                admin b = new admin();
                b.setId(rs.getInt("id"));
                b.setNIK(rs.getString("nik"));
                b.setNama(rs.getString("nama"));
                b.setJk(rs.getString("jk"));
                b.setAlamat(rs.getString("alamat"));
                b.setUsia(rs.getInt("usia"));
                b.setAlasan(rs.getString("alasan"));
                lb.add(b);
            }
        }catch (SQLException ex) {
                Logger.getLogger(DAOadmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lb;
    }
}