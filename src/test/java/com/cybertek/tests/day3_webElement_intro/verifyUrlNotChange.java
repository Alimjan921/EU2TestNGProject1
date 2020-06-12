package com.cybertek.tests.day3_webElement_intro;

import com.cybertek.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class verifyUrlNotChange {

    public static void main(String[] args) {
        /*
   open chrome browser
   go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
   click on Retrieve password
   verify that url did not change
         */

        WebDriver driver = WebdriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        String exeualUrl = driver.getCurrentUrl();


        driver.findElement(By.id("form_submit")).click();



        String  currentUrl= driver.getCurrentUrl();

        if(currentUrl.equals(exeualUrl)){
           System.out.println("Pass");
        }else {
            System.out.println("Fail");

        }




    }
}
