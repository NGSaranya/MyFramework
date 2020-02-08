package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

import cucumber.api.java.en.Then;

public class HomePage extends ProjectSpecificMethods{

	public HomePage(RemoteWebDriver driver, ExtentTest node, ExtentTest test){
		this.driver = driver;
		this.node = node;
		this.test = test;
		PageFactory.initElements(driver, this);
	}		

	
	public HomePage verifyTitle() {
		String title = driver.getTitle();
		System.out.println("Page Title:" + title);
		return this;
	}

	@FindBy(how=How.LINK_TEXT,using="Log Out")
	private WebElement eleLogOut;
	
	public LoginPage clickLogout() {
		click(eleLogOut);
		return new LoginPage(driver, node, test);
	}
	
	

}










