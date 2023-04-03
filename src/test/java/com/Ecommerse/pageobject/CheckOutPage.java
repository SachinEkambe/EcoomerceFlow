package com.Ecommerse.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
WebDriver ldriver;
	
	public CheckOutPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	//identify Web elements for enter user name
	@FindBy(name="finish")
	WebElement finish;
	
	public void ClickOnFinish()
	{
		finish.click();
	}
}

