package tests;

import org.testng.annotations.Test;

import commonFunctions.ServiceCommon;
import servicenow.selenium.pages.Header;
import servicenow.selenium.pages.LoginPage;

public class TC002_EditProfile extends ServiceCommon{



	@Test
	public void login() {

		new LoginPage()
		.enterUserName("admin")
		.enterPassword("Oman@1989");
		//.clickLogin();
		
		new Header()
		.clickUserAccount()
		.clickProfile()
		.printTitle();


		/*
		 * LoginPage lp = new LoginPage(); lp.enterUserName("admin");
		 * lp.enterPassword("Pass123$"); lp.clickLogin();
		 */
	}

}
