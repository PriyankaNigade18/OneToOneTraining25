package com.Window_Alert_Frame;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertDemo2_AutomationBlog {
  @Test
  public void testAlerts() throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  //alert1:simple alert
	  driver.findElement(By.id("alertBtn")).click();
	  
	  //alert will open
	  Alert alt1=driver.switchTo().alert();
	  Thread.sleep(2000);
	  System.out.println("Alert text: "+alt1.getText());
	  //ok
	  alt1.accept();
	  
	  
	  //alert2:confirmation alert
	  driver.findElement(By.id("confirmBtn")).click();
	  //alert will open
	  Alert alt2=driver.switchTo().alert();
	  Thread.sleep(2000);
	  System.out.println("Alert text: "+alt2.getText());
	  //cancel
	  alt2.dismiss();
	  
	  //result
	  String resultText=driver.findElement(By.id("demo")).getText();
	  System.out.println(resultText);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
