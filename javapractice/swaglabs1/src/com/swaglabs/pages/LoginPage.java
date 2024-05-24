package com.swaglabs.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.swaglabs.utils.SmartFunctions;

public class LoginPage extends SmartFunctions {

	
		
	public LoginPage(WebDriver driver, String filename) {
		super(driver, filename);
		// TODO Auto-generated constructor stub
	}
	public void clickOnLoginBtn()
	{
		this.waitandclick("Loginbtn");
	}
	public void setUsername(String username)
	{
		this.waitandsendtext("Username", username);
	}
	public void setpassword(String password)
	{
		this.waitandsendtext("password", password);
	}
	public String getErrormsg()
	{
		String errormsg = this.waitandgeterrormsg("Errorlabel");
		return errormsg;
	}
	public void clickOnCrossIcon()
	{
		this.waitandclick("crossbutton");
	}
	public boolean isCrossbtnVisible()
	{
		return this.IsElementPresent("crossbutton");
	}
	public int getCrossIconSize()
	{
		List<WebElement> crossicons = this.getElements("crossSymbol1");
		return crossicons.size();
	}

}
