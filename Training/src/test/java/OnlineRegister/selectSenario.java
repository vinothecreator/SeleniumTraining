package OnlineRegister;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class selectSenario {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty( "webdriver.gecko.driver", "C:\\\\Users\\vgunasekaran\\eclipse-workspace\\geckodriver.exe");
	      WebDriver driver=new FirefoxDriver();
	      driver.get("file:///C:/Users/vgunasekaran/Desktop/sample.html");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//select[@id='countySel']")).click();
	  List selc =  driver.findElements(By.xpath("//select[@id='countySel']/option"));
	  
	  
	  
	 
	  
	  for(int i=1;i<=selc.size();i++) {
		  String element = driver.findElement(By.xpath("//select[@id='countySel']/option["+i+"]")).getText();
		  if (element.equals("India"))
			  driver.findElement(By.xpath("//select[@id='countySel']/option["+i+"]")).click();
	  }
	  List state =  driver.findElements(By.xpath("//select[@id='stateSel']/option"));
		  for(int j=1;j<=state.size();j++) {	
			  String element1 = driver.findElement(By.xpath("//select[@id='stateSel']/option["+j+"]")).getText();
			  if (element1.equals("Delhi"))
				  driver.findElement(By.xpath("//select[@id='stateSel']/option["+j+"]")).click();
		  }
		  Thread.sleep(1000);
		  List dist =  driver.findElements(By.xpath("//select[@id='districtSel']/option"));
			  for(int z=1;z<=dist.size();z++) {
				  String element2 = driver.findElement(By.xpath("//select[@id='districtSel']/option["+z+"]")).getText();
				  System.out.println(element2);
				  if (element2.equals("North Delhi"))
					  driver.findElement(By.xpath("//select[@id='districtSel']/option["+z+"]")).click();
			  }
				  
		 
		  
		 
		  
		  
		  
		 
		  
		  
  
	  
	} }
	    
	/*     //Select sec = new Select(selc);
	     List <WebElement>   lis  =  driver.findElements(By.xpath("//select[@name='state']"));
	      
	      
	      //List <WebElement> lis = sec.getOptions();
	       int siz = lis.size();
	       
	       
	       for(int i=0;i<=siz;i++)
	       {
	    	   String val = lis.get(i).getText();
	    	   System.out.println(val );
	       }
	      */
