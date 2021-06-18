package locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println("clicked on back");
		driver.navigate().forward();
		System.out.println("clicked on forward");
		driver.navigate().refresh();
		System.out.println("clicked on refresh");
		driver.close();
		System.out.println("closed the browser successfully");
		
		

	}

}
