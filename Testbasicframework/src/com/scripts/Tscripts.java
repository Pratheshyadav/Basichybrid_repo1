package com.scripts;

import org.testng.annotations.Test;

import com.demoweb.automation.generic.Data;
import com.generic.Baseeclass;
import com.pom.Pomclasss;

public class Tscripts extends Baseeclass
{

	@Test(dataProvider = "testdata",dataProviderClass = Data.class)
	public void exe(String v,String x) 
	{
		Pomclasss pmc=new Pomclasss(driver);
		pmc.name().sendKeys(v);
		pmc.pass().sendKeys(x);
	}
}
