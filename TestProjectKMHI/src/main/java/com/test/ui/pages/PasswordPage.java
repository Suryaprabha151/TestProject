package com.test.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.test.ui.base.ProjectSpecificMethods;

public class PasswordPage extends ProjectSpecificMethods{

	public PasswordPage(RemoteWebDriver receiveddriver)
	{
		this.driver=receiveddriver;
	}
	
	public PasswordPage typePassword(String pwd) throws InterruptedException
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
		return this;
	}
	
	public SuccessPage clickNext_Positive()
	{
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	return new SuccessPage(driver);
	}
	
	
}
