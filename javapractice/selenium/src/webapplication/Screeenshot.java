package webapplication;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screeenshot {

	public static void takepictures(WebDriver driver ,String imgname) throws IOException {
		// TODO Auto-generated method stub

		String filepath=".//screenshots//"+imgname+".png";
		File destination = new File(filepath);
		TakesScreenshot ts= (TakesScreenshot)driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, destination);

	}


}
