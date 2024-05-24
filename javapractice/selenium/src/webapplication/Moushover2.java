package webapplication;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Moushover2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		By accountsL =By.xpath("//span[text()='Account & Lists']");
		WebElement account=driver.findElement(accountsL);
		//Moushover Action
		Actions Action = new Actions(driver);
		Action.moveToElement(account).build().perform();
		
		By StyleL =By.xpath("//span[text()='Discover Your Style']");
		WebElement style=driver.findElement(StyleL);
		style.click();
		
		
		

	}

}
