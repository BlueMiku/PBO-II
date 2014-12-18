package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import oracle.jdbc.pool.OracleDataSource;

public class DataHandler {

    String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
    String userid = "jumkos";
    String passwd = "135314081";

    Connection conn;
    Statement stmt;
    ResultSet rset;
    String query;
    String sqlString;

    public DataHandler() {

    }

    public void getDBConnection() {
        try {
            OracleDataSource ds;
            ds = new OracleDataSource();
            ds.setURL(jdbcUrl);
            conn = ds.getConnection(userid, passwd);
            System.out.println("Connected");

        } catch (SQLException ex) {
            System.out.println("No Connection");
        }
    }

    public String getDBConnection2() {
        try {
            OracleDataSource ds;
            ds = new OracleDataSource();
            ds.setURL(jdbcUrl);
            conn = ds.getConnection(userid, passwd);
            return "Connected";

        } catch (SQLException ex) {
            return "No Connection";
        }
    }

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        String host = "localhost";
        String port = "1521";
        String db = "XE";
        String usr = "jumkos";
        String pwd = "135314081";
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = null;

        con = DriverManager.getConnection("jdbc:oracle:thin:@" + host + ":" + port + ":" + db, usr, pwd);

        return con;
    }

    public void closeConnection() {
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Cant Close Connection");
        }
    }

}
