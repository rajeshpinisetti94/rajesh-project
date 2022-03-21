package com.testsenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fblogintestng {
	
	
	WebDriver driver;
	@Parameters("browsername")
	@BeforeClass
	public void browserlaunch(String browsername) { 
		if (browsername.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}	else if (browsername.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}else if (browsername.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver(); 
	}else {
			System.out.println("check browser");
	}	
			driver.manage().window().maximize();
					
	}
		
  @Test
  public void f() throws Exception {
	  
	  driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.id("email")).sendKeys("rajesh");
		//driver.findElement(By.name("pass")).sendKeys("123456");
		//driver.findElement(By.name("login")).click();
		//Thread.sleep(5000);
		//String email123 = driver.findElement(By.name("email")).getAttribute("aria-label");
		//System.out.println(email123);
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
