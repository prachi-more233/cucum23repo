package com.multiplestepdeffilesjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;

public class ParentStepDefs {
	
	 
	/**
	 * This method is created to just get the driver. This can be easily achieved in step defs class by
	 * creating the @Before method 
	 * 
	 */
	public WebDriver getDriver() throws InterruptedException {
		System.out.println("in setup");
		System.setProperty("webdriver.chrome.driver", "S:\\prachu\\JAVA SELENIUM\\Radical_Aundh\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("opned browser");
		Thread.sleep(5000);
		return driver;
	}

}
