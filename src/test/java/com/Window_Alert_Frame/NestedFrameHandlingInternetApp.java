package com.Window_Alert_Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NestedFrameHandlingInternetApp {
  @Test
  public void testNestedFrame()
  {
	  
	  WebDriver driver=new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://the-internet.herokuapp.com/nested_frames");
	  
	  int total=driver.findElements(By.xpath("//frameset//frame")).size();
	  System.out.println("Total frames are: "+total);//2	  
	  //top--->left,middle,right /Bottom
	  //top
//	  driver.switchTo().frame(0);
//	  
//	  //left
//	  driver.switchTo().frame("frame-left");
	  
	  driver.switchTo().frame(0).switchTo().frame("frame-left");
	  System.out.println(driver.getPageSource());
	  
	  //left to middle come outside to main frame
	  driver.switchTo().defaultContent();
	  
	  
	  driver.switchTo().frame(0).switchTo().frame("frame-middle");
	  System.out.println(driver.getPageSource());
	  
	  //middle---> bottom
	  
	  driver.switchTo().defaultContent();
	  
	  
	  driver.switchTo().frame("frame-bottom");
	  System.out.println(driver.getPageSource());
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
