package com.Window_Alert_Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameHandlingDmeo2 {
  @Test
  public void testFrame() 
  {
	  WebDriver driver =new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://ui.vision/demo/webtest/frames/");
	  
	  //frame1
	  
	  WebElement f1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
	  driver.switchTo().frame(f1);
	  
	  driver.findElement(By.name("mytext1")).sendKeys("Frame1 hello");
	  
	  //come to main window
	  //Selects either the first frame on the page, or the main document when a page containsiframes. 
	  driver.switchTo().defaultContent();
	  
	  //frame2
	  WebElement f2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
	  
	  driver.switchTo().frame(f2);
	  
	  driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Frame2 Hello");
	  
	  
	  //frame3
	  //come to the main window
	  driver.switchTo().defaultContent();
	  
	  WebElement f3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
	  driver.switchTo().frame(f3);
	  
	  
	 WebElement ele3= driver.findElement(By.name("mytext3"));
	 ele3.sendKeys("Hello frame3");
	  
	  //nested frame
	  WebElement nestedf=driver.findElement(By.tagName("iframe"));
	  
	  driver.switchTo().frame(nestedf);
	  
	  //radio button
	  driver.findElement(By.id("i9")).click();
	  
	  //we are inside inner frame-->come to parent frame and clear the text and add new text
	  
	  driver.switchTo().parentFrame();//f3
	  
	  //clear the input box
	  ele3.clear();
	  
	  //text
	  ele3.sendKeys("Bye frame3");
	  
	  //frame 4
	  
	  //frame5
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
