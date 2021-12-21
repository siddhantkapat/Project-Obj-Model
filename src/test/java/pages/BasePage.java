package pages;

import org.openqa.selenium.WebDriver;

public class BasePage {       //for common methods
	WebDriver driver;
	public BasePage (WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	
	public String getCurrentUrl()
	{
		return driver.getCurrentUrl();
	}

}
