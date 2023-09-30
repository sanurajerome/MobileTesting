package Main;



import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Tests.testingWeldingRobot;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SourceClass {
	
	static AppiumDriver driver;
	
	
	@BeforeTest
	public void setup() {
		
		try {
			
		DesiredCapabilities caps = new DesiredCapabilities();
			
	
		
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
		caps.setCapability(CapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 7 Pro API 30");
		//
		caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "6000");
		//caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\dajay\\eclipse-workspace\\MobileTestingProject\\src\\test\\resources\\apps\\MachineHealth.apk");
		//caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		
		caps.setCapability("appPackage","com.machinehealth.app" );
		caps.setCapability("appActivity","com.machinehealth.app.MainActivity" );
		
		@SuppressWarnings("deprecation")
		URL url= new URL("http://127.0.0.1:4723");
		
		driver= new AppiumDriver(url,caps);
		
		
		Thread.sleep(10000);
		
		}catch(Exception exp) {
			
			System.out.println("Cause is:"+ exp.getCause());
			System.out.println("Message is :" + exp.getMessage());
			exp.printStackTrace();
			
			
		}
		
		
		
		
	}
	
	@Test
	public void openLog() throws InterruptedException, IOException {
		
		// click log part
		
		driver.findElement(By.xpath("//android.view.View[@content-desc=\", Log Part\"]")).click();
	
		Thread.sleep(5000);
		
		driver= testingWeldingRobot.enterdetails(driver);
		
		// click on machine status
		
		
		////android.view.View[@content-desc=", Machine State"]/android.widget.TextView
		
		driver.findElement(By.xpath("//android.view.View[@content-desc=\", Machine State\"]/android.widget.TextView")).click();
		
		Thread.sleep(5000);
		
		// click on calculate health
		
		
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"CALCULATE HEALTH\"]/android.widget.TextView")).click();
		
		Thread.sleep(5000);
		
		// check if the information is displayed
		
		Boolean t2;
		

		t2 = driver.getPageSource().contains("Machine Health Scores");
		
	    //Assert.assertEquals(t2, "true");
	    
	    if(t2==true) {
	    	Reporter.log("Machine Health Score Calculated");
	    	
	    }
	    
	    else {
	    	
	    	Reporter.log("Machine Health Score could not be calculated");
	    }
		
		
		
	}
	
	
	@AfterTest
	public void teardown() {
		
		
	}

}