package com.test.Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demoAdd {


	
	public static void main(String[] args) {
		
		System.setProperty( "webdriver.gecko.driver", "C:\\\\Users\\vgunasekaran\\eclipse-workspace\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		driver.get("http://thedemosite.co.uk/login.php");
		driver.findElement(By.name("username")).sendKeys("vino");
		driver.findElement(By.name("password")).sendKeys("121345");

	}

}
