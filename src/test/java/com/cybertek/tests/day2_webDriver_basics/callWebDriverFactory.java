package com.cybertek.tests.day2_webDriver_basics;

import com.cybertek.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class  callWebDriverFactory {


    public static void main(String[] args) {

        WebDriver driver = WebdriverFactory.getDriver("chrome");

        driver.get("http://www.youtube.com");

        driver.manage().window().maximize();

        driver.findElement(By.name("search_query")).sendKeys("");

        driver.findElement(By.id("search-icon-legacy")).click();

//      String titel =  driver.getTitle();
//       String currentUrl = driver.getCurrentUrl();
//        System.out.println("currentUrl = " + currentUrl);


//        System.out.println("title: " + titel);


       // driver.findElement(By.).click();


    }
}
