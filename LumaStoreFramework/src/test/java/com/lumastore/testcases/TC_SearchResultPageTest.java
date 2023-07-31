package com.lumastore.testcases;

import org.testng.annotations.Test;

import com.lumastore.pageobject.HomePage;
import com.lumastore.pageobject.SearchResultsPage;

public class TC_SearchResultPageTest extends BaseClass {

	@Test(priority = 1)
	public void verifySearchBoxFunctionality() throws Exception {

		// Create object of HomePage Class to perform the method of that class
		HomePage hPage = new HomePage(driver);
		hPage.clickAndEnterTextInSearchBox("jacket");
		Thread.sleep(3000);
		logger.info("Clicked on search box successfully");
		logger.info("Entered 'jacket' in search box successfully");
		hPage.clickOnSearchButton();
		Thread.sleep(3000);
		logger.info("Clicked on search button and Search functionality verified");

	}

	@Test(priority = 2, enabled = false)
	public void verifyListGridModeFunctionality() throws Exception {
		// Creating object of Search Result Page
		SearchResultsPage resultsPage = new SearchResultsPage(driver);
		resultsPage.clickOnListMode();
		logger.info("List mode verified");
		
		Thread.sleep(3000);
		resultsPage.scrollWindowDown();
		Thread.sleep(5000);
		resultsPage.scrollWindowDown();
		Thread.sleep(5000);
		resultsPage.scrollWindowDown();
		Thread.sleep(5000);
		resultsPage.scrollWindowDown();
		Thread.sleep(5000);
		logger.info("Scrolled the window down in list mode");
		
		resultsPage.scrollWindowUp();
		Thread.sleep(5000);
		resultsPage.scrollWindowUp();
		Thread.sleep(5000);
		resultsPage.scrollWindowUp();
		Thread.sleep(5000);
		resultsPage.scrollWindowUp();
		Thread.sleep(5000);
		logger.info("Scrolled the window up in list mode");
		

		resultsPage.clickOnGridMode();
		logger.info("Grid mode verified");
		Thread.sleep(3000);

	}

	@Test(priority = 3, enabled = false)
	public void verifySortByFunctionality() throws Exception {
		SearchResultsPage sortDropdown = new SearchResultsPage(driver);
	
		sortDropdown.clickOnDropdown();
		logger.info("Clicked on Dropdown");
		Thread.sleep(5000);
		sortDropdown.clickOnSortByRelevance();
		logger.info("Sort by relevance verified");
		
		sortDropdown.clickOnDropdown();
		logger.info("Clicked on Dropdown");
		Thread.sleep(5000);
		sortDropdown.clickOnSortByPrice();
		
		Thread.sleep(5000);
		sortDropdown.scrollWindowDown();
		Thread.sleep(5000);
		sortDropdown.scrollWindowDown();
		Thread.sleep(5000);
		sortDropdown.scrollWindowDown();
		Thread.sleep(5000);
		logger.info("Scrolled window down");
		sortDropdown.scrollWindowUp();
		Thread.sleep(5000);
		sortDropdown.scrollWindowUp();
		Thread.sleep(5000);
		sortDropdown.scrollWindowUp();
		Thread.sleep(5000);
		logger.info("Scrolled window up");
		logger.info("Sort by price verified");
		
	}
	
	@Test(priority = 4, enabled = false)
	public void AscDescSwitcherFunctionality() throws Exception {
		
		SearchResultsPage switcher = new SearchResultsPage(driver);
		switcher.clickOnAscDescSwitcher();
		logger.info("Switcher button clicked once");
		
		Thread.sleep(5000);
		
		switcher.clickOnAscDescSwitcher();
		logger.info("Switcher button clicked twice");
		Thread.sleep(5000);
		
	}
	
	@Test(priority = 4, enabled = false)
	public void verifyItemsPerPageDropDownFunctionality() throws Exception {
		
		SearchResultsPage perPageDropdown = new SearchResultsPage(driver);
		
		
		perPageDropdown.scrollWindowDown();
		Thread.sleep(3000);
		perPageDropdown.scrollWindowDown();
		Thread.sleep(3000);
		perPageDropdown.scrollWindowDown();
		Thread.sleep(3000);
		logger.info("Page is scrolled down up to bottom");
		
		perPageDropdown.clickOnItemsPerPageDropdown12();
		Thread.sleep(3000);
		logger.info("Clicked on 12 visible per page dropdown");
		
		// Clicking on 24 items per page 
		perPageDropdown.clickOnPerPage24Items();
		Thread.sleep(5000);
		logger.info("selected 24 items per page");
		
/*		
		perPageDropdown.scrollWindowDown();
		Thread.sleep(3000);
		perPageDropdown.scrollWindowDown();
		Thread.sleep(3000);
		perPageDropdown.scrollWindowDown();
		Thread.sleep(3000);
		perPageDropdown.scrollWindowDown();
		Thread.sleep(3000);
		perPageDropdown.scrollWindowDown();
		Thread.sleep(3000);
		perPageDropdown.scrollWindowDown();
		Thread.sleep(3000);
		logger.info("Page is scrolled down up to bottom");
		
		// Clicking on 36 items per page 
		perPageDropdown.clickOnItemsPerPageDropdown24();
		Thread.sleep(3000);
		logger.info("Clicked on 24 visible per page dropdown");
		
		perPageDropdown.clickOnPerPage36Items();
		Thread.sleep(5000);
		logger.info("Selected 36 items per page");
		
		
		perPageDropdown.scrollWindowDown();
		Thread.sleep(3000);
		perPageDropdown.scrollWindowDown();
		Thread.sleep(3000);
		perPageDropdown.scrollWindowDown();
		Thread.sleep(3000);
		perPageDropdown.scrollWindowDown();
		Thread.sleep(3000);
		perPageDropdown.scrollWindowDown();
		Thread.sleep(3000);
		perPageDropdown.scrollWindowDown();
		Thread.sleep(3000);
		logger.info("Page is scrolled down up to bottom");
		
		// Clicking on 12 items per page 
		perPageDropdown.clickOnItemsPerPageDropdown36();
		Thread.sleep(3000);
		logger.info("Clicked on 36 visible per page dropdown");
		
		perPageDropdown.clickOnPerPage12Items();
		Thread.sleep(5000);
		logger.info("Selected 12 items per page");
*/
		
	}
	
	@Test(priority = 5, enabled = true)
	public void verifyNextAndPreviousPageButtonsFunctionality() throws Exception {
		
		SearchResultsPage nextPreviousButton = new SearchResultsPage(driver);
	
		nextPreviousButton.scrollWindowDown();
		Thread.sleep(3000);
		nextPreviousButton.scrollWindowDown();
		Thread.sleep(3000);
		nextPreviousButton.scrollWindowDown();
		Thread.sleep(3000);
		logger.info("Page is scrolled down up to bottom");
		
		nextPreviousButton.clickOnNextPageActionButton();
		logger.info("Clicked on next page");
		
		nextPreviousButton.scrollWindowDown();
		Thread.sleep(3000);
		nextPreviousButton.scrollWindowDown();
		Thread.sleep(3000);
		nextPreviousButton.scrollWindowDown();
		Thread.sleep(3000);
		logger.info("Page is scrolled down up to bottom");
		
		nextPreviousButton.clickOnPreviousPageActionButton();
		logger.info("Clicked on previous page");
	}
}
