package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Right_Click {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/datepicker/");
		String parentid = driver.getWindowHandle();
		By downloadloc = By.xpath("//a[text()='Download']");
		WebElement download = driver.findElement(downloadloc);
		Actions Action = new Actions(driver);
		Action.contextClick(download).build().perform();
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		Set<String>allwindows = driver.getWindowHandles();
		for(String win:allwindows)
		{
			if(!win.equals(parentid ))
			{
				driver.switchTo().window(win);
				Thread.sleep(3000);
				driver.close();
			}
			driver.switchTo().window(parentid);
			Thread.sleep(3000);
			driver.close();
		}
		
	}

}
