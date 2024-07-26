package com.WebDriverDemos;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D26HandlingTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://money.rediff.com/index.html");
		driver.findElement(By.partialLinkText("More")).click();
		
		List<WebElement> headers=driver.findElements(By.tagName("th"));
		
		for(WebElement headerText:headers)
		{
			System.out.println(headerText.getText());
		}
		
		List<WebElement> totalRows=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		System.out.println(totalRows.size());
		
		System.out.println(totalRows.get(4).getText());
		
		Random randomNumber=new Random();
		//int n=randomNumber.nextInt(11);
		int n=randomNumber.nextInt(totalRows.size());
		System.out.println(totalRows.get(n).getText());
		

		System.out.println(driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[" + (n+1) + "]")).getText());
		
	}

}
