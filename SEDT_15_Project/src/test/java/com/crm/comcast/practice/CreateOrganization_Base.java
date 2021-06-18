package com.crm.comcast.practice;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.comcast.genericUtils.BaseClass;
import com.crm.comcast.genericUtils.ExcelFileUtility;
import com.crm.comcast.genericUtils.JavaUtility;
import com.crm.comcast.genericUtils.PropertyFileUtility;
import com.crm.comcast.genericUtils.WebDriverUtility;

public class CreateOrganization_Base extends BaseClass {
	public void createOrgTest() throws Throwable
	{
		
	WebDriver driver=new ChromeDriver();
		//fetch the data
		String OrgName = elib.getExcelData("sheet1","TC_01","OrgName")+jlib.getRandomNumber();
		
	    //navigate to organizations
	    driver.findElement(By.linkText("Organizations")).click();
	    
	    //navigate to create organization
	    driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	    
	    //enter mandatory fields and create organization
	    driver
	    .findElement(By.name("accountname")).sendKeys(OrgName);
	    driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	    
	    //validate
        String successMsg = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
        Assert.assertTrue(successMsg.contains(OrgName));
        System.out.println(successMsg);
        
	}
	

}
