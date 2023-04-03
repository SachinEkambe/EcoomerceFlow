package com.Ecommerse.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
WebDriver ldriver;
	
	public AddToCart(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	//find Web elements for click to add cart product
	@FindBy(id="checkout")
	WebElement Checkout;
	
	
	
	public void ClickOnCheckout()
	{
		Checkout.click();
	}
	
	
	
}
