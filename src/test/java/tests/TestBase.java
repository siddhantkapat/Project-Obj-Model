package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {                     // common page
	
	public static WebDriver driver;
	
	public static void initDriver()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Java Project\\AutomationFiles\\drivers\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

	}
	
}
