package com.cybertek.tests.day4_basic_locaters;

import com.cybertek.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class linkTextAndPartialLinkText {

    public static void main(String[] args) {

        WebDriver driver = WebdriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/dynamic_loading");

        WebElement element = driver.findElement(By.linkText("Example 1: Element on page that is hidden and become visible after trigger"));

        element.click();

        WebElement link4 = driver.findElement(By.partialLinkText("Example 4"));
        link4.click();
    }
}
