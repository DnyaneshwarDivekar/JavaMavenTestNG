package com.dddemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dddemo.utilities.ElementHighlighterUtils;

public class LoginPage extends BasePage {

       
    @FindBy (xpath = "//a[normalize-space()='Login']")
    private WebElement loginLink;

    @FindBy(xpath = "//input[@id='username']")
    private WebElement usernameInput;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@type='button']")
    private WebElement loginButton;

    // Constructor
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    
   
    // Methods representing actions on the page
    
    public void navigateToLoginLink() {
    	
    	ElementHighlighterUtils.highlightElement(driver, loginLink);
    	
    	loginLink.click();
    }
    
    public void enterUsername(String username) {
    	
    	ElementHighlighterUtils.highlightElement(driver, usernameInput);
        usernameInput.sendKeys(username);
    }

    public void enterPassword(String password) {
    	ElementHighlighterUtils.highlightElement(driver, passwordInput);
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton() {
    	
    	ElementHighlighterUtils.highlightElement(driver, loginButton);
        loginButton.click();
    }
}
