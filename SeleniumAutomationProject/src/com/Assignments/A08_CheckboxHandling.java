package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A08_CheckboxHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://echoecho.com/htmlforms11.htm");
		
		
		WebElement dropList=driver.findElement(By.name("mydropdown"));
		Select milkProducts=new Select(dropList);
		System.out.println(milkProducts.getFirstSelectedOption().getText());
		//milkProducts.selectByVisibleText("Old Cheese");
		milkProducts.selectByIndex(2);
		milkProducts.selectByValue("Cheese");
	}

}
