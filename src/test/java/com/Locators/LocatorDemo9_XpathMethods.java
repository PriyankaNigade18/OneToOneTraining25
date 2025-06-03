package com.Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LocatorDemo9_XpathMethods {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		//mobiles: xpath with text()
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		
		//get the text of menu
		List<WebElement> ele=driver.findElements(By.xpath("//div[@class='a-section a-spacing-none']"));
		
		for(WebElement i:ele)
		{
			System.out.println(i.getText());
		}
		
		
		System.out.println("*****************************");
		
		//capture all brands(checkboxex)
		List<WebElement> allBrands=driver.findElements(By.xpath("//ul[@aria-labelledby='p_123-title']//li"));
		
		for(WebElement i:allBrands)
		{
			System.out.println(i.getText());
		}
		
		System.out.println("*************Cart*******");
		
		driver.findElement(By.xpath("(//span[normalize-space()='Cart'])[2]")).click();
		
		//normalize-space
		//String text=driver.findElement(By.xpath("//h3[normalize-space()='Your Amazon Cart is empty']")).getText();
		
		//contains with normalize-space()
		String text=driver.findElement(By.xpath("//h3[contains(normalize-space(),'empty')]")).getText();
		System.out.println(text);
		
		
		//search for watch: contains
		driver.findElement(By.xpath("//input[contains(@id,'searcht')]")).sendKeys("watch",Keys.ENTER);

		Thread.sleep(2000);
		
		//clear text--search for bags
		WebElement searchbox=driver.findElement(By.xpath("//input[starts-with(@id,'two')]"));
		
		searchbox.clear();
		
		searchbox.sendKeys("bags",Keys.ENTER);
		
		
		
		
		
		
		
		
		
	}

}
