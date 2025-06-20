package com.Window_Alert_Frame;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleWindowHandlingAutomationblog {
  @Test
  public void testMultipleWindow()
  {
	  
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  
	  driver.findElement(By.xpath("//button[@id='PopUp']")).click();
	  
	  Set<String> allWindows=driver.getWindowHandles();
	  System.out.println("Total open windows are: "+allWindows.size());
	  System.out.println(allWindows);
	  
	  //order
	  LinkedHashSet<String> ls=new LinkedHashSet<String>(allWindows);
	  System.out.println(ls);
	  
	  int count=0;
	  Iterator<String> ir=ls.iterator();
	  while(ir.hasNext())
	  {
		  driver.switchTo().window(ir.next());
		  count++;
		  if(count==2)
		  {
		  System.out.println("Current window session id: "+driver.getWindowHandle());
		  System.out.println(driver.getTitle());
		  System.out.println(driver.getCurrentUrl());
		  break;
		  }
	  }
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
