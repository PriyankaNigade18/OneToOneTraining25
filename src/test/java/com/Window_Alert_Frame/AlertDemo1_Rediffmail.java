package com.Window_Alert_Frame;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertDemo1_Rediffmail {
  @Test
  public void testAlert() throws InterruptedException 
  
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi/");
	  //rediffid
	  driver.findElement(By.id("login1")).sendKeys("priyanka");
	  
	  //button
	  driver.findElement(By.name("proceed")).click();
	  
	  //UnhandledAlertException
	  //alert will open: Alert interface in sleenium
	  
	  Alert alt1=driver.switchTo().alert();
	  
	  Thread.sleep(2000);
	  System.out.println("Alert text is: "+alt1.getText());
	  
	  //ok
	  alt1.accept();
	  
	   
	  //password
	  driver.findElement(By.id("password")).sendKeys("test123");
	  
	  
  }
}
