package com.cybertek.tests.day6_CSS;

import com.cybertek.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cssDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebdriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        driver.manage().window().maximize();

        WebElement button = driver.findElement(By.cssSelector("a.nav-link"));

        System.out.println("button.getText() = " + button.getText());

        driver.quit();


    }
}
