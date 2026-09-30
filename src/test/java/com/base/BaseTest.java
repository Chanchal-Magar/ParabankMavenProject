package com.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest
{
	 public WebDriver driver;
	 public WebDriverWait wait;

	    @BeforeMethod
	    public void setUp() {

	        driver = new ChromeDriver();

	        driver.manage().window().maximize();
	        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        driver.get("https://parabank.parasoft.com/");
	    }

	    @AfterMethod
	    public void tearDown() {

	        driver.quit();
	    }

}
