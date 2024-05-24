package webapplication;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test_login_page {

	public static void main(String[] args) {
		
		// Launching Browser
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.saucedemo.com/");
		
		// Entering Username
		By Username=By.id("user-name"); //-->finding the locator
		WebElement username=driver.findElement(Username); //---> finding which element we want
		username.sendKeys("standard_user"); // ---> sending the text 
		
		// Entering password
		By password=By.id("password");
		WebElement Password=driver.findElement(password);
		Password.sendKeys("secret_sauce");
		
		// Click on login button
		By loginbtnloc=By.id("login-button");
		WebElement ele=driver.findElement(loginbtnloc);
		ele.click();
		
		
		}

}
