package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class HowToIdentifyElement {

	public static void main(String[] args)
	{
		// create a driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
			
		//strategy 3: Identify+action
		driver.findElement(By.id("APjFqb")).sendKeys("Cucumber");
		
		
		/*
		//strategy 2: Identify +validation+action
		WebElement searchEle=driver.findElement(By.id("APjFqb"));
		
		if(searchEle.isDisplayed() && searchEle.isEnabled())
		{
			//action
			searchEle.sendKeys("selenium");
		}*/
		
		
		
		
		
		/*
		//By locator strategy:address+Identify+validation+action(framework)
		
		//By is class in selenium used to get the address of element
		By searchBoxAddress=By.id("APjFqb");
		
		//Element identify-findElement()Method returns WebElement interface Object
		WebElement searchEle=driver.findElement(searchBoxAddress);
		
		//Element validation 
		System.out.println("Is Search box displayed?:"+searchEle.isDisplayed());
		System.out.println("Is searchbox is enabled?: "+searchEle.isEnabled());
		
		//Element action
		searchEle.sendKeys("Java",Keys.ENTER);
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
