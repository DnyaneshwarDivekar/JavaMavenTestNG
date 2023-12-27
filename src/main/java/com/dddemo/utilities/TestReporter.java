package com.dddemo.utilities;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import java.text.SimpleDateFormat;
import java.util.Date;

@SuppressWarnings("deprecation")
public class TestReporter {

    private static ExtentReports extent;
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    public static void initReporter(String reportDirectory, String reportName) {
        // Create a timestamp to include in the report name
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

        // Construct the complete report path
        String reportPath = reportDirectory + "/" + reportName + "_" + timestamp + ".html";

        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(reportPath);
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }

    public static void createTest(String testName) {
        ExtentTest extentTest = extent.createTest(testName);
        test.set(extentTest);
    }

    public static void logInfo(String message) {
        test.get().log(Status.INFO, message);
    }

    public static void logPass(String message) {
        test.get().log(Status.PASS, message);
    }

    public static void logFail(String message) {
        test.get().log(Status.FAIL, message);
    }

    public static void flushReport() {
        extent.flush();
    }
}
