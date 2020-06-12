package com.cybertek.tests.day2_webDriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class NaviagtionDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        //navigate to facebook
        driver.get("https://www.google.com");
           Thread.sleep(2000);
        //navigating to facebook with another selenium method
        driver.navigate().to("https://www.facebook.com");

        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();


    }
}