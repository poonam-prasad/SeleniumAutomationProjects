package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A01ClickOnLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		System.out.println("URL before clicking link = "+driver.getCurrentUrl());
		driver.findElement(By.linkText("Gmail")).click();
		System.out.println("URL after clicking on Gmail link = "+driver.getCurrentUrl());
	}

}
