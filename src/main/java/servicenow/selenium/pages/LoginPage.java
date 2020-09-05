package servicenow.selenium.pages;

import org.openqa.selenium.By;

import commonFunctions.ServiceCommon;

public class LoginPage extends ServiceCommon{
	
	/*
	 * 1.Create separate classes for individual pages (class)
	 * 2. That class must be extend to the Common Class
	 */
	
	
	public LoginPage enterUserName(String username){
		driver.switchTo().frame(0);
		driver.findElement(By.id("user_name"))
		.sendKeys(username);
		return this;
	}
	
	public LoginPage enterPassword(String password){
		driver.findElement(By.id("user_password"))
		.sendKeys(password);
		return this;
		
	}
	
	public DashBoard clickLogin() {
		driver.findElementById("sysverb_login").click();
		return new DashBoard();
	}
	
	public void login() {
		// TODO
	}

}
