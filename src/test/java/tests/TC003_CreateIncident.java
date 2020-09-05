package tests;

import org.testng.annotations.Test;

import commonFunctions.ServiceCommon;
import servicenow.selenium.pages.CreateIncident;
import servicenow.selenium.pages.DashBoard;
import servicenow.selenium.pages.Header;
import servicenow.selenium.pages.LoginPage;

public class TC003_CreateIncident extends ServiceCommon{
	
	
	
	
	@Test
	public void login() {

		new LoginPage()
		.enterUserName("admin")
		.enterPassword("admin")
		.clickLogin();
		
		new Header()
		.clickUserAccount()
		.clickProfile()
		.printTitle();

		new DashBoard()
		.enterOnSearch();
	

		
		new CreateIncident()
		.clickNewButton()
		.enterDescription()
		.clickSubmit();
		
	
		
		
		
		
}
	
}
