package com.cybertek.tests.day3_webElement_intro;

import com.cybertek.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyConfirmationMassage {

    public static void main(String[] args) throws InterruptedException {

        /**
         *  open browser
         * go to http://practice.cybertekschool.com/forgot_password Links to an external site.
         * enter any email
         * verify that email is displayed in the input box
         * click on Retrieve password
         * verify that confirmation message says 'Your e-mail's been sent!'
         */

        WebDriver driver = WebdriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");
        String expectedEmail = "test@gmail.com";
        WebElement emailInputBox = driver.findElement(By.name("email"));
        emailInputBox.sendKeys("test@gmail.com");

        String actualEmail = emailInputBox.getAttribute("value");

        if(actualEmail.equals(expectedEmail)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("actualEmail = " + actualEmail);
            System.out.println("expectedEmail = " + expectedEmail);
        }

        driver.findElement(By.id("form_submit")).click();

        String text = driver.findElement(By.name("confirmation_message")).getText();

        System.out.println("text = " + text);

        Thread.sleep(2000);

        driver.quit();



    }
}
