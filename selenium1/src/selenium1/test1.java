package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.onlinesbi.com");
		//Thread.sleep(3000);
			driver.getCurrentUrl();
			System.out.println(driver.getTitle());
			driver.close();

	}

}
