package com.automation.testngexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample1 {

    public WebDriver driver;

    @DataProvider(name = "keywords")
    public Object[][] keyworddata() {
	return new Object[][] { { "abhishek yadav qa" },
		{ "selenium webdriver" }, { "xebia india" } };
    }

    @Test(dataProvider = "keywords")
    public void googleSearch(String keyword) throws InterruptedException {
	driver.get("http://www.google.com");
	driver.findElement(By.name("q")).sendKeys(keyword);
	driver.findElement(By.name("btnG")).click();
	Thread.sleep(2000);
	String title = driver.getTitle();
	Assert.assertEquals(title, keyword + " - Google Search");
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
