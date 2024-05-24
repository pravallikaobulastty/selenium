package day3;

import org.testng.annotations.Test;

import io.restassured.response.*;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;

public class Cookies {
	
	
	//@Test
	void testcookies()
	{
	 given()
		
			.when()
				.get("https://www.amazon.in/")
			
		.then()
			.statusCode(200)
			.log().all();
}
	
	//@Test
	void getcookies()
	{
		Response res=given()
					
				.when()
				
				.get("https://www.youtube.com/");
				
			String cookie_value = res.cookie("VISITOR_INFO1_LIVE");
		System.out.println("value of cookiee is ----> "+ cookie_value);	
									
	}
	
	@Test
	void getallcookies()
	{
		Response res=given()
					
				.when()
				
				.get("https://www.youtube.com/");
				
			Map <String,String> cookie_value =res.getCookies();
			//System.out.println(cookie_value.keySet());
			for(String K: cookie_value.keySet())
			{
				String cookiee_value =res.getCookie(K);
				System.out.println(cookiee_value);
			}
			
		
	
			
			
									
	}

}
