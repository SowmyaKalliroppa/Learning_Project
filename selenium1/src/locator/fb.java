package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("sagard.kan@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("k.a.r.1.2.3");
		String title = driver.getTitle();
		System.out.println(title);
		Object url =driver.getCurrentUrl();
		System.out.println(url);
		driver.findElement(By.name("login")).click();
	if(title.equals("Facebook – log in or sign up"))
		{
			System.out.println("pass:expected title as displayed");
			
		}
		else
			System.out.println("fail:expected title as not displayed"); 
		


	}

}
