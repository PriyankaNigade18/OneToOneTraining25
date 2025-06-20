package com.Window_Alert_Frame;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleWindowExpantestingDemo {
  @Test
  public void testWindow() 
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://practice.expandtesting.com/windows");
	  //parent window
	  String parentId=driver.getWindowHandle();
	  System.out.println(parentId);
	  
	  
	  
	  driver.findElement(By.linkText("Click Here")).click();
	  
	  //next window
	  Set<String> allWindows=driver.getWindowHandles();
	  
	  for(String childId:allWindows)
	  {
		  if(!parentId.equals(childId))
		  {
			  driver.switchTo().window(childId);
			  String text=driver.findElement(By.tagName("h1")).getText();
			  System.out.println(text);
		  }
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
