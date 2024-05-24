package nopcommerce;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Admin {
	@Test
	void adminloginpage()
	{
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://admin-demo.nopcommerce.com/");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//i[@class='right fas fa-angle-left ']"));
		Actions actions= new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		By links=By.tagName("ul");
		List<WebElement>alllinks = driver.findElements(links);
		for(WebElement link:alllinks)
		{
			if(link.isDisplayed())
			{
				System.out.println(link.getText());
				actions.click(link).build().perform();
			}
		}
	}

}
