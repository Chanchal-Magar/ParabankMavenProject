package tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.pages.LoginPage;

import junit.framework.Assert;


public class LoginTest extends BaseTest
{
	 @Test
	    public void validLoginTest() {
	        LoginPage loginPage = new LoginPage(driver);
	        loginPage.login("john", "demo");  // username & password for demo
	        
	        AssertJUnit.assertTrue(driver.getTitle().contains("ParaBank"));
	    }
	    

		@Test
	    public void verifyTest() {
	        Assert.assertFalse(false);
	    }
	}




