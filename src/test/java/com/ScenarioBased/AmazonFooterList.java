package com.ScenarioBased;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonFooterList {
  @Test
  public void testFooterList() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.amazon.in/");
	  
	  List<WebElement> allOptions=driver.findElements(By.xpath("//div[contains(@class,'navFooterLinkCol')]//ul//li"));
	  System.out.println("Total links are: "+allOptions.size());
	  
	  
	  for(WebElement i:allOptions)
	  {
		  System.out.println(i.getText());
	  }
  }
}
