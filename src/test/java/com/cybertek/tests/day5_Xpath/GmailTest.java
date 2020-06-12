package com.cybertek.tests.day5_Xpath;

import com.cybertek.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GmailTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebdriverFactory.getDriver("chrome");

        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();


        driver.findElement(By.id("email")).sendKeys("attila0921@hotmail.com");

       // driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();

    Thread.sleep(Long.parseLong("1500"));

      driver.findElement(By.id("pass")).sendKeys("@Lim2827243");

   driver.findElement(By.id("u_0_b")).click();

      //  driver.quit();



    }
}
