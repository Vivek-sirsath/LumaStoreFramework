package com.lumastore.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.lumastore.pageobject.HomePage;


public class TC_homePageTest extends BaseClass {
	
	@Test (priority=1)
	public void verifySearchBoxText() throws InterruptedException  {
		HomePage hPage = new HomePage(driver);	
		
		hPage.clickOnSearchBox();
		logger.info("Clicked on search box");
		
		Thread.sleep(3000);
		
		String boxText = hPage.getSearchBoxText();
		System.out.println("Search box text is: " + boxText);
		
		Assert.assertEquals(boxText, "Search entire store here...");
		logger.info("Search box text verified");	
		
	}
	
	@Test (priority=2)
	public void verifySignInLink() {
		
//		open url
//		driver.get(url);
		
		// Create object of HomePage Class to perform the method of that class
		HomePage hPage = new HomePage(driver);
	    hPage.clickOnSignInLink();
	    logger.info("Sign In link clicked");
		
	}
	
	@Test (priority=3)
	public void searchFinctionalityInHomePage() {
		HomePage hPage = new HomePage(driver);
		
		hPage.clickAndEnterTextInSearchBox("Bags");;
		logger.info("Clicked on search box and entered 'Bags'");
        
		hPage.clickOnSearchButton();
		logger.info("Search button clicked");
	}

}
