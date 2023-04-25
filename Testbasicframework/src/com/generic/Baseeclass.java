package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseeclass
{
	public WebDriver driver;
	@BeforeMethod
	public void opp()
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/login/");
	}
	
	@AfterMethod
	public void closeapp()
	{
		//driver.quit();
	}
}
