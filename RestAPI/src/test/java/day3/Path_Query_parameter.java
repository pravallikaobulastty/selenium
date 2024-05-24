package day3;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;
public class Path_Query_parameter {
	//https://dummy.restapiexample.com/api/v1/employee/1
	@Test
	void testpathqueryprams()
	{
		given()
			.pathParam("mypath", "users")
			
			.queryParam("page",2)
			
			
			.when()
				.get("https://reqres.in/api/{mypath}")
				
			
			.then()
				.statusCode(200)
				.log().body();
	}
	
	@Test
	
	void testpathqueryparams2()
	///api/users/23
	{
		given()
			.pathParam("path","user")
			
			.queryParam("id",23)
		.when()
			.get("https://reqres.in/api/{path}")
			
		.then()
			.statusCode(404)
			.log().all();
	}

}
