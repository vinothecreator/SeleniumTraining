package com.example.Tests;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.example.pages.CalcAppPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class CalcAppTest {

	 AppiumDriver<MobileElement>  driver;
		private final static String APPIUM_SERVER_URL = "http://127.0.0.1:4723/wd/hub";
	
	 public void setup() throws Exception
	 {
		 URL url = new URL(APPIUM_SERVER_URL);
		 //String[] platformInfo = platform.split(" ");
		 
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
			//caps.setCapability(MobileCapabilityType.PLATFORM_NAME,platformInfo[0]);
			//caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformInfo[1]);
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "samsung");
			caps.setCapability(MobileCapabilityType.UDID, "123456");
			//System.out.println(udid);
		
			driver = new AndroidDriver<MobileElement>(url,caps);
		 
	 }
	 
	 @Test
	 public void  register()
	 {
		 CalcAppPage cal = new CalcAppPage(driver);
		cal.register();
		 
		 
		 
		 
	 }
	 
	 
}
