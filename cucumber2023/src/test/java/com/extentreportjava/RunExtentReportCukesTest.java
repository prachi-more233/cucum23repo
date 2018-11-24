package com.extentreportjava;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@Cucumber.Options(format = {"pretty", "html:target/cucumber-htmlreport", "json-pretty:target/cucumber-report.json"} )

@CucumberOptions(	features = {"src/test/resources/com/extentreport/" },
					glue={"com/extentreportjava/"},
					monochrome = true, //console output in readable format
					//dryRun = true,
					plugin = {"pretty", 
								"html:target/cucumber-htmlreport", 
								"json:target/cucumber-report.json",
								"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"
							 }
					)


public class RunExtentReportCukesTest {

}
