package bankproject;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Launchbrowser {
	
	private static WebDriver driver;
	private static WebDriverWait wait;

	public static WebDriver browser()
	{
		return driver =new FirefoxDriver();
		 
	}
	public static void openurl()
	{
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.navigate().to(Utils.BaseUrL);
	}
	public static void EnterUsernameAndPassword()
	{
		driver.findElement(By.name("uid")).sendKeys(Utils.Username);
		driver.findElement(By.name("password")).sendKeys(Utils.Password);
	}
	public static void click()
	{
		driver.findElement(By.name("btnLogin")).click();
	}
	
	public static void close()
	{
		driver.close();
	}
	public static void main(String[] args) {
		
		Launchbrowser.browser();
		Launchbrowser.openurl();
		Launchbrowser.EnterUsernameAndPassword();
		Launchbrowser.click();
		String actualtittle=driver.getTitle();
		System.out.println(actualtittle);
			if(actualtittle.contains(Utils.ExpectedTittle))
				System.out.println("test case : passed");
			else
				System.out.println("test case : failed");
		Launchbrowser.close();
	}
	
}
