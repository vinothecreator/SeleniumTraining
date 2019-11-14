package zendesk;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class gmailLogin {
	WebDriver driver;
	
	config  properties  = new  config();


	@BeforeClass
	public void getTableSize() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vgunasekaran\\workspace\\libs\\geckodriver.exe");
		driver = new FirefoxDriver();

	}

	@Test
	public void gLogin() {
		// URL
		WebDriverWait wait = new WebDriverWait(driver, 20);
		//driver.get(config.prop.getProperty("Site_URL"));
		
		driver.get("https://accounts.google.com/signin");

		// Email ID

		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys(config.prop.getProperty("username"));
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		// password

		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));

		wait.until(ExpectedConditions.elementToBeClickable(password));

		password.sendKeys("");

		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();

	}

}
