package com.test.ui.base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcelData;

public class ProjectSpecificMethods {
	
	public String excelFileName;
	public String leadID;
   
	public RemoteWebDriver driver;	
	@Parameters({"url","browserName"})
	@BeforeMethod
	public void beforeTest(String URL, String browser)
	{
		
		if(browser.equals("Chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();		
		driver.get(URL);
		
		}
		else if(browser.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();	
			driver.get(URL);
			
		}
		
		else
		{
			System.out.println("Please select Chrome or Edge Browser");
		}
		System.out.println("Driver from ProjectSpecificMethod "+driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	

	@AfterMethod
	public void afterTest()
	{
		driver.close();
	}
	
	@DataProvider(name="testData",indices=0)
	public String[][] sendData() throws IOException
	{
		String[][] data = ReadExcelData.getData(excelFileName);
		
		return data;
				
				
	}
	

}
