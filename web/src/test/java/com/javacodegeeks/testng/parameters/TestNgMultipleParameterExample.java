package com.javacodegeeks.testng.parameters;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
 
public class TestNgMultipleParameterExample {
 
   @Parameters({"udid", "exampleDesc"})
    @BeforeTest
    public void t1(String udid, String exampleDesc) {   
        System.out.println("t1: " + udid + ":" + exampleDesc);
    }
     
 /*   @Parameters(value={"category", "exampleDesc", "moreDesc"})
    @Test
    public void t2(String category, String exampleDesc, String moreDesc) {
        System.out.println("t2: " + category + ":" + exampleDesc + ", " + moreDesc);
    }*/
}
