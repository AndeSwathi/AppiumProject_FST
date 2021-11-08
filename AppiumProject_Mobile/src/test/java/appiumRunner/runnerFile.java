package appiumRunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import appiumProject_pageClasses.BaseClass;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/appiumProject_FeatureFiles", 
					glue = {"appiumProject_StepDefFiles" }, 
					tags = {"@ViewsTabs"},
					plugin = { "pretty", "html:target/cucumber-reports" }, 
					monochrome = true)

public class runnerFile {
	
	@AfterClass
	public static void killSession()
	{
		BaseClass.baseDriver.quit();
	}

}
