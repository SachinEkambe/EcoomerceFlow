package com.Ecommerse.testcases;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import com.Ecommerse.utility.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
ReadConfig readConfig=new ReadConfig();
String Url=readConfig.getBaseUrl();
String browser=readConfig.getBrowser();


public static WebDriver driver;
public static Logger logger;

//set method for browser
@BeforeClass
public void Setup()
{
	
	switch(browser.toLowerCase())
	{
case "chrome":
	
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	break;
	
case "msedge":

	WebDriverManager.edgedriver().setup();
    driver=new EdgeDriver();
break;

case "firefox":
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
	break;

default:
	driver=null;
	break;
}
	driver.manage().window().maximize();
	//implicit weit of 10 seconds
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//for logging
	logger=(Logger) LogManager.getLogger("Ecommers");
}
@AfterClass
public void TearDown()
{
driver.close();
driver.quit();
}
}
