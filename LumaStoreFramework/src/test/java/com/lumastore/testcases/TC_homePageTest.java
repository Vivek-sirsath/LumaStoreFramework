package com.lumastore.testcases;

import org.testng.annotations.Test;

import com.lumastore.pageobject.HomePage;


public class TC_homePageTest extends BaseClass {
	
	@Test (priority=5)
	public void verifySignInLink() {
		
//		open url
//		driver.get(url);
		logger.info("Browser Opened Successfully");
		
		// Create object of HomePage Class to perform the method of that class
		HomePage hPage = new HomePage(driver);
	    hPage.clickOnSignInLink();
	    logger.info("Sign In Link Clicked");
		
	}

}
