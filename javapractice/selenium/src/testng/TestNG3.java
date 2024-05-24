package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG3 {
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("BeforeClass");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("AfterClass");
	}
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
	public void tc005()
	{
		System.out.println("tc005--->TestNG3");
	}
	
	@Test
	public void tc006()
	{
		System.out.println("tc006--->TestNG3");
	}

}
