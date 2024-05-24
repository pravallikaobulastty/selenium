package webapplication;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class Exploreshowroom {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		
		/*By accountsL=By.xpath("//span[text()='Account & Lists']");
		WebElement accounts = driver.findElement(accountsL);
		
		Actions action = new Actions(driver);
		action.moveToElement(accounts).build().perform();
		*/
		By exploreL=By.xpath("//span[text()='Explore Showroom']");
		WebElement explore = driver.findElement(exploreL);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", explore);

	}

}
