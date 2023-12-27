package com.dddemo.sampletests;

import org.testng.annotations.Test;

import com.dddemo.base.BaseTest;
import com.dddemo.pages.LoginPage;

public class Test1 extends BaseTest {

    @Test
    public void testCase1() {
        // Test steps
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("yourUsername");
        loginPage.enterPassword("yourPassword");
        loginPage.clickLoginButton();

        // Perform assertions or additional steps
        // ...

        // Example: Logging
        System.out.println("Test case executed successfully!");
    }
}
