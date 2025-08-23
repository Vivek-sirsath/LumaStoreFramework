package com.lumastore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	// 1. Create object of WebDriver
	WebDriver ldriver;

	// 2. Create a constructor of class
	public HomePage(WebDriver rdriver) {

		ldriver = rdriver;  // Here we need to initialize local driver by remote driver.

		PageFactory.initElements(rdriver, this); // 'this' is the object of this page

	}

	// 3. Identify Web Elements
	@FindBy(linkText = "Sign In")
	WebElement signin;
	
	@FindBy(linkText = "Create an Account")
	WebElement createAccLink;
	
	@FindBy(css = "#search")
	WebElement homeSearchBox;
/*
	Here we were not able to find the text inside 'Search Box' by using X-path
	Hence, used css and getAttribute() method. 
	Used below line as a reference.
//  String password=driver.findElement(By.cssSelector("ur css path")).getAttribute("placeholder");
 	
*/
	@FindBy(xpath = "//button[@title='Search']")
	WebElement searchButton;
	

	// 4. Perform action on Web Elements
	
	public void clickOnSearchBox() {
		homeSearchBox.click();
	}
	
	public void clickOnSignInLink() {
		signin.click();
	}
	
	public void clickOnCreateAnAccountLink() {
		createAccLink.click();
	}

	public void clickAndEnterTextInSearchBox(String data) {
		homeSearchBox.sendKeys(data);
	}

	public void clickOnSearchButton() {
		searchButton.click();
	}
	
	public String getSearchBoxText() {
		String txt = homeSearchBox.getAttribute("placeholder");
		return txt;
	}

}
