package com.Window_Alert_Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameHandlingDemoQa {
  @Test
  public void testFrame()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://demoqa.com/frames");
	  
	  
	  //frame1 interaction using id/name
	  //driver.switchTo().frame("frame1");
	  
	  //frame1 interaction using index=3
	  //driver.switchTo().frame(3);
	  
	  //frame1 interaction using webelement
	  WebElement f1=driver.findElement(By.id("frame1"));
	  
	  driver.switchTo().frame(f1);
	  
	  String fmsgf1=driver.findElement(By.id("sampleHeading")).getText();
	  System.out.println(fmsgf1);
	  
	  
	  
  }
  
}
