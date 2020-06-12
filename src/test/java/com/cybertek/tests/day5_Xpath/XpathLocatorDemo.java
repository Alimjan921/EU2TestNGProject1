package com.cybertek.tests.day5_Xpath;

import com.cybertek.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathLocatorDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebdriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        Thread.sleep(3000);
        WebElement button = driver.findElement(By.xpath("//button[2]"));

  //      button.click();0

    }
}
