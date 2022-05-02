package com.syntax.class31;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FacebookProperties {
    public static void main(String[] args) throws IOException {

        String path = "/Users/sebvettal/Desktop/facebook.properties";
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        Properties properties = new Properties();
        properties.put("browser", "chrome");
        properties.put("url", "https://facebook.com");
        properties.put("username", "");
        properties.put("password", "");
        properties.store(fileOutputStream, "created file");

        System.out.println(properties.get("browser"));
        System.out.println(properties.get("url"));

    }
}
