package DataProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class DataProvider 
{
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "E:\\Software Testing\\Selenium\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 driver.get("https://demoqa.com");
	}
	
}
