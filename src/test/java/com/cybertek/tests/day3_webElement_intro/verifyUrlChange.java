package com.cybertek.tests.day3_webElement_intro;

import com.cybertek.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class verifyUrlChange {

    public static void main(String[] args) throws InterruptedException {

        /**
         * open browser
         * go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
         * enter any email
         * click on Retrieve password
         * verify that url changed to http://practice.cybertekschool.com/email_sent
         */


        WebDriver driver = WebdriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        driver.findElement(By.name("email")).sendKeys("gfdshg@gmail.com");

        driver.findElement(By.id("form_submit")).click();

        String text = driver.findElement(By.name("confirmation_message")).getText();

        System.out.println("text = " + text);

        Thread.sleep(2000);



        String expectedUrl = "http://practice.cybertekschool.com/email_sent";

        String actualUrl = driver.getCurrentUrl();

        if(actualUrl.equals(expectedUrl)){

            System.out.println("Pass");
        }else {
            System.out.println("Fail");
            System.out.println("actualUrl = " + actualUrl);
            System.out.println("expectedUrl = " + expectedUrl);
        }

        driver.quit();





    }

}
