package com.dddemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dddemo.utilities.ElementHighlighterUtils;

public class HomePage extends BasePage {

    private WebDriver driver;

    @FindBy(xpath = "//h1[normalize-space()='Home Page']")
    private WebElement headerText;

    @FindBy(xpath = "//a[normalize-space()='Home']")
    private WebElement homeLink;

    @FindBy(xpath = "//a[normalize-space()='Register']")
    private WebElement registerLink;
    
    @FindBy(xpath = "//a[normalize-space()='Login']")
    private WebElement loginLink;
    
    @FindBy(xpath = "//a[normalize-space()='Textbox Test']")
    private WebElement textboxTestLink;
    
    @FindBy(xpath = "//p[contains(text(),'Welcome to our website! Please use the links above')]")
    private WebElement welcomeText;

    // Constructor
    public HomePage(WebDriver driver) {
        super(driver);
    }

    // Methods representing actions on the page
    
    public String getPageTitle() {
    	
    	return driver.getTitle();
    }
    
    public String getHeaderText() {
    	
    	ElementHighlighterUtils.highlightElement(driver, headerText);

    	return headerText.getText();
    	
    }
    
    public void clickHomeLink() {
    	
    	ElementHighlighterUtils.highlightElement(driver, homeLink);

    	homeLink.click();
    }
    
    public void clickRegisterLink() {
    	
    	ElementHighlighterUtils.highlightElement(driver, registerLink);

    	registerLink.click();
    }
    
    public void clickLoginLink() {
    	
    	ElementHighlighterUtils.highlightElement(driver, loginLink);

    	loginLink.click();
    }
    
    public void clickTextboxTestLink() {
    	
    	ElementHighlighterUtils.highlightElement(driver, textboxTestLink);
    	
    	textboxTestLink.click();    	
    }
    
    public String getWelcomeText() {
    	
    	ElementHighlighterUtils.highlightElement(driver, welcomeText);
    	return welcomeText.getText();
    }
}
