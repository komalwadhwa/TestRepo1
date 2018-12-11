package com.VW.qa.TestPages;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.VW.qa.TestBase.TestBaseClass;
import com.VW.qa.pages.ProductDetailPage;

//devices page
public class ProductDetailPageTest extends TestBaseClass{
	ProductDetailPage PD;
	//AddToCartPage AToC;
	
	public ProductDetailPageTest()
	{//call TestBaseClass constructor
		//super();
		}
	
	@BeforeMethod
	public void setup()
	{
		//intialization("https://www.verizonwireless.com/smartphones/apple-iphone-xr/?sku=sku3190241");
		//methods in home page class are static so I have to create obj of this class to use its methods
		PD = new ProductDetailPage(driver);				
	}
	
	//this test method takes the user to 	
	@Test(priority=1)
	public void clkRadioButton()  {
		PD.clickRadioButton();
		//return new 
		
	}
	
     @Test(priority=2)
	public void clkAddToCart() {
		 PD.clickAddToCart();		
	}
	
	@AfterMethod()
	public void tearDown() {
	
		//driver.quit();
	}
	
}
