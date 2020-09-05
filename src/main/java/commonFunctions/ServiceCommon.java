package commonFunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.ReadData;

public class ServiceCommon {
	
	public String excelname;

	protected static RemoteWebDriver driver;
//	@Parameters({"url"})
	@BeforeMethod
	public void startApp() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		Options manage = driver.manage();
		Window window = manage.window();
		window.maximize();
		
		
		/*
		 * driver .manage() .window() .maximize();
		 */
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://dev83870.service-now.com/navpage.do");
	}
	
	@AfterMethod
	public void closeApp() {
		//driver.quit();
		System.out.println("insideAfterMethod");
	}
	
	
	@DataProvider(name = "login", indices = 0)
	public String[][] testData() {
		ReadData rd = new ReadData();
		return rd.getData(excelname);
	}
	
}
