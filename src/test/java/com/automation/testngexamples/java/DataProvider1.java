package com.automation.testngexamples.java;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {

	@Test(dataProvider = "provideNumbers")
	public void test(int number, int expected) {
		Assert.assertEquals(number + 10, expected);
	}

	@DataProvider(name = "provideNumbers")
	public Object[][] provideData() {

		return new Object[][] { 
			{ 10, 20 }, 
			{ 100, 110 }, 
			{ 200, 210 }, 
			{ 300, 310 }, 
			{ 400, 210 } 
		};
	}

}
