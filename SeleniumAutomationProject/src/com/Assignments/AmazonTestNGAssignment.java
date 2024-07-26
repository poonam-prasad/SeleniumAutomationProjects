package com.Assignments;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class AmazonTestNGAssignment {
	
	WebDriver driver;
	
	@BeforeTest
	  public void beforeTest() {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Before Test");
	  }
	
	 @AfterTest
	  public void afterTest() {
		 driver.close();
		 System.out.println("After Test");
	  }
	 
	 @BeforeMethod
		public void beforeMethod()
		{
			
			driver.get("https://www.amazon.in/");
			System.out.println(driver.getTitle());
			System.out.println("Before Method");
		}
		
	 @Test(priority = 1)
  public void sell() {
		 driver.findElement(By.linkText("Sell")).click();
		 System.out.println("Test 1 executed");
		 
  }
	 
	 @Test(priority = 2)
	  public void bestSellers() {
			 driver.findElement(By.partialLinkText("Best")).click();	
			 System.out.println("Test 2 executed");
	  }
	 
		
	 @Test(priority = 3)
	  public void mobiles() {
			 driver.findElement(By.linkText("Mobiles")).click();
			 System.out.println("Test 3 executed");
			 
	  }
		
	 @Test(priority = 4)
	  public void electronics() {
			 driver.findElement(By.partialLinkText("Electronics")).click();
			 System.out.println("Test 4 executed");
			 
	  }
		

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println(driver.getTitle());
	  System.out.println("After Method");
  }
  
  

  
}
 