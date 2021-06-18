package com.crm.comcast.practice;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import com.crm.comcast.genericUtils.PropertyFileUtility;

public class DynamicWebTable {
	
	WebDriver driver;
	@Test
	public void checkBox() throws Throwable
	{
	PropertyFileUtility pLib=new PropertyFileUtility();
	String URL =pLib.readDataFromPropertyFile("url"); 
	String BROWSER = pLib.readDataFromPropertyFile("browser");	
	String USERNAME = pLib.readDataFromPropertyFile("username");
	String PASSWORD = pLib.readDataFromPropertyFile("password");
	
	
	System.out.println("Hi Vtiger");
	
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
	driver.findElement(By.linkText("Organizations")).click();
	List<WebElement> list = driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr[*]/td[*]/input"));
	for(int i=1;i<list.size()-1;i++)
	{
		list.get(i).click();
	} 
	
	/*for(WebElement ls:list) {
		System.out.println(list.get(0).getText());
		
	} */
	
	}
}
