package com.testsenarios;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.objectrepository.Locators;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Justrechargeit_logintestng {
  @Test
  public void login() {
	  
	  Locators loc =new Locators();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		//how to read data from properties
		Properties pro= new Properties();
		//FileInputStream fis= new FileInputStream ("src/test/resources/Testdata/input.properties");
		//pro.load(fis);
		
		
		
		
		
		
		driver.findElement(loc.Justrechargeit_login_Email_Editbox).sendKeys("rajesh@gmail.com");
		driver.findElement(loc.Justrechargeit_login_password_Editbox).sendKeys("aaaaaaa");
		driver.findElement(loc.Justrechargeit_login_entercaptcha_Editbox).sendKeys("12");
		driver.findElement(loc.Justrechargeit_login_securesignin_Button).click();
		
		
		
		
	  
	  
  }
}
