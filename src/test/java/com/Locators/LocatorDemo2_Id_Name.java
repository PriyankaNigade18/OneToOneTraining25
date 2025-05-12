package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo2_Id_Name {

	public static void main(String[] args) throws InterruptedException 
	{

		//Create driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");
		
		//signIn
		driver.findElement(By.linkText("Sign In")).click();
		
		//login page
		//email:By id
		driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
		
		//password:By name
		driver.findElement(By.name("password-name")).sendKeys("test123");
			
		
		//checkbox:By id
		driver.findElement(By.id("remember")).click();
		
		//submit
		driver.findElement(By.id("submit-id")).click();

		//pause:static wait:Thread.sleep()
		Thread.sleep(1500);
		
		//signOut
		driver.findElement(By.linkText("Sign Out")).click();
		
		//pause:static wait:Thread.sleep()
				Thread.sleep(1500);
				
			//close 
				
			driver.quit();
				
	}

}
