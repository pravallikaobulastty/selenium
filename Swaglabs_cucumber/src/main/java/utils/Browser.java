package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser {
	
	private static WebDriver driver;
	public static WebDriver Launchbrowser(String browsername)
	{
		if(browsername.equals("chrome"))
			driver = new ChromeDriver();
		else
			driver = new EdgeDriver();
		return driver;
	}
	public static void oprnUrl()
	{
		driver.get("https://www.saucedemo.com/v1/");
	}
	public static void closebrowser()
	{
		driver.close();
	}

}
