package testNG;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class CrossBrowserParallel_googleTest
{
	@Parameters("Browser")
	@Test
	public void demoTest(String browser) throws InterruptedException
	{
		WebDriver driver= null;
		switch(browser)
		{
		case "chrome": driver= new ChromeDriver();
		break;
		case "firefox": driver= new FirefoxDriver();
		break;
		case "edge": driver= new EdgeDriver();
		break;
		}
driver.manage().window().maximize();
driver.get("http://www.google.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
Thread.sleep(2000);
driver.quit();
	}
}
