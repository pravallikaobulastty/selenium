package day8;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;



import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;


import com.github.javafaker.Faker;
public class CreateUser {
	
	@Test
	void test_createuser(ITestContext context)
	{
		Faker faker = new Faker();
		JSONObject data = new JSONObject(); 
		data.put("name", faker.name().fullName());
		data.put("gender", faker.dog().gender());
		data.put("email", faker.internet().emailAddress());
		data.put("status","inactive");
		
		String bt = "c3f68748e896c2c6c3b16b501940c022121f5364a89f56151ffffc361c718ab9";
		
		int id =given()
			.headers("Authorization","Bearer "+bt)
			.contentType("application/json")
			.body(data.toString())
		.when()
			.log().all()
			.post("https://gorest.co.in/public/v2/users")
			.jsonPath().getInt("id");
			context.setAttribute("user_id", id);
		//System.out.println("generated id: "+id);

			
		
	}

}
