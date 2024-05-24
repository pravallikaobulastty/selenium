package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver driver;
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}
	@FindBy(xpath="//input[@placeholder='Username']")WebElement Username;
	@FindBy(xpath="//input[@placeholder='Password']")WebElement Password;
	@FindBy(xpath="//input[@data-test='login-button']")WebElement loginbtn;
	@FindBy(xpath="//h3[@data-test='error']")WebElement errormsg;
	@FindBy(xpath="//button[@class='error-button']//*[@role='img']")WebElement crossbtn;
	
	public void setusername(String uname)
	{
		Username.sendKeys(uname);
	}
	public void setpassword(String pass)
	{
		Password.sendKeys(pass);
	}
	public void clickLoginbtn()
	{
		loginbtn.click();
	}
	public String geterrormsg()
	{
		String errormsgtext = errormsg.getText();
		System.out.println(errormsgtext);
		return errormsgtext;
	}
	public void clickcrossbtn()
	{
		crossbtn.click();
	}
	public boolean iscrossbtndispaly()
	{
		try
		{
			return crossbtn.isDisplayed();
		}
		catch(Exception e)
		{
			return false;
		}
	}

}
