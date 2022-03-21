package com.testsenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {
  @Test
  public void f() throws Exception {
	  
	  WebDriver driver;
	  
	  WebDriverManager.chromedriver().setup();
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://demoqa.com/alerts");
	  
	 driver.findElement(By.id("alertButton")).click();
	  
	  String alert= driver.switchTo().alert().getText();
	  System.out.println(alert);
	  
	 driver.switchTo().alert().accept();
	  
	  driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[2]")).click();
	  
	 Thread.sleep(15000);
	  
	 String alert2 = driver.switchTo().alert().getText();
	System.out.println(alert2);
	  
	Thread.sleep(10000);

	driver.switchTo().alert().accept();
	  
	  driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[3]")).click();
	  
	  Thread.sleep(5000);
	  
	  String alert3 = driver.switchTo().alert().getText();
	  System.out.println(alert3);
	  
	  Thread.sleep(5000);

	  driver.switchTo().alert().accept();
	  
	  driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[4]")).click();
	  
	  Thread.sleep(5000);
	  driver.switchTo().alert().sendKeys("Jhon");
	  
	  
	  String alert4 = driver.switchTo().alert().getText();
	  System.out.println(alert4);
	  
	  Thread.sleep(5000);
	   
	  driver.switchTo().alert().accept();
	    }
}
