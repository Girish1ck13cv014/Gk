package mavenCmd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PracticeTest
{
	@Test
	public void test0() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		Thread.sleep(2000);
		driver.quit();
	}
	@Test
	public void test1() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("http://www.google.com/");
		Thread.sleep(2000);
		driver.quit();
	}
	@Test
	public void test2() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("http://www.swiggy.com/");
		Thread.sleep(2000);
		driver.quit();
	}
}
