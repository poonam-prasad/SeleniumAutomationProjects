package com.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D06DataDrivenTesting {
	
	WebDriver driver;
  
	@Test(dataProvider = "getLoginData")
  public void loginToHRM(String un, String ps) {
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(ps);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	  System.out.println(un+" - "+ps);
  }
  @BeforeMethod
  public void beforeMethod() {
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  if(driver.getCurrentUrl().contains("dash"))
	  {
		  driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i"));
		  	driver.findElement(By.partialLinkText("Log")).click(); 
	  }
	  
	  else
	  {
		  System.out.println(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")).getText());
	  }
	  
  }


  @DataProvider
  public Object[][] getLoginData() {
    return new Object[][] {
      new Object[] { "Poonam", "Test@123"},
      new Object[] { "Admin", "admin123" },
      new Object[] { "Test2", "Test@123" },
    };
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	
	  	
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
