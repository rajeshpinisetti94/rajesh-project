package com.testsenarios;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.objectrepository.Locators;
import com.utilites.WrapperClass;

public class Studentregistrationn     extends WrapperClass {
  @Test
  public void f() {
	  
	  Locators abc= new Locators();
	  
	  Properties pro= new Properties();
	  
	  
	  chromedriverlaunch();
	  
	  driver.get("https://stqatools.com/demo/index.php");
	  
	  sendkeysbyanylocators(abc.Studentregistration_Studentname_editbox, pro.getProperty("Studentname"));
	  //driver.findElement(By.name("studentname")).sendKeys("Rajesh");
	  sendkeysbyanylocators(abc.Studentregistration_Fathername_editbox,pro.getProperty("Fathername"));
	  //driver.findElement(By.id("fathername")).sendKeys("Dddddd");
	  sendkeysbyanylocators(abc.Studentregistration_Postaladdress_editbox, pro.getProperty("Permenantadress"));
	  //driver.findElement(By.name("paddress")).sendKeys("abcd");
	  sendkeysbyanylocators(abc.Studentregistration_Personaladdress_editbox, pro.getProperty("Personaladress"));
	  //driver.findElement(By.id("personaladdress")).sendKeys("secfev");
	  
	  clickbyanylocators(abc.studentregistration_Gender_Radiobutton);
	  
	  // driver.findElement(By.name("city")).getCssValue("Goa");
	  // driver.findElement(By.name("Course")).getCssValue("B.Tech");
	 //driver.findElement(By.name("State")).getCssValue("Goa");

	  
	  sendkeysbyanylocators(abc.Studentregistration_Pincode_editbox, pro.getProperty("Pincode"));
	  //driver.findElement(By.name("pincode")).sendKeys("534260");
	  sendkeysbyanylocators(abc.Studentregistration_Mailid_editbox, pro.getProperty("Emailid"));
	  //driver.findElement(By.name("emailid")).sendKeys("venkatarajesh94@gmail.com"); 
	  
  }
}
