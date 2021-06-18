package com.crm.comcast.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class SampleJDBCExecuteQuery {
	@Test
	public void databaseExecuteQuery() throws SQLException {
	//step 1:Register to databse
	Driver driverRef=new Driver();
	DriverManager.registerDriver(driverRef);
	
	//Step 2: get connection with database
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet1", "root", "root");
	
	//Step 3: issue create statement
	Statement stat=conn.createStatement();
	
	//Step 4: Execute any query -provide table name
	ResultSet result=stat.executeQuery("select * from employee;");
	while(result.next())
	{
		System.out.println(result.getString(1));
	}
	
	//Step 5: close the database
	conn.close();
	
	}
	

}
