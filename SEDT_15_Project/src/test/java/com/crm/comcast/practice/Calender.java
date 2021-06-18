package com.crm.comcast.practice;


import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
      //problem solved
/**
 * why this exception org.openqa.selenium.ElementClickInterceptedException:
 * @author SAGAR
 *
 */
public class Calender {
	public static void main(String args[]) throws Throwable {
	/*	Date dateobj = new Date();
		String todaysdate=dateobj.toString();
		String[] arr = todaysdate.split("");
		String day=arr[0];
		String month=arr[1];
		String date=arr[2];
		String year=arr[5]; */
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Actions action=new Actions(driver);
		action.moveByOffset(10, 10).click().perform();
		Thread.sleep(1000);
		WebElement src = driver.findElement(By.xpath("//input[@id='fromCity']"));
		WebElement dest = driver.findElement(By.xpath("//input[@id='toCity']"));
		src.sendKeys("Mumbai");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'BOM')]")).click();
		dest.sendKeys("Chennai");
		driver.findElement(By.xpath("//div[contains(text(),'MAA')]")).click();
		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='Sun Jun 13 2021']")).click();
	//	System.out.println(day+" "+month+" "+date+" "+year);
		for (;;) {
			try {
				driver.findElement(By.xpath("//div[@aria-label='Sat Oct 02 2021']")).click();
				break;
			}

			catch (Exception e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
		
		driver.close();
	}
	

}
