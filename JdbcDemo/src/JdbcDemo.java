import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

import java.sql.*;
public class JdbcDemo {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		String dbUrl = "jdbc:mysql://localhost:3306/demo?useSSL=false";
		String user = "student";
		String pass = "9902";
		
		try {
			conn = DriverManager.getConnection(dbUrl,user,pass);
			st = conn.createStatement();
			
			System.out.println("Inserting a new Empoyee to database:");
			int rowsInserted = st.executeUpdate("insert into employees " +
					"(last_name, first_name, email, department, salary) " + 
					"values " + 
					"('Wright', 'Eric', 'eric.wright@foo.com', 'HR', 33000.00)");
			
			rs = st.executeQuery("select * from employees order by last_name");
			
			while(rs.next()) {
				System.out.println(rs.getString("last_name") + ", " + rs.getString("first_name"));
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}finally {
			if (rs != null) {
				rs.close();
			}
			
			if (st != null) {
				st.close();
			}
			
			if (conn != null) {
				conn.close();
			}
		}
	}

}
