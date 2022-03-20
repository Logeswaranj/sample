package com.stepdeff;

import org.openqa.selenium.WebDriver;

import com.New.Add_Base;
import com.pomc.Initial;
import com.runner.Runner_file.runner;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdeff extends Add_Base {
	public static WebDriver driver = runner.driver;
	Initial ref = new Initial(driver);
	
	@Given("^open lik$")
	public void open_lik() throws Throwable {
		System.out.println(driver.getCurrentUrl());
	}

	@When("^click button$")
	public void click_button() throws Throwable {
		Thread.sleep(2000);
	    click(ref.getClick());
	}

}
