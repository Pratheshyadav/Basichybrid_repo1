package com.demoqa.automation.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

import com.demoweb.automation.generic.Base_class;
import com.demoweb.automation.generic.Data;

public class Testscript_form extends Base_class
{

	@Test (dataProvider = "testdata",dataProviderClass = Data.class)
	public void form(String fn,String ln,String mail)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.xpath("//div[@class='category-cards']/div[2]"));
		js.executeScript("arguments[0].scrollIntoView();", ele);
		ele.click();
	//	WebElement el = driver.findElement(By.xpath("//div[text()='Forms']"));
		//js.executeScript("arguments[1].click();", el);
		driver.findElement(By.xpath("//span[text()='Practice Form']")).click();
		driver.findElement(By.id("firstName")).sendKeys(fn);
		driver.findElement(By.id("lastName")).sendKeys(ln);
		driver.findElement(By.id("userEmail")).sendKeys(mail);
		/*driver.findElement(By.id("lastName")).sendKeys("hi");
		driver.findElement(By.id("lastName")).sendKeys("hi");*/
	
	}
}
