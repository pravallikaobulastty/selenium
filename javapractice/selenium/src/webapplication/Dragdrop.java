package webapplication;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/droppable/");
		//scrolling 
		By exampleL=By.xpath("//h2[text()='Examples']");
		WebElement example=driver.findElement(exampleL);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",example);
		
		//switch to frame
		driver.switchTo().frame(0);

		//drag and drop locators
		By dragL=By.cssSelector("div#draggable");
		WebElement drag=driver.findElement(dragL);
		
		By dropL=By.cssSelector("div#droppable");
		WebElement drop=driver.findElement(dropL);
		
		Actions action=new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform();

		

	}

}
