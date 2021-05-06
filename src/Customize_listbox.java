import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Customize_listbox
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\chromedriver_win32new\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(5000);
		//step 1
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		//month.click();
		Thread.sleep(3000);
		//step2
		Actions act = new Actions(driver);
		act.click(month).perform();
		Thread.sleep(1000);
		//step3
		act.sendKeys().perform();
	}
}
