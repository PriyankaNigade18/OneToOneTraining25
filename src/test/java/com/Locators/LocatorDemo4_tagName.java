package com.Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LocatorDemo4_tagName {

	public static void main(String[] args)
	{
		//create driver session
		WebDriver driver=new ChromeDriver();
		
		//global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//open
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				
		
		//single element
		//driver.findElement(By.name("username####")).sendKeys("Admin");
		
		//number of input boxes
		List<WebElement> inputBoxes=driver.findElements(By.tagName("input"));
		System.out.println("Total input boxes are: "+inputBoxes.size());//3
		
		//number of images
		int images=driver.findElements(By.tagName("img")).size();
		System.out.println("Number of images are: "+images);//3

		//number of links
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("Total links are: "+allLinks.size());//5
		
		/*
		 * get the value for href attribute and get the text of link
		 * 
		 */
		
		for(WebElement i:allLinks)
		{
			System.out.println(i.getDomAttribute("href"));
			System.out.println(i.getText());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
