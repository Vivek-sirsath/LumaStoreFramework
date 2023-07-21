package com.lumastore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisteredUserWelcomePage {

	// Create object of WebDriver
	WebDriver ldriver;

	// Create constructor
	public RegisteredUserWelcomePage(WebDriver rdriver) {

		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);

	}	
	
	// Identify web elements
	
	@FindBy(xpath = "//div[@class='panel header']")
	WebElement userName;
	
	@FindBy(linkText = "What's New")
	WebElement whatsNewTab;
	
	@FindBy(linkText = "Women")
	WebElement womenTab;
	
	@FindBy(linkText = "Men")
	WebElement menTab;
	
	@FindBy(linkText = "Gear")
	WebElement gearTab;
	
	@FindBy(linkText = "Training")
	WebElement trainingTab;
	
	@FindBy(linkText = "Sale")
	WebElement saleTab;
	
	@FindBy(id = "search")
	WebElement searchBox;
	
	@FindBy(xpath = "//button[@title='Search']")
	WebElement searchButton;
	
	@FindBy(xpath = "//div[@class='panel header']//button[@type='button' and @data-action='customer-menu-toggle']")
	WebElement userToggleButton;
	
	@FindBy(linkText = "Sign Out")
	WebElement signOut;
	
	
	
	
	
	
/*	@FindBy(xpath = "//button[@xpath='1']")
//  WebElement toggleButton;
	
		
	
	// perform action on web elements	
	
	
*/
	
	public void clickOnWhatsNewTab() {
		whatsNewTab.click();
	}
	
	public void clickOnWomenTab() {
		womenTab.click();
	}
	
	public void clickOnMenTab() {
		menTab.click();
	}
	
	public void clickOnGearTab() {
		gearTab.click();
	}
	
	public void clickOnTrainingTab() {
		trainingTab.click();
	}
	
	public void clickOnSaleTab() {
		saleTab.click();
	}
	
	public void enterDataInSearchBox(String data) {
		searchBox.sendKeys(data);
	}
	
	public void clickOnSearchButton() {
		searchButton.click();
	}
	 
	public void clickOnUserToggleButton() {
		userToggleButton.click();
	}
	
	public String getTextPresentInSearchBox() {
		String searchBoxText = searchBox.getText();
		return searchBoxText;
	}
	
	public String verifyRegisteredUserNameText() {
		String text = userName.getText();
		return text;		
	}
	
	public void verifySearchField() {
		searchBox.isEnabled();
	}
	
	public void clickOnSignOutLink() {
		signOut.click();
	}
	
}
