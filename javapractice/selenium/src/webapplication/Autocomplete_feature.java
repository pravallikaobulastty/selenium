package webapplication;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete_feature {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		By googlesearchboxLoc = By.xpath("//textarea[@name='q']");
		WebElement googlesearchbox = driver.findElement(googlesearchboxLoc);
		googlesearchbox.sendKeys("selenium");
		
		for(int i=1;i<=3;i++)
		{
			Thread.sleep(3000);
			googlesearchbox.sendKeys(Keys.ARROW_DOWN);
		}
		Thread.sleep(3000);
		googlesearchbox.sendKeys(Keys.ENTER);
	}

}
