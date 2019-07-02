package ActiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demoXptah {
	public static void main(String[] args) {
	
	System.setProperty( "webdriver.gecko.driver", "C:\\\\Users\\vgunasekaran\\eclipse-workspace\\geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	
	driver.get("https://www.qa.pch.com");
	driver.findElement(By.xpath("//*[@class=\"uninav__sign-in uninav__button link-button\"]")).click();
	
	driver.findElement(By.id("EM")).sendKeys("tu01@pchmail.com");

	
	driver.findElement(By.id("PW")).sendKeys("tester");
	
	driver.findElement(By.id("login-sub-btn")).click();
	driver.findElement(By.xpath("games-tab-link")).click();
	
	//driver.findElement(By.xpath("//*[@class=\"nav-bar\"]//preceding-sibling:: li[@class='item-556 parent']//a[@class='games-tab-link']")).click();

}
}