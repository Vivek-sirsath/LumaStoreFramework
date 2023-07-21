package com.lumastore.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.lumastore.pageobject.LoginPage;

public class TC_loginPageTest extends BaseClass {

	@Test (priority=6)
	public void verifyLoginPageTest() throws IOException {
		
		
		// Create object of LoginPage Class to perform the method of that class
		LoginPage lpage = new LoginPage(driver);
		lpage.clickOnSignInLink();
		logger.info("Sign In Link Clicked");		
		lpage.enterEmailInEmailField(email);	
		logger.info("Email Entered");
		lpage.enterPasswordInPasswordField(password);
		logger.info("Password Entered");
		lpage.clickOnSignInButton();
		logger.info("Sign In butten Clicked");
		
/*		String text = lpage.getWelcomeName();
		if(text.equals("Vivek Sirsath")) {
			logger.info("Username Verification - Passed");			
			Assert.assertTrue(true);
		}
		else {
			logger.info("Username Verificatin - Failed");
			captureScreenShot(driver, "verifyUserNameVisibility");
			Assert.assertTrue(false);
		}
*/				
	}
	
	
}


