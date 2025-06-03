package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo8_Operator_Indexing {

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		//firstname: and operator
		driver.findElement(By.xpath("//input[@name='firstname' and @class='form-control']")).sendKeys("Shital");
		
		//lastname
		driver.findElement(By.xpath("//input[@placeholder='Last Name' and @class='form-control']")).sendKeys("Jadhav");
		
		//email: indexing
		driver.findElement(By.xpath("(//input[@class='form-control'])[3]")).sendKeys("shital123@gmail.com");
		
		//telephone:indexing
		driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys("776666");
		
		//password: position()
		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=5]")).sendKeys("test123");
		
		//confirm password
		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=6]")).sendKeys("test123");
		
		//by default status for no checkbox
		WebElement noRadioButton=driver.findElement(By.xpath("(//input[@name='newsletter'])[2]"));
		System.out.println("Current status of No radio button: "+noRadioButton.isSelected());
		
		//yes radio button
		WebElement yesRadioButton=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		System.out.println("Current status of yes radio button: "+yesRadioButton.isSelected());

		yesRadioButton.click();
		
		//checkbox
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		
		
		//continue button
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		//validate message
		String actMessage=driver.findElement(By.xpath("(//h1)[2]")).getText();
		
		String expMessage="Your Account Has Been Created!";
		
		if(actMessage.equals(expMessage))
		{
			System.out.println("Test Pass: "+actMessage);
		}
		else
		{
			System.out.println("Test Fail: "+actMessage);

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
