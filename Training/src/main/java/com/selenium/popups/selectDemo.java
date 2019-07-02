package com.selenium.popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class selectDemo {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebElement driver;
		String text=driver.findElement(By.linkText("Column visibility")).getText();
		Select colvisibility= new Select(driver);
	   //WebElement te=	colvisibility.selectByValue(text);

	}


