package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D10LocateByCssSelectorSpecialCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement userName=driver.findElement(By.cssSelector("input[data-testid='royal_email']"));
		userName.sendKeys("poonamprasad94@gmail.com");
		
		WebElement password= driver.findElement(By.cssSelector("input[data-testid='royal_pass']"));
		password.sendKeys("test123");
		
		driver.findElement(By.cssSelector("button[id^='u_0_5']")).click();
		System.out.println("Button clicked");

	}

}
