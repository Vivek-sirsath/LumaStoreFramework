/* Page Object Model using PageFactory class -
 * 
 * PageFactory is an In-Built Page Object Model concept for Selenium WebDriver
 * 3 important steps -
 * 
 * 1) @FindBy = (Declaration)
 * 2) PageFactory.initElements(driver, this) = (Initialization)
 * 3) Calling method to test class (Utilization)
 * 
*/
package com.lumastore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	// Create object of WebDriver
		WebDriver ldriver;

		// Create constructor
		public LoginPage(WebDriver rdriver) {

			ldriver = rdriver;

			PageFactory.initElements(rdriver, this);

		}
		
		// Identify Web Elements in Home Page - e.g. sign in link
		@FindBy(linkText = "Sign In")
		WebElement signin;
		
			
		// Identify Web Elements in Login Page
		

		
		@FindBy(id = "email")
		WebElement emailId;
		
		@FindBy(id = "pass")
		WebElement password;
		
		@FindBy(id = "send2")
		WebElement signInButton;
		
//		@FindBy(xpath = "//span[@class='base']")
//		WebElement customerLoginText;
		
		
	
		// perform action on web elements
		
		public void clickOnSignInLink() {
			signin.click();
		}
				
		public void enterEmailInEmailField(String email) {
			emailId.sendKeys(email);			
		}
		
		public void enterPasswordInPasswordField(String pwd) {
			password.sendKeys(pwd);
		}

		public void clickOnSignInButton() {
			signInButton.click();
		}
		
//		public void verifyCustomerLoginText() {
//			customerLoginText.getText();		
//		    }
		
}
