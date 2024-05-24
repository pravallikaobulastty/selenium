package webapplication;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_loginpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch browser
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://accounts.google.com/InteractiveLogin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&ifkv=Af_xneHiWN7v0Mt6matt7SfB8I-nzhv26B_guKjt5R4cPclco0FDzo4Dg4AW1REUgUbwI2zToOnOyA&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		// enter username
		By username=By.id("identifierId");
		WebElement uele=driver.findElement(username);
		uele.sendKeys("pravallikapravalli98@gmail.com");
		// click on next button
		By next=By.xpath("//span[text()='Next']");
		WebElement nextele=driver.findElement(next);
		nextele.click();
		// enter password
		By password=By.id("password");
		WebElement pele=driver.findElement(password);
		pele.sendKeys("penfriend");

	}

}
