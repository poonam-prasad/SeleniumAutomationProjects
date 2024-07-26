package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A04RegistrationForm {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");
		
		driver.findElement(By.id("firstname")).sendKeys("Poonam");
		driver.findElement(By.id("lastname")).sendKeys("Prasad");
		driver.findElement(By.id("username")).sendKeys("poonam001");
		driver.findElement(By.id("password")).sendKeys("poonam@001");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		System.out.println("Registration successful!!");
		
		
	}

}
