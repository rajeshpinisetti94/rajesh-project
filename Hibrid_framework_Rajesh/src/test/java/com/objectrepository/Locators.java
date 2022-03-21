package com.objectrepository;

import org.openqa.selenium.By;

public class Locators {

	public final By Justrechargeit_login_Email_Editbox= By.name("txtUserName");

	public final By Justrechargeit_login_password_Editbox =By.id("txtPasswd");
	
	public final By Justrechargeit_login_entercaptcha_Editbox = By.name("txtCaptcha");
	
	public final By Justrechargeit_login_securesignin_Button = By.id("imgbtnSignin"); 
	
			
	public final By Justrechargeit_Createaccount_Signupname_Editbox = By.id("signup_name");
	
	public final By Justrechargeit_Createaccount_Mobilenumber_Editbox = By.name("signup_mobileno");
	
	public final By Justrechargeit_Createaccount_Emailid_Editbox =  By.id("signup_email");
		
	public final By Justrechargeit_Createaccount_Password_Editbox = By.name("signup_password");
	
	public final By Justrechargeit_Createaccount_checkbox_checkbox = By.id("checkbox");
		
	public final By Justrechargeit_Createaccount_createaccount_Button = By.name("imgbtnSubmit");
	
	
	
	//studentregistration locators:
	public final By Studentregistration_Studentname_editbox = By.name("studentname");
	public final By Studentregistration_Fathername_editbox = By.id("fathername");
	public final By Studentregistration_Postaladdress_editbox = By.name("paddress");
	public final By Studentregistration_Personaladdress_editbox = By.id("personaladdress");
	public final By studentregistration_Gender_Radiobutton = By.name("sex");
	public final By Studentregistration_Pincode_editbox = By.name("pincode");
	public final By Studentregistration_Mailid_editbox = By.name("emailid");
	
}
