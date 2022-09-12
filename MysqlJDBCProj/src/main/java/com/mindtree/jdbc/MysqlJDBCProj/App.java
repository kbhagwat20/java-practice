package com.mindtree.jdbc.MysqlJDBCProj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App 
{
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String host ="localhost";
		String port ="3306";
		
		//connect to database
		Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/sample", "root", "root");
		
		//create statement
		Statement s= con.createStatement();
		
		//execute statement
		ResultSet rs= s.executeQuery("select * from worker");
		
		while(rs.next()) 
		{
			
		     System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
		     		
		}
		s.close();
		con.close();

	}
}
