package com.Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

public class LocatorDemo11_RelativeLocator {
  @Test
  public void testRelativeLocator()
  {
	  
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://automationplayground.com/crm/login.html");
	  
	  //enter email which is above password
	  
	  WebElement emailEle=driver.findElement(RelativeLocator.with(By.id("email-id")).above(By.id("password")));
	  emailEle.sendKeys("test@gmail.com");
	  
	  //enter password which is below email
	  WebElement passEle=driver.findElement(RelativeLocator.with(By.id("password")).below(By.id("email-id")));
	  passEle.sendKeys("test123");
	  
	  //Check the checkbox which is near to remember me text
	  driver.findElement(RelativeLocator.with(By.id("remember")).near(By.xpath("//label[text()='Remember me']"))).click();
	  
	  
	  
	  
	  
  }
}
