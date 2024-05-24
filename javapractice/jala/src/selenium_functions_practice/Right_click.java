package selenium_functions_practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.godaddy.com/");
		By menubtnloc = By.cssSelector("button.p1td6cxw");
		WebElement menubtn = driver.findElement(menubtnloc);
		Actions Action = new Actions(driver);
		Action.doubleClick(menubtn).build().perform();
		
	}

}
