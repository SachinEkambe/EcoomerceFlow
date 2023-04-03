package com.Ecommerse.testcases;

import org.testng.annotations.Test;

import com.Ecommerse.pageobject.AddToCart;
import com.Ecommerse.pageobject.CheckOutPage;
import com.Ecommerse.pageobject.CheckoutInfo;
import com.Ecommerse.pageobject.LoginPage;
import com.Ecommerse.pageobject.ProductPage;

public class TCLoginWebsitePage extends BaseClass{
@Test
	public void VarifyLoginPage()
	{
		//open url
		driver.get(Url);
		logger.info("url open");
		
		LoginPage lg=new LoginPage(driver);
		
		lg.EnterUsername("standard_user");
		logger.info("enter username");
		
		lg.EnterPassword("secret_sauce");
		logger.info("enter password");
		
		lg.clickOnLoginBtn();
		logger.info("click on loginBtn");
		
		ProductPage pg= new ProductPage(driver);
		pg.SalectProduct1();
		logger.info("salect product 1");
		
		pg.SalectProduct2();
		logger.info("salect product 2");
		
		pg.ClickOnAddToCart();
		logger.info("click on add to cart");
		
		AddToCart ad=new AddToCart(driver); 
		ad.ClickOnCheckout();
		logger.info("continue to checkout");
		
		CheckoutInfo ci=new CheckoutInfo(driver);
		ci.EnterFirstName("Sachin");
		logger.info("enter fname");

		ci.EnterLastName("Ekambe");
		logger.info("enter lname");

		ci.EnterPostalCode("123412");
		logger.info("enter postal code");
		
		ci.ClicktoContinueInfopage();
		logger.info("continue to info page");

		
		CheckOutPage ck=new CheckOutPage(driver);
        ck.ClickOnFinish();
		logger.info("click on finish");


	}
}
