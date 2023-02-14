package com.Selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Methods {
	public static void main(String[] args) {
		System.setProperty("WebDriver.Chrome.Driver",
				" C:\\Users\\Dell\\eclipse-workspace\\new\\Selenium_Automation\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//get method used to get the given url
	driver.get("https://www.facebook.com/");
	//manage method used to manage the window to maximize or minimize
	driver.manage().window().maximize();
	//find element method used to find the element in website
	WebElement findElement = driver.findElement(By.name("email"));
	//send keys method is used to send the text to website
	findElement.sendKeys("logan");
	//quit method is used quit the browser
	driver.quit();
	//close method is used to close the current window only
	//driver .close();
	
	
	
	
	
	
	
	}

}
