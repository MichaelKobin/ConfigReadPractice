package com.cydeo.tests;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class Test {
    WebDriver driver;

    @BeforeMethod
    public void setUpDriver() {
        driver = WebDriverFactory.getDriver("opera");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @org.testng.annotations.Test
    public void automation() throws InterruptedException {
        driver.get("https://practice.cydeo.com/registration_form");
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Jon");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("smith");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Cobain");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sad@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123123123");
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("571-000-0000");
        driver.findElement(By.xpath("//input[@value='male']")).click();
        driver.findElement(By.xpath("//input[@name='birthday']")).sendKeys("12/01/1991");
        Select bDayDropDown = new Select(driver.findElement(By.xpath("//select[@name='department']")));
        Thread.sleep(1000);
        bDayDropDown.selectByIndex(1);
        Thread.sleep(4000);
        driver.close();
    }


}
