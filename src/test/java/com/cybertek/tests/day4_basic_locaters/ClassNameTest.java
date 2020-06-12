package com.cybertek.tests.day4_basic_locaters;

import com.cybertek.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ClassNameTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebdriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/sign_up");

       WebElement homeLink =  driver.findElement(By.className("nav-link"));

       homeLink.click();



       driver.get("http://practice.cybertekschool.com/multiple_buttons");

        System.out.println(driver.findElement(By.className("h3")).getText());


    }
}
