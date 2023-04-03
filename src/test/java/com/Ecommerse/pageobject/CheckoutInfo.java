package com.Ecommerse.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutInfo {
	//create object of webdriver
		WebDriver ldriver;
		
		public CheckoutInfo(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
		//identify Web elements for enter user name
		@FindBy(id="first-name")
		WebElement FirstName;
		
		//Identify web element for enter password
		@FindBy(id="last-name")
		WebElement LastName;
		
		//find web element for click on login btn
		@FindBy(id="postal-code")
		WebElement PostalCode;
		
		@FindBy(id="continue")
		WebElement ClickOnContinue;


		
		public void EnterFirstName(String Fname)
		{
			FirstName.sendKeys(Fname);
		}
		
		public void EnterLastName(String Lname)
		{
			LastName.sendKeys(Lname);
		}
		
		public void EnterPostalCode(String Postal)
		{
			PostalCode.sendKeys(Postal);
		}
		
		public void ClicktoContinueInfopage()
		{
			ClickOnContinue.click();
		}
}
