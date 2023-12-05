package Basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ReadDataFromPropertyTest
{
	public WebDriver driver;
	@Test
	public void vtigerCRMTest() throws IOException
	{
		final WebDriver driver;
		FileInputStream fis=new FileInputStream("src\\test\\resources\\Vtiger.properties");
		Properties p=new Properties();
		p.load(fis);
		String BROWSER = p.getProperty("Browser");
		
		if(BROWSER.equals("Chrome"))
		{
			driver=new ChromeDriver();
		}
		
		else if(BROWSER.equals("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			driver=new EdgeDriver();
		}
		
		
		String url=p.getProperty("URL");	//To get/read/fetch the key from property file
		String USERNAME=p.getProperty("Username");
		String PASSWORD=p.getProperty("Password");
				
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
	}
}
