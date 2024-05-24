package com.swaglabs.testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.swaglabs.pages.LoginPage;
import com.swaglabs.utils.Browser;
import com.swaglabs.utils.DataConfigConstant;

public class Loginpagetest extends Browser {
	WebDriver driver;
	@BeforeMethod
	@Parameters("browsername") 
	public void setup(String browsername)
	{
		launchbrowser(browsername);
		openUrL();
	}
	@AfterMethod
	public void teardown()
	{
		close();
	}
	@Test
	public void verifyTheLoginButtonWithUsernameAndPasswordAsBlank()
	{
		LoginPage loginpage=new LoginPage(driver,"loginpage");
		loginpage.clickOnLoginBtn();
		Assert.assertEquals(loginpage.getCrossIconSize(), 2,"test script failed as 2cross icons not displayed");
		Assert.assertTrue(loginpage.isCrossbtnVisible()," test script has failed as cross button not visible");
		Assert.assertEquals(loginpage.getErrormsg(), DataConfigConstant.USSERNAME_BLANK_ERRORMSG);
	}
}
