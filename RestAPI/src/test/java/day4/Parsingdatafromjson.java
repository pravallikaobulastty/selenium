package day4;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.*;



public class Parsingdatafromjson{
	
	//@Test
	
	void testjsonresponse()
	{
		//approach1
		
		/*given()
			.contentType(ContentType.JSON)
			.when()
				.get("https://dummyjson.com/products")
		.then()
			.statusCode(200)
			.header("vary", "Accept-Encoding")
			.body("products[2].category",equalTo("smartphones"));
			*/
		
		//approach 2
		
		Response res =given()
				.contentType(ContentType.JSON)
			.when()
				.get("https://dummyjson.com/products");
		Assert.assertEquals(res.getStatusCode(),200);
		Assert.assertEquals(res.getHeader("vary"),"Accept-Encoding" );
		String body =res.jsonPath().get("products[2].category").toString();
		Assert.assertEquals(body,"smartphones" );
		
		
	}
	
	//@Test
	
	void getobjectvalue()
	{
		boolean status = false;
		Response res =given()
						.contentType(ContentType.JSON)
					.when()
						.get("https://dummyjson.com/products");
		JSONObject jo = new JSONObject(res.asString());//--->converts json object
		for(int i=0; i<jo.getJSONArray("products").length();i++)
		{
			String brandvalue = jo.getJSONArray("products").getJSONObject(i).get("brand").toString();
			//System.out.println(brandvalue);
		
		//to find particular brand name 
		
		if(brandvalue.equals("Huawei"))
		{
			status = true;
			break;
		}
		
	}
		Assert.assertEquals(status,true);
					
	}
	
	@Test
	void priceofphone()
	{
		Response rs = given()
						.contentType(ContentType.JSON)
					.when()
					.get("https://dummyjson.com/products");
		double totalprice = 0;
		JSONObject jo = new JSONObject(rs.asString());
		for(int i=0;i<jo.getJSONArray("products").length();i++ )
		{
			String price = jo.getJSONArray("products").getJSONObject(i).get("price").toString();
			totalprice=totalprice+Double.parseDouble(price);
		}
		System.out.println(totalprice);
		Assert.assertEquals(totalprice, 111902.0);
		
	}
	
	
	
	


}
