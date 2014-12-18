import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import oracle.jdbc.pool.OracleDataSource;

public class DataHandler {
    String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
    String userid= "Miku";
    String passwd= "135314076";

    Connection conn;
    Statement stmt;
    ResultSet rset;
    String query;
    String sqlString;
    public DataHandler(){

    }
    public void getDBConnection(){
        try{
            OracleDataSource ds;
            ds = new OracleDataSource();
            ds.setURL(jdbcUrl);
            conn = ds.getConnection(userid, passwd);
            System.out.println("Connected");

        }catch (SQLException ex){
            System.out.println("No Connection");
        }
    }

    public String getDBConnection2(){
        try{
            OracleDataSource ds;
            ds = new OracleDataSource();
            ds.setURL(jdbcUrl);
            conn = ds.getConnection(userid, passwd);
            return "Connected";

        }catch (SQLException ex){
            return "No Connection";
        }
    }
    public void closeConnection(){
        try{
            conn.close();
        }catch (SQLException ex){
            System.out.println("Cant Close Connection");
        }
    }
}
