package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.saucedemo.com/v1/inventory.html");
		By getlinksloc = By.tagName("a");
		List<WebElement>allwindows = driver.findElements(getlinksloc);
		for(WebElement win:allwindows)
		{
			if(win.isDisplayed())
				System.out.println(win.getText());
		}
		
	}

}
