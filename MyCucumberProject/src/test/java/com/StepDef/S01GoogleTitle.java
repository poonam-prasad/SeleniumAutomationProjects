package com.StepDef;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S01GoogleTitle {
	
	WebDriver driver;
	
	@Given("Open Google")
	public void open_google() {
	    System.out.println("Opening Google");
	}

	@When("I read title of the page")
	public void i_read_title_of_the_page() {
	   System.out.println("Reading Title");
	}

	@Then("Title should be Google")
	public void title_should_be_google() {
	   System.out.println("Title is Google");
	}

}
