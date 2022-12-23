package com.test.ui.cases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.test.ui.base.ProjectSpecificMethods;
import com.test.ui.pages.LoginPage;

public class LoginTest extends ProjectSpecificMethods{

	@BeforeTest
	public String setData()
	{
		excelFileName="tc001-LoginTest";
		return excelFileName;
	}
		
			
	@Test(dataProvider ="testData")
		public void runLoginTest(String email,String pwd) throws InterruptedException {
		
	  LoginPage pg =new LoginPage(driver);
	  pg.typeEmail(email).clickNext_Positiveemail().typePassword(pwd).clickNext_Positive().verifyUserProfileIcon();
	}
	
}
