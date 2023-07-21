package com.lumastore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmedSuccessPage {

	// Create object of WebDriver
	WebDriver ldriver;

	// Create constructor
	public OrderConfirmedSuccessPage(WebDriver rdriver) {

		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);

	}
	
	// Identify web elements
	
	@FindBy(xpath = "//span[contains(.,'Thank you for your purchase!')]")
	WebElement thankYouMessage;
	
	@FindBy(xpath = "//a[@class='order-number']")
	WebElement orderNumber;
	
	@FindBy(linkText = "Print receipt")
	WebElement printReceiptLink;
	
	@FindBy(xpath = "//a[@class='action primary continue']//span[normalize-space()='Continue Shopping']")
	WebElement continueShoppingLink;
	
	
	
	// Perform action on web elements
	
	public String getThankYouMessageText() {
		String thankMessage = thankYouMessage.getText();
		return thankMessage;
	}
	
	public String getOrderNumber() {
		String orderId = orderNumber.getText();
		return orderId;
	}
	
	public void clickPrintReceiptLink() {
		printReceiptLink.click();
	}
	
	public void clickContinueShoppingLink() {
		continueShoppingLink.click();
	}
		
}

