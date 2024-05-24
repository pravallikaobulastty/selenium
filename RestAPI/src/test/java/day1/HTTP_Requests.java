package day1;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;

public class HTTP_Requests {
	int id;
	@Test(priority = 1)
	
	void getUser()
	{
		given()
		
		.when()
			.get("https://reqres.in/api/users?page=2")
		.then()
			.statusCode(200)
			.body("page",equalTo(2))
			.log().all();
	}
	@Test(priority =2)
	void createuser()
	{
		HashMap data = new HashMap();
		data.put("name", "pravallika");
		data.put("job", "seeker");
		
		id = given()
			.contentType("application/json")
			.body(data)
		.when()
			.post("https://reqres.in/api/users/"+id)
			.jsonPath().getInt("id");
		//.then()
			//.statusCode(201)
		//	.log().all();
	
	}
	
	@Test(priority=3,dependsOnMethods= {"createuser"})
	
	void update()
	{
		HashMap data = new HashMap();
		data.put("name","mani");
		data.put("job","manual");
		
		given()
			.contentType("application/json")
			.body(data)
		.when()
			.put("https://reqres.in/api/users/"+id)
		.then()
			.statusCode(200)
			.log().all();
			
		
	}
	
	void delete()
	{
		when()
			.delete("https://reqres.in/api/users/"+id)
		.then()
			.statusCode(204)
			.log().all();
	}

}


