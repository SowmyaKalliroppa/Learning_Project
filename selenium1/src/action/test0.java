package action;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class test0 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElements(By.id("Download")).get(1).click();
		Runtime.getRuntime().exec("D:\\java\\autoIT\\file.exe");

//java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 0
		
	}

}
