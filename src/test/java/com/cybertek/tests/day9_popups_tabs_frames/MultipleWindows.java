package com.cybertek.tests.day9_popups_tabs_frames;

import com.cybertek.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class MultipleWindows {
    WebDriver driver;

    @BeforeMethod
    public void  setUpmethod(){
        driver = WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

    }
    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(2000);
        //  driver.quit();
    }

    @Test
    public void switchWindowsTest(){

        driver.get("http://practice.cybertekschool.com/windows");

        System.out.println("Title befor new window:" + driver.getTitle());

        driver.findElement(By.linkText("Click Here")).click();

        System.out.println("Title after new window:" + driver.getTitle());

        String currentWindowHandle = driver.getWindowHandle();
        System.out.println(currentWindowHandle);

        //we will switch to new window
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println("windowHandles.size() = " + windowHandles.size());

        for (String windowHandle : windowHandles) {
            if(!windowHandle.equals(currentWindowHandle)){
                driver.switchTo().window(windowHandle);
            }

        }
        System.out.println("Title after switching = " + driver.getTitle());

    }

    @Test
    public void moreThan2Windows(){

        driver.get("http://practice.cybertekschool.com/windows");
        driver.findElement(By.linkText("Click Here")).click();

        Set<String> windowHandles = driver.getWindowHandles();

        System.out.println("Title befor new window:" + driver.getTitle());

        String currentWindowHandle = driver.getWindowHandle();

        for (String Handle : windowHandles) {
            driver.switchTo().window(Handle);

            if(driver.getTitle().equals("New Window")){
                //stop on that window
                break;
            }
        }

        System.out.println("After switch:" + driver.getTitle());

        System.out.println(driver.findElement(By.tagName("h3")).getText());

    }


}
