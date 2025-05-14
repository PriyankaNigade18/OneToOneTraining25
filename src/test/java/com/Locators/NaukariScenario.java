package com.Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukariScenario {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.naukri.com/companies-hiring-in-india?src=gnbCompanies_homepage_srch");
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		
		System.out.println("Total links are: "+allLinks.size());
		
		String expLink="https://www.naukri.com/jobs-in-pune";
		
		for(WebElement i:allLinks)
		{
			System.out.println(i.getText());
			System.out.println(i.getDomAttribute("href"));
			
			try {
			if(i.getDomAttribute("href").contains(expLink))
			{
				
			System.out.println("Link found!Test Pass");
			break;
			}
			}catch(NullPointerException n)
			{
				System.out.println("Href is null");
			}
		}
		
		
		
		
		
		

	}

}
