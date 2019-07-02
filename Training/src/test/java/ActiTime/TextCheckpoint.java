package ActiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextCheckpoint {

	public static void main(String[] args) {
		System.setProperty( "webdriver.gecko.driver", "C:\\\\Users\\vgunasekaran\\eclipse-workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		//TextCheckpoint
		
		String exceptedText ="Please identify yourself";
		
		String actualText=driver.findElement(By.id("headerContainer")).getText();
		
		if(actualText.equals(exceptedText))
		{
			System.out.println("Login Page is displayed");
		}
		else
		{
			System.out.println("Failed to display the login page");
		}
		


	}

}
