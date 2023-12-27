package com.dddemo.sampletests;

import org.testng.annotations.Test;

import com.dddemo.base.BaseTest;
import com.dddemo.pages.LoginPage;
import com.dddemo.utilities.TestReporter;

public class ExtendReportTest extends BaseTest {

  

    @Test
    public void yourTestCase() {
        // Initialize ExtentTest for the current test case
        TestReporter.createTest("yourTestCase");

        try {
            // Your test steps
            LoginPage loginPage = new LoginPage(driver);
            loginPage.enterUsername("yourUsername");
            loginPage.enterPassword("yourPassword");
            loginPage.clickLoginButton();

            // Additional steps or assertions
            // ...

            // Log a pass in the report
            TestReporter.logPass("Test case executed successfully!");
        } catch (Exception e) {
            // Log a fail in the report
            TestReporter.logFail("Test case failed: " + e.getMessage());
        }
    }

   
}
