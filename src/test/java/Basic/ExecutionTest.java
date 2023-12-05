package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExecutionTest 
{
	@Test (groups="Food")
	public void ZomatoTest()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://zomato.com/");
	}
	
	@Test
	public void FacebookTest()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test (groups="Food")
	public void SwiggyTest()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
	}
	
}
