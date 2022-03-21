package com.testsenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jricurrenturl {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver;
	  
	  WebDriverManager.chromedriver().setup();	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	 // driver.get("https://www.justrechargeit.com/SignIn.aspx");
	  //String title= driver.getTitle();
	  //System.out.println(title);
	  //String url=driver.getCurrentUrl();
	  //System.out.println(url);
	  
	  driver.get("https://www.justrechargeit.com/");
	  Thread.sleep(3000);
	  driver.findElement(By.linkText("Create New Account")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.id("imgbtnSubmit")).click();
	  Thread.sleep(2000);
	  String named= driver.findElement(By.id("nameTD")).getText();
	  Thread.sleep(2000);
	  System.out.println(named);
	  driver.navigate().refresh();
	  Thread.sleep(2000);
	  driver.navigate().forward();
	  Thread.sleep(2000);
	  driver.navigate().back();
	  
	  
	  
	  
	  
	  
  }
}
