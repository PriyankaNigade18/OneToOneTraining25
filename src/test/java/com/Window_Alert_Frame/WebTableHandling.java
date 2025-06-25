package com.Window_Alert_Frame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableHandling {
  @Test
  public void staticTableAutomation() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  System.out.println("**************Number of Rows*************");

	  //total rows
	  int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr")).size();
	  System.out.println("Total rows are: "+rows);//7
	  
	  System.out.println("**************Number of Columns**************");
	  //total columns(row-->cell)
	  List<WebElement> allHeadings=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr[1]//th"));
	  	System.out.println("Total Columns are: "+allHeadings.size());
	  System.out.println("**************Number of Number of Heading**************");
 
	  //print heading
	  for(WebElement heading:allHeadings)
	  {
		  System.out.println(heading.getText());
	  }
  }
}
