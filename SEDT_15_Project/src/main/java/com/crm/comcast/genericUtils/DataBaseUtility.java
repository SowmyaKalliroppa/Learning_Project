package com.crm.comcast.genericUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;
/**
 * This class Contains methods related to Database
 * @author SAGAR
 *
 */

public class DataBaseUtility {
	Connection con=null;
	ResultSet result = null;
	public void connectToDB()
	{
		Driver driverRef;
		try
		{
			driverRef = new Driver();
			DriverManager.registerDriver(driverRef);
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet1", "root", "root");
		}
	catch(Exception e) {
		e.printStackTrace();
	}
	}
	
/**
 * This method will close connection	
 * @throws SQLException 
 */
     	public void closeDB() throws SQLException 
	   {
         con.close();

}

public String executeQueryAndGetData(String query,int columnName,String expData) throws SQLException
{
	boolean flag = false;
	result = con.createStatement().executeQuery(query);
	while(result.next()) {
		if(result.getString(columnName).equalsIgnoreCase(expData))
		{
			flag=true;
			break;
			
		}
	}
	if(flag)
	{
		System.out.println(expData+"data verified in database");
		return expData;
	} else {
		
		System.out.println(expData+"data not verified");
		return expData;
	}
}
public ResultSet  readDataFromDatabase(String url,String username,String password,String query2) throws SQLException
{
	//step 1:Register to databse
		Driver driverRef=new Driver();
		DriverManager.registerDriver(driverRef);
		//Step 2: get connection with database
		 con = DriverManager.getConnection(url,username,password);
		// step 3:Issue create statement 
		 Statement stat=con.createStatement();
			ResultSet result=stat.executeQuery(query2);
			while(result.next())
			{
				System.out.println(result.getString(1));
			}

	return result;
	
}
}