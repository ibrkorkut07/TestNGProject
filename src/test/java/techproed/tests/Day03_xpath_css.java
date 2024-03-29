package com.myfirstproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day03_xpath_css {
    WebDriver driver;

    @Before
    public void setUp () {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/sign_in");
    }

    @Test
    public void xpath_css () {

        // locating email box using xpath
        WebElement emailBox = driver.findElement(By.xpath("//input[@id='session_email']"));
        // typing the email
        emailBox.sendKeys("testtechproed@gmail.com");
        // locating password box using xpath
        WebElement passwordbox = driver.findElement(By.xpath("//input[@id='session_password']"));
        // typing the password
        passwordbox.sendKeys("Test1234!");
        // locating sing in button
        WebElement signInButton = driver.findElement(By.xpath("//input[@type='submit']"));
        // clicking
        signInButton.click();
    }

    @After
    public void tearDown (){
        driver.close();
    }
}