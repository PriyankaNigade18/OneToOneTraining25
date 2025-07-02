package com.Window_Alert_Frame;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class CalenarAutomationDemo2 {
  @Test
  public void testDatePicker()
  {
	  //create a driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  String expDate="6";
	  String expMonth="Apr";
	  String expYear="2025";
	  
	  //open calendar
	  driver.findElement(By.id("txtDate")).click();
	  
	  
	  //moth selection:dropdown
	  
	  WebElement month=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
	  Utility.selectBasedDropdown(month,expMonth);
	  
	  WebElement year=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	  Utility.selectBasedDropdown(year,expYear);
	  
	  //date selection
	  List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
	  
	  for(WebElement date:allDates)
	  {
		  if(date.getText().contains(expDate))
		  {
			  date.click();
			  break;
		  }
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
