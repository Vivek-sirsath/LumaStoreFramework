package com.lumastore.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CatalogueSearchResultsPage {
	
	// Create object of WebDriver
		WebDriver ldriver;

		// Create constructor
		public CatalogueSearchResultsPage(WebDriver rdriver) {

			ldriver = rdriver;

			PageFactory.initElements(rdriver, this);

		}
		
		// Identify web elements
		
		@FindBy(linkText = "Lando Gym Jacket")
		WebElement landoGymJacket;
		
		
						
		// perform action on web elements
		
		public void clickOnDesiredProduct() {
			JavascriptExecutor jse = (JavascriptExecutor)ldriver;		
			jse.executeScript("window.scrollBy(0,600)");			
			landoGymJacket.click();
		}
		
		

}
