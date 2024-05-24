package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_picker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/datepicker/");
		By exampleloc=By.xpath("//h2[text()='Examples']");
		WebElement exaample=driver.findElement(exampleloc);
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		js.executeScript("arguments[0].scrollIntoView(true)", exaample);
		driver.switchTo().frame(0);
		By searchboxLoc = By.cssSelector("input#datepicker");
		WebElement searchbox = driver.findElement(searchboxLoc);
		searchbox.click();
		for(int i=1;i<3;i++)
		{
			By nextbtnloc = By.xpath("//span[text()='Prev']");
			WebElement nextbtn = driver.findElement(nextbtnloc);
			nextbtn.click();
		}
		By tableloc = By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td");
		List<WebElement>table =driver.findElements(tableloc);
		for(WebElement btn:table )
		{
			if(btn.getText().equals("20"))
			{
				btn.click();
			}
		}
		
	}

}
