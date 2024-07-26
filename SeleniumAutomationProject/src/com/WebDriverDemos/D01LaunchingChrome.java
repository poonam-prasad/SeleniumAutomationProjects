package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class D01LaunchingChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/"); //Absolute url
		String title=driver.getTitle();
		System.out.println("Title is "+title);
		System.out.println(driver.getCurrentUrl());
		String url=driver.getCurrentUrl();
		
		if(url.contains("dev"))
		{
			System.out.println("Correct page");
		}
		
		if(title.equals("Selenium"))
		{
			System.out.println("Title matching,Test case Passed");
		}
		
		else
		{
			System.out.println("Test case Failed, Title not matching");
		}
		//driver.close();
		
		
		/*WebDriver driver1=new FirefoxDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.google.com/"); //Absolute url
		
		WebDriver driver2=new EdgeDriver();
		driver2.manage().window().maximize();
		driver2.get("https://www.google.com/");*/
		
	}

}
