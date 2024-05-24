package day3;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;
import io.restassured.response.*;
import io.restassured.http.*;

public class Headers {
	
	//@Test
	
	void testheaders()
	{
		given()
		
			.when()
				.get("https://www.youtube.com/")
		
			.then()
				.statusCode(200)
				.log().all();
	}
	
	//@Test
	void getsingleheader()
	{
		Response res = given()
				
				.when()
					.get("https://www.youtube.com/");
			
			String header=res.getHeader("Content-Type");
			System.out.println(header);
				
	}
	
	@Test
	
	void getmultipleheader()
	{
		Response res = given()
				
				.when()
				.get("https://www.youtube.com/");
		
		
				io.restassured.http.Headers myheader = res.getHeaders();
				
				for(Header hd : myheader)
				{
					System.out.println(hd.getName()+ "    "+hd.getValue());
				}
	}
	
	
}
