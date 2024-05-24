package webapplication;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleLinks {

	public static void main(String[] args) throws AWTException, InterruptedException{
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.amazon.in/");
		String parentid=driver.getWindowHandle();//---> we get main window id
		// links are developed with tag name so we find locator with tag name
		By linkl=By.tagName("a");
		// group of links we are getting so we use list of webelement
		List<WebElement>alllinks=driver.findElements(linkl);
		for(WebElement link:alllinks)
		{
			if(link.isDisplayed())
			{
			//System.out.println(link.getText());
		
		// right click operation on every link
				Actions action=new Actions(driver);
				action.contextClick(link).build().perform();
		// to select the frst option 
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
		//to press the button selected option
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		Set<String>allwindowid=driver.getWindowHandles();
		// to switch to next window
		for(String win:allwindowid)
		{
			System.out.println(win);
			if(!win.equals(parentid))
			{
			driver.switchTo().window(win);
			Thread.sleep(3000);
			driver.close();
		}
		}
			driver.switchTo().window(parentid);
			Thread.sleep(3000);
			
			}
			
		}
		driver.close();
		
		
		
	}

}
		
