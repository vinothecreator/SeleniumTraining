package ActiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) {
		System.setProperty( "webdriver.gecko.driver", "C:\\Users\\vgunasekaran\\eclipse-workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.yatra.com/");
		
		Actions act= new Actions(driver);
		
		//complete booking
		WebElement menu=driver.findElement(By.xpath("//*[@id=\"themeSnipe\"]/div[1]/div[3]/div[2]/div/ul/li[2]/a"));
		act.moveToElement(menu).build().perform();
	
		driver.findElement(By.xpath("//*[@id=\"customer_support_ddn\"]/ul/li[2]/a")).click();

		
		
	}

}
