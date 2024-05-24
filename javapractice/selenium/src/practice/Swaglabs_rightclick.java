package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Swaglabs_rightclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		By usernameloc = By.id("user-name");
		WebElement username = driver.findElement(usernameloc);
		username.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		
		WebElement loginbtn = driver.findElement(By.id("login-button"));
		loginbtn.click();
		
		WebElement menubtn = driver.findElement(By.xpath("//button[text()='Open Menu']"));
		menubtn.click();
		
		WebElement selectbtn = driver.findElement(By.xpath("//a[@id='inventory_sidebar_link']"));
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView(true)",selectbtn);
		Actions action = new Actions(driver);
		Thread.sleep(3000);
action.contextClick(selectbtn).build().perform();
	}

}
