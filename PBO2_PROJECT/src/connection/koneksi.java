/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.*;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author Arung
 */
public class koneksi {
    String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
    String userid = "jumkos";
    String password = "135314081";
    Connection conn;
    Statement stmt;
    ResultSet rset;
    String query;
    String sqlString;
    
    public ResultSet getAllEmployees() throws SQLException{
        getDBConnection();
        stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        query = "SELECT e.employee_id, e.last_name, e.email, e.hire_date, "+
                "j.job_title, e.salary, d.department_name, e2.last_name "+
                "FROM employees e, employees e2, jobs j, departments d "+
                "where e.job_id=j.job_id and e.department_id=d.department_id "+
                "and e2.employee_id=e.manager_id ORDER BY employee_id";
        System.out.println("\nExecuting query: "+query);
        rset =stmt.executeQuery(query);
        return rset;
    }

    private void getDBConnection() throws SQLException {
            OracleDataSource ds;
            ds = new OracleDataSource();
            ds.setURL(jdbcUrl);
            conn = ds.getConnection(userid, password);
            System.out.println("Connected");
    }   
}
