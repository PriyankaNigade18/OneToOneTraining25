package com.Window_Alert_Frame;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTablePaginationTest {
  @Test
  public void testPegination() 
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  
	  //Number of webtable pages
	  List<WebElement> pages=driver.findElements(By.xpath("//ul[@id='pagination']//li//a"));
	  System.out.println("Number of pages are: "+pages.size());//4
	  
	    
	  //per page number of rows and columns
	  
	  int rows=0;
	  int cells=0;
	  int pcount=0;
	  int totalrows=0;
	  for(WebElement i:pages)
	  {
		  pcount++;
		  System.out.println("Page number is: "+pcount);
		  i.click();//click on page number
		  rows=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
		  cells=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr[1]//td")).size();
		  System.out.println("For page "+pcount+" Total rows are: "+rows);
		  System.out.println("For page "+pcount+" Total cells are: "+cells);
		  totalrows=totalrows+rows;
		  
		  
		  
	  }
	  
	  System.out.println("Total Rows Including all the pages: "+totalrows);
	 
	 
	  //from page number 3 check the Fitness Tracker
	  
	  String exp="Router";
	  int rnum=0;
	  for(WebElement p:pages)
	  {
		  String pgno=p.getText();
		  if(pgno.contains("3"))
		  {
			  p.click();
			  List<WebElement> names=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr//td[2]"));
			  for(WebElement n:names)
			  { rnum++;
				  if(n.getText().contains(exp))
				  {
					  System.out.println(exp+ " is available on row number : "+rnum);
					  driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+rnum+"]//td[4]//input")).click();
					  break;
				  }
			  }
			  break;
		  }
	  }
	  
	  System.out.println("*****Total page wise data*************");
	  	  
	  //print all data as per pages
	  
	  int pgcount=0;
	  for(WebElement p:pages)
	  {
		  pgcount++;
		  
		  p.click();
		  System.out.println("Page number : "+pgcount);
		  
		  List<WebElement> data=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr//td"));
		  for(WebElement d:data)
		  {
			  System.out.println(d.getText());
		  }
		  
		  
		  
	  }
	  
	  
	  
	  
	  }
}
