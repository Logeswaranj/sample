package com.pomc;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Initial {
	public static WebDriver driver;
	public Initial(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		
		
	}
	@FindBy(xpath = " (//a[@class=\"nav-a  \"])[1]")
	public static WebElement click;
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getClick() {
		return click;
	}
	
	

}
