package com.selenium.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGClass {
	@BeforeClass
	public void launchApplication() {
	  System.out.println("Application is launched");
	}
	@AfterClass
	public void closeApplication() {
	  System.out.println("Application is Closed");
	}
	@Test(priority = 1)
	public void userLogin() {
	System.out.println("Login with User Name or User ID");
	}
	@Test(priority = 2)
	public void navigateToAddProfile() {
	System.out.println("Selected Photo is Successfully added in Profile");
	}
	@Test(priority = 3)
	public void navigateToSentBox() {
	System.out.println("Sent Messages are Displayed in the Chat Box");
	}
	@Test(priority = 4)
	public void navigateToInBox() {
	System.out.println("Recevied Messages are Displayed in the In Box ");
	}
	@Test(priority = 5)
	public void navigateToLogOut() {
	System.out.println("Successfully LogOut ");
	}
	
}
