//package com.crm.comcast.genericUtils;

package com.crm.comcast.genericUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

//import org.testng.annotations.Test;

public class PropertyFileUtility {
	
	
	public String readDataFromPropertyFile(String key) throws IOException {
		FileInputStream file=new FileInputStream("commonData.properties");
		Properties prop =new Properties();
		prop.load(file);
		String value = prop.getProperty(key);
	//	System.out.println(value);
		return value;
		
		
	}

}
