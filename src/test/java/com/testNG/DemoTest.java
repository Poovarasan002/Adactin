package com.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DemoTest {
	
	
	@BeforeClass
	public static void browserSetup() {
		System.out.println("Bowser setup successfully");
	}
	@BeforeTest
	public static void browserLaunch() {
		System.out.println("BroserLaunch");
	}
	
	@BeforeClass
	public static void url() {
		System.out.println("Application Launch");
	}
	
	@BeforeMethod
	public static void SignIn() {
		System.out.println("User successfully sign In");
	}
	@Ignore
	@Test
	public static void roomBooking() {
		System.out.println("Successfully booked the room");

	}
	@Test
	public static void ignore() {
		System.out.println("ignore this method");

	}
	
	@AfterMethod
	public static void logout() {
		System.out.println("User logout from the application");
	}
	
	@AfterClass
	public static void quit() {
		System.out.println("Quit the browser");

	}
	@AfterSuite
	
	public static void close() {
		System.out.println("Close the browser");

	}
	
	

}
