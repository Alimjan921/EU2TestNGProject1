package com.cybertek.tests.day1_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class openBrowser {

    public static void main(String[] args) {

        //we have to enter this line everyTime we want to open browser
        //hey webdrivermanager, can you make browser ready for me for automat
        // WebDriverManager.firefoxdriver().setup();

         //webDriver represent the browser
        //we are creating driver for chrome browser
        //new chromeDriver()--> this part will open

       // WebDriver driver = new FirefoxDriver();

       // driver.get("https://www.google.com");
             WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/gmail/about/#");








    }}