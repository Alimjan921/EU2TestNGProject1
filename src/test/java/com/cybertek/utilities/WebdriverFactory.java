package com.cybertek.utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebdriverFactory {



    public static WebDriver getDriver(String browsertype){

        WebDriver driver =null;

        switch (browsertype.toLowerCase()){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                break;

                case"firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            case"safari":
                WebDriverManager.chromedriver().setup();
                driver = new SafariDriver();
                break;
        }
       return driver;
    }

}
