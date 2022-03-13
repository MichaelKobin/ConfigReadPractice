package com.cydeo.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties properties = new Properties();

    static {
        try{
            FileInputStream file = new FileInputStream("configuration.properties");
            properties.load(file);

            file.close();
        }catch(IOException e){
            System.out.println("file not found in configreader");
            e.printStackTrace();
        }
    }
    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }
}
