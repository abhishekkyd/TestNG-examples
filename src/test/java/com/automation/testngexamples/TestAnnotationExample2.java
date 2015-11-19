package com.automation.testngexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotationExample2 {

    public WebDriver driver;
    public String keyword = "abhishek yadav qa";

    @Test(groups = { "sanity" })
    public void googleSearch1() {
	driver.get("http://www.google.com");
	String title = driver.getTitle();
	Assert.assertEquals(title, "Google");
    }

    @Test(groups = { "regression" }, dependsOnGroups = { "sanity" })
    public void googleSearch2() throws InterruptedException {
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
