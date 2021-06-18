package com.crm.comcast.practice;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.annotations.Test;

import com.crm.comcast.genericUtils.DataBaseUtility;
import com.crm.comcast.genericUtils.PropertyFileUtility;
public class DemoRead {
	/**
	 * This class to read the file from property file
	 * @throws IOException
	 * @throws SQLException 
	 */
	@Test
	public  void demoProperty() throws IOException, SQLException {
		PropertyFileUtility pLib=new PropertyFileUtility();
		DataBaseUtility dbLib=new DataBaseUtility();
		String USERNAME =pLib.readDataFromPropertyFile("username");
		System.out.println(USERNAME);
		
		dbLib.connectToDB();	
		String value =dbLib.executeQueryAndGetData("select * from employee;", 1, "Sowmya");
		System.out.println(value);
	//	dbLib.closeDB();
		
		ResultSet v1=dbLib.readDataFromDatabase("jdbc:mysql://localhost:3306/sdet1", "root", "root", "select * from  employee;");
		System.out.println(v1);
		dbLib.closeDB();
		
	}


	

}
