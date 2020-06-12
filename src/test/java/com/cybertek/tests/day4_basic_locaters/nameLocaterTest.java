package com.cybertek.tests.day4_basic_locaters;

import com.cybertek.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class nameLocaterTest {

    public static void main(String[] args) {

        WebDriver driver = WebdriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/sign_up");

         driver.manage().window().maximize();

        WebElement fullanameInputbox = driver.findElement(By.name("full_name"));

        fullanameInputbox.sendKeys("Mike Smith");

        driver.findElement(By.name("email")).sendKeys("tarim@gmail.com");

        driver.findElement(By.name("wooden_spoon")).click();


        String actualWord = driver.findElement(By.name("signup_message")).getText();

        String ExpactingWord = "Thank you for signing up. Click the button below to return to the home page.";



        if(actualWord.equals(ExpactingWord)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("ExpactingWord = " + ExpactingWord);
            System.out.println("actualWord = " + actualWord);
        }



    }
}
