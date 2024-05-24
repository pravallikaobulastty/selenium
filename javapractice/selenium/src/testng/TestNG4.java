package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG4 {
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("BeforeMethod");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("AfterMethod");
	}
	
	@Test
	public void tc007()
	{
		System.out.println("tc007--->TestNG4");
	}
	
	@Test
	public void tc008()
	{
		System.out.println("tc008--->TestNG4");
	}

}
