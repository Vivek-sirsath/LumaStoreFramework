package com.lumastore.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductSpecAndAddToCartPage {
	
	// Create object of WebDriver
			WebDriver ldriver;

			// Create constructor
			public ProductSpecAndAddToCartPage(WebDriver rdriver) {

				ldriver = rdriver;

				PageFactory.initElements(rdriver, this);

			}
			
			// Identify web elements
			@FindBy(xpath = "//div[@id='option-label-size-143-item-168' and @option-label='M']")
			WebElement size;
			
			@FindBy(xpath = "//div[@id='option-label-color-93-item-52' and @option-label='Gray']")
			WebElement color;
			
			@FindBy(xpath = "//span[normalize-space()='M']")
			WebElement sizeLabel;
			
			@FindBy(xpath = "//span[normalize-space()='Gray']")
			WebElement colorLabel;
						
			@FindBy(id = "qty")
			WebElement quantity;
			
			@FindBy(linkText = "More Information")
			WebElement moreInfoTab;
			
			@FindBy(xpath = "//div[@class='product-addto-links']//span[contains(text(),'Add to Wish List')]")
			WebElement addToWishListLink;
			
			@FindBy(xpath = "//div[@class='product-addto-links']//span[contains(text(),'Add to Compare')]")
			WebElement addToCompareLink;
			
			@FindBy(id = "product-addtocart-button")
			WebElement addToCartButton;
			
			@FindBy(xpath = "//span[@class='counter-number']")
			WebElement totalItemsInCart;
			
			@FindBy(xpath = "//span[@data-bind='html: cart().subtotal_excl_tax']")
			WebElement cartSubTotal;
			
			@FindBy(xpath = "//a[@class='action showcart']")
			WebElement miniCartIcon;
						
			@FindBy(id = "top-cart-btn-checkout")
			WebElement proceedToCheckoutBtn;
			
			@FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
			WebElement messageText;
			
//			@FindBy(linkText = "shopping cart")
//			WebElement shoppingCartLink;
			
			
			
			
			
			// Perform action on web elements
			
			public void clickOnSizeSelection() {
				size.click();
			}
			
			public void clickOnColorSelection() {
				color.click();
			}
			
			public String displaySizeLabel() {
				String size =sizeLabel.getText();
				return size;
			}
			
			public String displayColorLabel() {
				String color =colorLabel.getText();
				return color;
			}
			
			public void enterOrderQuantity() {
				quantity.clear();
				quantity.sendKeys(Keys.NUMPAD2);
			}
			
			public void clickOnMoreInformationTab() {
				moreInfoTab.click();
				JavascriptExecutor jse = (JavascriptExecutor)ldriver;		
				jse.executeScript("window.scrollBy(0,-800)");
			}
			
			public void clickOnAddToWishList() {
				addToWishListLink.click();
			}
			
			public void clickOnAddToCompare() {
				addToCompareLink.click();
			}
			
			public void clickOnAddToCartButton() {
				addToCartButton.click();
			}
			
			public String displayTotalItemsInCart() {
				String ttlQty=totalItemsInCart.getText();
				return ttlQty;
			}
			
			public String displayCartSubTotal() {
				String cartsubTotal=cartSubTotal.getText();
				return cartsubTotal;
			}
			
			public void clickOnMiniCartIcon() {
				miniCartIcon.click();
			}
			
			public void clickonProceedToCheckoutButton() {
				proceedToCheckoutBtn.click();
			}
			
			public String getMessagetextOfSelectedProduct() {
				String messagetext=messageText.getText();
				return messagetext;
			}
			
//			public void clickOnShoppingCartLink() {
//				shoppingCartLink.click();
//			}
			

}
