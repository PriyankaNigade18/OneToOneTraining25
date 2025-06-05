package com.ScenarioBased;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class FreshworksFooterlinks {
  @Test
  public void testFooterlinks() 
  {
	  
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.freshworks.com/");
	  
	  //single list
	  List<WebElement> allOptions=driver.findElements(By.xpath("(//ul[contains(@class,'mLpDx')])[1]//li"));
	  
	  for(WebElement i:allOptions)
	  {
		  System.out.println(i.getText());
	  }
	  
	  
	  System.out.println("--------------------------");
	  
	  //get the all footers
	  
	 List<WebElement> allFooters=driver.findElements(By.xpath("//ul[contains(@class,'mLpDx')]//li"));
	  
	 System.out.println("Total footers are: "+allFooters.size());
	 
	 for(WebElement i:allFooters)
	 {
		 System.out.println(i.getText());
	 }
	  
	  
  }
}
