package com.cybertek.tests.day7_TestNG;

import org.testng.annotations.*;

public class BeforeAfterTests {

    @Test
    public void test1(){
        System.out.println("This is my test 1");
    }

    @Test
    public void test2(){
        System.out.println("This is my test2");
    }

    @Test
    public void test3(){
        System.out.println("This is my test3");
    }



    @BeforeMethod
    public void setUp(){
        //webDriver part
        System.out.println("Before Method Here");
        System.out.println("Webdriver Part");

    }


    @AfterMethod
    public void tearDown(){
        //close browser,quit
        System.out.println("After Method Here");
        System.out.println("Driver Quite");

    }

    @BeforeClass
    public void setUpClass(){
        System.out.println("---Before Class---");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("---After Class----");
        System.out.println("Runs only in the class");
        System.out.println("Generate Report");
    }
}
