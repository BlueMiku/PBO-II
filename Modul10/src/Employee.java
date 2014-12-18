import java.sql.*;
import java.util.ArrayList;

public class Employee {

    private int employee_id;
    private String first_name, last_name, email, phone_number;
    private Date hire_date;
    private String job_id;
    private float salary, commission_pct;
    private int manager_id, department_id;

    public Employee() {
    }

    public Employee(int employee_id, String first_name, String last_name, String email, String phone_number, Date hire_date, String job_id, float salary, float commission_pct, int manager_id, int department_id) {
        this.employee_id = employee_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.phone_number = phone_number;
        this.hire_date = hire_date;
        this.job_id = job_id;
        this.salary = salary;
        this.commission_pct = commission_pct;
        this.manager_id = manager_id;
        this.department_id = department_id;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public Date getHire_date() {
        return hire_date;
    }

    public void setHire_date(Date hire_date) {
        this.hire_date = hire_date;
    }

    public String getJob_id() {
        return job_id;
    }

    public void setJob_id(String job_id) {
        this.job_id = job_id;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getCommission_pct() {
        return commission_pct;
    }

    public void setCommission_pct(float commission_pct) {
        this.commission_pct = commission_pct;
    }

    public int getManager_id() {
        return manager_id;
    }

    public void setManager_id(int manager_id) {
        this.manager_id = manager_id;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }
//    
    
    public static ArrayList searchEmployee(String keyword) throws SQLException, Exception {
        ArrayList result = null;
        DataHandler dh= new DataHandler();
        dh.getDBConnection();
        try (Connection conn = dh.conn) {
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String query = "SELECT * FROM employees where first_name like '%" + keyword + "%'";
            ResultSet rset = stmt.executeQuery(query);
            result = new ArrayList();
            while (rset.next()) {
                Employee temp = new Employee(rset.getInt(1), rset.getString(2), rset.getString(3), rset.getString(4),
                        rset.getString(5), rset.getDate(6), rset.getString(7),
                        rset.getFloat(8), rset.getFloat(9), rset.getInt(10), rset.getInt(11));
                result.add(temp);
            }
        }
        return result;
    }
}
