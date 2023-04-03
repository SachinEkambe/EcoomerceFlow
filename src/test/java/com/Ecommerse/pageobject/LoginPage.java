package com.Ecommerse.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//create object of webdriver
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	//identify Web elements for enter user name
	@FindBy(id="user-name")
	WebElement userName;
	
	//Identify web element for enter password
	@FindBy(id="password")
	WebElement passWord;
	
	//find web element for click on login btn
	@FindBy(id="login-button")
	WebElement ClckLogin;

	
	public void EnterUsername(String Uname)
	{
		userName.sendKeys(Uname);
	}
	
	public void EnterPassword(String pwd)
	{
		passWord.sendKeys(pwd);
	}
	
	public void clickOnLoginBtn()
	{
		ClckLogin.click();
	}
}
