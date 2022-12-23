package com.test.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.test.ui.base.ProjectSpecificMethods;

public class EpayPage extends ProjectSpecificMethods {
	
	public EpayPage(RemoteWebDriver receiveddriver)
	{
		this.driver=receiveddriver;
	}
	
	public EpayPage search(String value)
	{
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(value);
		return this;
	}
	
	public ResultPage clickSearchButton()
	{
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		return new ResultPage(driver);
	}
	

}
