package com.automation.testngexamples.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicTestNGClass {

    public WebDriver driver;

    @Test()
    public void googleSearch1() {
	driver.get("http://www.google.com");
	String title = driver.getTitle();
	Assert.assertEquals(title, "Google");
    }

    @BeforeTest
    public void beforeTest() {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver = new ChromeDriver();
    }

    @AfterTest
    public void afterTest() {
	 driver.quit();
    }

}
