package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/droppable/");
		By exampleloc =By.xpath("//h2[text()='Examples']");
		WebElement example =driver.findElement(exampleloc);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",example);
		driver.switchTo().frame(0);
		By dragloc = By.cssSelector("div#draggable");
		WebElement drag = driver.findElement(dragloc);
		By droploc = By.cssSelector("div#droppable");
		WebElement drop = driver.findElement(droploc);
		Actions Action = new Actions(driver);
		Action.dragAndDrop(drag, drop).build().perform();

	}

}
