package com.allfilesinsamefolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyFirstStepDef {
	

	@Given("^open facebook page$")
	public void openFacebookPage(){
		
		System.setProperty("webdriver.chrome.driver", "S:\\prachu\\JAVA SELENIUM\\Radical_Aundh\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	
	@When("^I enter Login name$")
	public void i_enter_Login_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "S:\\prachu\\JAVA SELENIUM\\Radical_Aundh\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Prachi");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("More");
		Thread.sleep(1000);
	    throw new PendingException();
	}

	@Then("^I verify textbox value$")
	public void i_verify_textbox_value() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "S:\\prachu\\JAVA SELENIUM\\Radical_Aundh\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Prachi");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("More");
		Thread.sleep(1000);
	    throw new PendingException();
	}

}
