package com.automation.testngexamples.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTestExample {

    public WebDriver driver;
    public String keyword = "abhishek yadav qa";

    @Test()
    @Parameters({ "url", "title" })
    public void googleSearch1(String url, String title) {
	driver.get(url);
	String currenttitle = driver.getTitle();
	Assert.assertEquals(currenttitle, title);
    }

    @BeforeTest
    public void beforeTest() {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver = new ChromeDriver();
    }

    @AfterTest
    public void afterTest() {
	// driver.quit();
    }

}
