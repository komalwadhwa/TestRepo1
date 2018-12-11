package com.VW.qa.util;

import org.openqa.selenium.WebElement;

public class TestUtil {

	public static long PAGE_LOAD_TIMEOUT =50;
	public static long IMPLICIT_WAIT = 10;
	public static String BaseURL= "https://www.verizonwireless.com/";
	public static String PhoneTitle;
	public static String initFactroy= "Initialize elements in page ";


public static void clickButton(WebElement element)
{
	element.click();
}
}