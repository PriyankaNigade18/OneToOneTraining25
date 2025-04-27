package com.WebTesting;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumInterfaceBasics {
  @Test
  public void testWithParent()
  {
	  //for selenium WebDriver interface SearchContext is parent interface
	  
	  //SearchContext driver=new ChromeDriver();
	//it provides two method
	  //findElement() findElements()
	  
	  WebDriver driver=new ChromeDriver();
	 
	  
  }
}
