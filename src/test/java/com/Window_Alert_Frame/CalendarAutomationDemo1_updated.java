package com.Window_Alert_Frame;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CalendarAutomationDemo1_updated 
{
	public int getMonthNumber(String monthName) {
		    String[] months = {"January", "February", "March", "April", "May", "June",
		                       "July", "August", "September", "October", "November", "December"};
		    for (int i = 0; i < months.length; i++)
		    {
		        if (months[i].equalsIgnoreCase(monthName))
		        {
		            return i;
		        }
		    }
		    return -1; // Invalid month
		}

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
		   String currentMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		    String currentYearStr = driver.findElement(By.className("ui-datepicker-year")).getText();

		    int currentYear = Integer.parseInt(currentYearStr);
		    int currentMonthNum = getMonthNumber(currentMonth);
		    int expectedMonthNum = getMonthNumber(expmonth);

		    if (currentYear == expyear && currentMonthNum == expectedMonthNum) {
		        break;
		    }

		    if (expyear > currentYear || (expyear == currentYear && expectedMonthNum > currentMonthNum)) {
		        // Move forward
		        driver.findElement(By.xpath("//span[contains(@class,'ui-icon-circle-triangle-e')]")).click();
		    } else {
		        // Move backward
		        driver.findElement(By.xpath("//span[contains(@class,'ui-icon-circle-triangle-w')]")).click();
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
