package OnlineRegister;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumEasy {

	public static void main(String[] args) {
		System.setProperty( "webdriver.gecko.driver", "C:\\\\Users\\vgunasekaran\\eclipse-workspace\\geckodriver.exe");
	      WebDriver driver=new FirefoxDriver();
	      driver.get("https://www.seleniumeasy.com/test/");
	      
	      driver.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Table')]")).click();
	      
	List <WebElement> lis = driver.findElements(By.xpath("//li[@class='dropdown open']//li"));
	
	
	 /*  int size = lis.size();
	      System.out.println(size);
	   for (int i=1;i<size;i++)
	      {
	    	  
	      	    	  String value = lis.get(i).getText();   
	      	    	  System.out.println(value);
	      }
	   
	   */
	for(int i=1;i<=lis.size();i++)
	   {
		   String ele = driver.findElement(By.xpath("//li[@class='dropdown open']//li["+i+"]")).getText();
		if(ele.equals("Table Filter")) {
			driver.findElement(By.xpath("//li[@class='dropdown open']//li["+i+"]")).click();
		break;
	
		}
	
		
		
	   }  
		driver.close();
		
	}
}
	

  
