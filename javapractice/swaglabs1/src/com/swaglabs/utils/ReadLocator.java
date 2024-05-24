package com.swaglabs.utils;
import java.io.FileInputStream;
import java.util.Properties;
public class ReadLocator {
	Properties pro;
	public ReadLocator(String filename) 	{
		try
		{
		String filepath=".//locators//"+ filename+".properties"; //--->filepath(loaction)
		FileInputStream instream= new FileInputStream(filepath); //---> reading filepath
		pro = new Properties();//--->when ever we use properties file we need to create object for propertes
		pro.load(instream);//-->loading the data, its a non static method
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public String getlocator(String locatorname)
	{
		return pro.getProperty(locatorname);//-->gets the requried locator
	}
	
	
	

}
