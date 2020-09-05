package servicenow.selenium.pages;

import commonFunctions.ServiceCommon;

public class ProfilePage extends ServiceCommon {

	public void printTitle() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(driver.getTitle());
	}

}
