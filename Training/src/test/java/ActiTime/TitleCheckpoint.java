package ActiTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TitleCheckpoint {

	public static void main(String[] args) {
		System.setProperty( "webdriver.gecko.driver", "C:\\\\Users\\vgunasekaran\\eclipse-workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.actitime.com/login.do");

		//Title Checkpoint demo
		
		
		// excepted title comes from the testcase/req doc
		String exceptedTitle="actiTIME - Login";
		
		// fetch from webpage
		String actualTitle=driver.getTitle();
		
		System.out.println(exceptedTitle);
		System.out.println(actualTitle);
		
		//String compare
		
		if(exceptedTitle.equals(actualTitle))
		{
			System.out.println("Login page is successfully displayed");
			
		}
		else
		{
			System.out.println("Failed to display the login page");
		}
		
	}

}
