package com.automation.testngexamples.java;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class SampleTestNGClass {
	
  @Test
  public void f() {
	  System.out.println("@Test annotation");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("@BeforeMethod annotation");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("@AfterMethod annotation");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("@BeforeClass annotation");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("@AfterClass annotation");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("@BeforeTest annotation");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("@AfterTest annotation");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("@BeforeSuite annotation");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("@AfterSuite annotation");
  }

}
