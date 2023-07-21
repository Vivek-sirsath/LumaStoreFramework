package com.lumastore.testcases;

import org.testng.annotations.Test;

import com.lumastore.pageobject.CreateAnAccountPage;

public class TC_createAnAccountPageTest extends BaseClass {

	@Test (priority=1)
	public void createNewUserAccount() throws Exception {
		
		CreateAnAccountPage createAccPage = new CreateAnAccountPage(driver);
		
		createAccPage.clickOnCreateAnAccountLink();
		logger.info("Create an Account link clicked");
		Thread.sleep(3000);
		createAccPage.enterFirstName("Deepika");
		logger.info("Entered First Name");
		Thread.sleep(3000);
		createAccPage.enterLastName("Shirsath");
		logger.info("Entered Last Name");
		Thread.sleep(3000);
		createAccPage.enterEmailAddress("EmailID");
		logger.info("Entered Email ID");
		Thread.sleep(3000);
		createAccPage.enterPassword("Password@123");
		logger.info("Entered Password");
		Thread.sleep(3000);
		createAccPage.enterConfirmPassword("Password@123");
		logger.info("Entered Confirmed Password");
		Thread.sleep(3000);
		createAccPage.clickOnCreateAccountButton();
		logger.info("Clicked on Create an Account Button");		
				
	}
}
