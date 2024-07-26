package com.WebDriverDemos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D28HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		JavascriptExecutor js;
		Alert alt;
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://demoqa.com/alerts");
		
		driver.findElement(By.id("alertButton")).click();
		
		
		alt=driver.switchTo().alert();
		
		
		System.out.println(alt.getText());
	    alt.accept();
		
		
	    driver.findElement(By.id("timerAlertButton")).click();
	    Thread.sleep(5000);
	    driver.switchTo().alert();
	    System.out.println(alt.getText());
	    alt.accept();
	    
	    js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)","");
		
		//driver.close();
		


	}

}
