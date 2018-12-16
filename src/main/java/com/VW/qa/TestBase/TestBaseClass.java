package com.VW.qa.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.VW.qa.pages.HomePage;
import com.VW.qa.util.TestUtil;

public class TestBaseClass {

	//use static vars so it can be used in child classes , and through out the project
	public static WebDriver driver;
	//protected HomePage homePg;
	//protected AllSmartPhonesPage AllPhonesPg;
	public static Properties prop;
	
	//check lecturer 158 and add code in below constructor and intialization() method below in @BeforeSuite annotation
	//extending testbase class in each test class will make obj reference "driver" available 
	public TestBaseClass() 
	{
		System.out.println("inside constructor TestBaseClass");
		prop = new Properties();	
//		String path="//VWShopCartK//src//main//java/config1.properties";
		String path= "C:\\Users\\komal\\eclipse-workspace\\VWShopCartClonedfromGit\\src\\main\\java\\config1.properties"; 
		   try {
			
			FileInputStream ip = new FileInputStream(path);
			//this will read complete file inside the memory
		    	prop.load(ip);
		  
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

	
	@BeforeSuite(alwaysRun=true)
	public void setup()
	{
		driver=	getDriverInstance("chrome");
		//homePg= PageFactory.initElements(driver, HomePage.class);

	}
	
	/* passing browser parameter does not work
	 @Parameters({"browser"})
	 @BeforeSuite(alwaysRun=true)
	public void setup(String browser)
	{
		driver=	getDriverInstance(browser);
		//homePg= PageFactory.initElements(driver, HomePage.class);

	}
	*/
	
	//create static method so it can be called globally
	public static WebDriver getDriverInstance(String browser)
	{
		WebDriver driver=null;
		String browName= browser;
				//prop.getProperty("Browser"); //browName = "chrome";//
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
	 System.out.println("-------------base url is: " + prop.getProperty("BaseURL"));
	 return driver;
	
	}
	
	
	//todo put this in TestBaseClass @AfterSuite annotation and remove from here
		@AfterSuite
		public void tearDown() throws InterruptedException {
	//	Thread.sleep(10000);	
		
		//driver.quit();
		}
	
}
