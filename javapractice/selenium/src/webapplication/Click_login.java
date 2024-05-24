package webapplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_login {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://saucedemo.com");
		
		//finding locator and click on button
		
		By loginbtnloc=By.id("login-button");
		WebElement ele=driver.findElement(loginbtnloc);
		ele.click();
	}

}
