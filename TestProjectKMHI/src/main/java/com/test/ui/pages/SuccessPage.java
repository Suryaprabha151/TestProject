package com.test.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.test.ui.base.ProjectSpecificMethods;

public class SuccessPage extends ProjectSpecificMethods {

	public SuccessPage(RemoteWebDriver receiveddriver)
	{
		this.driver=receiveddriver;
	}
	
	public SuccessPage verifyUserProfileIcon()
	{
		
		boolean displayed = driver.findElement(By.xpath("//div[@class='gb_b gb_ld gb_qg gb_l gb_Ff']")).isDisplayed();
		
		System.out.println(displayed);
		
		return this;
	}
	
	
	
	
	
}
