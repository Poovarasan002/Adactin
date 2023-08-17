package com.adactin.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pom.Login_page;
import io.cucumber.java.en.Then;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.Runner;


public class Adactin {
	
	public static WebDriver driver = Runner.driver;
	
	

@Given("^user Launch The Adactin Application$")
public static void user_Launch_The_Adactin_Application() throws Throwable {
	
	driver.get("https://adactinhotelapp.com/");
}

@When("^user Enter The Username In Username Field$")


public static void user_Enter_The_Username_In_Username_Field() throws Throwable {
	
	WebElement uname = driver.findElement(By.name("username"));
	
	uname.sendKeys("poova123");
}

@When("^user Enter The Password In Password Field$")
public static void user_Enter_The_Password_In_Password_Field() throws Throwable {
	
	WebElement pass = driver.findElement(By.name("password"));
	pass.sendKeys("U42NVT");
}

@Then("^user Click The Login Button And It's Navigates To Serach Hotel Page$")
public static void user_Click_The_Login_Button_And_It_s_Navigates_To_Serach_Hotel_Page() throws Throwable {
   
	WebElement clc = driver.findElement(By.name("login"));
	clc.click();
}

@When("^user Select The Location In Location Field$")
public static void user_Select_The_Location_In_Location_Field() throws Throwable {
	
	WebElement loc = driver.findElement(By.name("location"));
	Select location = new Select (loc);
	location.selectByValue("London");
    
}

@When("^user Select The Hotel In Hotels Field$")
public static void user_Select_The_Hotel_In_Hotels_Field() throws Throwable {
	
	WebElement hot = driver.findElement(By.name("hotels"));
	Select hotel = new Select (hot);
	hotel.selectByValue("Hotel Creek");
    
}

@When("^user Select The Room_Type In Room_Type Field$")
public static void user_Select_The_Room_Type_In_Room_Type_Field() throws Throwable {

	WebElement type = driver.findElement(By.name("room_type"));
	Select room = new Select (type);
	room.selectByValue("Super Deluxe");
}

@When("^user Select The Number Of Rooms In Number Of Rooms Field$")
public static void user_Select_The_Number_Of_Rooms_In_Number_Of_Rooms_Field() throws Throwable {

	WebElement nos = driver.findElement(By.name("room_nos"));
	Select rooms = new Select (nos);
	rooms.selectByValue("10");
}

@When("^user Enter The Date In Check In Date Field$")
public static void user_Enter_The_Date_In_Check_In_Date_Field() throws Throwable {
	
	WebElement date_in = driver.findElement(By.name("datepick_in"));
	date_in.sendKeys("20/07/2023");
    
}

@When("^user Enter The Date In Check Out Date Field$")
public static void user_Enter_The_Date_In_Check_Out_Date_Field() throws Throwable {
	
	WebElement date_out = driver.findElement(By.name("datepick_out"));
	date_out.sendKeys("25/07/2023");
    
}

@When("^user Select The Adults Per Room In Adults Per Room Field$")
public static void user_Select_The_Adults_Per_Room_In_Adults_Per_Room_Field() throws Throwable {

	WebElement nos = driver.findElement(By.name("adult_room"));
	Select adult = new Select (nos);
	adult.selectByValue("4");
    
}

@When("^user Select The Children per Room in Children Per Room Field$")
public static void user_Select_The_Children_per_Room_in_Children_Per_Room_Field() throws Throwable {

	WebElement nos = driver.findElement(By.name("child_room"));
	Select child = new Select (nos);
	child.selectByValue("4");
   
}

@Then("^user Click The Search Button And It's Navigates to Select Hotel page$")
public static void user_Click_The_Search_Button_And_It_s_Navigates_to_Select_Hotel_page() throws Throwable {
	
	driver.findElement(By.name("Submit")).click();
    
}

@When("^user Click The Hotel$")
public static void user_Click_The_Hotel() throws Throwable {
	
	WebElement clc = driver.findElement(By.name("radiobutton_0"));
	clc.click();
    
}

@Then("^user Click The Continue Button And It's Navigates To Book A Hotel Page$")
public static void user_Click_The_Continue_Button_And_It_s_Navigates_To_Book_A_Hotel_Page() throws Throwable {
	
	driver.findElement(By.name("continue")).click();
    
}

@When("^user Enter The First Name In First Name Field$")
public static void user_Enter_The_First_Name_In_First_Name_Field() throws Throwable {
    
	driver.findElement(By.name("first_name")).sendKeys("Poovarasan");
	
}

@When("^user Enter The Last Name In Last Name Field$")
public static void user_Enter_The_Last_Name_In_Last_Name_Field() throws Throwable {
	
	driver.findElement(By.name("last_name")).sendKeys("M");
    
}

@When("^user Enter The Billing Address In Billing Address Field$")
public static void user_Enter_The_Billing_Address_In_Billing_Address_Field() throws Throwable {
	
	driver.findElement(By.name("address")).sendKeys("Arakkonam, Ranipet, Tamilnadu");
    
}

@When("^user Enter The Credit Card Number In Credit Card No Field$")
public static void user_Enter_The_Credit_Card_Number_In_Credit_Card_No_Field() throws Throwable {
    
	driver.findElement(By.name("cc_num")).sendKeys("1234567890098765");
	
}

@When("^user Select The Credit Card Type$")
public static void user_Select_The_Credit_Card_Type() throws Throwable {
	
	WebElement cardtype = driver.findElement(By.name("cc_type"));
	
	Select type = new Select(cardtype);
	type.selectByValue("VISA");
    
}

@When("^user Select The Month In Expiry Date Field$")
public static void user_Select_The_Month_In_Expiry_Date_Field() throws Throwable {
	
	WebElement expiry = driver.findElement(By.name("cc_exp_month"));
	Select month = new Select (expiry);
    month.selectByValue("12");
}

@When("^user Select The Year In Expiry Date Field$")
public static void user_Select_The_Year_In_Expiry_Date_Field() throws Throwable {
	
	WebElement expiry = driver.findElement(By.name("cc_exp_year"));
	Select year = new Select (expiry);
    year.selectByValue("2030");
    
}

@When("^user Enter The CVV Number In CVV Number Field$")
public static void user_Enter_The_CVV_Number_In_CVV_Number_Field() throws Throwable {
   
	driver.findElement(By.name("cc_cvv")).sendKeys("123");
	
}

@Then("^user Click The Book Now And It's Navigates To Booking Confirmation Page$")
public static void user_Click_The_Book_Now_And_It_s_Navigates_To_Booking_Confirmation_Page() throws Throwable {
	
	driver.findElement(By.name("book_now")).click();
    
}

@When("^User Click The Logout Button To Logout The Session$")
public static void user_Click_The_Logout_Button_To_Logout_The_Session() throws Throwable {
    
	driver.findElement(By.name("logout")).click();
	
}

}
