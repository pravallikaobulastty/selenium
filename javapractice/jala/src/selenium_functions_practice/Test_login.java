package selenium_functions_practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_login {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://sso.godaddy.com/?realm=idp&app=venture-redirector&path=/");
		By Usernameloc = By.cssSelector("input#username");
		WebElement username = driver.findElement(Usernameloc);
		username.sendKeys("pravallikapravs131875@gmail.com");
		By passwordloc = By.cssSelector("input#password");
		WebElement password = driver.findElement(passwordloc);
		password.sendKeys("penfriend");
		By loginbtnloc = By.cssSelector("button#submitBtn");
		WebElement loginbtn = driver.findElement(loginbtnloc);
		loginbtn.click();
		driver.close();
	}

}
