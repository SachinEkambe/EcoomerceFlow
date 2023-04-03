package com.Ecommerse.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
WebDriver ldriver;
	
	public ProductPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	//identify Web elements for addto cart product
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	WebElement clickOnProduct1;
	
	//identify Web elements for addto cart product
	@FindBy(id="add-to-cart-sauce-labs-bike-light")
	WebElement clickOnProduct2;
	
	@FindBy(id="shopping_cart_container")
	WebElement clickOncartSym;

	
	public void SalectProduct1()
	{
		clickOnProduct1.click();
	}
	
	public void SalectProduct2()
	{
		clickOnProduct2.click();
	}
	
	public void ClickOnAddToCart()
	{
		clickOncartSym.click();
	}
	
	
}


