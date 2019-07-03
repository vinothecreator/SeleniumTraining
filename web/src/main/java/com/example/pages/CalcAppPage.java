package com.example.pages;

import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CalcAppPage {
	
	public CalcAppPage(AppiumDriver<MobileElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	
	@FindBy(xpath = "//div[@class='register-link']")
	WebElement register;

	@FindBy(name = "regform_title")
	WebElement Titlelistbox;

	@FindBy(name = "regform_first")
	WebElement firstNameTextbox;

	@FindBy(name = "regform_last")
	WebElement lastNameTextbox;

	@FindBy(name = "regform_street")
	WebElement streetTextbox;

	@FindBy(name = "regform_city")
	WebElement cityTextbox;

	@FindBy(xpath = "//select[@class='reg-input required state']")
	WebElement statelistbox;

	@FindBy(id = "regform_zip")
	WebElement zipTextbox;

	@FindBy(xpath = "//select[@class='reg-input month']")
	WebElement monthListbox;

	@FindBy(xpath = "//select[@class='reg-input day']")
	WebElement dayListbox;

	@FindBy(xpath = "//select[@class='reg-input year']")
	WebElement yearListbox;

	@FindBy(name = "regform_email")
	WebElement emailTextbox;

	@FindBy(name = "regform_emailc")
	WebElement confirmemailTextbox;

	@FindBy(name = "regform_password")
	WebElement passwordTextbox;

	@FindBy(name = "regform_passwordc")
	WebElement confirmpasswordTextbox;

	@FindBy(xpath = "//button[@id='sub-btn']")
	WebElement submitButton;

	// Title selection
	/*public void Titlelistbox(String title) {
		Select drop = new Select(driver.findElement(By.name("regform_title")));
		drop.selectByValue(title);

	}
*/
	// set first name
	
	
	public void register()
	{
		register.click();
	}
	
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
		Select drop = new Select(statelistbox);
		drop.selectByValue(state);
	}

	// set ZIP
	public void typezipcode(String text) {
		zipTextbox.sendKeys("11050");
	}

	// set Month

	public void monthListbox(int month) {
		Select drop = new Select((monthListbox));
		drop.selectByIndex(month);
	}

	// set day

	public void dayListbox(int day) {
		Select drop = new Select((dayListbox));
		drop.selectByIndex(day);
	}

	// set year

	public void yearListbox(String  year) {
		Select drop = new Select((yearListbox));
		drop.selectByVisibleText(year);
	}

	// set email

	public void emailTextbox(String text) {

	}

	public void randomEmailFill() {
		final String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		String email = "email_" + uuid + "@pchmail.com";
		System.out.println(email);
		emailTextbox.sendKeys(email);
		confirmemailTextbox.sendKeys(email); // confirm email
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

	
	
	
	
	

}
