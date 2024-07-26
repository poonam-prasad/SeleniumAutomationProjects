package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D13LocateByPartialLinkText {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			
			WebElement advertisingLink=driver.findElement(By.partialLinkText("Adver"));
			System.out.println(advertisingLink.getText());
			advertisingLink.click();
			
	}

}
