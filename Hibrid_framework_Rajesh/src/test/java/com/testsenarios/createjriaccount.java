package com.testsenarios;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.objectrepository.Locators;
import com.utilites.WrapperClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class createjriaccount extends WrapperClass  {
  @Test
  public void f() throws Exception {
	  
	  
	  Locators cde =new Locators();
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		Properties pro = new Properties();
		FileInputStream ff = new FileInputStream("./src/test/resources/Testdata/input.properties");
		pro.load(ff);
		
		driver.get(pro.getProperty("Jricreate_url"));
		
		sendkeysbyanylocators(cde.Justrechargeit_Createaccount_Signupname_Editbox, pro.getProperty("Signupname"));
		//driver.findElement(cde.Justrechargeit_Createaccount_Signupname_Editbox).sendKeys(pro.getProperty("Signupname"));
		
		sendkeysbyanylocators(cde.Justrechargeit_Createaccount_Mobilenumber_Editbox,pro.getProperty("Mobilenumber" ));
		//driver.findElement(cde.Justrechargeit_Createaccount_Mobilenumber_Editbox).sendKeys(pro.getProperty("Mobilenumber"));
		sendkeysbyanylocators(cde.Justrechargeit_Createaccount_Emailid_Editbox,pro.getProperty("Email"));
		//driver.findElement(cde.Justrechargeit_Createaccount_Emailid_Editbox).sendKeys(pro.getProperty("Email"));
		sendkeysbyanylocators(cde.Justrechargeit_Createaccount_Password_Editbox , pro.getProperty("Password1"));
		//driver.findElement(cde.Justrechargeit_Createaccount_Password_Editbox).sendKeys(pro.getProperty("Password1"));
		clickbyanylocators(cde.Justrechargeit_Createaccount_checkbox_checkbox);
		//driver.findElement(cde.Justrechargeit_Createaccount_checkbox_checkbox).click();	
		clickbyanylocators(cde.Justrechargeit_Createaccount_createaccount_Button);
		//driver.findElement(cde.Justrechargeit_Createaccount_createaccount_Button).click();
	
		
	  
	  
	  
	  
	  
	  
	  
  }
}
