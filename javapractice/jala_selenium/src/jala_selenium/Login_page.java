package jala_selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;
public class Login_page {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://magnus.jalatechnologies.com/");
		By usernameloactor = By.cssSelector("input#UserName");
		WebElement Username = driver.findElement(usernameloactor);
		Username.sendKeys("training@jalaacademy.com");
		By passwordlocator = By.cssSelector("input#Password");
		WebElement Password = driver.findElement(passwordlocator);
		Password.sendKeys("jobprogra");
		By rememberlocator = By.cssSelector("span.checkmark");
		WebElement remember =  driver.findElement(rememberlocator);
		remember.click();
		By Signntnlocator = By.cssSelector("button.btn");
		WebElement Signinbtn = driver.findElement(Signntnlocator);
		Signinbtn.click();
		By forgotpasswordLocator = By.cssSelector("a.btn");
		WebElement forgotpassword = driver.findElement(forgotpasswordLocator);
		forgotpassword.click();
		By Emailboxloactor = By.cssSelector("input#Email");
		WebElement Emailbox = driver.findElement(Emailboxloactor);
		Emailbox.sendKeys("training@jalaacademy.com");
		By getpasswordlocator = By.cssSelector("button.btn");
		WebElement Getpassword = driver.findElement(getpasswordlocator);
		Getpassword.click();
		

	}

}
