package com.lumastore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	// Create object of WebDriver
	WebDriver ldriver;

	// Create constructor
	public HomePage(WebDriver rdriver) {

		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);   // 'this' is the object of this page

	}

	// Identify Web Elements - sign in link
	@FindBy(linkText = "Sign In")
	WebElement signin;
	
	@FindBy(id = "search")
	WebElement homeSearchBox;
	
	@FindBy(xpath = "//button[@title='Search']")
	WebElement searchButton;
	
	
	
	
		
	// perform action on web element
	public void clickOnSignInLink() {
		signin.click();
	}
	
	public void clickAndEnterTextInSearchBox(String data) {
		homeSearchBox.sendKeys(data);;
	}
/*	
	public String getSearchBoxText() {
		String text = homeSearchBox.getText();
		return text;
	}
*/
	public void clickOnSearchButton() {
		searchButton.click();
	}
	
}
