package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.getCurrentUrl();
   driver.get("https://www.amazon.in/");
   System.out.println(driver.getTitle());
  // driver.findElement(By.id("identifierId")).sendKeys("sgaksjasl");
  // driver.findElement(By.name("YPqjbf")).sendKeys("1234");
   
   driver.close();
   
	}

}
