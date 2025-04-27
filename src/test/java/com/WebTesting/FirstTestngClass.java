package com.WebTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class FirstTestngClass 
{
  @Test
  public void testCase1()
  {
	  System.out.println("this is test case1");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  
	  
	  
	  
  }
  
  
}
