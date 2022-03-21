package com.testsenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fblogin {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); 
		
		
		
		driver.manage().window().maximize();
		
		
		
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.id("email")).sendKeys("rajesh");
		//driver.findElement(By.name("pass")).sendKeys("123456");
		//driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		String email123 = driver.findElement(By.name("email")).getAttribute("aria-label");
		System.out.println(email123);
		
	
				
	}

}
