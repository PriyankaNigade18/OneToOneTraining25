package com.Window_Alert_Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthenticationWindowAutomation {
  @Test
  public void testAuthenticationpopup() 
  {
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	  
	  String exp="Congratulations! You must have the proper credentials.";
	  
	  String act=driver.findElement(By.tagName("p")).getText();
	  Assert.assertEquals(act,exp);
	  System.out.println("Test pass...");
	  
	  
  }
}
