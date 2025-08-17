package com.lumastore.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.lumastore.pageobject.CreateAnAccountPage;
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
	    logger.info("Sign in link verified");
		
	}
	
	@Test (priority=3)
	public void vrifySearchFinctionalityInHomePage() {
		HomePage hPage = new HomePage(driver);
		
		hPage.clickAndEnterTextInSearchBox("Bags");;
		logger.info("Clicked on search box and entered 'Bags'");
        
		hPage.clickOnSearchButton();
		logger.info("Search button clicked");
		logger.info("Search functionality verified");
	}
	
	@Test(priority=4)
	public void verifyCreateAnAccountLink() {
		HomePage hPage = new HomePage(driver);
		hPage.clickOnCreateAnAccountLink();
		logger.info("Clicked on 'Create An Account' link");
		
		CreateAnAccountPage createAccPage = new CreateAnAccountPage(driver);
		String pgText = createAccPage.getPageTitleWrapperText();
		System.out.println("Page Title: " + pgText);
		Assert.assertEquals(pgText, "Create New Customer Account");
		logger.info("Verified the 'Create An Account' link");
		
	}

}
