package com.cydeo.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class WebDriverFactory {



        public static WebDriver getDriver(String browserType){

            if (browserType.equalsIgnoreCase("opera")){

                WebDriverManager.operadriver().setup();
                return new OperaDriver();

            }else if (browserType.equalsIgnoreCase("firefox")){
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            }else{
                System.out.println("Given browser type does not exist/or is not currently supported");
                System.out.println("Driver = null");
                return null;
            }


        }

    }


