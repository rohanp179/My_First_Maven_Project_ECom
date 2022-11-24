package com.ecom.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static String projectPath = System.getProperty("user.dir");
	
	public static WebDriver driver;

	public static WebDriver getDriver () {
		
		System.setProperty("webdriver.chrome.driver", projectPath+"\\driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/V1/index.php");
		
		return driver;
		
		
	}
}
