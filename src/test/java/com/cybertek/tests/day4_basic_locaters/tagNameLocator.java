package com.cybertek.tests.day4_basic_locaters;

import com.cybertek.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tagNameLocator {

    public static void main(String[] args) {

        WebDriver driver = WebdriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullNameInputBox = driver.findElement(By.tagName("input"));
        fullNameInputBox.sendKeys("Mike Smith by tagname");

        WebElement emailInputBox = driver.findElement(By.name("email"));
        emailInputBox.sendKeys("jhaduj@gjsjkax.com");

       driver.findElement(By.tagName("button")).click();

        String text = driver.findElement(By.tagName("h3")).getText();
        System.out.println("text = " + text);


    }
}
