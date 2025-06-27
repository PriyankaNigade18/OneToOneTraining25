package com.Window_Alert_Frame;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CalendarAutomationDemo1 {
  @Test
  public void testDatePicker() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  //open calendar
	   driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	  
	  
	   //expection
	   String expdate="6";
	   String expmonth="April";
	   int expyear=2026;
	   
	   
	   //month selection
	   while(true)
	   {
		   //current month
		   String cmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		   String cyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		   //System.out.println(cmonth+" : "+cyear);
		   int currentyear=Integer.parseInt(cyear);
		   if(cmonth.contains(expmonth) && currentyear==expyear)
		   {
		   		   break;//when we found month
		   }else
		   {
			   //click on arrow
			   if(expyear>currentyear)
			   {
			   driver.findElement(By.xpath("//span[contains(@class,'circle-triangle-e')]")).click();
			   }else
			   {
				driver.findElement(By.xpath("//span[contains(@class,'circle-triangle-w')]")).click();

			   }
		   }
	   }
	   //date selection
	   List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td"));
	   for(WebElement i:allDates)
	   {
		   if(i.getText().contains(expdate))
		   {
			   i.click();
			   break;
		   }
	   }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
