package api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.Userendpoints;
import api.payload.User;
import api.utilities.Dataproviders;
import io.restassured.response.Response;

public class Data_Driven_Test {
	
	@Test(priority=1, dataProvider="Data", dataProviderClass=Dataproviders.class)
	void test_post_user(String userid,String userName, String fname, String lname, String useremail, String pwd, String phone)
	{
		User userpayload = new User();
		userpayload.setId(Integer.parseInt(userid));
		userpayload.setUsername(userName);
		userpayload.setFirstName(fname);
		userpayload.setLastName(lname);
		userpayload.setEmail(useremail);
		userpayload.setPassword(pwd);
		userpayload.setPhone(phone);
		
		Response response = Userendpoints.CreateUser(userpayload);
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	
	@Test(priority = 2, dataProvider = "UserNames",dataProviderClass=Dataproviders.class)
	
	void test_delete_userbynames(String userName)
	{
		Response response = Userendpoints.deleteuser(userName);
		Assert.assertEquals(response.getStatusCode(), 200);
	}

}
