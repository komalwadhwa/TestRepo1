package com.VW.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.VW.qa.util.TestUtil;


//devices page
public class ProductDetailPage {
	
    //to do put alll the radio buttons in a list of elements and go through 
	//the radio button list and select the radio button based on the color passed in argument list
	//@FindBy(xpath="//input[@id='#FFFF00']")
	WebElement yellowRadioButton;
	//later List<WebElements>
    
	WebDriverWait wait;
    
    @FindBy(xpath="//button[text()='Add to Cart']")
	WebElement btnAddToCart;
	
	public ProductDetailPage(WebDriver driver) {
	//	System.out.println(TestUtil.initFactroy + this.getClass());
		//	"intailize elements in devices page");

		PageFactory.initElements(driver,this);		
		wait=new WebDriverWait(driver,5);
	}
			
	public void clickRadioButton() {
		try {
		System.out.println("inside ProductDetailPage - click color radio button");
		Thread.sleep(6000);
		WebElement rb= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='#FFFF00']")));
			
		//yellowRadioButton.click();
		
		//if(yellowRadioButton.isSelected())
				if (rb.isDisplayed())
		System.out.println("yellow radio button selected");
		else
			System.out.println("yellow radio button not selected");
			
				rb.click();
			
		System.out.println("yellow radio button clicked");
		}catch (Exception e)
		{ //e.printStackTrace();
			//Reporter.log
			System.out.println("Yellow radio button not clickable/found");}
		
		//later based on color passed- click radio button
		/*		List<WebElement> radioButtons = driver
						.findElements(By.xpath("//input[contains(@type,'radio') and contains(@name,'colors')]"));
				// alternative xpath: //input[@type='radio' and @name='cars']
				// System.out.println("is enabled :" + e1.isEnabled());
				// for radiobutton/checkbox it will be e1.isSelected()

				// if u want to find all elements in the page with name cars and going through
				// for loop for each element will select them
				// radioButtons = driver.findElements(By.name("cars"));

				Boolean blnE1;

				for (int i = 0; i < radioButtons.size(); i++) {
					blnE1 = radioButtons.get(i).isSelected();
					if (!(blnE1)) {
						radioButtons.get(i).click();

						Thread.sleep(3000);
					}*/
	}
	
	public void clickAddToCart() {
		
		btnAddToCart.click();		
	}
	
	

}
