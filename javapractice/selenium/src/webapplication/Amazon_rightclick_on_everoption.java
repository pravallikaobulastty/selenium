package webapplication;
import org.openqa.selenium.interactions.Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_rightclick_on_everoption {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		//main window id
		String parentid=driver.getWindowHandle();
		By sellLoc=By.xpath("//a[text()='Sell']");
		WebElement sell=driver.findElement(sellLoc);	
		//rightclick
		Actions action=new Actions(driver);
		action.contextClick(sell).build().perform();
		//to select the option
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
		//to enter
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		//to shift to nexxt window 
		Set<String>allwindowid=driver.getWindowHandles();
		for(String win:allwindowid)
		{		
		if(!win.equals(parentid))
		{
			driver.switchTo().window(win);
			Thread.sleep(3000);
			driver.close();
		}
		
		}
	}

}
