package com.cybertek.tests.day4_basic_locaters;

import com.cybertek.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IdLocaterTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebdriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement dontClickbutton = driver.findElement(By.id("disappearing_button"));

   //     dontClickbutton.click();

        Thread.sleep(2000);

 //      driver.quit();





    }
}
