package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A01EchoTrackAssgn {

	public static void main(String[] args) {
	
		String expectedMsg="Invalid Username/Password";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		WebElement userName=driver.findElement(By.id("txtCustomerID"));
		userName.sendKeys("Sunil");
		//Webelement is an interface where we can store all controls
		//return type of findelement menthod is webelemnt
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys("sunil123");
		
		WebElement loginbutton=driver.findElement(By.id("Butsub"));
		loginbutton.click();
		
		WebElement error=driver.findElement(By.className("error"));
		String errorText=error.getText();
		
		System.out.println("Error message is "+errorText);
		
		if(expectedMsg.equals(errorText))
		{
			System.out.println("Test case is Passed");
		}
		else {
			System.out.println("Invalid error message");
		}
		driver.close();
	}

}
