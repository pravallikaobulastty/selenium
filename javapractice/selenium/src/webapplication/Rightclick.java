package webapplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

public class Rightclick {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		String parentid=driver.getWindowHandle();//---> we get main window id
		By bestsellersL=By.linkText("Best Sellers");
		WebElement bestsellers=driver.findElement(bestsellersL);
		// Right click
		Actions action=new Actions(driver);
		action.contextClick(bestsellers).build().perform();
		// to select the frst option 
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
		//to press the button selected option
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		//to switch the controller to new selected window
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
			driver.switchTo().window(parentid);
			Thread.sleep(3000);
			driver.close();
			

		
	}

	}

