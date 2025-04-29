package com.WebTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestBrowserCommands {
  @Test
  public void testBrowsercommands() 
  {//ctrl+Shift+O
	  
	  //create a driver session
	  WebDriver driver=new ChromeDriver();
	  
	  //open application: get(url)
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  //getTitle():String
	  System.out.println("Title is: "+driver.getTitle());
	  
	  //current url app-getCurrentUrl()
	  System.out.println("Current url is: "+driver.getCurrentUrl());
	  
	  //getPageSource(): it get the source code of the page
	  
	  System.out.println(driver.getPageSource());
	  
	  //close the browser close() quit()
	  //driver.close();
	  driver.quit();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
