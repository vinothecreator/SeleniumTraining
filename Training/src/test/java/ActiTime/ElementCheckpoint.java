package ActiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementCheckpoint {

	public static void main(String[] args) {
		System.setProperty( "webdriver.gecko.driver", "C:\\\\Users\\vgunasekaran\\eclipse-workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		try
		{
		WebElement loginbtn=driver.findElement(By.id("loginbtn"));
		System.out.println("login page is displayed");

	}
		catch(Exception e)
		{
		System.out.println("Failed to display the login page ");	
		}
		
		driver.quit();
		}
	


}
