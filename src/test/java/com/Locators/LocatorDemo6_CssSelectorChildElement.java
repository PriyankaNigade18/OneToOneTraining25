package com.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo6_CssSelectorChildElement {

	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		List<WebElement> allLinks=driver.findElements(By.cssSelector("div.list-group>a"));
		
		System.out.println("Total elements are: "+allLinks.size());
		
		//get the text of every element
		WebElement ele=null;
		
		for(WebElement i: allLinks)
		{
			System.out.println(i.getText());
			
			if(i.getText().contains("Register"))
			{
				ele=i;
//				i.click();
//				break;
			}
		}
		
		//click
		ele.click();
		
		
		
		
	
		
		
		
		
	}

}
