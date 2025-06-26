package com.Window_Alert_Frame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StaticWebTableHandling 
{
	
	public static void getRowData(WebDriver driver,int count)
	{
		System.out.println("Row number is: "+count);
		List<WebElement> row=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr["+count+"]//td")); 
	 	  
		  for(WebElement i:row)
		  {
			  System.out.print(i.getText()+" ");
		  }
	}
	
	
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
	  
	  
	  System.out.println("**************Specific Row**************");

	  List<WebElement> row=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr[5]//td")); 
	 	  
	  for(WebElement i:row)
	  {
		  System.out.print(i.getText()+" ");
	  }
	  
	  System.out.println("****************************");
	  getRowData(driver,2);
	  
	  System.out.println("**************Specific cell**************");
	  List<WebElement> cells=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//td[2]"));
	  
	  String exp="Mukesh";
	  
	  for(WebElement i:cells)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains(exp))
		  {
			  System.out.println("Author Found....!");
			  
		  }
	  }
	  
	  
	  System.out.println("**************************");
	  List<WebElement> priceAll=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//td[4]"));
	  
	  int total=0;
	  for(WebElement i:priceAll)
	  {
		  String data=i.getText();
		  //string to int
		  int price=Integer.parseInt(data);
		  total=total+price;
	  }
	  
	  System.out.println("Total Books price is: "+total);
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
