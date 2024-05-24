package nopcommerce;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon {
	//@Test
	void scroll()
	{
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		WebElement scroll = driver.findElement(By.xpath("//h2[@class='a-color-base headline truncate-2line'and text()='Never before offers from Small businesses']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", scroll);
		
	}
	@Test
	void calender_type1()
	{
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.hyrtutorials.com/p/calendar-practice.html");
		//to click on search box.
		driver.findElement(By.cssSelector("input#first_date_picker")).click();
		//scrolldown
		WebElement scroll = driver.findElement(By.xpath("//span[text()='Next']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", scroll);
		//to click the button forward or back word
		driver.switchTo().frame(0);
	    driver.findElement(By.xpath("//span[text()='Next']")).click();
	    List<WebElement>tablebody = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
	    for(WebElement btn:tablebody)
	    {
	    	if(btn.getText().equals("20"))
	    	{
	    		btn.click();
	    	}
	    }
	   // WebElement year = driver.findElement(By.xpath("//div/span[text()='April']"));
	    //WebElement month = driver.findElement(By.xpath(""))
		
	}

}
