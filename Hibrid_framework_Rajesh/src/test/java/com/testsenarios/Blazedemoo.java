
	  package com.testsenarios;

	  import org.openqa.selenium.By;
	  import org.openqa.selenium.WebDriver;
	  import org.openqa.selenium.chrome.ChromeDriver;
	  import org.openqa.selenium.support.ui.Select;
	  import org.testng.annotations.Test;

	  import io.github.bonigarcia.wdm.WebDriverManager;

	  public class Blazedemoo {
	    @Test
	    public void f() throws Exception {
	  	  
	  	  WebDriver driver;
	  	  
	  	  WebDriverManager.chromedriver().setup();
	  	  driver=new ChromeDriver();
	  	  driver.manage().window().maximize();
	  	  
	  	  driver.get("https://blazedemo.com/");
	  	  Select depcity= new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
	  	  depcity.selectByVisibleText("Philadelphia");
	  	  Thread.sleep(2000);
	  	  Select discity = new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
	  	  discity.selectByValue("Rome");
	  	  
	  	 driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	  	 driver.findElement(By.xpath("(//input[@type='submit'])[5]")).click();
	  	 driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Rajesh");
	  	 driver.findElement(By.xpath("//input[@name='address']")).sendKeys("hyd");
	  	 driver.findElement(By.xpath("//input[@id='city']")).sendKeys("hyderabad");
	  	driver.findElement(By.xpath("//input[@id='state']")).sendKeys("telangana");
	  	driver.findElement(By.xpath("//input[@name='zipCode']")).sendKeys("123456");
	  	
	  	Select card= new Select(driver.findElement(By.xpath("//select[@id='cardType']")));
	  	card.selectByValue("dinersclub");
	  	
	  	driver.findElement(By.xpath("//input[@name='creditCardNumber']")).sendKeys("123456789456");
	  	driver.findElement(By.xpath("//input[@id='creditCardMonth']")).sendKeys("12");
	  	driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys("2025");
	  	driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("raj");
	  	driver.findElement(By.xpath("//input[@type='submit']")).click();
	  
	  	
	  	
	  	
	  	
	  	
	  	
	  			 
	  	 
	  
	  
	  
  }
}
