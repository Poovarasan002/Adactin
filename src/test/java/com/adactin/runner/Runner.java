package com.adactin.runner;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(
		features = "src//test//java//com//adactinn//feature",
		glue = "com.adactin.stepdefinition",
		
		monochrome = true,
		dryRun = false,
		plugin = {"pretty"}
		)

public class Runner {
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp(){
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	
	@AfterClass
	public static void tearDown() {
		driver.close();
	}
}
