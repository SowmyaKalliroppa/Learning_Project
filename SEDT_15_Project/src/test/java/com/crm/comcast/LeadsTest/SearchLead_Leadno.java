package com.crm.comcast.LeadsTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.crm.comcast.genericUtils.PropertyFileUtility;

public class SearchLead_Leadno {
	/**
	 * Method to search lead by clicking on leadno
	 * @throws Throwable
	 */
	@Test
public void  TC054_searchLeadByLeadno() throws Throwable {
		
		WebDriver driver;
		
		PropertyFileUtility pLib=new PropertyFileUtility();
		String URL =pLib.readDataFromPropertyFile("url");
		String BROWSER = pLib.readDataFromPropertyFile("browser");	
		String USERNAME = pLib.readDataFromPropertyFile("username");
		String PASSWORD = pLib.readDataFromPropertyFile("password");		
		if(BROWSER.equals("chrome")) {
			driver=new ChromeDriver();
		} else if(BROWSER.equals("firefox")) {
			driver= new FirefoxDriver();
		} else {
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(URL);
		driver.manage().window().maximize();
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Go to Advanced Search")).click();
	  //  driver.findElement(By.className("detailedViewTextBox")).click();
	    WebElement ele = driver.findElement(By.className("detailedViewTextBox"));
	    Select s= new Select(ele);
	    s.selectByVisibleText("Lead No");
	    WebElement secbox=driver.findElement(By.xpath("//select[@class='repBox']"));
	     Select s1=new Select(secbox);
	     s1.selectByVisibleText("not equal to");
	       
	     driver.findElement(By.xpath("//form[@name='advSearch']//input[@class='crmbutton small create']")).click();
	Thread.sleep(1000);
	    driver.close();
	
}
}
