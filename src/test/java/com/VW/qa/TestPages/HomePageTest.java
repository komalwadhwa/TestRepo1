package com.VW.qa.TestPages;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.VW.qa.TestBase.TestBaseClass;
import com.VW.qa.pages.HomePage;


public class HomePageTest extends TestBaseClass
{
	HomePage homePg;
//AllSmartPhonesPage AllSP;
//TestUtil test = new TestUtil();
	
	/*public HomePageTest()
	{//call TestBaseClass constructor
		//super();
				System.out.println("after super called");
		}
	*/

//todo (check lecture 158 for refrence): annotatiing intialization() method in TestBaseClass with @BeforeSuite annotation will not need below method
	@BeforeClass
	public void intialize()
	{
		homePg = new HomePage(driver);	
	}
	
	//this test method takes the user to smartphones list
	@Test//(priority=1)
	public void clickPhones() {
		
		homePg.clickPhonesMenu();
	//test.clickButton(element);
	}
	

	
	
	
	
	
	
}
