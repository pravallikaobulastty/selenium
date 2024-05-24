package day2;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;
public class Different_ways_to_create_request {
	
	//@Test 
	
	void usinghashmap()
	{
		HashMap data = new HashMap();
		data.put("userId", "11");
		data.put("id", "101");
		data.put("title", "nvhbfgjernfkvnjfhbgv hjgryfre hrgyfi hgryfb");
		data.put("body", "herhfhergfygergfyerhyerg");
		
		given()
			.contentType("application/json")
			.body(data)
		.when()
			.post("https://jsonplaceholder.typicode.com/posts")
		.then()
			.statusCode(201)
			.body("userId",equalTo("11"))
			.body("title", equalTo("nvhbfgjernfkvnjfhbgv hjgryfre hrgyfi hgryfb"))
			.body("id",equalTo(101))
			.log().all();
			
	}
	
	//@Test
	
		void orgjsonlibrary()
		{
			JSONObject data = new JSONObject();
			data.put("userId", "11");
			data.put("id", "101");
			data.put("title", "nvhbfgjernfkvnjfhbgv hjgryfre hrgyfi hgryfb");
			data.put("body", "herhfhergfygergfyerhyerg");
			
			given()
				.contentType("application/json")
				.body(data.toString())
			.when()
				.post("https://jsonplaceholder.typicode.com/posts")
			.then()
				.statusCode(201)
				.body("userId",equalTo("11"))
				.body("title", equalTo("nvhbfgjernfkvnjfhbgv hjgryfre hrgyfi hgryfb"))
				.body("id",equalTo(101))
				.log().all();
		}
	//	@Test
	void usingPojoclass()
	{
		Pojo_postrequest data = new Pojo_postrequest();
		data.setUserId("11");
		data.setId("101");
		data.setTitle("jbfhvbfhgv hjbfhvbyeg hfbvyugw");
		data.setBody("ndbvger hjbfvyr hgvfgte hfgtv");
		given()
			.contentType("application/json")
			.body(data)
		.when()
			.post("https://jsonplaceholder.typicode.com/posts")
		.then()
		.statusCode(201)
		.body("userId",equalTo("11"))
		.body("title", equalTo("jbfhvbfhgv hjbfhvbyeg hfbvyugw"))
		.body("id",equalTo(101))
		.log().all();
	}
	
	@Test
	void using_json_external_file() throws FileNotFoundException
	{
		File f = new File(".\\body.json");
		FileReader fr = new FileReader(f);
		JSONTokener jt = new JSONTokener(fr);
		JSONObject obj = new JSONObject(jt);
		given()
			.contentType("application/json")
			.body(obj.toString())
		.when()
			.post("https://jsonplaceholder.typicode.com/posts")
		.then()
			.statusCode(201)
			.body("userId",equalTo("11"))
			.body("title", equalTo("jbfhvbfhgv hjbfhvbyeg hfbvyugw"))
			.body("id",equalTo(101))
			.log().all();
		
	}
	@Test
	void testdatadelete()
	{
		given()
		.when()
			.delete("https://jsonplaceholder.typicode.com/posts/101")
		.then()
			.statusCode(200);
	}
	
	
	
	
	

}
 