package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo3_className {

	public static void main(String[] args)
	{

		//create driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/login.html");
				
		//email
		driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
		
		//password
		driver.findElement(By.id("password")).sendKeys("test123");
		
		//Submit button: using class name
		//selenium.InvalidSelectorException: Compound class names not permitted
		//driver.findElement(By.className("btn btn-default btn-primary")).click();

		
		driver.findElement(By.className("btn-primary")).click();
	}

}
