package com.JavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HowtoScrollThePage {
  @Test
  public void testScroll() throws InterruptedException 
  {
	  
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  
	  //type casting convert driver object into javascript executor
	  //JavascriptExecutor js=(JavascriptExecutor) driver;
	  
	  //((JavascriptExecutor)driver).executeScript("window.scrollTo(0,5000);");
	  
	  //scrollDown
	  
	  ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHeight);");
	  
	  
	  Thread.sleep(2000);
	  
	  //scroll up
	  
	  ((JavascriptExecutor)driver).executeScript("window.scrollTo(document.body.scrollHeight,0);");

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
