package webapplication;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshots {

	 @Test
		 public static void takePicture(WebDriver driver ,String imgname) throws IOException
			{
			  driver = new ChromeDriver();
			driver.navigate().to("https://www.nykaafashion.com/");
				
				String filepath=".//screenshots//"+imgname+".png";
				File destination = new File(filepath);
				TakesScreenshot ts= (TakesScreenshot)driver;
				File f=ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(f, destination);
			}
		 
		}
		
		
	


