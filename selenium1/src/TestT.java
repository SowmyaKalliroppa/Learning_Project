import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class TestT {

	
	@DataProvider(name="data")
	public String[] getData() {
		String [] values= {"abcd",
				           "defg",
				           "mnop"};
		return values;
	}
	
	@Test(DataProvider="data")
	public void campaignData(String campaignName) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://106.51.137.79:7777/crm/HomePage.do");
		driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
		driver.findElement(By.id("passWord")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@title='Sign In']")).click();
		driver.findElement(By.linkText("Campaigns")).click();
		driver.findElement(By.linkText("New Campaign")).click();
		driver.findElement(By.xpath("//td[@class='title hline']//input[@class='button']")).click();
		driver.findElement(By.name("property(Campaign Name)")).sendKeys("campaignName");
		
	}
	
	
}
