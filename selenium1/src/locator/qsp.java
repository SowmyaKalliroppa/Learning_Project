package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class qsp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.oracle.com/mysso/signon.jsp");
		driver.findElement(By.id("sso_username")).sendKeys("sagard.kan@gmail.com");
		driver.findElement(By.id("password")).sendKeys("s@g@r@3oo75");
		String title = driver.getTitle();
		System.out.println(title);
		Object url =driver.getCurrentUrl();
		System.out.println(url);
		driver.findElement(By.id("signin_button")).click();
	/*if(title.equals("Facebook – log in or sign up"))
		{
			System.out.println("pass:expected title as displayed");
			
		}
		else
			System.out.println("fail:expected title as not displayed");  */
		


	}

}
