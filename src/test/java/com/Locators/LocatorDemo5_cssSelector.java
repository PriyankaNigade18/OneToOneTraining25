package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo5_cssSelector {

	public static void main(String[] args) 
	{
		// create driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");
		
		//signin: tagname with id
		driver.findElement(By.cssSelector("a#SignIn")).click();;

		//email: tagname with attaribute
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("test@gmail.com");
		
		//password: tagname with attribute
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("test123");
		
		
		//checkbox
		driver.findElement(By.cssSelector("input#remember")).click();
		
		//submit:tagname with class 
		driver.findElement(By.cssSelector("button.btn")).click();
		
		
		
		
		
		
		
		
		
	}

}
