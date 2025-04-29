package com.WebTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigationCommands {
  @Test
  public void Navigation() throws InterruptedException 
  {
	  
	  //create a driver session
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://www.google.com");
	  
	  //Navigation
	  
	  driver.navigate().to("https://www.facebook.com");
	  
	  //static wait:Thread.sleep(2000);//2sec=2000msec
	  Thread.sleep(2000);
	  
	  //back
	  driver.navigate().back();//google
	  Thread.sleep(2000);
	  
	  //forward
	  driver.navigate().forward();
	  Thread.sleep(2000);
	  
	  //refresh
	  driver.navigate().refresh();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
