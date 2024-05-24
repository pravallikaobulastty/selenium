package webapplication;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		By dropdownL=By.cssSelector("select#searchDropdownBox");
		WebElement dropdown=driver.findElement(dropdownL);
		Select select=new Select(dropdown);
		//List<WebElement>alloptions=select.getOptions();
		List<WebElement>alloptions=select.getAllSelectedOptions();
		System.out.println("All options");
		for(WebElement options:alloptions)
		{
			System.out.println(options.getText());
			//if(options.getText().equals("Alexa Skills"));
			//select.selectByVisibleText("Alexa Skills");

		}
		select.selectByIndex(4);
	}

}
