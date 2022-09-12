import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcconnection {

	public static void main(String[] args) throws SQLException {
		
		String host ="localhost";
		String port ="3306";
		
		//connect to database
		Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/sample", "root", "root");
		
		//create statement
		Statement s= con.createStatement();
		
		//execute statement
		ResultSet rs= s.executeQuery("select * from worker where department = 'technical'");
		
		while(rs.next()) {
			
		     System.out.println(rs.getString("salary"));
		     System.out.println(rs.getString("joining_date"));
		
		}
		s.close();
		con.close();

	}

}
