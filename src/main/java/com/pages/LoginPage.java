package com.pages;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class LoginPage
	{
		 WebDriver driver;
		    

		    public LoginPage(WebDriver driver) {
		        this.driver = driver;
		        
		        
		    }


		    By username = By.name("username");
		    By password = By.name("password");
		    By loginBtn = By.xpath("//input[@value='Log In']");

		    public void login(String user, String pass) {
		        driver.findElement(username).sendKeys(user);
		        driver.findElement(password).sendKeys(pass);
		        driver.findElement(loginBtn).click();
		    
		}
	}


