package com.dddemo.tests;

import org.testng.annotations.Test;

import com.dddemo.base.BaseTest;
import com.dddemo.pages.LoginPage;
import com.dddemo.utilities.TestReporter;

public class VerifyLoginPage extends BaseTest{
	
	@Test
	
	public void verifyValidLoginTest() {
		
		// Initialize ExtentTest for the current test case
        TestReporter.createTest("verifyValidLoginTest");
		
		
		
		
		 try {
			 LoginPage loginPage = new LoginPage(driver);
				
				loginPage.navigateToLoginLink();
				
				loginPage.enterUsername("user1");
				loginPage.enterPassword("Test@123");
				loginPage.clickLoginButton();

	            // Log a pass in the report
	            TestReporter.logPass("Test case executed successfully!");
	        } catch (Exception e) {
	            // Log a fail in the report
	            TestReporter.logFail("Test case failed: " + e.getMessage());
	        }
		
		
	}
	
	   @Test
	    public void LoginFailed() {
	        // Initialize ExtentTest for the current test case
	        TestReporter.createTest("LoginFailed");

	        try {
	            // Your test steps
	            LoginPage loginPage = new LoginPage(driver);
	            loginPage.enterUsername("yourUsername");
	            loginPage.enterPassword("");
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
