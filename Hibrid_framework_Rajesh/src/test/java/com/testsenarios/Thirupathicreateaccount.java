package com.testsenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Thirupathicreateaccount {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriver driver;
	  
	  WebDriverManager.chromedriver().setup();
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://tirupatibalaji.ap.gov.in/");
	  
	  Thread.sleep(3000);
	  driver.findElement(By.linkText("Sign Up")).click();
	  
	  Thread.sleep(3000);
	  driver.findElement(By.name("fName")).sendKeys("Rajesh");
	  driver.findElement(By.name("lName")).sendKeys("pini");
	  driver.findElement(By.id("indiMobile")).sendKeys("9676474959");
	  driver.findElement(By.name("address1")).sendKeys("sfsg");
	  driver.findElement(By.name("address2")).sendKeys("sfsaag");
	  driver.findElement(By.name("cityS")).sendKeys("HYd");
	  Select aj= new Select(driver.findElement(By.name("countryS")));
	  aj.selectByVisibleText("India");
	  Select ap= new Select(driver.findElement(By.name("stateS")));
	  ap.selectByVisibleText("Andhra Pradesh");
	 
	  driver.findElement(By.id("regi_continue")).click();
	  
	  
	  
	  
	  
	  
  }
}
