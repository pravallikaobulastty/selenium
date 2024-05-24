package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {
	static WebDriver driver;
	public static WebElement alertttt(String locator)
	{
		By getlocatoreloc = By.xpath("//*[contains(text(),'"+ locator +"')]");
		WebElement getloc = driver.findElement(getlocatoreloc);
		return getloc;
	}
	public static void click(WebElement getloc )
	{
		getloc.click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		
		WebElement alertwithok = alertttt("Alert with OK & Cancel ");
		click(alertwithok );
		
		WebElement alertwithtextbox_button=alertttt("click the button to display a confirm box ");
		click(alertwithtextbox_button);
		
		Alert alert =driver.switchTo().alert();
		alert.accept();
		
		WebElement alertwithtext = alertttt("Alert with Textbox ");
		click(alertwithtext);
		
		WebElement alertwithtextbtn = alertttt("click the button to demonstrate the prompt box ");
		click(alertwithtextbtn);
		
		Alert alert1 =driver.switchTo().alert();
		alert1.accept();
		
		}

	
		
	}


