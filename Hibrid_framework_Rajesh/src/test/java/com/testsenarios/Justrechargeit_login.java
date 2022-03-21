package com.testsenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.objectrepository.Locators;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Justrechargeit_login {

	public static void main(String[] args) {
		
		Locators loc =new Locators();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		
		driver.findElement(loc.Justrechargeit_login_Email_Editbox).sendKeys("rajesh@gmail.com");
		driver.findElement(loc.Justrechargeit_login_password_Editbox).sendKeys("aaaaaaa");
		driver.findElement(loc.Justrechargeit_login_entercaptcha_Editbox).sendKeys("12");
		driver.findElement(loc.Justrechargeit_login_securesignin_Button).click();
		
		
		
		

	}

}
