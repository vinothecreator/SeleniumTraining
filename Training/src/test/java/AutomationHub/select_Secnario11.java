package AutomationHub;

import org.testng.AssertJUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class select_Secnario11 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty( "webdriver.gecko.driver", "C:\\\\Users\\vgunasekaran\\eclipse-workspace\\geckodriver.exe");
	      WebDriver driver=new FirefoxDriver();
	      driver.get("https://automationpub.com/");
	      Thread.sleep(2000);
	     WebElement test = driver.findElement(By.xpath("//*[@id=\"archives-dropdown-2\"]"));
	     test.click();
	     Select pass = new Select(test);
	      
	   pass.selectByIndex(5);
	   
	   String actual = driver.findElement(By.xpath("//*[@id=\"archives-dropdown-2\"]")).getText();
	   
	 Assert.assertEquals("January 2017", actual);

	


	}

}
