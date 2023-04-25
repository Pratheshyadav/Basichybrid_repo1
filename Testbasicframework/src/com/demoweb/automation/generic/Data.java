package com.demoweb.automation.generic;

import org.testng.annotations.DataProvider;

public class Data 
{
	 
	@DataProvider (name = "testdata")
	public String[][] getdata()
	{
		String[][]arr= {{"prathesh","yadav","prathesh@gmail.com"}};
		return arr;
	}
}
