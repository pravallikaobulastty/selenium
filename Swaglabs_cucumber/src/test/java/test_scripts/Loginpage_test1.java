package test_scripts;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Loginpage;
import utils.Browser;

public class Loginpage_test1 {
	WebDriver driver;
	Loginpage login;
	
	@Given("^user must be on login page$")
	public void user_must_be_on_login_page() throws Throwable {
		driver = Browser.Launchbrowser("chrome");
	    Browser.oprnUrl();
	    login = new Loginpage(driver);
	    
	}

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
		login.clickLoginbtn();
	   
	}

	@Then("^verify error msg must be \"([^\"]*)\"$")
	public void verify_error_msg_must_be(String expectederrormsg) throws Throwable {
		String actualerrormsg = login.geterrormsg();
	    Assert.assertEquals(actualerrormsg, expectederrormsg);
	}

	@Then("^cross button at error msg label must be visible$")
	public void cross_button_at_error_msg_label_must_be_visible() throws Throwable {
		boolean status = login.iscrossbtndispaly();
		Assert.assertTrue("test script failed as cross button not visible", status);

	}

}
