package com.selenium.popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
 
public class Tool_Tip {
 
  public static void main(String[] args) {
 
     // Set Gecko Driver location.
	  System.setProperty( "webdriver.gecko.driver", "C:\\Users\\vgunasekaran\\eclipse-workspace\\geckodriver.exe");
 
     WebDriver driver = new FirefoxDriver();
 
     driver.get("http://jqueryui.com/tooltip/");
     driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
     //driver.findElement(By.className("demo-frame")).click();
     WebElement iframe=driver.findElement(By.className("demo-frame"));
     driver.switchTo().frame(iframe);
     //driver.findElement(By.xpath("//input[@id='age']")).sendKeys("23");
 
     // Create action class object
   Actions builder = new Actions(driver);
 
     // find the tooltip xpath
     
     WebElement Del_btn_tooltip =driver.findElement(By.xpath("//input[@id='age']"));
 
     // Mouse hover to that text message
     builder.moveToElement(Del_btn_tooltip).perform();
 
     // Extract text from tooltip
     String tooltip_msg = driver.findElement(By.xpath("//div[contains(@class,'ui-tooltip ui-corner-all')]")).getText();
     
     
     System.out.println(tooltip_msg);
 
     // Print the tooltip message just for our refrences
  }
}