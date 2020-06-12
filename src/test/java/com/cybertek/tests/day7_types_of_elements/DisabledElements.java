package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisabledElements {

    @Test
    public void test1(){
        WebDriver driver = WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement greenButton = driver.findElement(By.id("green"));

        System.out.println("greenButton is Enabled " + greenButton.isEnabled());

        Assert.assertFalse(greenButton.isEnabled(),"verify that green is disenable");

        greenButton.click();
    }

    @Test
    public void test2(){
        WebDriver driver = WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        WebElement inputBox = driver.findElement(By.cssSelector("#input-example>input"));

        inputBox.sendKeys("Mike");
    }

}
