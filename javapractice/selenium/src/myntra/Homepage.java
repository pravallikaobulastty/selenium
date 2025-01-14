package myntra;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
public class Homepage {
	
	//@Test
	public void home() throws InterruptedException
	{
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.nykaafashion.com/");
	//driver.manage().deleteAllCookies();
	driver.findElement(By.id("wzrk-cancel")).click();
	driver.findElement(By.className("css-d040mp")).click();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ethnic wear");
	Thread.sleep(10000);
	List<WebElement>listofvisble=driver.findElements(By.xpath("//div[@data-test='suggestion-anchor']"));
	for(WebElement lis:listofvisble)
	{
		System.out.println(lis.getText());
	}
	driver.navigate().back();
	}
	@Test
	public void screenshot() throws IOException
	{
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.nykaafashion.com/");
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	File f = ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f, new File("./selenium/screenshots.png"));
	
	}
	}

