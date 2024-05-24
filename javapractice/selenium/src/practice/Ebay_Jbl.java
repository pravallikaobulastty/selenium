package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay_Jbl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.ebay.com/");
		String page = driver.getCurrentUrl();
		System.out.println(page);
		driver.quit();
		
		
		/*By searchboxloc = By.cssSelector("input#gh-ac");
		WebElement searchbox = driver.findElement(searchboxloc);
		searchbox.sendKeys("JBL Speakers");
		
		WebElement searchbtnloc = By.xpath("//input[@id='gh-btn']").findElement(searchbox);
		searchbtnloc.click();
	*/
		
		
		
		
	}

}
