package OnlineRegister;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Register_Page {
	public static void main(String[] args) {
	System.setProperty( "webdriver.gecko.driver", "C:\\\\Users\\vgunasekaran\\eclipse-workspace\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.get("http://newtours.demoaut.com");
	
	driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();

//Registration
	
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("test");
	driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("testLast");
	driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("123456789");
	driver.findElement(By.xpath("//input[@id=\"userName\"]")).sendKeys("test@testmail.com");
	driver.findElement(By.xpath("//input[@name=\"address1\"]")).sendKeys("123 dummy address");
	
	driver.findElement(By.xpath("//input[@name=\"city\"]")).sendKeys("city");
	driver.findElement(By.xpath("//input[@name=\"state\"]")).sendKeys("state");
	
	Select country= new Select(driver.findElement(By.xpath("//select[@name=\"country\"]")));
	country.selectByIndex(4);
	
	driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("Vinotesting");
	driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("tester");
	driver.findElement(By.xpath("//input[@name=\"confirmPassword\"]")).sendKeys("tester");
	
	driver.findElement(By.xpath("//input[@name=\"register\"]")).click();
	
	

}
}
