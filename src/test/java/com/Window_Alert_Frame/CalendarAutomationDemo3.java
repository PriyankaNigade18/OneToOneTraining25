package com.Window_Alert_Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CalendarAutomationDemo3 {
  @Test
  public void testDatePicker3()
  {
	  
	//create a driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  
	  //for range-->open calendar
	 
	  driver.findElement(By.cssSelector("#start-date")).sendKeys("04-07-2025");
	  driver.findElement(By.cssSelector("#end-date")).sendKeys("04-08-2025");
	  
	  driver.findElement(By.className("submit-btn")).click();
	  
	  
	  
  }
}
