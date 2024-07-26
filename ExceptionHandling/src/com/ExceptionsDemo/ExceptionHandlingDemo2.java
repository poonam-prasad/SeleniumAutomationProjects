package com.ExceptionsDemo;

public class ExceptionHandlingDemo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		showMessage();

	}
	
	public static void showMessage() throws InterruptedException
	{
		System.out.println("Test method started");
		Thread.sleep(5000);
		System.out.println("Test method ended");
	}

}
