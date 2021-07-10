package mvc.koneksi;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;


public class koneksi {
    static Connection con;
    
    public static Connection connection() {
        if(con==null){
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("db_dutacoding");
            data.setUser("root");
            data.setPassword("");
            try{
                con = data.getConnection();
            } catch (SQLException ex){
                System.out.println();
            }
        }
        return con;
    }
}