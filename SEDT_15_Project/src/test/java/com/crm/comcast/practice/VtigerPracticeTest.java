package com.crm.comcast.practice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import com.crm.comcast.genericUtils.PropertyFileUtility;

public class VtigerPracticeTest {
	@Test
	public void  createOrgannization() throws Throwable {
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver;
		
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
		
		Thread.sleep(2000);
		driver.close();
	}

}
