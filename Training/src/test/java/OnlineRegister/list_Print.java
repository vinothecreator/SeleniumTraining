package OnlineRegister;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class list_Print {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty( "webdriver.gecko.driver", "C:\\\\Users\\vgunasekaran\\eclipse-workspace\\geckodriver.exe");
	      WebDriver driver=new FirefoxDriver();
	      
	      //driver.get("https://www.toolsqa.com/automation-practice-form");
	      
	      driver.get("http://jqueryui.com/autocomplete/#combobox");
	    
	      
	      WebElement fram = driver.findElement(By.className("demo-frame"));
	      
	      driver.switchTo().frame(fram);
	      

	     driver.findElement(By.xpath("//span[@class='ui-button-icon ui-icon ui-icon-triangle-1-s']")).click();
	      
	     
		/* if you have select option, you must use the SELECT case */
	      //Select cont = new Select (driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/div")));
	
	  
	   List< WebElement> lis= driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/div"));
	     
	   int size = lis.size();
	      System.out.println(size);
	   for (int i=0;i<size;i++)
	      {
	    	  
	      	    	  String value = lis.get(i).getText();   
	      	    	  System.out.println(value);
	      }
	     
	     
	 
	      
	   /*   List <WebElement> ele = cont.getOptions();
	     
	
	      int size = ele.size();
	      System.out.println(size);*/

	      
	      
	      
    /*  for (int i=0;i<size;i++)
      {
    	  
      	    	  String value = ele.get(i).getText();   
      	    	  System.out.println(value);
      }
	     */ 
	      
	    	}}
	    

		
		
