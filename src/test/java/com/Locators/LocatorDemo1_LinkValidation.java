package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo1_LinkValidation {

	public static void main(String[] args)
	{

		//create driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");
		
		//validation: store the element then validate
		WebElement signInLink=driver.findElement(By.linkText("Sign In"));
		
		if(signInLink.isDisplayed())
		{
			signInLink.click();
		}
		
		
		//linkText()
		//driver.findElement(By.linkText("Sign In")).click();

		//partialLinkText()
		//driver.findElement(By.partialLinkText("In")).click();
		
	}

}
