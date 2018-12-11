package com.VW.qa.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import com.VW.qa.util.TestUtil;

public class TestBaseClass {

	//use static vars so it can be used in child classes , and through out the project
	public static WebDriver driver;
	public static Properties prop;
	
	//check lecturer 158 and add code in below constructor and intialization() method below in @BeforeSuite annotation
	//extending testbase class in each test class will make obj reference "driver" available 
	public TestBaseClass() 
	{
		System.out.println("inside constructor TestBaseClass");
		prop = new Properties();	
//		String path="//VWShopCartK//src//main//java/config1.properties";
		String path= "C:\\Users\\komal\\eclipse-workspace\\VWShopCartK\\src\\main\\java\\config1.properties";          
		
		try {
			//System.out.println("inside try and print path");	
			
			FileInputStream ip = new FileInputStream(path);
			//System.out.println("inside try after and print path" + path);	
			//this will read complete file inside the memory
		    prop.load(ip);
		   //System.out.println("print base url" + prop.getProperty("BaseURL"));
		} 		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			 System.out.println("inside catch1");
			// Reporter.log(e.getMessage());
			 
			e.printStackTrace();
		} catch (IOException e) 
		{			System.out.println("inside catch2");
		e.printStackTrace();}
		//catch (Exception E) {}
		
	finally {
		System.out.println("inside finally of TestBaseClass");
	}
	
	}
	
	//create static method so it can be called globally
	public void intialization()
	{
		String browName=prop.getProperty("Browser"); //browName = "chrome";//
		if (browName.equals("chrome"))
		{
			//path variable already set
			System.setProperty("webdriver.chrome.driver", "c://Users//komal//workspace_personal//Selenium//chromeDriver//chromedriver.exe");
			driver  = new ChromeDriver();
		}
		else if (browName.equals("firefox"))
		 {System.setProperty("webdriver.gecko.driver", "/Users//komal//workspace_personal//Selenium//BrowserDrivers//geckodriver.exe");
			driver = new FirefoxDriver();
			}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		System.out.println("driver launched");
		
	 driver.get(prop.getProperty("BaseURL"));
	//	driver.get(TestUtil.BaseURL);
	}
	
	/*//create static method so it can be called globally
		public void intialization(String strURL)
		{
			String browName=prop.getProperty("Browser"); //browName = "chrome";//
			if (browName.equals("chrome"))
			{
				//path variable already set
				System.setProperty("webdriver.chrome.driver", "c://Users//komal//workspace_personal//Selenium//chromeDriver//chromedriver.exe");
				driver  = new ChromeDriver();
			}
			else if (browName.equals("firefox"))
			 {System.setProperty("webdriver.gecko.driver", "/Users//komal//workspace_personal//Selenium//BrowserDrivers//geckodriver.exe");
				driver = new FirefoxDriver();
				}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			
			System.out.println("driver launched");
			
		 driver.get(strURL);
		//	driver.get(TestUtil.BaseURL);
		}
 */
	
}
