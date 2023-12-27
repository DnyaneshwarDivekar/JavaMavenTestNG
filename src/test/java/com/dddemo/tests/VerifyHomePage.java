package com.dddemo.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.dddemo.base.BaseTest;
import com.dddemo.pages.HomePage;

public class VerifyHomePage extends BaseTest{
	
	HomePage homePage;
	
	
	@Test 
	
	public void verifyHomePageTitle() {
		
		homePage = new HomePage(driver);
		
		String actTitle = homePage.getPageTitle();
		String expTitle = "Home Page";
		
		Assert.assertEquals(actTitle, expTitle);		
		
	}
	
	@Test
	
	public void verifyHomePageHeader() {
		
		homePage = new HomePage(driver);
		
		String actHeaderText = homePage.getHeaderText();
		String expHeaderText = "Home Page";
		
		Assert.assertEquals(actHeaderText, expHeaderText);
	}
	
	@Test
	
	public void verifyHomeLink() {
		
			
		homePage = new HomePage(driver);
		
		homePage.clickHomeLink();
		
		
	}
	

}
