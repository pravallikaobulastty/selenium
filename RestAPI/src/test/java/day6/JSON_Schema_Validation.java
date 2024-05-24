package day6;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

public class JSON_Schema_Validation {
	
	
	@Test
	
	void jsonschemavalidation()
	{
		given()
			.when()
				.get("https://dummyjson.com/products")
			.then()
				.assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("product.json"));
	}
	

}
