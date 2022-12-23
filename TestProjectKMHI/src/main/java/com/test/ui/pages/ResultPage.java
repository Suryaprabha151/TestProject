package com.test.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.test.ui.base.ProjectSpecificMethods;

public class ResultPage extends ProjectSpecificMethods {

	public ResultPage(RemoteWebDriver receiveddriver)
	{
		this.driver=receiveddriver;
	}
	
	public DetailPage selectFirstResult() throws InterruptedException
	{   Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='s-item__title'])[2]")).click();
		return new DetailPage(driver);
	}
  public ResultPage getPrice() throws InterruptedException
  {
	  Thread.sleep(5000);
	  String text = driver.findElement(By.xpath("(//span[@class='s-item__price'])[2]")).getText();
	  System.out.println(text);
	  return this;
  }	
}
