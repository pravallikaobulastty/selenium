package webapplication;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DealsFunctionality {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		
		By searchL = By.cssSelector("select#searchDropdownBox");
		WebElement search = driver.findElement(searchL);
		
		Select select=new Select(search);
		List<WebElement> alloptions = select.getAllSelectedOptions();
		
		for(WebElement options:alloptions)
		{
			//select.selectByIndex(4);
			if(options.getText().equals("Baby"));
			
				select.selectByVisibleText("Baby");
			
		}
		
		

	}

}
