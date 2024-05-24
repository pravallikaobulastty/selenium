package day5;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.List;

import io.restassured.path.xml.XmlPath;
import io.restassured.response.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class XMLPath_validation {
	
	//@Test
	
	void parsingXMLPath()
	{
		Response res = given()
			.when()
				.get("https://www.w3schools.com/xml/simple.xml");
			/*.then()
				.statusCode(200)
				.header("Content-Type", "text/xml")
				.body("breakfast_menu.food.name[0]",equalTo("Belgian Waffles"))
				.body("breakfast_menu.food.price[1]",equalTo("$7.95"));
				*/
		Assert.assertEquals(res.getStatusCode(), 200);
		Assert.assertEquals(res.header("Content-Type"), "text/xml");
		String calories = res.xmlPath().get("breakfast_menu.food[0].calories").toString();
		Assert.assertEquals(calories, "650");
		String breakfastname = res.xmlPath().get("breakfast_menu.food[0].name").toString();
		Assert.assertEquals(breakfastname, "Belgian Waffles");
	}
	
	@Test
	
	void testXMLPATH()
	{
		boolean status = false;
		Response res = given()
					.when()
					.get("https://www.w3schools.com/xml/simple.xml");
		
		XmlPath obj = new XmlPath(res.asString());
		//total no.of breakfast items
		List<String>breakfast=obj.getList("breakfast_menu.food.name");
		Assert.assertEquals(breakfast.size(), 5);
		//verify brekfast name present in list or not
		List<String>breakfastname=obj.getList("breakfast_menu.food.name");
		for(String name :breakfastname )
		{
			System.out.println(name);
			if(name.equals("Strawberry Belgian Waffles"))
			{
				status = true;
			break;
			
			}
		}
		
		Assert.assertEquals(status, true);
		
	}

}
