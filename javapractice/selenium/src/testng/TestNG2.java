package testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG2 {
	@BeforeTest
	public void beforetest()
	{
		System.out.println("BeforeTest");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("AfterTest");
	}

	
	@Test
	public void tc003()
	{
		System.out.println("tc003--->TestNG2");
	}
	
	@Test
	public void tc004()
	{
		System.out.println("tc004--->TestNG2");
	}

}
