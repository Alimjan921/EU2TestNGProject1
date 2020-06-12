package com.cybertek.tests.day5_Xpath;

import com.cybertek.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebdriverFactory.getDriver("Chrome");

        driver.get("http://www.amazon.com");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@*='auto']")).sendKeys("Java");

        driver.findElement(By.xpath("//input[@*='Go']")).click();

        Thread.sleep(2000);

        String text = driver.findElement(By.xpath("//span[contains(text(),'results for')]")).getText();

        System.out.println("text = " + text);

        driver.quit();




    }}
