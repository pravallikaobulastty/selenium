package day8;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class GetUser {
	@Test
	void test_getUser(ITestContext context)
	{
		int id = (int) context.getAttribute("user_id");
		String bt = "c3f68748e896c2c6c3b16b501940c022121f5364a89f56151ffffc361c718ab9";
		System.out.println(id);
		given()
			.headers("Authorization","Bearer "+bt)
			.pathParam("id", id)
		.when()
			.get("https://gorest.co.in/public/v2/users/{id}")
		.then()
			.statusCode(200)
			.log().all();
			
	}

}
