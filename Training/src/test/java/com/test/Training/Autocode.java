package com.test.Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autocode {
	
	public WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
System.setProperty( "webdriver.gecko.driver", "C:\\\\Users\\vgunasekaran\\eclipse-workspace\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.get("https://iwe.qa.pch.com/iwe/#user/list");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.id("j_username")).sendKeys("vgunasekaran");
driver.findElement(By.id("j_password")).sendKeys("Spring2017");
driver.findElement(By.id("submit")).click();

//driver.quit();
		String GawyName = new Autocode().setupCashWinCondition("100");
		new Autocode().configureCashConditionToDevices(GawyName,152);

	}
	
	public String setupCashWinCondition(String cashValue) {

		driver.findElement(By.id("splitbutton-1043-btnIconEl")).click();
		return "";
	}
	
	public void configureCashConditionToDevices(String Gway, int DeviceID) {
		
	}

}
