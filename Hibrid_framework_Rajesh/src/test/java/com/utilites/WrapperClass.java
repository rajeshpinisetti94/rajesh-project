package com.utilites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WrapperClass extends BaseClass {
	
	public void chromedriverlaunch() {
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	

	public void sendkeysbyanylocators(By locators, String inputData) {
		
	if (driver.findElement(locators).isDisplayed()) {
		
		if (driver.findElement(locators).isEnabled()) {
			
			driver.findElement(locators).clear();
			driver.findElement(locators).sendKeys(inputData);
		} else {
			System.out.println("element is not enbaled please check it");
		}	
		} else {
			System.out.println("element is not displayed please check it");	
			
		}
	}
		
		


	public void clickbyanylocators(By locators) {
		
	if (driver.findElement(locators).isDisplayed()) {
		
		if (driver.findElement(locators).isEnabled()) {
			
			
			driver.findElement(locators).click();
		} else {
			System.out.println("element is not enbaled please check it");
		}	
		} else {
			System.out.println("element is not displayed please check it");	
			
		}}}
