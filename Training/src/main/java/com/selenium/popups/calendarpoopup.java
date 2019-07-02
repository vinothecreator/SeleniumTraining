package com.selenium.popups;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class calendarpoopup {

	public static void main(String[] args) {
	
		System.setProperty( "webdriver.gecko.driver", "C:\\Users\\vgunasekaran\\eclipse-workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
	/*	driver.get("https://www.yatra.com/");
		
		driver.findElement(By.id("BE_flight_origin_date")).click();
		driver.findElement(By.id("06/04/2018")).click();*/
		
		
		driver.get("http://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//datepciker clicking
		
		  driver.findElement(By.id("datepicker")).click();
		  
		WebElement DateElements=driver.findElement(By.id("ui-datepicker-div"));
		
		List<WebElement> rows=DateElements.findElements(By.tagName("tr"));
		
		List<WebElement> columns=DateElements.findElements(By.tagName("td"));
		
		
		for(WebElement cell:columns)
		{
			if(cell.getText().equals("24")) {
				
				cell.findElement(By.linkText("24")).click();
				break;
			}
		}
		
		
		

	}

}
