package com.ScenarioBased;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutomateGoogleSearch {
  @Test
  public void testGoogleSearchList()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.google.com/");
	  
	  
	  //search for keyword
	  driver.findElement(By.id("APjFqb")).sendKeys("Java");
	   
	  List<WebElement> allList=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
	  
	  System.out.println("Total Options are: "+allList.size());
	  
	  for(WebElement i:allList)
	  {
		  System.out.println(i.getText());
	  }
	  
  }
}
