package ActiTime;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class twotabs {

	public static void main(String[] args) {
	System.setProperty( "webdriver.gecko.driver", "C:\\Users\\vgunasekaran\\workspace\\libs\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
	
	/*	//((JavascriptExecutor)driver).executeScript("window.open()");
		//((JavascriptExecutor)driver).executeScript("window.Open");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		driver.get("http://www.fb.me");
		driver.switchTo().window(tabs.get(1));
		
		driver.close();
		driver.switchTo().window(tabs.get(0));*/

		 ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs2.get(1));
		    driver.close();
		    driver.switchTo().window(tabs2.get(0)); 
	

	
	}

}
