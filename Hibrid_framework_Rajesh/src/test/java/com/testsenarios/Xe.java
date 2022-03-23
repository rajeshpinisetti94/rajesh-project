package com.testsenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xe {
  @Test
  public void f() {
	  
	  WebDriver driver;
	  
	  WebDriverManager.chromedriver().setup();
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.xe.com/");
	  
	  //String mon = driver.findElement(By.xpath("//span[normalize-space()='$']")).getAttribute();
	  
	 // System.out.println(mon);
	  String ste = driver.findElement(By.xpath("//h2[normalize-space()='How to transfer money in 3 easy steps']")).getText();
	  System.out.println(ste);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
