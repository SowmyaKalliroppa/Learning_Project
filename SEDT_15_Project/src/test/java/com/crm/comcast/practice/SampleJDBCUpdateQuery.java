package com.crm.comcast.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class SampleJDBCUpdateQuery {
	@Test
	public void databaseExeuteUpdate() throws Throwable
	{
		Connection conn=null;
		try
		{
			Driver driverRef = new Driver();
			DriverManager.registerDriver(driverRef);
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet1", "root", "root");
			
			Statement stat=conn.createStatement();
			int result = stat.executeUpdate("insert into employee values('Banu',1111122455,'Bangaluru')");
			if(result==1)
			{
				System.out.println("Query successfull 1 row added");
			}
			else
			{
				System.out.println("Query Failed");
				
			}
		}
		 catch(Exception e)
		{
			 
		}
		finally {
			conn.close();
			System.out.println("Database connection closed successfully");
		}
		
		
	}


}
