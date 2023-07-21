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
	
		
	// perform action on web element
	public void clickOnSignInLink() {
		signin.click();
	}
	
	
}
