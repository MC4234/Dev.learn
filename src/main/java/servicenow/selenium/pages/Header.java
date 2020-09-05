package servicenow.selenium.pages;

import commonFunctions.ServiceCommon;

public class Header extends ServiceCommon{

	public Header clickUserAccount(){
		driver.findElementById("user_info_dropdown").click();
		return this;
	}
	public ProfilePage clickProfile(){
		driver.findElementByLinkText("Profile").click();
		return new ProfilePage();	
	}

}
