package com.dropdownAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class AmazonDropdownSelectBased {
  @Test
  public void testDropdown() throws InterruptedException 
  {
	  
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.amazon.in/");
	  
	  
	  //identify dropdown
	  WebElement dropdownEle=driver.findElement(By.id("searchDropdownBox"));
	  
	  Utility.selectBasedDropdown(dropdownEle,"Amazon Fashion");
	  
	  
	  
	  /*
	  //create object of Select class
	  Select dd=new Select(dropdownEle);
	  
	  System.out.println("Is dropdown support multiple selection: "+dd.isMultiple());
	  
	  //single selection
	  
	  dd.selectByIndex(3);//Amazon Fashion
	  
	  Thread.sleep(2000);
	  
	  dd.selectByVisibleText("Jewellery");
	  
	  Thread.sleep(2000);
	  
	  dd.selectByValue("search-alias=toys");
	  
	  //get the all option-getOptions()
	  
	  List<WebElement> allOptions=dd.getOptions();
	  System.out.println("Total options are: "+allOptions.size());
	  
	  WebElement ele=null;
	  
	  for(WebElement i:allOptions)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("Baby"))
		  {
			  ele=i;
		  }
	  }
	  
	  //select element
	  ele.click();
	  
	  
	  
	  */
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
  
}
