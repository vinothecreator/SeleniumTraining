package OnlineRegister;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class test_Reg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\vgunasekaran\\eclipse-workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.qa.pch.com/register");
		Thread.sleep(1000);
		/*
		 * WebElement element
		 * =driver.findElement(By.xpath("//select[@class='reg-input month']"));
		 * JavascriptExecutor executor = (JavascriptExecutor)driver;
		 * executor.executeScript("arguments[0].click();", element);
		 */

		// driver.findElement(By.xpath("//select[@name='reg-input month']")).click();

		Select sec = new Select(driver.findElement(By.xpath("//select[@class='reg-input month']")));

		List<WebElement> k = sec.getOptions();

		int size = k.size();
		System.out.println(size);
		for (int i = 0; i < size; i++) {
			String value = k.get(i).getText();
			System.out.println(value);
		}

		/*
		 * List lis
		 * =driver.findElements(By.xpath("//select[@name='reg-input month']/option"));
		 * 
		 * 
		 * int size = lis.size(); System.out.println(size); for (int i=1;i<size;i++) {
		 * 
		 * String value =
		 * driver.findElement(By.xpath("//select[@name='month']/option[i]")).getText();
		 * 
		 * System.out.println(value); }
		 */

		/*
		 * Select sec = new Select
		 * (driver.findElement(By.xpath("//select[@class='reg-input month']")));
		 * sec.selectByIndex(2);
		 */

	}

}
