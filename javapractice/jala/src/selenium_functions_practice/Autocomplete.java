package selenium_functions_practice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Autocomplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		By searchloc = By.cssSelector("textarea.gLFyf");
		WebElement searchbtn = driver.findElement(searchloc);
		searchbtn.sendKeys("godaddy");
		for(int i=0;i<3;i++)
		{
			Thread.sleep(3000);
			searchbtn.sendKeys(Keys.ARROW_DOWN);
		}
		Thread.sleep(3000);
		searchbtn.sendKeys(Keys.ENTER);
	}

}
