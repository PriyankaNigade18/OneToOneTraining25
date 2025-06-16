package com.Window_Alert_Frame;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleWindowHandling {
  @Test
  public void testMultipleWindow() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  //parent window
	  String parentId=driver.getWindowHandle();
	  System.out.println(parentId);
	  
	  
	  //click on link
	  driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	  //new window-->child window
	  
	  Set<String> allWindows=driver.getWindowHandles();
	  System.out.println(allWindows);
	  
	  //child window
	  for(String childId:allWindows)
	  {
		  //driver has to switch when parent id is not equal with child id
		  if(!parentId.equals(childId))
		  {
			  //switch
			  driver.switchTo().window(childId);
			//email
			 driver.findElement(By.name("EmailHomePage")).sendKeys("test@gmail.com");
			  
			 //driver.close();
			 
			 //driver.quit();
		  }
	  }
	  
	  //parent window
	  driver.switchTo().window(parentId);
	  
	  driver.findElement(By.name("username")).sendKeys("Priyanka");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
