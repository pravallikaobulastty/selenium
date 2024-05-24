package practice;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Webpage {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.saucedemo.com/v1/");
		
		By usernameloc = By.id("user-name");
		WebElement username = driver.findElement(usernameloc);
		username.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		
		WebElement loginbtn = driver.findElement(By.id("login-button"));
		loginbtn.click();
		
		WebElement product = driver.findElement(By.xpath("//div[text()='Products']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",product);
		
		WebElement menubtn = driver.findElement(By.xpath("//button[text()='Open Menu']"));
		menubtn.click();
		Thread.sleep(3000);
	
		
		WebElement firstbtn = driver.findElement(By.cssSelector("a#inventory_sidebar_link"));
		js.executeScript("arguments[0].click()",firstbtn);
		
		WebElement menubtn1 = driver.findElement(By.xpath("//button[text()='Open Menu']"));
		menubtn1.click();
		Thread.sleep(3000);
		
		WebElement aboutbtn = driver.findElement(By.xpath("//a[@id='about_sidebar_link']"));
		js.executeScript("arguments[0].click()",aboutbtn);
		
		driver.navigate().back();
		
		WebElement crossbtn = driver.findElement(By.xpath("//button[text()='Close Menu']"));
		crossbtn.click();
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		dropdown.click();
		
		Robot robo = new Robot();
		
	
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_DOWN);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		
	}

}
