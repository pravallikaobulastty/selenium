package webapplication;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test_login1{
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.saucedemo.com/");
		
		By loginbtnl=By.id("login-button");
		WebElement ele=driver.findElement(loginbtnl);
		ele.click();
		
		//to print error message and locate the error message using xpath
		By errormsg=By.xpath("//h3[@data-test='error']");
		WebElement errorele=driver.findElement(errormsg);
		String errorrmsg=errorele.getText();
		System.out.println(errorrmsg);
	}

}
