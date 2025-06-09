package com.dropdownAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class FacebookDropdownAutomation {
  @Test
  public void testDropdown()
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.facebook.com/");
	  
	  
	  //create an account page
	  driver.findElement(By.linkText("Create new account")).click();
	  
	  //identify dropdown
	 // WebElement dayele=driver.findElement(By.id("day"));
	  
	  WebElement dayele=Utility.getElementById(driver,"day");
	  Utility.selectBasedDropdown(dayele,"2");
	  	    
	  WebElement monthele=Utility.getElementById(driver,"month");
	  Utility.selectBasedDropdown(monthele,"Sep");
	  
	  WebElement yearele=Utility.getElementById(driver,"year");
	  Utility.selectBasedDropdown(yearele,"1984");
	  
	  
	  
	  
//	  Select sc=new Select(dayele);
//	  
//	  System.out.println("Is dropdown support multipleSelections?: "+sc.isMultiple());
//	  
//	  //to get all option
//	  List<WebElement> allOptions=sc.getOptions();
//	  System.out.println("Total options are: "+allOptions.size());
//	  
//	  WebElement ele=null;
//	  for(WebElement i:allOptions)
//	  {
//		  System.out.println(i.getText());
//		  if(i.getText().contains("27"))
//		  {
//			  ele=i;
//		  }
//		  
//	  }
//	  
//	  //select some option
//	  ele.click();
//	  
//	  
	  //month
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
