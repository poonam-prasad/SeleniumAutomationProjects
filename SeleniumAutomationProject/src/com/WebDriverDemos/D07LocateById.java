package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D07LocateById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			
			driver.findElement(By.id("email")).sendKeys("poonamrocks01@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("Bobby@001");
			driver.findElement(By.id("u_0_5_Ux")).click();
	}

}
