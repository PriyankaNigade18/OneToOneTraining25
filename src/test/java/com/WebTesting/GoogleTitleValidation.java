package com.WebTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleTitleValidation {
  @Test
  public void testBrowserCommands() 
  {
	  //test Google title should be Google
	  
	  //create a driver session
	  WebDriver driver=new ChromeDriver();
	  
	  //open application
	  driver.get("https://www.google.com/");
	  
	  //get the title and store actual title
	  String actTitle=driver.getTitle();
	  System.out.println("Title is : "+actTitle);
	  
	  String expTitle="GoogleApp";
	  
	  //validate title
	  if(actTitle.equals(expTitle))
	  {
		  System.out.println("Test Pass...");
	  }else
	  {
		  System.out.println("Test Fail....");
	  }
	  
  }
}
