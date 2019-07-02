package ActiTime;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class demowiki {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty( "webdriver.gecko.driver", "C:\\\\Users\\vgunasekaran\\eclipse-workspace\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();

		driver.get("https://automation.willtoken.io/coinadmin/login");
		
		/*File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		 // now copy the  screenshot to desired location using copyFile //method
			 FileUtils.copyFile(scrFile, new File("c:\\screenshot.png"));
			
		}
		 
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 
		 }*/
		
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		
	String timw=new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss a").format(new Date());
		
		String path = System.getProperty("user.dir")+ "/DemoLogin/"+ timw  +".png";
		
		
		File dest = new File(path);
		
		try
		{
			FileUtils.copyFile(src, dest);
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
			
		}
		
		
		
		
	
	    driver.findElement(By.id("email")).sendKeys("admin@demo.com");
	    driver.findElement(By.id("password")).sendKeys("123456");
	    
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(15000);
	    
	
	  driver.navigate().to("https://automation.willtoken.io/coinadmin/user/3/kycdoc");
	
	 String element= driver.findElement(By.xpath("//table/tbody/tr[.//td[text()='Address Proof']]/td[4]")).getText().trim();

	 
	 String element2= driver.findElement(By.xpath("//table/tbody/tr[.//td[text()='Identification Document']]/td[4]")).getText().trim();
	 String element3= driver.findElement(By.xpath("//table/tbody/tr[.//td[text()='Selfie - With your Identification Document']]/td[4]")).getText().trim();
	 
	 String res = "APPROVED"; 
	 
	 System.out.println(element + element2 + element3);
	
	 if(element.equals(res) || element2.equals(res) )
			 {
	 
		 System.out.println("click the button");
	 }
		 
	 
	 
	    
	    
	    
	    
	    
	    
	 /*    WebElement list=driver.findElement(By.xpath("//ul[@class='sidebar-menu']/li[20]/a"));
		 String name=list.getText();
		 JavascriptExecutor executor = (JavascriptExecutor)driver;
		 executor.executeScript("arguments[0].click();", list);
		 System.out.println(name);
		 */
		 
		
		 
		 
	/*	 // Menu List for reference to access the elements .
		 List<WebElement> sidemenu= driver.findElements(By.xpath("//ul[@class='sidebar-menu']/li"));
		 int sidemenucount=sidemenu.size();
		 System.out.println("size of sidemenu bar" + sidemenucount);
		 for(int i=0;i<sidemenucount;i++)
		    {
		    	String Menu=sidemenu.get(i).getText();
		    	System.out.println(i + " " +Menu);
		    }
*/
	   
	 /*   JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    
	    WebElement logout = driver.findElement(By.xpath("//a[@href='https://automation.willtoken.io/logout']"));
        Actions ob = new Actions(driver);
        ob.click(logout);
        System.out.println("Logout !!");
       // driver.close();
*/        
      

		 //coin name:
		 
	/*	 
		WebElement coinname= driver.findElement(By.id("name"));
		coinname.sendKeys("test");
	
		
		WebElement coinSymbol = driver.findElement(By.xpath(".//input[@id='symbol']"));
		coinSymbol.sendKeys("testsymbol");
		
	    WebElement coinAdd=driver.findElement(By.xpath(".//input[@id='address']"));
	     coinAdd.sendKeys("testAdd");
	  
	  
	    driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block']")).click();*/
	  
	  

	}

}
