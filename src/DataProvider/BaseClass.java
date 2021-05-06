package DataProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass 
{
	static WebDriver driver;
	public static void openBrowser(String browserName)
	{
		driver = new ChromeDriver();
		if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\Software Testing\\Selenium\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://demoqa.com");
		}
		else if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\Software Testing\\Selenium\\selenium\\Browser Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://demoqa.com");
		}
		
	}
}
