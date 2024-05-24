package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Methods_webpage {

	static WebDriver driver;
		
		public static void launchbrowser()
		{
			driver=new ChromeDriver();
			driver.navigate().to("https://www.saucedemo.com/v1/");
			
		}
		
		public static void logipage()
		{
			
			By usernameloc = By.id("user-name");
			WebElement username = driver.findElement(usernameloc);
			username.sendKeys("standard_user");
			
			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys("secret_sauce");
			
			WebElement loginbtn = driver.findElement(By.id("login-button"));
			loginbtn.click();
		}
		
		public static void Scrollpagedown()
		{
			WebElement image = driver.findElement(By.cssSelector("img.footer_robot"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true)",image);
		}
		
		public static void scrollpageup()
		{
			WebElement product = driver.findElement(By.xpath("//div[text()='Products']"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true)",product);
		}
		
		public static void Menubutton()
		{
			WebElement menubtn = driver.findElement(By.xpath("//button[text()='Open Menu']"));
			menubtn.click();
		}
		
		public static WebElement selectoption(String locator)
		{
			WebElement selectbtn = driver.findElement(By.xpath("//a[text()='"+ locator+"']"));
			return selectbtn;
		}
		
		public static void clickbtn(WebElement selectbtn) throws InterruptedException
		{
			//JavascriptExecutor js = (JavascriptExecutor)driver;
			//js.executeScript("arguments[0].click()",selectbtn);
			
			Actions action = new Actions(driver);
			Thread.sleep(3000);
			action.contextClick(selectbtn).build().perform();
			
		}
		
		public static void crossbtn()
		{
			WebElement Crossbtn = driver.findElement(By.xpath("//button[text()='Close Menu']"));
			Crossbtn.click();
		}
		
		public static WebElement productoption(String locator)
		{
			WebElement selectproduct = driver.findElement(By.xpath("//div[text()='"+locator+"']"));
			return selectproduct;
		}
		
		public static void click(WebElement selectproduct)
		{
			selectproduct.click();
		}
		
		public static void addtocartbtn(String cartvalue)
		{
			WebElement cartbtn = driver.findElement(By.xpath("//button[text()='"+cartvalue+"']"));
			cartbtn.click();
		}
		
		public static void backbtn(WebElement selectproduct,String value)
		{
			WebElement Backbtn = driver.findElement(By.xpath("//button[text()='"+value+"']"));
			Backbtn.click();
		}
		
		public static void cartoption()
		{
			WebElement cartbtn = driver.findElement(By.xpath("//div[@id='shopping_cart_container']"));
			cartbtn.click();
					
		}
		
		public static void dropdownoption()
		{
			WebElement dropbtn = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
			dropbtn.click();
		}
		public static void robotselection() throws AWTException

		{
			Robot robo = new Robot();
			robo.keyPress(KeyEvent.VK_DOWN);
			robo.keyRelease(KeyEvent.VK_DOWN);
			robo.keyPress(KeyEvent.VK_ENTER);
			robo.keyRelease(KeyEvent.VK_ENTER);
		}
		
		public static void windowshandle(String parentid) throws InterruptedException
		{
			Set<String>allwindowsid=driver.getWindowHandles();
			for(String win:allwindowsid)
			{
				if(!win.equals(parentid))
				{
					driver.switchTo().window(win);
					Thread.sleep(3000);
					driver.close();
				}
				
			}
		}
		
		
		public static void main(String[] args) throws InterruptedException, AWTException {
			
			launchbrowser();
			String parentid = driver.getWindowHandle();
			logipage();
			Scrollpagedown();
			
			scrollpageup();
			Menubutton();
			WebElement frstoption = selectoption("All Items");
			clickbtn(frstoption);
			robotselection();
			crossbtn();
			
			
			
			
			WebElement frstproduct = productoption("Sauce Labs Backpack");
			
			addtocartbtn("ADD TO CART");
			dropdownoption();
			robotselection();
			robotselection();
			
			Menubutton();
			WebElement secondoptn = selectoption("About");
			clickbtn(secondoptn);
			robotselection();
			crossbtn();
			windowshandle(parentid);
			
			
			

	}

}
