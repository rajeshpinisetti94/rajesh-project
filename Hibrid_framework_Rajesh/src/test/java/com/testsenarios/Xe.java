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
	  
	  String mon = driver.findElement(By.xpath("//span[@class='amount-input__NumberInput-sc-1gq6pic-1 amount-input__GhostSpan-sc-1gq6pic-2 eIuRdk eQVLHh']")).getText();
	  System.out.println(mon);
	  String ste = driver.findElement(By.xpath("//h2[@class='heading__Heading1-n07sti-0 heading__Heading2-n07sti-1 iXbZUl']")).getText();
	  System.out.println(ste);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
