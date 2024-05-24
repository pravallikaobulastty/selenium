package day7;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class Authorizations {
	
	//@Test
	
	void basicauthentication()
	{
		given()
			.auth().basic("foo", "bar")
		.when()
			.get("https://httpbin.org/basic-auth/foo/bar")
		.then()
			.statusCode(200)
			.body("authenticated", equalTo(true))
			.body("user",equalTo("foo"))
			.log().all();
	}
	
	//@Test
	
	void testdigestauthentication()
	{
		given()
			.auth().digest("foo", "bar")
		.when()
			.get("https://httpbin.org/basic-auth/foo/bar")
		.then()
			.statusCode(200)
			.body("authenticated", equalTo(true))
			.body("user",equalTo("foo"))
			.log().all();
	}
	
	//@Test
	
	void testpreemptiveauthentication()
	{
		given()
			.auth().preemptive().basic("foo", "bar")
		.when()
			.get("https://httpbin.org/basic-auth/foo/bar")
		.then()
			.statusCode(200)
			.body("authenticated", equalTo(true))
			.body("user",equalTo("foo"))
			.log().all();
	}
	
	@Test
	
	void testbearertokenauthentication()
	{
		given()
			.headers("Authorization","Bearer ${auth_token}")
		.when()
			.get("https://httpbin.org/anything/foo")
		.then()
			.statusCode(200)
			.log().all();
	}
	
	void testoauth1authentication()
	{
		given()
			.auth().oauth("consumer_key", "consumer_secret", "access_token", "token_secret")
		.when()
			.get("url")
		.then()
			.statusCode(200);
	}
	
	
	//@Test
	void testoauth2authentication()
	{
		given()
			.auth().oauth2("accesstokenvalue")
		.when()
			.get("url")
		.then()
			.statusCode(200);
	}
	
	
	void testAPIkeyauthentication()
	{
		
	}

}
