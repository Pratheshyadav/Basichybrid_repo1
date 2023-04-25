package com.generic;

import java.util.jar.Attributes.Name;

import org.testng.annotations.DataProvider;

public class Datap 
{
	@DataProvider(name="testdata")
	public String[][] getdataa()
	{
		String[][]arr= {{"9916801544","9448972941"}};
		return arr;
	}

}
