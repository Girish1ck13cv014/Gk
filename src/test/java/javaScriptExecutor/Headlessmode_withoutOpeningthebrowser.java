package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headlessmode_withoutOpeningthebrowser 
{
	public static void main(String[] args) 
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.yatra.com/");
		System.out.println("headless mode");
		driver.quit();
}
}
