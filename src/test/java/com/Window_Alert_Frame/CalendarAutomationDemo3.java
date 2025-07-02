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
	 // driver.findElement(By.xpath("//input[@id='start-date']")).click();
	  //driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[1]/div[1]/div/div/div/div/div[2]/div[8]/input[1]")).click();
	  
	  //driver.findElement(By.xpath("//input[@placeholder='Start Date']")).click();
	  driver.findElement(By.cssSelector("#start-date")).click();
	  
	  
  }
}
