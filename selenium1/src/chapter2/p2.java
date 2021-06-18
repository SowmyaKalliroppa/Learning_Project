package chapter2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.name("userType")).click();
		driver.findElement(By.name("uploadCV")).sendKeys("C:\\Users\\SAGA\\Downloads\\JAN2021_AA02332458_TXN.pdf");
		
		
	}

}
