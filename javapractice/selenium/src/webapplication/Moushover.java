package webapplication;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Moushover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		By StyleL =By.xpath("//span[text()='Discover Your Style']");
		WebElement Style=driver.findElement(StyleL);
		Style.click();
		// by this we will be getting exception "elementnotfound" to handle that we use mouseover actions
		
		

	}

}
