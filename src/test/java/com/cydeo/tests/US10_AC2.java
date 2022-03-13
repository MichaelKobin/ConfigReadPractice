package com.cydeo.tests;

import com.cydeo.Utilities.ConfigReader;
import com.cydeo.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class US10_AC2 {

@Test
    public void AC2(){
    Driver.getDriver().get(ConfigReader.getProperty("env"));
    WebElement login = Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput']"));
    login.sendKeys(ConfigReader.getProperty("truckerLogin"));
    WebElement password = Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput2']"));
    password.sendKeys(ConfigReader.getProperty("password"));
    Driver.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
    wait(

}


}
//AC2: Drivers should see the default page as 1.