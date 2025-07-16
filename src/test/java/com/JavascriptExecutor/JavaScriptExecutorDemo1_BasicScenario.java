package com.JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class JavaScriptExecutorDemo1_BasicScenario {
  @Test
  public void testInterface() throws InterruptedException
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  
	  
	//get the title
	  System.out.println(driver.getTitle());
	  
	  //using javascriptExecutor
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  String title=js.executeScript("return document.title").toString();
	  System.out.println(title);
	  
	  
	  //refresh the page
	  driver.navigate().refresh();
	  
	  System.out.println("------------------------------------");
	  
	  Thread.sleep(2000);
	  
	  //refresh the page using javascriptExecutor
	  js.executeScript("window.history.go()");
	  
	  //element interaction click()
	  WebElement ele=driver.findElement(By.linkText("Bestsellers"));
	  
	  js.executeScript("arguments[0].click();",ele);
	  
	  //send the data
	  WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
	  
	  js.executeScript("arguments[0].value='watch'",searchbox);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
