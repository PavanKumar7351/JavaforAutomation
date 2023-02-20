package com.selenium.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGMethods {
	
	
	@BeforeMethod
	public void launchApplication() {
	  System.out.println("Application is Successfully launched");
	}
	@AfterMethod
	public void closeApplication() {
	  System.out.println("Application is Successfully Closed");
	}
	
	@Test(priority = 1)
	public void navigateToRegister() {
	System.out.println("Register User Name and User ID");
	}
	@Test(priority = 2)
	public void navigateToSearchBar() {
	System.out.println("Search the Product in the Search Bar");
	}
	@Test(priority = 3)
	public void navigateToAddToCart() {
	System.out.println("Product is Successfully Added in the cart ");
	}
	@Test(priority = 4)
	public void navigateToPayments() {
	System.out.println("Select the Payment Method");
	System.out.println("Payment is Successfully Completed");
	}
	@Test(priority = 5)
	public void navigateToAddress() {
	System.out.println("Address Details is Successfully Added");
	}
	@Test(priority = 6)
	public void productDelivery() {
	System.out.println("Product is Successfully Delivered ");
	}
	@Test(priority = 7)
	public void navigateToLogOut() {
	System.out.println("Successfully LogOut ");
	}
}
