package com.Window_Alert_Frame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewWindowTabTest {
  @Test
  public void testNewWindowTab() 
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  System.out.println("Application title: "+driver.getTitle());
	  
	  
	  //In new tab facebook app
	  WebDriver newTab=driver.switchTo().newWindow(WindowType.TAB);
	  newTab.get("https://www.facebook.com");
	  System.out.println("Application Title: "+newTab.getTitle());
	  
	  for(int i=1;i<=10;i++)
	  {
	  WebDriver newWin=driver.switchTo().newWindow(WindowType.WINDOW);
	  newWin.get("https://www.amazon.in");
	  
	  }
	  
	  
	  
	  
  }
}
