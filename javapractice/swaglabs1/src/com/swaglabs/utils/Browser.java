package com.swaglabs.utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Browser {
	private static WebDriver driver;
	public static WebDriver launchbrowser(String browsername)
	{
		if(browsername.equals("chrome"))
			driver = new ChromeDriver(); 
		else
			driver = new FirefoxDriver();
		return driver;
	}
	public static void openUrL()
	{
		driver.get("https://www.saucedemo.com/");
	}
	public static void close()
	{
		driver.close();
	}
	

}
