package com.dddemo.testsuite;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;

import com.dddemo.tests.VerifyLoginPage;

public class TestSuite {

    public static void main(String[] args) {
        TestListenerAdapter tla = new TestListenerAdapter();
        TestNG testng = new TestNG();
        testng.setTestClasses(new Class[] { VerifyLoginPage.class });
        testng.addListener(tla);
        testng.run();
    }
}
