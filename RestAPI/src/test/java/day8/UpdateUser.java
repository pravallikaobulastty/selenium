package day8;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;

public class UpdateUser {
	
	@Test
	void test_updateuser(ITestContext context)
	{
		Faker faker = new Faker();
		JSONObject data = new JSONObject();
		data.put("name",faker.name().fullName());
		data.put("gender",faker.dog().gender());
		data.put("email", faker.internet().emailAddress());
		data.put("status","active");
		String bt = "c3f68748e896c2c6c3b16b501940c022121f5364a89f56151ffffc361c718ab9"; 
		int id =(int) context.getAttribute("user_id");
		System.out.println(id);
			given()			
				.headers("Authorization","Bearer "+bt)
				.contentType("application/json")
				.body(data.toString())
				.pathParam("id", id)
			.when()
				.put("https://gorest.co.in/public/v2/users/{id}")
			.then()
				.statusCode(200)
				.log().all();
	}

}
