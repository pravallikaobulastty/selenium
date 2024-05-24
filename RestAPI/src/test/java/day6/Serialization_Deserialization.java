package day6;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Serialization_Deserialization {
	
	//@Test
	void serialization_pojo_to_json() throws JsonProcessingException
	{
		Pojo data = new Pojo();
		data.setUserId("11");
		data.setId("101");
		data.setTitle("jbfhvbfhgv hjbfhvbyeg hfbvyugw");
		data.setBody("ndbvger hjbfvyr hgvfgte hfgtv");
		ObjectMapper obj = new ObjectMapper();
		String jsondata =obj.writerWithDefaultPrettyPrinter().writeValueAsString(data);
		System.out.println(jsondata);
	}
	
	@Test
	void deserialization_json_to_pojo() throws JsonMappingException, JsonProcessingException
	{
		String jsondata = "{\r\n"
				+ "  \"userId\" : \"11\",\r\n"
				+ "  \"title\" : \"jbfhvbfhgv hjbfhvbyeg hfbvyugw\",\r\n"
				+ "  \"id\" : \"101\",\r\n"
				+ "  \"body\" : \"ndbvger hjbfvyr hgvfgte hfgtv\"\r\n"
				+ "}";
		ObjectMapper obj = new ObjectMapper();
		Pojo object=obj.readValue(jsondata,Pojo.class );
		System.out.println(object.getId());
		System.out.println(object.getBody());
		System.out.println(object.getTitle());
		System.out.println(object.getUserId());
	}

}
