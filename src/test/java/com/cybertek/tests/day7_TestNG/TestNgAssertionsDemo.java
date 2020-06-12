package com.cybertek.tests.day7_TestNG;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgAssertionsDemo {

    @Test
    public void test1(){
        System.out.println("First Assertion");
        Assert.assertEquals("title","Title");

        System.out.println("Second Assertion");
        Assert.assertEquals(1,1);
    }

    @Test
    public void test2(){
        System.out.println("Second test case");
        Assert.assertEquals("url","url");
    }

    @Test
    public void test3(){
        String expectedTitle = "Cybt";
        String actualTitle = "Cybertek";
        //Verify that your title is starting with Cyb

        Assert.assertTrue(actualTitle.startsWith(expectedTitle),"verify titlr statr with Cyb");
        Assert.assertTrue(2>1,"I'm checking that 2 is greater than 1");
    }

    @Test
    public void test4(){
        //verify that email contains @
        String email = "mikesmith.com";

        Assert.assertTrue(email.contains("@"),"Verify that email has @ sign");

    }

    @Test
    public void test5(){
        Assert.assertFalse(0>1,"Verify that 0 is Not greater that 1");

      //  System.out.println();
    }

    @Test
    public void test6(){
        Assert.assertNotEquals("one","two");
    }

}
