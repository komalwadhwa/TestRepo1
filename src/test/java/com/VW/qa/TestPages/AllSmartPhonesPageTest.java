package com.VW.qa.TestPages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.VW.qa.TestBase.TestBaseClass;
import com.VW.qa.pages.AllSmartPhonesPage;
import com.VW.qa.pages.HomePage;

public class AllSmartPhonesPageTest extends TestBaseClass{
	AllSmartPhonesPage SP;
	
	/*public AllSmartPhonesPageTest()
	{//call TestBaseClass constructor
	//	super();
		}
	*/
	@BeforeMethod
	public void setup()
	{
		//intialization();
		//methods in home page class are static so I have to create obj of this class to use its methods
		SP= new AllSmartPhonesPage(driver);				
	}
	
	//this test method takes the user to 	
	@Test
	public void clickApple() {

		System.out.println("inside all smart phones page class");
		SP.clickApple();
		System.out.println("after clicking on product - inside all smart phones page class");
		//return new 
	}
	
	@AfterMethod()
	public void tearDown() {
	//	driver.quit();
	}
	
}