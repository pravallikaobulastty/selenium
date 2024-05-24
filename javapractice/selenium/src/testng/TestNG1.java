package testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class TestNG1 {
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Beforesuite");
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("Aftersuite");
	}
	
	@Test
	public void tc001()
	{
		System.out.println("tc001--->TestNG1");
	}
	
	@Test
	public void tc002()
	{
		System.out.println("tc002--->TestNG1");
	}

}
