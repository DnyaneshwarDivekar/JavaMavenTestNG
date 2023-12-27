package com.dddemo.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementHighlighterUtils {
	
	public static void highlightElement(WebDriver driver, WebElement element) {
        // Create JavaScriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Store original border color and style
        String originalStyle = element.getAttribute("style");

        // Highlight element by changing border color and style
        js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');", element);

        // Wait for a short duration (you can adjust this based on your needs)
        try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Reset element style to original
        js.executeScript("arguments[0].setAttribute('style', '" + originalStyle + "');", element);
    }


}
