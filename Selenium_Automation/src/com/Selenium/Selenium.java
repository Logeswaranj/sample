package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.Driver",
				" C:\\Users\\Dell\\eclipse-workspace\\new\\Selenium_Automation\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	//driver.manage().window().minimize();
	String title = driver.getTitle();
	System.out.println(title);
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	Thread.sleep(300);
	String pageSource = driver.getPageSource();
	System.out.println(pageSource);
	driver.close();
	
	
	
	}

}
