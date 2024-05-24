package webapplication;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_signiIn {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		By urlL=By.xpath("//span[text()='Hello, sign in']");
		WebElement url=driver.findElement(urlL);
		url.click();
		//username
		By usernameL=By.cssSelector("input#ap_email");
		WebElement username=driver.findElement(usernameL);
		username.sendKeys("pravallikapravalli98@gmail.com");
		//continuebutton
		By continueL=By.cssSelector("span#continue");
		WebElement Continue=driver.findElement(continueL);
		Continue.click();
		//password
		By passwordL=By.cssSelector("input#ap_password");
		WebElement password=driver.findElement(passwordL);
		password.sendKeys("Penfriend13@");
		//sign_in_button
		By signinbuttonL=By.cssSelector("input#signInSubmit");
		WebElement signinbutton=driver.findElement(signinbuttonL);
		signinbutton.click();

		
	}

}
