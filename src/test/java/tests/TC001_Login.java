package tests;

import org.testng.annotations.Test;

import commonFunctions.ServiceCommon;
import servicenow.selenium.pages.LoginPage;

public class TC001_Login extends ServiceCommon{
	
	
	
	@Test
	public void login() {
		
		new LoginPage()
			.enterUserName("admin")
			.enterPassword("admin")
			.clickLogin();
		
		/*
		 * LoginPage lp = new LoginPage(); lp.enterUserName("admin");
		 * lp.enterPassword("Pass123$"); lp.clickLogin();
		 */
	}

}
