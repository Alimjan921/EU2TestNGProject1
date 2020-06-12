package com.cybertek.tests.day11_file_upload;

import com.cybertek.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploadTest {
    WebDriver driver;

    @BeforeMethod
    public void  setUpmethod(){
        driver = WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

    }
    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(5000);
    //    driver.quit();
    }

    @Test
    public void test1(){
        driver.get("https://practice-cybertekschool.herokuapp.com/upload");

        WebElement chooseFile = driver.findElement(By.id("file-upload"));

        chooseFile.sendKeys("/Users/aabliz/Desktop/git/HTMLK.html");

        driver.findElement(By.id("file-submit")).click();

        String acualtext = driver.findElement(By.id("uploaded-files")).getText();
        String expactedtext = "HTMLK.html";

        Assert.assertEquals(acualtext,expactedtext,"verify that this massage displayed");


    }


    @Test
    public void test2(){
        driver.get("https://practice-cybertekschool.herokuapp.com/upload");

        WebElement chooseFile = driver.findElement(By.id("file-upload"));

        String projectPath = System.getProperty("user.dir");
        String relativePath = "src/test/resources/testfile.txt";
        String filePath = projectPath+"/"+relativePath;
        chooseFile.sendKeys(filePath);

        driver.findElement(By.id("file-submit")).click();

        String acualtext = driver.findElement(By.id("uploaded-files")).getText();
        String expactedtext = "testfile.txt";

        Assert.assertEquals(acualtext,expactedtext,"verify that this massage displayed");


    }


}

