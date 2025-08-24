package com.lumastore.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.lumastore.pageobject.LoginPage;
import com.lumastore.pageobject.RegisteredUserWelcomePage;

public class TC_RegisteredUserWelcomePageTest extends BaseClass {

	@Test(priority = 2, enabled = true)
	public void verifyUIWidgetContent() throws IOException {

		LoginPage lpage = new LoginPage(driver);
		lpage.clickOnSignInLink();
		logger.info("Sign In Link Clicked");
		lpage.enterEmailInEmailField(email);
		logger.info("Email Entered");
		lpage.enterPasswordInPasswordField(password);
		logger.info("Password Entered");
		lpage.clickOnSignInButton();
		logger.info("Clicked on Sign In Button");

		RegisteredUserWelcomePage wPage = new RegisteredUserWelcomePage(driver);

		wPage.clickOnWhatsNewTab();
		driver.navigate().back();
		logger.info("Whats New tab verified");
		wPage.clickOnWomenTab();
		driver.navigate().back();
		logger.info("Women tab verified");
		wPage.clickOnMenTab();
		driver.navigate().back();
		logger.info("Men tab verified");
		wPage.clickOnGearTab();
		driver.navigate().back();
		logger.info("Gear tab verified");
		wPage.clickOnTrainingTab();
		driver.navigate().back();
		logger.info("Training tab verified");
		wPage.clickOnSaleTab();
		driver.navigate().back();
		logger.info("Sale tab verified");

	}

	@Test(enabled = true, priority = 3)
	public void verifySearchFunctionality() throws Exception {

		RegisteredUserWelcomePage wPage = new RegisteredUserWelcomePage(driver);
		wPage.enterDataInSearchBox("Jeans");
		wPage.clickOnSearchButton();
		driver.navigate().back();
		logger.info("Search functionality verified");
		Thread.sleep(5000); // If sleep eliminated, Failure Screenshot will be taken

	}

	@Test(enabled = true, priority = 4)
	public void verifyRegisteredUserNameText() throws Exception {
		RegisteredUserWelcomePage user = new RegisteredUserWelcomePage(driver);

		// 1st Approach
		String welcomeName = user.getRegisteredUserNameText().toString();

		if (welcomeName.contains("Vivek Sirsath")) {
			logger.info("Name of registered user verified");
			Assert.assertTrue(true);
		} else {
			logger.info("Registered username Verificatin Failed - Screenshot is taken");
			captureScreenShot(driver, "welcomeNameVerification");
			Assert.assertTrue(false);
			logger.info("1st Approach to verify registered user is verified");
		}

		// 2nd Approach
		String name = user.getRegisteredUserNameText();
		Assert.assertEquals("Vivek Sirsath", name);
		System.out.println("User Name: " + name);
		logger.info("2nd Approach to verify registered user is verified");
	}

}
