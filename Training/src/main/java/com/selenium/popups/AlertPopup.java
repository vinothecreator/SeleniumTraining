package com.selenium.popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty( "webdriver.gecko.driver", "C:\\Users\\vgunasekaran\\eclipse-workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.services.irctc.co.in/cgi-bin/bv60.dll/irctc/services/home.do");
		driver.findElement(By.id("button")).click();
		
		Thread.sleep(2000);
		
		// get text of the popup
		
		String alertMsg=driver.switchTo().alert().getText();
		System.out.println(alertMsg);
		
		//switch webdriver control to the alert popup & click on "ok"button
		
		driver.switchTo().alert().accept();

	}

}
