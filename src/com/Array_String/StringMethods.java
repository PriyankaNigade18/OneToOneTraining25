package com.Array_String;

public class StringMethods {

	public static void main(String[] args)
	{
		//length()
		
		String s1="Hello AllA";
		System.out.println("Length of string is: "+s1.length());//9
		
		//conversion toUpperCase()  toLowerCase()
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		//get the character from index- charAt(index)
		System.out.println("Character at index 6: "+s1.charAt(6));//A
		
		//get the index of character- indexOf(char): first occurrence
		System.out.println("index of A: "+s1.indexOf('A'));//6
		
		//get the index of second occurrence of A
		System.out.println("Second Occurrence A index is: "+s1.indexOf('A',7));//9
		
		//Equality between string equals() and  equalsIgnoreCase():data
		
		String act="Selenium WebDriver is webui automation library";
		String exp="Selenium WebDriver is webui automation library";
		
		System.out.println(act.equals(exp));//true
		System.out.println(act.equalsIgnoreCase(exp));//true
		
		exp="Selenium WebDriver is WEBUI automation library";
		
		System.out.println(act.equals(exp));//false
		System.out.println(act.equalsIgnoreCase(exp));//true
		
		exp="Selenium WebDriver is webui automation library/tool";
		System.out.println(act.equals(exp));//false
		System.out.println(act.equalsIgnoreCase(exp));//false
		
		
		//search specific word from string contains():Partial match
		System.out.println("Check String have tool?: "+exp.contains("tool"));//true
		System.out.println("Check string have testng?: "+exp.contains("testng"));//false
		
		//startsWith(prefix value)
		System.out.println("Exp string starts with Selenium?: "+exp.startsWith("Selenium"));//true
		System.out.println("Exp string starts with Sel?: "+exp.startsWith("Sel"));//true
		System.out.println("Exp string starts with S?: "+exp.startsWith("S"));//true
		System.out.println("Exp string starts with nium?: "+exp.startsWith("nium"));//false

		//endsWith(suffix value)
		System.out.println("Exp string ends with tool?: "+exp.endsWith("tool"));//true
		System.out.println("Exp string ends with tool?: "+exp.endsWith("l"));//true
		System.out.println("Exp string ends with tool?: "+exp.endsWith("to"));//false
		System.out.println("Exp string ends with tool?: "+exp.endsWith("library"));//false

		//concat():merge + concat()
		String s2="Hello";
		String s3="All";
		System.out.println(s2.concat(" "+s3));
		System.out.println(s2+" "+s3);

		//trim(): ignore white space before and after the string
		String s4="      Welcome All        ";
		System.out.println(s4);
		System.out.println(s4.trim());
		
		//substring()
		String unit="TestNg is unit testing framework";
		System.out.println(unit);
		System.out.println("Substring from index 10:"+ unit.substring(10));
		
		System.out.println(unit.substring(10,22));//endindex-1
		
		//replace
		System.out.println(unit);
		System.out.println(unit.replace('i','*'));
		System.out.println(unit.replace("TestNg","JUnit"));
		
		
		//isBlank():Returns true if the string is empty or contains only white space  
		//isEmpty():Returns true if, and only if, length() is 0.
		String s5="";//no space
		System.out.println("Is string is empty?: "+s5.isEmpty());//true
		System.out.println("Is string is blank?: "+s5.isBlank());//true
		
		s5=" ";//space
		System.out.println("Is string is empty?: "+s5.isEmpty());//false
		System.out.println("Is string is blank?: "+s5.isBlank());//true
		
		
		//toCharArray():It convert string to array
		String s6="Hello";
		char arr[]=s6.toCharArray();
		for(char i:arr)
		{
			System.out.println(i);
		}
		
		//split("regular expression"): pattern
		
		String tools="Selenium Appium Postman Jmeter Jira Cypress Playwright";
		System.out.println(tools);
		
		String toolData[]=tools.split(" ");
		//cypress
		System.out.println(toolData[5]);
		System.out.println("***************");
		for(String i:toolData)
		{
			System.out.println(i);
		}
		
		
		//example
		String bill="Total Amount is 7000";
		/*
		 * compare actual amount should be less that 10000
		 */
		String data=bill.split(" ")[3];//"7000"
		//string --->int =-amount
		int amount=Integer.parseInt(data);
		
		if(amount<10000)
		{
			System.out.println("Test pass...");
		}else
		{
			System.out.println("Test Fail....");
		}
		
		
		String date="Apr 2025";
		String month=date.split(" ")[0];
		String year=date.split(" ")[1];
		
		System.out.println("Month is : "+month);
		System.out.println("Year is : "+year);
		
		
		/*
		 * String class immutable
		 * 
		 * mutable | new keyword
		 * StringBuffered class
		 * StringBuilder class 
		 */
		
		/*
		 * How to reverse string using method:reverse()
		 * 
		 * How to reverse string without method: String class
		 */
		StringBuilder br=new StringBuilder("Hello All");
		System.out.println(br.reverse());
		
		//string class
		String ss1="Java Selenium";
		String res="";
		
		for(int i=ss1.length()-1;i>=0;i--)
		{
			res=res+ss1.charAt(i);
		}
		
		System.out.println(res);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
