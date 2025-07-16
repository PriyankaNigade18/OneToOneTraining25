package com.dropdownAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RedbusDropdownAutomation {
  @Test
  public void testDropdown() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.redbus.in/");
	  
	  
	  //click on from
	  driver.findElement(By.xpath("//div[text()='From']")).click();
	  
	  
	  driver.findElement(By.id("srcDest")).sendKeys("pune");
	  
	  List<WebElement> allOptions=driver.findElements(By.xpath("//div[contains(@class,'searchCategory')]//div[contains(@class,'listHeader')]"));
	  
	  for(WebElement i:allOptions)
	  {
		  System.out.println(i.getText());
	  }
	  
	  
	  
	  
  }
}
