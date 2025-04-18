package com.OOP.Encapsulation;

public class LoginPageTest {

	public static void main(String[] args) 
	{
			LoginPage user1=new LoginPage();
			user1.setUsername("Shital");
			user1.setPassword("shital@123");
			user1.onButtonClickDoLogin(user1.getUsername(),user1.getPassword());

			System.out.println("********************");

			LoginPage user2=new LoginPage();
			user2.setUsername("Priyanka");
			user2.setPassword("test123");
			user2.onButtonClickDoLogin(user2.getUsername(),user2.getPassword());
	
			
	}

}
