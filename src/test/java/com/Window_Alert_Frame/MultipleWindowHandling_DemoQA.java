package com.Window_Alert_Frame;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class MultipleWindowHandling_DemoQA {
  @Test
  public void testMultipleWindow()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://demoqa.com/browser-windows");
	  driver.manage().window().maximize();
	  
	  //parent window
	  String parentId=driver.getWindowHandle();	  
	  System.out.println(parentId);
	  
	  
	  Utility.scrollDown(driver);
	  
	  driver.findElement(By.id("messageWindowButton")).click();
	  
	  Set<String> allWindows=driver.getWindowHandles();
	  
	  for(String i:allWindows)
	  {
		  if(!parentId.equals(i))
		  {
			  driver.switchTo().window(i);
			  //String text=driver.findElement(By.xpath("//body")).getText();
			  //System.out.println(text);
			  
		  }
	  }
	  
	  
	 /* 
	  /*
	   * Scenario: open all child window and automate one by one
	   
	  
	  List<WebElement> allButtons=driver.findElements(By.xpath("//div[@id='browserWindows']//div//button"));
	  System.out.println("Total child windows: "+allButtons.size());
	  
	  for(WebElement i:allButtons)
	  {
		  i.click();
		  driver.switchTo().window(parentId);
		  Utility.scrollDown(driver);
		  
	  }
	  
	  //get all session ids for all window
	  Set<String> allWindows=driver.getWindowHandles();
	  System.out.println(allWindows);
	  
	  for(String childWindow:allWindows)
	  {
		  
		  if(!parentId.equals(childWindow))
		  {
			  driver.switchTo().window(childWindow);
			  String text=driver.findElement(By.xpath("//body")).getText();
			  System.out.println(text);
		  }
		  
		  
	  }
		  
	  
	  */
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  /* this is for single child window
	  //newtab
	  driver.findElement(By.id("tabButton")).click();
	  //child window
	  Set<String> allWindows=driver.getWindowHandles();
	  System.out.println(allWindows);
	  
	  for(String childId:allWindows)
	  {
		
		  if(!parentId.equals(childId))
		  {
			  driver.switchTo().window(childId);
			  String text=driver.findElement(By.id("sampleHeading")).getText();
			  System.out.println("New tab heading: "+text);
		  }
	  }
	  
	  */
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
