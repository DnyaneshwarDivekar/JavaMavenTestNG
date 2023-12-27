package com.dddemo.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtils {
	
	
	public static void captureScreenshot(WebDriver driver, String testName) {
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Define the path to save the screenshot
        String screenshotPath = "screenshots/" + testName + "_screenshot.png";

        try {
            // Copy the screenshot file to the specified path
            org.apache.commons.io.FileUtils.copyFile(screenshotFile, new File(screenshotPath));
            System.out.println("Screenshot captured: " + screenshotPath);
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Unable to capture screenshot: " + e.getMessage());
        }
    }

}
