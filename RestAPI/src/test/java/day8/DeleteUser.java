package day8;

import org.testng.ITestContext;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class DeleteUser {
	
	
	@Test
	
	void test_deleteuser(ITestContext context)
	{
		int id=(int) context.getAttribute("user_id");
		
		String bt = "c3f68748e896c2c6c3b16b501940c022121f5364a89f56151ffffc361c718ab9";
		given()
			.headers("Authorization","Bearer "+bt)
			.contentType("application/json")
			.pathParam("id", id)
		.when()
			.delete("https://gorest.co.in/public/v2/users/{id}")
		.then()
			.statusCode(204);

	}

}
