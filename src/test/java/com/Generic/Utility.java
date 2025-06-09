package com.Generic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility 
{
	
	
	//reusable method
	
	public static WebElement getElementById(WebDriver driver,String loc)
	{
		return driver.findElement(By.id(loc));
	}
	
	public static void selectBasedDropdown(WebElement ddele,String expvalue)
	{
		Select sc=new Select(ddele);
		  
		  System.out.println("Is dropdown support multipleSelections?: "+sc.isMultiple());
		  
		  //to get all option
		  List<WebElement> allOptions=sc.getOptions();
		  System.out.println("Total options are: "+allOptions.size());
		  
		  
		  for(WebElement i:allOptions)
		  {
			  System.out.println(i.getText());
			  if(i.getText().contains(expvalue))
			  {
				  i.click();
				  break;
			  }
			  
		  }
		  
	}
	

}
