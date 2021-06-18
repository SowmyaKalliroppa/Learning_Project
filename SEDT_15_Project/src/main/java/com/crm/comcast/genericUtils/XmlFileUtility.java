package com.crm.comcast.genericUtils;

//package com.crm.comcast.genericUtils;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.testng.annotations.Test;

//Run All
public class XmlFileUtility {
	/**
	 * 
	 * @param node
	 * @return
	 * @throws DocumentException
	 */
	@Test
	public void readDataFromXml() throws DocumentException{
		
		File inputfile = new File("./commonData.xml");
				SAXReader reader =new SAXReader();
			 Document doc = reader.read(inputfile);
			  String value = doc.selectSingleNode("//commonData/password").getText();
			 System.out.println(value);
             //  return value;			 
				
		
	}

	
	
}
