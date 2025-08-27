package com.lumastore.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.lumastore.pageobject.LoginPage;
import com.lumastore.pageobject.RegisteredUserWelcomePage;
import com.lumastore.utilities.ReadExcelFile;

public class TC_dataDrivenLoginPageTest extends BaseClass {

	@Test(dataProvider = "LoginDataProvider")
	public void verifyDataDrivenTest(String email, String password, String expectedUsername) throws IOException, Exception {

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
		
		Thread.sleep(5000);

		RegisteredUserWelcomePage wPage = new RegisteredUserWelcomePage(driver);
		String userName = wPage.verifyRegisteredUserNameText();

		if (userName.contains(expectedUsername)) {
			logger.info("Name of the registered user verified");
			Assert.assertTrue(true);
			wPage.clickOnUserToggleButton();
			wPage.clickOnSignOutLink();

		} else {

			logger.info("Username Verificatin - Failed");
			captureScreenShot(driver, "verifyUserNameVisibility");
			Assert.assertTrue(false);
		}
	}

	@DataProvider(name = "LoginDataProvider")
	public String[][] LoginDataProvider() {
		// System.out.println(System.getProperty("user.dir"));
		String fileName = System.getProperty("user.dir") + "\\TestData\\UsersTestData.xlsx";

		// Sheet Name = UserData
		// Here we don't need to create the object of 'ReadExcelFile' Class
		// Because, we've created the methods static, directly called the method using ClassName
		int ttlRows = ReadExcelFile.getRowCount(fileName, "UserData");
		int ttlColumns = ReadExcelFile.getColCount(fileName, "UserData");

		// Here we don't need to create object of 'ReadExcelFile' Class because,
		// we have declared the methods as static
   // We take (ttlRows - 1) because, first row is for header. Hence we should minus that row from 'ttlRows'
		String data[][] = new String[ttlRows - 1][ttlColumns];

		for (int i = 1; i < ttlRows; i++)// rows = 1, 2
		{
			for (int j = 0; j < ttlColumns; j++)// col = 0, 1, 2
			{

				data[i - 1][j] = ReadExcelFile.getCellValue(fileName, "UserData", i, j);
			}

		}
		return data;
	}

}
