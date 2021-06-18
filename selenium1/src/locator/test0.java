package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test0 {

	public static void main(String[] args) {
		System.setProperty("WebDriver.Chrome.Driver", "./software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.get("https://www.amazon.in/");
	//	driver.findElement(By.id(""))
		
		

	}

}
