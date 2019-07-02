package AutomationHub;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintallElements_S17 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty( "webdriver.gecko.driver", "C:\\\\Users\\vgunasekaran\\eclipse-workspace\\geckodriver.exe");
	      WebDriver driver=new FirefoxDriver();
	      driver.get("https://automationpub.com/");
	      Thread.sleep(2000);
	      java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
	      
	      System.out.println(links.size());
	         
	      JavascriptExecutor JS = (JavascriptExecutor)driver;
	      JS.executeScript("document.getElementByID().value ='test@teatmail.com' ");
	      
	      for (int i = 1; i<=links.size(); i++) {


	    	   
	     }

	}
}
