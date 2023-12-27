package com.dddemo.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverUtilities {

    public static WebDriver initializeWebDriver() {
        // Set up WebDriver (example for Edge)
    	    	
        return new EdgeDriver();
    }

    public static void quitWebDriver(WebDriver driver) {
        // Quit WebDriver
        if (driver != null) {
            driver.quit();
        }
    }
}
