package com.VW.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.VW.qa.util.TestUtil;

public class AllSmartPhonesPage {

	@FindBy(xpath = "//a[@href='/smartphones/apple-iphone-xr/?sku=sku3190241']")
	WebElement iphoneXR;

	public AllSmartPhonesPage(WebDriver driver) {
	//	System.out.println(TestUtil.initFactroy + this.getClass());
			//	"intailize elements in devices page");
		PageFactory.initElements(driver,this);		
	}

	public void clickApple() {
		// String IPhoneXRTitle=
		System.out.println("inside all smart phones test class");

		try {
			TestUtil.PhoneTitle = getIPhoneXRTitle();

			System.out.println("inside all smart phones test class");
			if (iphoneXR.isEnabled()) {
				System.out.println("link enabled");
				iphoneXR.click();
				System.out.println("iphone xr clicked");
			} else {
				System.out.println("cannot find iphone xr");
			}

			System.out.println("inside all smart phones test class");
			// return new ProductDetailPage();
		} catch (Exception e) {
			System.out.println("errro message" + e.getMessage());
		}
	}

	public String getIPhoneXRTitle() {

		// System.out.println(iphoneXR.getText());
		return iphoneXR.getText();
	}

}
