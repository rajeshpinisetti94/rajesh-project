package com.testsenarios;

import java.text.DateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Toyotaaa {
  @Test
  public void f() throws Exception {
	  
	  Date d= new Date();
	  DateFormat df = new SimpleDateFormat("yyyy_MM_dd");
	  
	  String dat= df.format(d);
	  System.out.println(dat);
	  
	  WebDriver driver;
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://forms.toyota.co.uk/brochure");
	  Thread.sleep(5000);
	  driver.findElement(By.partialLinkText("Yes, I agree")).click();
	  Thread.sleep(5000);
	  
	  driver.findElement(By.xpath("//li[@data-label='All New RAV4 Hybrid']")).click();
	  
	  Thread.sleep(5000);
	  //driver.findElement(By.linkText("Please select")).click();
	  
	  driver.findElement(By.cssSelector("a[role='button']")).click();
	  driver.findElement(By.linkText("Mr")).click();
	  
	  driver.findElement(By.name("firstname")).sendKeys("FRajesh");
	  
	  Thread.sleep(3000);
	  driver.findElement(By.name("surname")).sendKeys("mmmmmm");
	  Thread.sleep(5000);
	  driver.findElement(By.cssSelector("label[for='checkbox-user_consent']")).click();
	  
	  driver.findElement(By.id("submit-br")).click();
  }
}
