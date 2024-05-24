package jala_selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;
public class Text_box {
	public static void main(String[] args) {
		
	
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("http://magnus.jalatechnologies.com/");
	By usernameloactor = By.cssSelector("input#UserName");
	WebElement Username = driver.findElement(usernameloactor);
	Username.sendKeys("training@jalaacademy.com");
	By passwordlocator = By.cssSelector("input#Password");
	WebElement Password = driver.findElement(passwordlocator);
	Password.sendKeys("jobprogram");
	By Signntnlocator = By.cssSelector("button.btn");
	WebElement Signinbtn = driver.findElement(Signntnlocator);
	Signinbtn.click();
	/*
	WebElement employee = driver.findElement(By.xpath("//i[@class='fa fa-users']"));
	Actions action = new Actions(driver);
	action.moveToElement(employee).build().perform();
	*/
	WebElement search =driver.findElement(By.xpath("//i[@class='fa fa-search']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()", search);
	driver.switchTo().frame("input#Name");
	By textboxlocator = By.cssSelector("input#Name");
	WebElement textbox = driver.findElement(textboxlocator);
	textbox.sendKeys("pravslliks");
	
	//String s = driver.findElement(By.name("Name")).getAttribute("value");
	//System.out.println(s);
	driver.quit();
	
	
	
	/*
	By logonamelocator = By.xpath("//b[text()='Magnus']");
	WebElement logoname = driver.findElement(logonamelocator);
	String text = logoname.getText();
	System.out.println(text);
	*/
	

}
}