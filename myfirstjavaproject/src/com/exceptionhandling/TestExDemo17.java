package com.exceptionhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestExDemo17 {

	public static void main(String[] args) throws SQLException  {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		

try {
	//Step1:Loading driver class
	//forName method :returns thr class obj associated with the class or interface
	//with the given string name.		
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class loaded into your primary location.");
			
			//Step2:Establishing connection btw the JDBC & MySql
			DriverManager.getConnection("jdbc:mysql://localhost:3306/batch75","root","root");
			System.out.println("Your connection has been established");
			
			//step4:create a resultset
			String sql="select * from employee";
			
			//step5:representing the data
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" | ");
				System.out.println(rs.getString(2)+" | ");
				System.out.println(rs.getString(3)+" | ");
				System.out.println(rs.getString(4)+" | ");
			}
			
			
			//step6:closing all the connection related obj

	}catch(SQLException | ClassNotFoundException ex) {
		System.err.println("in cATCH");
	}finally {
		con.close();
		stmt.close();
		rs.close();
	}
	
	}

}
