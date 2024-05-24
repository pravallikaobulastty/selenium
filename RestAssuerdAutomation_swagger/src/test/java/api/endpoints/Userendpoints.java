package api.endpoints;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import api.payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.*;

public class Userendpoints {

	public static Response CreateUser(User payload)
	{
		Response response =given()
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(payload)
		.when()
			.post(Routes.post_url);
		return response;
	}
	public static Response GetUser(String user_name)
	{
		Response response = given()
								.pathParam("username", user_name)
			.when()
				.get(Routes.get_url);
		
		return response;
	}
	
	public static Response UpdateUser(String user_name,User payload)
	{
		Response response =  given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.pathParam("username", user_name)
				.body(payload)
			.when()
				.put(Routes.put_url);
		return response;
	}
	
	public static Response deleteuser(String user_name)
	{
		
		Response response = given()
				.pathParam("username",user_name)
			.when()
				.delete(Routes.delete_url);
		return response;
	}

}
