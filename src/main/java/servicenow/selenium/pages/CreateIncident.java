package servicenow.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;

import commonFunctions.ServiceCommon;

public class CreateIncident  extends ServiceCommon {

	
	public CreateIncident clickNewButton ()
	{
		try {
			if (driver.findElements(By.xpath("//button[text()='New']")).size()==0){
				System.out.println("ELement found");
			     int size1 = driver.findElements(By.tagName("iframe")).size();
			     System.out.println(size1);
			     for(int iFrameCounter=0; iFrameCounter<=size1; iFrameCounter++){
			        driver.switchTo().frame(iFrameCounter);
			        if (driver.findElements(By.xpath("//button[text()='New']")).size()>0){
			            System.out.println("found the element in iframe:" + Integer.toString(iFrameCounter));
			            driver.findElementByXPath("//button[text()='New']").click();
			            System.out.println("NEW button pressed");
			            driver.switchTo().defaultContent();
			            // perform the actions on element here
			        }
			        
			        else
			        {
			        	System.out.println("Element not Found");
			        	driver.switchTo().defaultContent();
			        }
			      
			    }
			 }
			
		} catch (NoSuchFrameException e) {
			// TODO Auto-generated catch block
			System.out.println("Handled no frame exception");
		}
		//driver.findElementById("incident.short_description").sendKeys("Hello");
		return this;
	}
	
//	incident.short_description
	public CreateIncident enterDescription()
	{
		driver.switchTo().frame(0);
		driver.findElementById("incident.short_description").sendKeys("Hello");
		return this;
		
	}
	public CreateIncident clickSubmit()
	{
		driver.findElementByXPath("//button[text()='Submit']").click();
		System.out.println("----------------Incident is create-------------------------");
		return null;
		
	}
	
	
}




