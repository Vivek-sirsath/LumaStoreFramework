package com.lumastore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReviewAndPaymentsPage {
	
	// Create object of WebDriver
	WebDriver ldriver;

	// Create constructor
	public ReviewAndPaymentsPage(WebDriver rdriver) {

		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);

	}
	
	// Identify web elements
	@FindBy(xpath = "//button[@title='Place Order' and @type='submit']")
	WebElement placeOrderBtn;
	

	
	// Perform action on web elements
	public void clickOnPlaceOrderButton() {
		placeOrderBtn.click();
	}
	

}
