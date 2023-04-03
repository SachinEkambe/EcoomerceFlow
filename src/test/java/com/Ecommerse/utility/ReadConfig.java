package com.Ecommerse.utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
Properties properties;
String path="C:\\Users\\Dell\\eclipse-workspace\\Ecommers\\configuration\\config.properties";

public ReadConfig() 
{
	try {
properties= new Properties();

	FileInputStream fis=new FileInputStream(path);
	properties.load(fis);
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}
public String getBaseUrl()
{
String value= properties.getProperty("baseUrl");

if (value!=null)
	return value;
else
	throw new RuntimeException("Url is not specified in config");
}

public String getBrowser()
{
String value= properties.getProperty("browser");

if (value!=null)
	return value;
else
	throw new RuntimeException("Url is not specified in config");
}

}
