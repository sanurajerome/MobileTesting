package Tests;


import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import io.appium.java_client.AppiumDriver;

public class testingWeldingRobot {
	
	public static AppiumDriver enterdetails(AppiumDriver driver) throws IOException, InterruptedException {
		

		
		// Click first dropdown
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.Spinner[1]")).click();
		
		Thread.sleep(5000);
		
		// select the machine 
		
		List<WebElement> drpmachine = driver.findElements(By.className("android.widget.CheckedTextView"));
		
		drpmachine.get(1).click();
		
		Thread.sleep(5000);
		
		// Click on part name
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.Spinner[2]")).click();
		
		Thread.sleep(5000);
		
		
		
		// select the part name
		
		List<WebElement> partname = driver.findElements(By.className("android.widget.CheckedTextView"));
		
		partname.get(1).click();
		
		Thread.sleep(2000);
		
		// enter the number
		
		driver.findElement(By.className("android.widget.EditText")).sendKeys("5");
		
		Thread.sleep(2000);
		// add details
		// click on save
		
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"SAVE\"]/android.widget.TextView")).click();
		
		Thread.sleep(1000);
		
		Boolean t1;
		
		//String result = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[5]")).getAttribute("text"); 
		
		t1 = driver.getPageSource().contains("Saved");
		
		if(t1==true) {
	    	
	    	if(t1==true) {
		    	Reporter.log("Value Saved");
		    	
		    }
		    
		    else {
		    	
		    	Reporter.log("Value not saved");
		    }
			
	    	
	    }
	    	
	  
	    
		
	/*	try {
			  
			  
		    
			t1 = driver.getPageSource().contains("Saved");

	
			System.out.println("Item saved");



		} catch (Exception exp) {



			t1=false;
			System.out.println("Item could not be saved");
		
		}
		*/
		
		for(int i=2;i<4;i++) {
			
		try {	
			
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.Spinner[2]")).click();
			
		Thread.sleep(5000);
		
		List<WebElement> partname1 = driver.findElements(By.className("android.widget.CheckedTextView"));
		
		partname1.get(1).click();
					

		
		Thread.sleep(2000);
		
		// enter the number
		
		driver.findElement(By.className("android.widget.EditText")).sendKeys("5");
		
		Thread.sleep(2000);
		
		// click on save
		
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"SAVE\"]/android.widget.TextView")).click();
		
		Thread.sleep(500);
		
		Boolean t2=false;

		t2 = driver.getPageSource().contains("Saved");
		
	    if(t2==true) {
	    	
	    	if(t2==true) {
		    	Reporter.log("Value Saved");
		    	
		    }
		    
		    else {
		    	
		    	Reporter.log("Value not saved");
		    }
			
	    	
	    }
	    
	    Thread.sleep(2000);
		}
		
		catch(Exception exp) {
			
			System.out.println("Cause is:"+ exp.getCause());
			System.out.println("Message is :" + exp.getMessage());
			exp.printStackTrace();
			
		}
			
			
		}
		
		
		
		
		return driver;
	}
	

}