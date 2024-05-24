package api.test;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpoints.Userendpoints;
import api.payload.User;
import io.restassured.response.Response;




public class UserTest {

	 Faker faker;
	 User userpayload;
	public Logger logger;
	@BeforeClass
	void setupdata()
	{
		faker = new Faker();
		userpayload = new User();
		userpayload.setId(faker.idNumber().hashCode());
		userpayload.setUsername(faker.name().username());
		userpayload.setFirstName(faker.name().firstName());
		userpayload.setLastName(faker.name().lastName());
		userpayload.setEmail(faker.internet().emailAddress());
		userpayload.setPassword(faker.internet().password(5, 10));
		userpayload.setPhone(faker.phoneNumber().cellPhone());	
		
		//logger details
		logger = LogManager.getLogger(this.getClass());
		
	}
	@Test(priority = 1)
	public void testpostuser()
	{
		logger.info("*************** creation started *******************");
		Response response =Userendpoints.CreateUser(userpayload);
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
	logger.info("*************** creation ended *******************");	
	}
	@Test(priority =2)
	public void testgetuser()
	{
		logger.info("*************** getting data *******************");
		Response response = Userendpoints.GetUser(this.userpayload.getUsername());
				response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
		logger.info("*************** retrived data *******************");
	}
	
	@Test(priority = 3)
	public void testupdateuser()
	{
		logger.info("*************** upadating data *******************");
		userpayload.setPhone(faker.phoneNumber().cellPhone());	
		userpayload.setFirstName(faker.name().firstName());
		userpayload.setLastName(faker.name().lastName());
		
		Response response = Userendpoints.UpdateUser(this.userpayload.getUsername(), userpayload);
		response.then().log().body();
		Assert.assertEquals(response.getStatusCode(), 200);
		logger.info("*************** updated data *******************");
	}
	@Test(priority = 4)
	public void testdeleteuser()
	{
		logger.info("*************** deleted request*******************");
		Response response = Userendpoints.deleteuser(this.userpayload.getUsername());
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	

}
