package com.test.ui.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;


import com.test.ui.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	
	public LoginPage(RemoteWebDriver receiveddriver)
	{
		this.driver=receiveddriver;
	}
	
	public LoginPage typeEmail(String email)
	{
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);
		return this;
	}
	
	public PasswordPage clickNext_Positiveemail() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(3000);
		return new PasswordPage(driver);
	}
	

	
	
	

}
