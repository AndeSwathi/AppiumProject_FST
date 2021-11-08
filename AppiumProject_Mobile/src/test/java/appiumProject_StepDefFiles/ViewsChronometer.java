package appiumProject_StepDefFiles;

import java.io.FileReader;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import appiumProject_pageClasses.BaseClass;
import appiumProject_pageClasses.ViewsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ViewsChronometer {

	// Create Object for Appium
	AppiumDriver driver;
	// Create Obj for Page class
	ViewsPage vpObj;
	// Read Properties file
	FileReader reader;
	Properties propFile;

	@Given("^User is on API demos home page$")
	public void user_is_on_API_demos_home_page() throws Throwable {

		reader = new FileReader("D:\\AndeSwathi\\EclipseWorkplace\\AppiumProject_Mobile\\Config\\TestData.properties");
		propFile = new Properties();
		propFile.load(reader);

		// To create an object of Desired Capabilities
		DesiredCapabilities capability = new DesiredCapabilities();
		// OS Name
		capability.setCapability("device", propFile.getProperty("Device"));
		capability.setCapability(CapabilityType.BROWSER_NAME, "");
		// Mobile OS version. In My case its running on Android 4.2
		capability.setCapability(CapabilityType.VERSION, propFile.getProperty("Version"));
		capability.setCapability("app", propFile.getProperty("File"));
		// To Setup the device name
		capability.setCapability("deviceName", propFile.getProperty("DeviceName"));
		capability.setCapability("platformName", propFile.getProperty("Device"));
		// set the package name of the app
		capability.setCapability("app-package", propFile.getProperty("AppPkg"));
		// set the Launcher activity name of the app
		capability.setCapability("app-activity", propFile.getProperty("AppName"));
		// driver object with new Url and Capabilities
		driver = new AppiumDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capability);
		Thread.sleep(2000);
		BaseClass.baseDriver = driver;
	}

	@When("^User Click on Views$")
	public void user_Click_on_Views() throws Throwable {

		// Create object for Views Page class
		vpObj = new ViewsPage(driver);

		// Tap on Views
		vpObj.viewsOption.click();
		Thread.sleep(2000);

	}

	@When("^User Click on Chronometer$")
	public void user_Click_on_Chronometer() throws Throwable {

		// Tap on Chronometer
		vpObj.ChronometerOption.click();
		Thread.sleep(2000);

	}

	@Then("^Verify Start, Stop and Rest Options$")
	public void verify_Start_Stop_and_Rest_Options() throws Throwable {

		// Click on start timer
		vpObj.btnStart.click();
		Thread.sleep(2000);

		// wait some time
		Thread.sleep(2000);

		// Click on Stop timer
		vpObj.btnStop.click();

		// Verify time is not 00:00
		String stopTime = vpObj.intialTime.getAttribute("text");
		Assert.assertTrue(!(stopTime.contains(propFile.getProperty("Timer"))), "START Option is working as expected");

		// Click on Reset
		vpObj.btnReset.click();

		// wait some time
		Thread.sleep(2000);

		// Verify time is 00:00
		String resetTime = vpObj.intialTime.getAttribute("text");
		Assert.assertTrue(resetTime.contains(propFile.getProperty("Timer")), "Reset Option is working as expected");

	}

}
