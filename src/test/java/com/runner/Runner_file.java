package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.New.Add_Base;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class Runner_file {

	@CucumberOptions(features = " C:\\Users\\Dell\\eclipse-workspace\\new\\src\\test\\java\\com\\feature\\new.feature"
			, glue = "com.stepdeff"
			//,monochrome = true
			//dryRun = true
			)
	@RunWith(Cucumber.class)

	public static class runner{
public static WebDriver driver;
		

		@BeforeClass
		public static void launch() throws Throwable {
			
			
			driver = Add_Base.launchbrowser("chrome");
			driver.get("https://www.amazon.in/");
		}

		@AfterClass
		public static void close() {
			driver.close();
		}

	}

}
