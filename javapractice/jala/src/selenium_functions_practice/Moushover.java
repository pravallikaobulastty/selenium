package selenium_functions_practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
public class Moushover {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.godaddy.com/");
		By signbtnloc = By.cssSelector("svg.uxicon-svg-container");
		WebElement signinbtn = driver.findElement(signbtnloc);
	
		Actions Action = new Actions(driver);
		Action.contextClick(signinbtn).build().perform();
		/*By createaccountloc = By.cssSelector("a.adn1o2r");
		WebElement createaccount = driver.findElement(createaccountloc);
		createaccount.click();
		*/
		
	}

}
