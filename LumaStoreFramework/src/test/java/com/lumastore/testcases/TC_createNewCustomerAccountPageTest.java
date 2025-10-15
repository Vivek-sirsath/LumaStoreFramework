package com.lumastore.testcases;

import org.testng.annotations.Test;

import com.lumastore.pageobject.CreateNewCustomerAccountPage;
import com.lumastore.pageobject.RegisteredUserWelcomePage;

public class TC_createNewCustomerAccountPageTest extends BaseClass {

	@Test(priority = 1, enabled = false)
	public void createNewUserAccountWithValidData() throws Exception {

		CreateNewCustomerAccountPage createAccPage = new CreateNewCustomerAccountPage(driver);

		createAccPage.clickOnCreateAnAccountLink();
		logger.info("Create an Account link clicked");
		Thread.sleep(3000);
		createAccPage.enterFirstName("Ishita");
		logger.info("Entered First Name");
		Thread.sleep(3000);
		createAccPage.enterLastName("Shirsath");
		logger.info("Entered Last Name");
		Thread.sleep(3000);
		createAccPage.enterEmailAddress("ishita456@yahoo.com");
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
	
	@Test(priority = 2, enabled = true)
	public void createNewUserAccountWithAlreadyRegisteredEmailId() throws Exception {

		CreateNewCustomerAccountPage createAccPage = new CreateNewCustomerAccountPage(driver);

		createAccPage.clickOnCreateAnAccountLink();
		logger.info("Create an Account link clicked");
		Thread.sleep(3000);
		createAccPage.enterFirstName("Ishita");
		logger.info("Entered First Name");
		Thread.sleep(3000);
		createAccPage.enterLastName("Shirsath");
		logger.info("Entered Last Name");
		Thread.sleep(3000);
		createAccPage.enterEmailAddress("ishita456@yahoo.com");
		logger.info("Entered already registered Email ID");
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
	
	@Test (priority = 3, enabled = false)
	public void verifyAccountCreatedOrNot() {

		RegisteredUserWelcomePage welcomePg = new RegisteredUserWelcomePage(driver);

		String newUserName = welcomePg.getRegisteredUserNameText();

		if (newUserName.equalsIgnoreCase("Ishita Shirsath")) {
			logger.info("Verified new user registered and account created");
		} else {
			logger.info("New user not created");
		}

	}
	
	@Test (priority = 4, enabled = true)
	public void verifyErrorMessageOfAlreadyRegisteredEmailAddress() {
		
		CreateNewCustomerAccountPage createNewAccPage = new CreateNewCustomerAccountPage(driver);
		
		String errMessage = createNewAccPage.getErrorMessageTextOfAlreadyRegisteredEmailAddress();
		System.out.println("Error : " + errMessage);
		
		if (errMessage.contains("There is already an account with this email address. If you are sure that it is your email address")) {
			logger.info("Error message displayed successfully");
		} else {
			logger.info("No error message not displayed");
		}
	}
	
	@Test (priority = 5, enabled = false)
	public void verifySeccessMessageForRegistrationOfNewUser() {
		
		RegisteredUserWelcomePage welcomePg = new RegisteredUserWelcomePage(driver);
		
		String successMsgTxt = welcomePg.getRegisteredUserSuccessMsgText();
		
		if (successMsgTxt.equalsIgnoreCase("Thank you for registering with Main Website Store.")) {
			logger.info("Verified the success message displayed successfully");
		} else {
			logger.info("Success message not displayed");
		}
	}

}
