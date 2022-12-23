package com.test.ui.cases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.ui.base.ProjectSpecificMethods;
import com.test.ui.pages.EpayPage;


public class EpayTest extends ProjectSpecificMethods {
	@BeforeTest
	public String setData()
	{
		excelFileName="tc001-EpayTest";
		return excelFileName;
	}
		
			
	@Test(dataProvider ="testData")
		public void runLoginTest(String val) throws InterruptedException {
		
	  EpayPage pg =new EpayPage(driver);
	  pg.search(val).clickSearchButton().getPrice().selectFirstResult();
	  
	}
	
}
