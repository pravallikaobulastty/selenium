package com.swaglabs.utils;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SmartFunctions {
	
	private WebDriver driver;
	private WebDriverWait wait;
	private ReadLocator read;
	public SmartFunctions(WebDriver driver, String filename)
	{
		this.driver=driver;
		wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		read = new ReadLocator(filename);//-->creating object to readlocator and we are calling functions which we have return in browser

	}
	
	//it gives single value  locator name
	protected WebElement getElement(String locatorname)
	{
		
		String stringvalue=read.getlocator(locatorname);//-->by using object we are calling which locator name we want.ex:crosbtn or error label....etc
		// it does not do any action, it just gives locator name 
		By locator=By.xpath(stringvalue);
		return driver.findElement(locator);
		
	}
	// If we want more than one locator name this logic is applicable
	
	protected List<WebElement> getElements( String locatorname)
	{
		
		String stringvalue=read.getlocator(locatorname);//-->by using object we are calling which locator name we want.ex:crosbtn or error label....etc
		// it does not do any action, it just gives locator name 
		By locator=By.xpath(stringvalue);
		return driver.findElements(locator);
		
	}
	
	// method for clicking
	
	protected void waitandclick( String locatorname)
	{
		WebElement element=this.getElement(locatorname);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
	}
	
	// method for sending text
	
	protected void waitandsendtext( String locatorname, String testdata)
	{
		WebElement element=this.getElement(locatorname);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(testdata);
	}
	
	// method to get error msg
	
	protected String waitandgeterrormsg( String locatorname)
	{
		WebElement element=this.getElement( locatorname);
		wait.until(ExpectedConditions.visibilityOf(element));
		return element.getText();
	}
	
	// method to find element is present or not
	
	protected boolean IsElementPresent( String locatorname)
	{
		WebElement element=this.getElement(locatorname);
		wait.until(ExpectedConditions.visibilityOf(element));
		return element.isDisplayed();
	}
	

	
	
	

}
