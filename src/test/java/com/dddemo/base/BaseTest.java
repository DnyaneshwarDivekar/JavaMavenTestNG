package com.dddemo.base;


import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.dddemo.utilities.ConfigReader;
import com.dddemo.utilities.ScreenshotUtils;
import com.dddemo.utilities.TestReporter;
import com.dddemo.utilities.WebDriverUtilities;

public class BaseTest {

    protected static WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Initialize WebDriver
        driver = WebDriverUtilities.initializeWebDriver();      
        
     // Initialize ExtentReports with a timestamp and specific directory
        TestReporter.initReporter("C:\\GitHubProjects\\JavaMavenTestNG\\reports", "extent-report");
        
        driver.get(ConfigReader.getUrl());
    }
    
    
    @AfterMethod
    public void tearDown(ITestResult result) {
        // Quit WebDriver
        if (driver != null) {
            if (result.getStatus() == ITestResult.FAILURE) {
                // Capture screenshot on test failure
            	ScreenshotUtils.captureScreenshot(driver, result.getName());
            	
            	 // Log the failure in the report
                TestReporter.logFail("Test case failed. Check screenshot for details.");
            }
            

            
            WebDriverUtilities.quitWebDriver(driver);
        }
        
        // Flush the ExtentReports to generate the report
        TestReporter.flushReport();
    }
    
    
    

    
    
    public static WebDriver getDriver() {
        if (driver == null) {
            throw new IllegalStateException("Driver has not been initialized. Call setUp() before using getDriver().");
        }
        return driver;
    }
}
