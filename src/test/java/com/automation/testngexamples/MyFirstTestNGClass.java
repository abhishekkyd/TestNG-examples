package com.automation.testngexamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyFirstTestNGClass {

    public WebDriver driver;
    public String keyword = "abhishek yadav qa";

    @Test()
    public void googleSearch1() {
	driver.get("http://www.google.com");
	String title = driver.getTitle();
	Assert.assertEquals(title, "Google");
    }

    @BeforeTest
    public void beforeTest() {
	System.setProperty("webdriver.chrome.driver", "chromedriver");
	driver = new ChromeDriver();
    }

    @AfterTest
    public void afterTest() {
	// driver.quit();
    }

}
