package com.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class D11WriteToExcelPoonam {
	
	File file;
	FileOutputStream fos;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
	  
	 file=new File("D:\\Poonam_JavaDemos\\SeleniumAutomationProject\\MyFirst.");
  }

  @AfterTest
  public void afterTest() {
  }

}
