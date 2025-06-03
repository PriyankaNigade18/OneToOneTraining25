package com.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LocatorDemo10_XpathAxies {
  @Test
  public void testAxies()
  {
	  
	  
	  //create a driver session
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://automationplayground.com/crm/customers.html?email-name=test%40gmail.com&password-name=scasd&submit-name=");
	  
	  
	  //get the parent tag for John
	  String parentTagName=driver.findElement(By.xpath("//td[text()='John']//parent::tr")).getTagName();
	  System.out.println("Parent tagname for John is: "+parentTagName);//tr
	  
	  System.out.println("--------------------");
	  
	  //get the ancestor tagname for John
	  String ancestorTagName=driver.findElement(By.xpath("//td[text()='John']//ancestor::tbody")).getTagName();
	  System.out.println("Ancestor tagname for John is: "+ancestorTagName);//tbody
	  System.out.println("--------------------");
	  
	  //get the all rows after john row
	  List<WebElement> allRows=driver.findElements(By.xpath("//td[text()='John']//following::tr"));
	  System.out.println("Total rows following John: "+allRows.size());//2
	  
	  for(WebElement i:allRows)
	  {
		  System.out.println(i.getText());
	  }
	  
	  System.out.println("--------------------");
	  
	  
	  //get the all child for row3
	  
	  List<WebElement> allChilds=driver.findElements(By.xpath("(//tbody//tr)[3]//child::td"));
	  System.out.println("Total child under row3: "+allChilds.size());//5
	  
	  for(WebElement i:allChilds)
	  {
		  System.out.println(i.getText());
	  }
	  
	  
	  System.out.println("--------------------");

	  //get the all previous rows form john 
	  List<WebElement> totalRows=driver.findElements(By.xpath("//td[text()='John']//preceding::tr"));
	  
	  //with heading
	  for(WebElement i:totalRows)
	  {
		  
		  System.out.println(i.getText());
	  }
	  System.out.println("--------------------");

	  //skip the heading and print data
	  
	  for(int i=1;i<totalRows.size();i++)
	  {
		  System.out.println(totalRows.get(i).getText());
	  }
	  System.out.println("--------------------");

	  //get the following siblings of John (td)
	  
	  int fsibling=driver.findElements(By.xpath("//td[text()='John']//following-sibling::td")).size();
	  System.out.println("For John Following siblings are : "+fsibling);
	  
	  System.out.println("--------------------");

	  int psibling=driver.findElements(By.xpath("//td[text()='John']//preceding-sibling::td")).size();
	  
	  System.out.println("For John Preceding siblings are : "+psibling);

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
