package com.Window_Alert_Frame;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RedbusDatePicker {
  @Test
  public void testDatePicker() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.goibibo.com/flights");
	  driver.manage().window().maximize();
	  
	 //close the popup
	  
	  driver.findElement(By.xpath("//span[contains(@class,'icClose')]")).click();
	  
	  //open calendar
	  driver.findElement(By.xpath("(//span[contains(@class,'fswDownArrow')])[1]")).click();
	  
	    
	  //expectations
	  
	  String expDate="6";
	  String expMonth="April";
	  String expYear="2026";
	  
	  	  
	  //month
	  while(true)
	  {
		  String text=driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();
		  //System.out.println(text);//July 2025
		  String currMonth=text.split(" ")[0];
		  
		  String currYear=text.split(" ")[1];
		  
		  //System.out.println(currMonth+" : "+currYear);
		  if(currMonth.contains(expMonth) && currYear.contains(expYear))
		  {
		  		  break;
		  }
		  else
		  {
			  //click  on arrow
			  driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		  }
	  }
	  
	  
	  //date
	  
	  List<WebElement> allDates=driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[1]//div[contains(@class,'DayPicker-Day')]"));
	  
	  for(WebElement i:allDates)
	  {
		  if(i.getText().contains(expDate))
		  {
			  i.click();
			  break;
		  }
	  }
	  
	  
	  
  }
}
