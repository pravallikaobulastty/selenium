package webapplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.automationtesting.in/Frames.html");
		
		// switch frame using index value
		//driver.switchTo().frame(0);
		// switch with tag id value or name value
		//driver.switchTo().frame("SingleFrame" );
		// switch with web element
		By frametagl=By.id("singleframe");
		WebElement frametag=driver.findElement(frametagl);
		driver.switchTo().frame(frametag);
		By texloc=By.xpath("//input[@type='text']");
		WebElement text=driver.findElement(texloc);
		text.sendKeys("hello pravallika");
	}

}
