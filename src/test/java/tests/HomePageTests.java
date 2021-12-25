package tests;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.Assert;

import pages.HomePage;

public class HomePageTests extends TestBase{
	
	HomePage homepage;
	
	@BeforeClass
	public void setup()                        //compulsary method
	{
		initDriver();
		homepage=new HomePage(driver);
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();
	}
	@Test
	public void verifyHomePageTitle() {
	  String expectedTitle="Automation Practice Site";
	  String actualTitle=homepage.getPageTitle();
	 AssertJUnit.assertEquals(actualTitle, expectedTitle);       //hard asserts
 	}
	
	@Test
	public void verifyNewArrivalsDisplayed() {
		boolean arrivalsActual=homepage.newArrivalsIsDisplayed();
		AssertJUnit.assertTrue(arrivalsActual);
 	}
	
	@Test
	public void verifyNewArrivalsEnabled() {
		boolean arrivalsActual=homepage.newArrivalsIsEnabled();	
		AssertJUnit.assertTrue(arrivalsActual);
 	}
	
/*	@Test
	public void verifyNewArrivalsSelected() {
		boolean arrivalsActual=homepage.newArrivalsIsSelected();	
		AssertJUnit.assertTrue(arrivalsActual);
 	}*/
	
	@Test
	public void verifyFirstBookTitle() {
		String expectedTitleBook="Selenium Rubyy";
		String actualTitleBook= homepage.getElementText();
		Assert.assertEquals(actualTitleBook,expectedTitleBook);
 	}

	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
}
