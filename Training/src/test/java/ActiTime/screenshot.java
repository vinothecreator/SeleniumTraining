package ActiTime;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class screenshot {

	public static void main(String[] args) {
		System.setProperty( "webdriver.gecko.driver", "C:\\\\Users\\vgunasekaran\\eclipse-workspace\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		driver.get("http://www.google.com");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String path= System.getProperty("user.dir")+ "/Screenshot" + System.currentTimeMillis() + ".png";
		
		File des= new File(path);
		
		try
		{
			
			
	
			
			FileUtils.copyFile(src,des);
		}
		
		catch(Exception e)

		{
			System.out.println(e.getMessage());
		}
		
	/*	//screenshot Method using try block
		
	File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	try {
		FileUtils.copyFile(src,new File("C:\\Er1.png"));
	}
		catch(IOException e)
	{
			System.out.println(e.getMessage());
	}
		
	}*/
	
//Another method for screenshot no hardcore
		
/*	TakesScreenshot ts=(TakesScreenshot) driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	
	String path = System.getProperty("user.dir")+ "/Screenshot/" + System.currentTimeMillis()+ ".png";
	
	File des= new File(path);
	
	try
	{
		FileUtils.copyFile(src, des);
	}
	catch(IOException e) {
		System.out.println(e.getMessage());
	}
		*/
	
	
/*	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	//String timestamp = new SimpleDateFormat(“yyyy_MM_dd__hh_mm_ss”).format(new Date());
	
String timw=new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss a").format(new Date());
	
	String path = System.getProperty("user.dir")+ "/screenshoz/"+ timw  +".png";
	
	
	File dest = new File(path);
	
	try
	{
		FileUtils.copyFile(src, dest);
	}
	catch(IOException e)
	{
		System.out.println(e.getMessage());
		
	}
	
		*/
	
		
		
	}
}
