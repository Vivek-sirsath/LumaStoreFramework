package com.lumastore.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchResultsPage {

	// Create object of WebDriver
	WebDriver ldriver;

	// Create constructor
	public SearchResultsPage(WebDriver rdriver) {

		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);

	}

	// Identify web elements
	@FindBy(xpath = "//body[1]/div[1]/main[1]/div[3]/div[1]/div[2]/div[1]/div[4]/label[1]")
	WebElement sortLabel;

	@FindBy(xpath = "//div//div//div//div[1]//div[3]//select[1]")
	WebElement sortDropdown;

	@FindBy(xpath = "//div[@class='column main']//div[1]//div[4]//select[1]//option[@value='name']")
	WebElement sortByProductName;

	@FindBy(xpath = "//div[@class='column main']//div[1]//div[4]//select[1]//option[@value='price']")
	WebElement sortByPrice;

	@FindBy(xpath = "//div[@class='column main']//div[1]//div[4]//select[1]//option[@value='relevance']")
	WebElement sortByRelevance;

	@FindBy(xpath = "//body/div/main[@id='maincontent']/div/div/div/div[1]/div[3]/a[1]")
	WebElement ascDescDirectionSwitcher;

	@FindBy(xpath = "//div//div//div[3]//div[2]//ul[1]//li[3]//a[1]")
	WebElement nextPageActionButton;
	
	@FindBy(xpath = "//div//div//div[3]//div[2]//ul[1]//li[1]//a[1]")
	WebElement previousPageActionButton;
	
	@FindBy(xpath = "//body/div/main[@id='maincontent']/div/div/div/div[1]/div[1]/a[1]")
	WebElement listMode;
	
	@FindBy(xpath = "//body/div/main[@id='maincontent']/div/div/div/div[1]/div[1]/a[1]")
	WebElement gridMode;
	
	@FindBy(xpath = "//body//div//div//div[3]//div[3]//div[1]//select[1]")
	WebElement itemsPerPageDropdownVisible12;
/*	
	@FindBy(xpath = "//body//div//div//div[3]//div[3]//div[1]//select[1]")
	WebElement itemsPerPageDropdownVisible24;
	
	@FindBy(xpath = "//body//div//div//div[3]//div[3]//div[1]//select[1]")
	WebElement itemsPerPageDropdownVisible36;
*/	

	// Perform action on web elements
	public String displaySortLabel() {
		String label = sortLabel.getText();
		return label;
	}
	
	
	public void clickOnDropdown() {
		sortDropdown.click();
	}
	
	public void clickOnSortByRelevance() {
		Select dropDown = new Select(sortDropdown);
		dropDown.selectByValue("relevance");;
	}

	public void clickOnSortByPrice() {
		Select dropDown = new Select(sortDropdown);
		dropDown.selectByValue("price");
	}
/*
	public void clickOnSortByProductName() {
		sortByProductName.click();
	}

	public void clickOnSortByPrice() {
		sortByPrice.click();
	}

	public void clickOnSortByRelevance() {
		sortByRelevance.click();
	}
*/
	public void clickOnAscDescSwitcher() {
		ascDescDirectionSwitcher.click();
	}
	
	public void clickOnNextPageActionButton() {
		nextPageActionButton.click();
	}
	
	public void clickOnPreviousPageActionButton() {
		previousPageActionButton.click();
	}
	
	public void clickOnListMode() {
		listMode.click();
	}
	
	public void clickOnGridMode() {
		listMode.click();
	}
	
	public void scrollWindowDown() {
		JavascriptExecutor jse = (JavascriptExecutor)ldriver;		
		jse.executeScript("window.scrollBy(0,600)");
	}
	
	public void scrollWindowUp() {
		JavascriptExecutor jse = (JavascriptExecutor)ldriver;		
		jse.executeScript("window.scrollBy(0,-600)");
	}
	
	public void clickOnItemsPerPageDropdown12() {		
		itemsPerPageDropdownVisible12.click();
	}
/*	
	public void clickOnItemsPerPageDropdown24() {		
		itemsPerPageDropdownVisible24.click();
	}
	
	public void clickOnItemsPerPageDropdown36() {		
		itemsPerPageDropdownVisible36.click();
	}
*/	
	public void clickOnPerPage24Items() {
		Select dropDwn = new Select(itemsPerPageDropdownVisible12);
		dropDwn.selectByValue("24");
	}
/*	
	public void clickOnPerPage36Items() {
		Select dropDwn = new Select(itemsPerPageDropdownVisible24);
		dropDwn.selectByValue("36");
	}
	
	public void clickOnPerPage12Items() {
		Select dropDwn = new Select(itemsPerPageDropdownVisible36);
		dropDwn.selectByValue("12");
	}
*/
	
}
