package com.appium.web;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameters {

/*	
	//@Parameters({ "browser" })
	//@Test
	public void testCaseOne(String browser) {
		System.out.println("browser passed as :- " + browser);
	}*/

	@Parameters({"username" })
	@BeforeTest
	public void testCaseTwo(String username) {
		System.out.println("Parameter for User Name passed as :- " + username);
		//System.out.println("Parameter for Password passed as :- " + password);
	}

}
