package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.CRM.TestCases.BaseClass;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By userEmail=By.xpath("//input[@type='email']");
	private By userPassword=By.id("password");
	private By submitButton=By.xpath("//button[@type='submit']");
	
	
	 public String doLogin(String email, String password)
	 {
		 driver.findElement(userEmail).sendKeys(email);
		 driver.findElement(userPassword).sendKeys(password);
		 driver.findElement(submitButton).click();
		 
		 return driver.getCurrentUrl();
		 
	 }
	
}
