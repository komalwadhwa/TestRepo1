package com.VW.qa.TestPages;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.VW.qa.TestBase.TestBaseClass;
import com.VW.qa.pages.AllSmartPhonesPage;
import com.VW.qa.pages.HomePage;
import com.VW.qa.util.TestUtil;


public class HomePageTest extends TestBaseClass
{
HomePage hm;
AllSmartPhonesPage AllSP;
//TestUtil test = new TestUtil();
	
	/*public HomePageTest()
	{//call TestBaseClass constructor
		//super();
				System.out.println("after super called");
		}
	*/

//todo (check lecture 158 for refrence): annotatiing intialization() method in TestBaseClass with @BeforeSuite annotation will not need below method
	@BeforeSuite
	public void setup()
	{
		intialization();
		//methods in home page class are static so I have to create obj of this class to use its methods
		
		
	}
	
	@BeforeMethod
	public void intialize()
	{
		hm = new HomePage(driver);	
	}
	
	//this test method takes the user to smartphones list
	@Test//(priority=1)
	public void clickPhones() {
		//AllSP =
		hm.clickPhonesMenu();
	//test.clickButton(element);
	}
	

	
	//todo put this in TestBaseClass @AfterSuite annotation and remove from here
	@AfterSuite
	public void tearDown() throws InterruptedException {
	Thread.sleep(5000);	
	//driver.quit();
	}
	
	
	
	
}
