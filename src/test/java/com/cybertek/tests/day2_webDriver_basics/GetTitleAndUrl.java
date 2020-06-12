package com.cybertek.tests.day2_webDriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndUrl {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com");

        //getting title with selenium
        String title = driver.getTitle();

        System.out.println("title = " + title);

        String url = driver.getCurrentUrl();
        System.out.println("url = " + url);
        Thread.sleep(3000);


        //getPageSoureCode
        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource);

        driver.quit();
    }
}
