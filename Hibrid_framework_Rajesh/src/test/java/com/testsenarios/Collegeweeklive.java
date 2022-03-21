package com.testsenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Collegeweeklive {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriver driver;
	  
	  WebDriverManager.chromedriver().setup();
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://collegeweeklive.com/go-signup/");
	  
	  Thread.sleep(8000);
	  
	  //Select dd=new Select(driver.findElement(By.name("attendeeType")));
	  //dd.selectByVisibleText("Student Looking for Graduate Degree");
	  
	  //Select ss= new Select(driver.findElement(By.id("country")));
	  //ss.selectByValue("US");
	  
	  //driver.findElement(By.id("questions[q_137]")).click();
	  
	  //driver.findElement(By.linkText("Privacy Policy")).click();
	  driver.findElement(By.id("submit")).click();
	  String errormsg =driver.findElement(By.id("firstNameError")).getText();
	  System.out.println(errormsg);
	
	  String errormsg1 =driver.findElement(By.id("lastNameError")).getText();
	  System.out.println(errormsg1);
	  
	  String errormsg2 =driver.findElement(By.id("emailAddressError")).getText();
	  System.out.println(errormsg2);
	  
	  String errormsg3 =driver.findElement(By.id("phoneNumberError")).getText();
	  System.out.println(errormsg3);
	  
	  String errormsg4 =driver.findElement(By.id("passwordError")).getText();
	  System.out.println(errormsg4);
	  
	  String errormsg5 =driver.findElement(By.id("ConfirmPasswordError")).getText();
	  System.out.println(errormsg5);
	  
	  String errormsg6 =driver.findElement(By.id("nationalityError")).getText();
	  System.out.println(errormsg6);
	  
	  String errormsg7 =driver.findElement(By.id("attendeeTypeError")).getText();
	  System.out.println(errormsg6);
	  
	  String errormsg8 =driver.findElement(By.id("nationalityError")).getText();
	  System.out.println(errormsg6);
	  
	  String errormsg9 =driver.findElement(By.id("questions_137Error")).getText();
	  System.out.println(errormsg6);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
