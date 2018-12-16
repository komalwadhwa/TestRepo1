package com.VW.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.VW.qa.TestBase.TestBaseClass;

public class HomePage 
{
	WebDriver driver;
	
	//Page Factory OR
	@FindBy(xpath="//span[contains(text(),'Phones')]")
	//@FindBy(xpath="//span[@href='https://www.verizonwireless.com/devices/']")
	WebElement menuPhones;
	
	@FindBy(xpath="//a[@href='/smartphones/apple-iphone-xr/?sku-sku3190241']")
	WebElement iphoneXR;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public void clickPhonesMenu() {
		menuPhones.click();
		
	}
	
	
	

}
