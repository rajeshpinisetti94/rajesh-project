package com.testsenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fbcreateaccount_hyperlink {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
	//driver.findElement(By.id("email")).sendKeys("bvgyvfxgvsh");
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(5000);
		Select am=new Select(driver.findElement(By.id("day")));
		am.selectByVisibleText("1");
		Select aa = new Select(driver.findElement(By.id("month")));
		aa.selectByVisibleText("Feb");
		Select abc= new Select(driver.findElement(By.name("birthday_year")));
		abc.selectByVisibleText("2017");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
