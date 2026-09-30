package com.pages;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class AccountPage 
	{
		WebDriver driver;
	    By openAccountLink = By.linkText("Open New Account");
	    By accountType = By.id("type");
	    By openBtn = By.xpath("//input[@value='Open New Account']");

	    public AccountPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void openNewAccount() {
	        driver.findElement(openAccountLink).click();
	        driver.findElement(accountType).sendKeys("CHECKING");
	        driver.findElement(openBtn).click();
	    }
	    By openAccountHeading = By.xpath("//h1");

	    
	    }
	
	

