package servicenow.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;

import commonFunctions.ServiceCommon;

public class DashBoard extends ServiceCommon{
	
	public void enterOnSearch() {
		
		driver.findElementById("087800c1c0a80164004e32c8a64a97c9").click();
		
	}
	

}
