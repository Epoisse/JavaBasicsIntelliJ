package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileDemo1 {
    public static void main(String[] args) throws IOException {
        // first step locating the file that we want to read
        String path="/Users/sebvettal/Desktop/Config.properties";
        //navigating to that location
        FileInputStream fileInputStream=new FileInputStream(path);
        //That special class which knows how to read the .properties file
        Properties properties=new Properties();
        //Loading all the data from the file to properties object
        properties.load(fileInputStream);
        System.out.println(properties.get("username"));
        System.out.println(properties.get("password"));
    }
}
