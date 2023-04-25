package com.demoweb.automation.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Base_class 
{
	public WebDriver driver;
	
	@Parameters({"key","url","value"})
	@BeforeMethod
	public void appopen(String kk,String uu,String vv)
	{
		System.setProperty(kk,vv);
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(uu);
	}
	
	@AfterMethod						
	public void appclose() throws InterruptedException
	{
		Thread.sleep(5000);
		//driver.quit();
	}
}
