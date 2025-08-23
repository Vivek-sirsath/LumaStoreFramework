package com.lumastore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewCustomerAccountPage {

	    // Create object of WebDriver
		WebDriver ldriver;

		// Create constructor
		public CreateNewCustomerAccountPage(WebDriver rdriver) {

			ldriver = rdriver;

			PageFactory.initElements(rdriver, this);

		}
		
		// Identify web elements
		
		@FindBy(xpath = "//div[@class='panel header']//a[normalize-space()='Create an Account']")
		WebElement createAnAccountLink;
		
		@FindBy(xpath = "//input[@id='firstname']")
		WebElement firstNameField;
		
		@FindBy(xpath = "//input[@id='lastname']")
		WebElement lastNameField;
		
		@FindBy(xpath = "//input[@id='email_address']")
		WebElement emailAddressField;
		
		@FindBy(xpath = "//input[@id='password']")
		WebElement passwordField;
		
		@FindBy(xpath = "//input[@id='password-confirmation']")
		WebElement confirmPasswordField;
			
		@FindBy(xpath = "//button[@title='Create an Account']//span[contains(text(),'Create an Account')]")
		WebElement createAnAccButton;
		
		@FindBy(xpath = "//span[@data-ui-id=\"page-title-wrapper\"]")
		WebElement pageTitle;
		
		@FindBy(xpath = "//div[@class='message-error error message']")
		WebElement errorMsg;
		
		
		// Create action methods to perform action on web elements
		
		public void clickOnCreateAnAccountLink() {
			createAnAccountLink.click();
		}
		
		public void enterFirstName(String firstName) {
			firstNameField.sendKeys(firstName);
		}
		
		public void enterLastName(String lastName) {
			lastNameField.sendKeys(lastName);
		}
		
		public void enterEmailAddress(String emailID) {
			emailAddressField.sendKeys(emailID);
		}
		
		public void enterPassword(String password) {
			passwordField.sendKeys(password);
		}
		
		public void enterConfirmPassword(String confirmPassword) {
			confirmPasswordField.sendKeys(confirmPassword);
		}
		
		public void clickOnCreateAccountButton() {
			createAnAccButton.click();
		}
		
		public String getPageTitleWrapperText() {
			return pageTitle.getText();
		}
		
		public String getErrorMessageTextOfAlreadyRegisteredEmailAddress() {
			String errMsg = errorMsg.getText();
			return errMsg;
		}
		
}
