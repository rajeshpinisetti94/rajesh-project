package com.testsenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.objectrepository.Locators;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Justrechargeit_createaccount {

	public static void main(String[] args) {
		
		
		Locators cde =new Locators();
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.justrechargeit.com/SignUp.aspx");
		driver.findElement(cde.Justrechargeit_Createaccount_Signupname_Editbox).sendKeys("Rajesh");
		driver.findElement(cde.Justrechargeit_Createaccount_Mobilenumber_Editbox).sendKeys("9676474959");
		driver.findElement(cde.Justrechargeit_Createaccount_Emailid_Editbox).sendKeys("venkatarajesh94@gmail.com");
		driver.findElement(cde.Justrechargeit_Createaccount_Password_Editbox).sendKeys("474959");
		driver.findElement(cde.Justrechargeit_Createaccount_checkbox_checkbox).click();
		driver.findElement(cde.Justrechargeit_Createaccount_createaccount_Button).click();
		

	}

}
