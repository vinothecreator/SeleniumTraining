package com.selenium.popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty( "webdriver.gecko.driver", "C:\\\\Users\\vgunasekaran\\eclipse-workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[contains(@class,'settings_icon')]")).click();
		driver.findElement(By.linkText("Types of Work")).click();
		
		
		//delete the task, you will see the popup
		
		
		driver.findElement(By.xpath("//a[text()='Automation']/../../td[6]/a")).click();
		
		//TO get the text
		
		String msg=driver.switchTo().alert().getText();
		
		System.out.println(msg);
		
		// click on cancel
		
		driver.switchTo().alert().dismiss();
		
		
		// To click om "OK" button to delete the button
		
		driver.findElement(By.xpath("//a[text()='Automation']/../../td[6]/a")).click();
		driver.switchTo().alert().accept();
		
		
		
		

	}

}
