package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest {

    @Test
  public void radioBtnTest() {
        WebDriver driver = WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blueRadioButton = driver.findElement(By.id("blue"));
        WebElement redRadioButton = driver.findElement(By.id("red"));

        //how to check is radio button selected?

        System.out.println("blueRadioButton.isSelected() = " + blueRadioButton.isSelected());
        System.out.println("redRadioButton.isSelected() = " + redRadioButton.isSelected());

        //Task verify blue is selected red is not selected
        Assert.assertTrue(blueRadioButton.isSelected(),"Verify that BlueButton is selected");
        Assert.assertFalse(redRadioButton.isSelected(),"verify that Redbutton is Not selected");

        //how to select redio button?
        //we use click method to select radio button
        redRadioButton.click();

        //Task verify blue is selected red is not selected
        Assert.assertFalse(blueRadioButton.isSelected(),"Verify that BlueButton is Not selected");
        Assert.assertTrue(redRadioButton.isSelected(),"verify that Redbutton is selected");

        driver.quit();


    }
}
