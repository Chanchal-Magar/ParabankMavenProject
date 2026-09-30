package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.pages.AccountPage;
import com.pages.LoginPage;


public class AccountTest extends BaseTest
{
	
		 @Test
		    public void openAccount() {
		        LoginPage loginPage = new LoginPage(driver);
		        loginPage.login("john", "demo");

		        AccountPage openAccount = new AccountPage(driver);
		        openAccount.openNewAccount();
		    }
}
