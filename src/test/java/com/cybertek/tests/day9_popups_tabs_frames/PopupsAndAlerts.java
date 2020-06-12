package com.cybertek.tests.day9_popups_tabs_frames;

import com.cybertek.utilities.WebdriverFactory;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PopupsAndAlerts {

    WebDriver driver;

    @BeforeMethod
    public void  setUpmethod(){
       driver = WebdriverFactory.getDriver("chrome");
       driver.manage().window().maximize();

    }
    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(2000);
     //   driver.quit();
    }

    @Test
    public void test1() {

        driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");
         //locate and click Destroy the world button
        driver.findElement(By.xpath("//button[.='Destroy the World']")).click();

        //locate and click No butten
        driver.findElement(By.xpath("//span[.='No']")).click();


    }

    @Test
    public void Alerts() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/javascript_alerts");

        driver.findElement(By.xpath("//button[1]")).click();

        //switch to JS alert windows
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        //click OK button on the alert
        alert.accept();

        //cancel
    //    alert.dismiss();

        driver.findElement(By.xpath("//button[3]")).click();
        Thread.sleep(2000);
        alert.sendKeys("focuse!! on you study!!!!!");
       alert.accept();
        System.out.println(driver.findElement(By.id("result")).getText());

    }


}
