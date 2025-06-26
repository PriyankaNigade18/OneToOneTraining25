package com.Window_Alert_Frame;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicWebTableHandling {
  @Test
  public void testDynamic() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  
	  System.out.println("***********Number of heading*******");
	  List<WebElement> allHeadings=driver.findElements(By.xpath("//table[@id='taskTable']//tr//th"));
	  System.out.println("Total Headings are: "+allHeadings.size());
	  
	  for(WebElement i:allHeadings)
	  {
		  System.out.println(i.getText());
	  }
	  
	  System.out.println("*****Number of rows*******");
	  int numberOfRows=driver.findElements(By.xpath("//table[@id='taskTable']//tr")).size();
	  System.out.println("Number of rows : "+numberOfRows);
	  
	  System.out.println("******Number of cells********");
	  
	  int numberOfCells=driver.findElements(By.xpath("//table[@id='taskTable']//tr[1]//td")).size();
	  System.out.println("Number of Columns : "+numberOfCells);
	  
	  
	  System.out.println("*********Specific column***********");
	  
	  int cellNumber=0;
	  for(WebElement heading:allHeadings)
	  {
		  cellNumber++;
		  if(heading.getText().contains("CPU"))
		  {
			  System.out.println("Expected Heading found at column: "+cellNumber);
			  List<WebElement> cellData=driver.findElements(By.xpath("//table[@id='taskTable']//tr//td["+cellNumber+"]"));
			  for(WebElement cell:cellData)
			  {
				  System.out.println(cell.getText());
			  }
			  
		  }
	  }
	  

	  System.out.println("**********Specific Row************");
	  
	  int cnumber=0;
	  int rcount=0;
	  for(WebElement heading:allHeadings)
	  {
		  cnumber++;
		  if(heading.getText().contains("Name"))
		  {
			  System.out.println("Name found at column number : "+cnumber);
			  List<WebElement> cellData=driver.findElements(By.xpath("//table[@id='taskTable']//tr//td["+cnumber+"]"));
			  for(WebElement i:cellData)
			  {
				  rcount++;
				  if(i.getText().contains("Chrome"))
				  {
					  System.out.println("Chrome browser found at row: "+rcount);
					 List<WebElement> rowData=driver.findElements(By.xpath("//table[@id='taskTable']//tr["+rcount+"]//td"));
					  for(WebElement j:rowData)
					  {
						  System.out.print(j.getText()+"  ");
					  }
				  }
			  }
			  
		  }
	  }
	  
	  System.out.println("***************************************");
	  
	  /*
	   * 
	   * CPU load of Chrome process: 3.4%

		Memory Size of Firefox process: 76.6 MB

		Network speed of Chrome process: 4.2 Mbps

		Disk space of Firefox process: 0.33 MB/s
	   */
	  
	  
	  
	  
	  int cellnumber=0;
	  int rowcount=0;
	  for(WebElement heading:allHeadings)
	  {
		  cellnumber++;
		  if(heading.getText().contains("Name"))
		  {
			  System.out.println("Name found at column number : "+cellnumber);
			  List<WebElement> cellData=driver.findElements(By.xpath("//table[@id='taskTable']//tr//td["+cellnumber+"]"));
			  for(WebElement i:cellData)
			  {
				  rowcount++;
				  if(i.getText().contains("Chrome"))
				  {	  
					  System.out.println("Chrome at row number : "+rowcount);
					  String tableCPULoad=driver.findElement(By.xpath("//table[@id='taskTable']//tr["+rowcount+"]//following-sibling::td[contains(text(),'%')]")).getText();
					  String actCpuLoad=driver.findElement(By.xpath("//strong[@class='chrome-cpu']")).getText();
					  
					  if(actCpuLoad.contains(tableCPULoad))
					  {
						  System.out.println("CPU load matched....."+tableCPULoad);
						  
					  }else
					  {
						  System.out.println("CPU Load is not mathced!");
					  }
				  }
				  
			  }
		  }
	  }
	  
	  
	  
  }
}
