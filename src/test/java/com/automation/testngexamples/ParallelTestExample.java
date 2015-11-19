package com.automation.testngexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTestExample {

    public WebDriver driver;

    @Test()
    @Parameters({ "url", "keyword", "title" })
    public void googleSearch(String url, String keyword, String title)
	    throws InterruptedException {
	driver.get(url);
	driver.findElement(By.name("q")).sendKeys(keyword);
	driver.findElement(By.name("btnG")).click();
	Thread.sleep(2000);
	String currentTitle = driver.getTitle();
	Assert.assertEquals(currentTitle, keyword + " - Google Search");
    }

    @BeforeTest
    @Parameters({ "browser" })
    public void beforeTest(String browser) {
	if (browser.equalsIgnoreCase("firefox")) {
	    driver = new FirefoxDriver();
	} else if (browser.equalsIgnoreCase("chrome")) {
	    System.setProperty("webdriver.chrome.driver", "chromedriver");
	    driver = new ChromeDriver();
	}
    }

    @AfterTest
    public void afterTest() {
	// driver.quit();
    }

}
