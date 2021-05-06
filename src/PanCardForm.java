import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class PanCardForm 
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\chromedriver_win32new\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.onlineservices.nsdl.com/paam/endUserRegisterContact.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='select2-selection__rendered']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[text()='New PAN - Indian Citizen (Form 49A)']")).click();
		driver.findElement(By.xpath("(//span[@class='select2-selection__rendered'])[2]")).click();
		driver.findElement(By.xpath("//li[text()='INDIVIDUAL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='select2-selection__rendered'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[text()='Shri']")).click();
		FileInputStream file = new FileInputStream("E:\\Software Testing\\Selenium\\Parameterization\\PanCard.xlsx");
		Sheet data = WorkbookFactory.create(file).getSheet("Pancardform");
		String lastname = data.getRow(4).getCell(2).getStringCellValue();
		String Firstname = data.getRow(5).getCell(2).getStringCellValue();
		String middlename = data.getRow(6).getCell(2).getStringCellValue();
     	//String dob = data.getRow(7).getCell(2).getStringCellValue();
		String mail = data.getRow(8).getCell(2).getStringCellValue();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(Firstname);
		driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys(middlename);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='dateOfBirth']")).click();
		WebElement year = driver.findElement(By.xpath("//select[contains(@class,'yearselect form-c')]"));
		Select s1 = new Select(year);
		s1.selectByVisibleText("1996");
		WebElement dateofbirth = driver.findElement(By.xpath("//select[@class='monthselect form-control input-sm']"));
		Select s = new Select(dateofbirth);
		s.selectByVisibleText("Jun");
		driver.findElement(By.xpath("//td[@data-title='r1c0']")).click();
		
		driver.findElement(By.xpath("//input[@name='emailId']")).sendKeys(mail);
		
		Thread.sleep(3000);
		
		long mobileno1 = (long) data.getRow(9).getCell(2).getNumericCellValue();
		String ty= Long.toString(mobileno1);
		driver.findElement(By.xpath("//input[@name='rvContactNo']")).sendKeys(ty);
		
		driver.findElement(By.xpath("//input[@name='consent']")).click();
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String rand = RandomString.make(2);
		File Dest = new File("E:\\Software Testing\\Selenium\\Screenshots\\pan"+rand+".jpg");
		FileHandler.copy(source, Dest);
	
	}
}
