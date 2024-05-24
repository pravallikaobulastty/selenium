package webapplication;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_action {
	static WebDriver driver;
	
	public static WebElement aleert(String locator)

	{
		By getelementloc=By.xpath("//*[contains(text(),'"+ locator+"')]");
		WebElement getelement=driver.findElement(getelementloc);
		return getelement;
	}
	public static void click(WebElement getelement)
	{
		getelement.click();
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		WebElement alertwithtextbox=aleert("Alert with Textbox");
		click(alertwithtextbox);
		Thread.sleep(3000);
		
		WebElement alertwithtextbox_button=aleert("click the button to demonstrate the prompt box");
		click(alertwithtextbox_button);
		Thread.sleep(3000);
 
		Alert alert=driver.switchTo().alert();//---> to switch to alert box
		alert.getText();//---->to get alert msg
		alert.sendKeys("livetech");//---->to write in prompt box
		alert.accept();
		
	/*	WebElement alertwithokcancel=aleert("Alert with OK & Cancel");
		click(alertwithokcancel);
		Thread.sleep(3000);
		
		WebElement alertwithok=aleert("Alert with OK");
		click(alertwithok);
	*/	Thread.sleep(3000);
		
		
	}

}