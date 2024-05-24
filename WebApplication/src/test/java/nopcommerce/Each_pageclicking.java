package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Each_pageclicking {
	@Test
	void clicks()
	{
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://admin-demo.nopcommerce.com/");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//i[@class='right fas fa-angle-left ']")).click();
		WebElement product = driver.findElement(By.xpath("//p[contains(text(),'Products')]"));
		Actions action = new Actions(driver);
		action.click(product).build().perform();
		WebElement productreview = driver.findElement(By.xpath("//p[contains(text(),'Product reviews')]"));
		action.click(productreview).build().perform();
		
		
		
	}

}
