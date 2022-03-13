package com.cydeo.tests;
import com.cydeo.Utilities.ConfigReader;
import com.cydeo.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.cydeo.Utilities.ConfigReader.properties;
public class US10_AC1 {
    //Store manager Test
    @Test
    public void userStory() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("env"));
        WebElement login = Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput']"));
        login.sendKeys(ConfigReader.getProperty("storeLogin"));
        WebElement password = Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput2']"));
        password.sendKeys(ConfigReader.getProperty("password"));
        Driver.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);
        WebElement dropDown = Driver.getDriver().findElement(By.xpath("(//span[contains(text(),'Fleet')])[1]"));
        Driver.getDriver().findElement(By.xpath("//button[@type='button']")).click();
        Thread.sleep(2000);
        dropDown.click();
        WebElement vehicleOdometer = Driver.getDriver().findElement(By.partialLinkText("Vehicle Odometer"));
        Thread.sleep(1000);
        vehicleOdometer.click();
        Thread.sleep(2000);
        String expectedErrorText = "You do not have permission to perform this action.";
        String actualText = (Driver.getDriver().findElement(By.xpath("//div[@class='message']")).getText());
        Assert.assertEquals(expectedErrorText, actualText);
    }
}