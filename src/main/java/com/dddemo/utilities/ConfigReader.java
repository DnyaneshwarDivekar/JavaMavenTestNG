package com.dddemo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;

    static {
        properties = new Properties();
        try (FileInputStream fileInputStream = new FileInputStream("C:\\GitHubProjects\\JavaMavenTestNG\\resources\\config.properties")) {
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception, such as logging or throwing a custom exception
        }
    }

    public static String getUrl() {
        return properties.getProperty("url");
    }

    public static String getUsername() {
        return properties.getProperty("username");
    }

    public static String getPassword() {
        return properties.getProperty("password");
    }

    // Add more methods to retrieve other properties if needed
}
