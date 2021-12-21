package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {      
	public WebDriver driver;
	
	//init elements
	public HomePage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);       //pageFactory Anotation
	}
		
	
	//page objects repo
	@FindBy(xpath="//*[@id=\"text-22-sub_row_1-0-1-1-0\"]/h2")
	private WebElement arrivalActEle;
	
	@FindBy(xpath="//h3[text()='Selenium Ruby']")
	private WebElement firstBookEle;
	
		
	//methods or action
	public boolean newArrivalsIsDisplayed()
	{
		return arrivalActEle.isDisplayed();
	}
	
	public boolean newArrivalsIsEnabled()
	{
		return arrivalActEle.isEnabled();
	}
	
	/*public boolean newArrivalsIsSelected()
	{
		return arrivalActEle.isSelected();
	}*/
	
	public String getElementText()
	{
		return firstBookEle.getText();
	}

	
}
