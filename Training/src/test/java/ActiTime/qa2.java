package ActiTime;

import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class qa2 {

public WebDriver driver;

public qa2(WebDriver d) {
	driver = d;
	PageFactory.initElements(d, this); // PageDecoration
}


		@FindBy(xpath = "//button[@class='uni-nav-btn']")
	    WebElement register;

		@FindBy(name = "title")
		WebElement Titlelistbox;

		@FindBy(name = "firstname")
		WebElement firstNameTextbox;

		@FindBy(name = "lastname")
		WebElement lastNameTextbox;

		@FindBy(name = "street") 
		WebElement streetTextbox;

		@FindBy(name = "city")
		WebElement cityTextbox;

		@FindBy(name = "state")
		WebElement statelistbox;

		@FindBy(name = "zip")
		WebElement zipTextbox;

		@FindBy(name = "month")
		WebElement monthListbox;

		@FindBy(name = "day")
		WebElement dayListbox;

		@FindBy(name = "year")
		WebElement yearListbox;

		@FindBy(name = "email")
		WebElement emailTextbox;

		@FindBy(name = "confirm-email")
		WebElement confirmemailTextbox;

		@FindBy(name = "password")
		WebElement passwordTextbox;

		@FindBy(name = "confirm-password")
		WebElement confirmpasswordTextbox;

		@FindBy(id = "sub_btn")
		WebElement submitButton;

		// Title selection
		public void Titlelistbox(String title) {
			Select drop = new Select(driver.findElement(By.name("title")));
			drop.selectByValue(title);

		}

		// set first name
		public void typeFirstName(String text) {
			firstNameTextbox.sendKeys("lotto");
		}

		// set last name
		public void typelasttName(String text) {
			lastNameTextbox.sendKeys("password");
		}

		// set streetname

		public void typestreetname(String text) {
			streetTextbox.sendKeys("382 channel drive");
		}

		// set cityname
		public void typecityname(String text) {
			cityTextbox.sendKeys("Port Washington");
		}

		// set state

		public void Statelistbox(String state) {
			Select drop = new Select(driver.findElement(By.name("state")));
			drop.selectByValue(state);
		}

		// set ZIP
		public void typezipcode(String text) {
			zipTextbox.sendKeys("11050");
		}

		// set Month

		public void monthListbox(int month) {
			Select drop = new Select(driver.findElement(By.xpath("//select[@tabindex='9']")));
			drop.selectByIndex(month);
		}

		// set day

		public void dayListbox(int day) {
			Select drop = new Select(driver.findElement(By.xpath("//select[@tabindex='10']")));
			drop.selectByIndex(day);
		}

		// set year

		public void yearListbox(String  year) {
			Select drop = new Select(driver.findElement(By.xpath("//select[@tabindex='11']")));
			drop.selectByVisibleText(year);
		}

		// set email

		public void emailTextbox(String text) {

		}

		public void randomEmailFill() {
			final String uuid = UUID.randomUUID().toString().replaceAll("-", "");
			String email = "email_" + uuid + "@pchmail.com";
			System.out.println(email);
			driver.findElement(By.name("email")).sendKeys(email);
			driver.findElement(By.name("confirm-email")).sendKeys(email); // confirm email
		}

		// create password

		public void passwordTextbox(String text) {
			passwordTextbox.sendKeys("tester");
		}

		public void confirmpasswordTextbox(String text) {
			confirmpasswordTextbox.sendKeys("tester");
		}

		// submit button

		public void submitButton() {
			submitButton.click();
		}

		public static void main(String[] args) {
			
			
			System.setProperty( "webdriver.gecko.driver", "C:\\\\Users\\vgunasekaran\\eclipse-workspace\\geckodriver.exe");

			WebDriver driver= new FirefoxDriver();
			
			driver.get("https://accounts.qa.pch.com/login");
			
			qa2 lop = new qa2(driver);
			lop.register.click();
		/*	lop.Titlelistbox("Mr.");
			lop.typeFirstName("lotto");
			lop.typelasttName("tester");
			lop.typestreetname("382 channel drive");
			lop.typecityname("Port Washington");
			lop.Statelistbox("NY");
			lop.typezipcode("11050");
			lop.monthListbox(5);
			lop.dayListbox(5);
			lop.yearListbox("1990");
			lop.randomEmailFill();
			lop.passwordTextbox("tester");
			lop.confirmpasswordTextbox("tester");
			lop.submitButton();*/
			
			driver.close();
			
	
			
			
		
		
	}

}
