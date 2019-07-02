package ActiTime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class interview_List {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty( "webdriver.gecko.driver", "C:\\\\Users\\vgunasekaran\\eclipse-workspace\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();

	driver.get("https://www.google.com/?gws_rd=ssl");
	 List<WebElement> alllinks= driver.findElements(By.tagName("a"));
	   for(WebElement link:alllinks)
	    System.out.println(link.getText());
		
		
	}
	
}
