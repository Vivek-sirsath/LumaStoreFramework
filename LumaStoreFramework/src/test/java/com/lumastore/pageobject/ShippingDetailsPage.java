package com.lumastore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ShippingDetailsPage {
	
	// Create object of WebDriver
				WebDriver ldriver;

				// Create constructor
				public ShippingDetailsPage(WebDriver rdriver) {

					ldriver = rdriver;

					PageFactory.initElements(rdriver, this);

				}
				
				// Identify web elements
				@FindBy(xpath = "//select[@name='country_id' and @id='RU6PGXI']")
				WebElement country;
				
				@FindBy(xpath = "//select[@name='region_id' and @id='AUYKGJW']")
				WebElement stateOrProvince;
				
				@FindBy(xpath = "//input[@name='street[0]' and @id='T3RH0IA']")
				WebElement streetAddressField;
				
				@FindBy(xpath = "//input[@name='city' and @id='GS6ED45']")
				WebElement cityField;
				
				@FindBy(xpath = "//input[@name='postcode' and @id='HENFR4E']")
				WebElement postalCodeField;
				
				@FindBy(xpath = "//input[@name='company' and @id='O2R2SLX']")
				WebElement companyField;
				
				@FindBy(xpath = "//input[@name='telephone' and @id='OTWDVOF']")
				WebElement phoneNumberField;
				
				@FindBy(xpath = "//div[@class='title']")
				WebElement orderSummaryTitle;
				
				@FindBy(xpath = "//span[contains(text(),'View Details')]")
				WebElement viewDetailsLink;
				
				@FindBy(xpath = "//button[@class='button action continue primary' and @type='submit']")
				WebElement nextButton;
				
				@FindBy(xpath = "//strong[@class='product-item-name']")
				WebElement selectedProductName;
				
				@FindBy(xpath = "//strong[@class='product-item-name']")
				WebElement shippingAddress;
				
				
				
				
				// Perform action on web elements
				
				public void selectCountryFromdDopdown(String textCountry) {
					Select obj = new Select(country);
					obj.selectByVisibleText(textCountry);
				}
				
				public void selectStateOrProvince(String textState) {
					Select obj = new Select(stateOrProvince);
					obj.selectByVisibleText(textState);
				}
				
				public void enterStreetAddress(String street) {
					streetAddressField.sendKeys(street);
				}
				
				public void enterCity(String city) {
					cityField.sendKeys(city);
				}
				
				public void enterPostalCode(String postcode) {
					postalCodeField.sendKeys(postcode);
				}
				
				public void enterCompanyName(String company) {
					companyField.sendKeys(company);
				}
				
				public void enterPhoneNumber(String phone) {
					phoneNumberField.sendKeys(phone);
				}
				
				public void clickOnOrderSummaryTitle() {
					orderSummaryTitle.click();
				}
				
				public void clickOnViewDetailsLink() {
					viewDetailsLink.click();
				}
				
				public void clickNextButton() {
					nextButton.click();
				}
				
				public String getSelectedProductName() {
					String productName = selectedProductName.getText();
					return productName;
				}
				
				public String getShippingAddressText() {
					String shippingDetails = shippingAddress.getText();
					return shippingDetails;
				}
							

}
