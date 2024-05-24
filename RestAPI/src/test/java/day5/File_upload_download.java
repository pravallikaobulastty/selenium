package day5;

import java.io.File;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class File_upload_download {
	
	//@Test
	
	void singlefileupload()
	{
		File myfile = new File("C:\\API Practice\\text.txt");
		given()
			.multiPart("file",myfile)
			.contentType("multipart/form-data")
		.when()
			.post("https://the-internet.herokuapp.com/upload")
		.then()
			.statusCode(200)
			.body("filename", equalTo("text.txt"))
			.log().all();
	}
	@Test
	void filedownload()
	{
		given()
			.when()
				.get("https://the-internet.herokuapp.com/download")
			.then()
				.statusCode(200)
				.log().all();
	}
	
	void multiplefileupload()
	{
		File myfile1 = new File("C:\\API Practice\\students.txt");
		File myfile2 = new File("C:\\API Practice\\students.txt");
		given()
			.multiPart("files",myfile1)
			.multiPart("files",myfile2)
			.contentType("multipart/form-data")
		.when()
			.post("https://the-internet.herokuapp.com/upload")
		.then()
			.statusCode(200)
			.log().all();
	}
	
	void multipartusingarray()
	{
		File myfile1 = new File("C:\\API Practice\\students.txt");
		File myfile2 = new File("C:\\API Practice\\students.txt");
		File filearr[] = {myfile1,myfile2};
		given()
			.multiPart("files",filearr)
			.contentType("multipart/form-data")
		.when()
			.post("https://the-internet.herokuapp.com/upload")
		.then()
			.statusCode(200)
			.log().all();
	}
}
