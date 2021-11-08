package appiumProject_StepDefFiles;

import org.testng.Assert;

import appiumProject_pageClasses.BaseClass;
import appiumProject_pageClasses.ViewsPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class ViewsTabs {

	// Create Object for Appium
	AppiumDriver driver;
	// Create Obj for Page class
	ViewsPage vpObj;

	@When("^User Click on Tabs$")
	public void user_Click_on_Tabs() throws Throwable {

		// Create object for driver and Views Page class
		driver = BaseClass.baseDriver;
		vpObj = new ViewsPage(driver);
		// Click on Tabs
		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Tabs\"));"))
				.click();

	}

	@When("^User Click on Content By factory$")
	public void user_Click_on_Content_By_factory() throws Throwable {

		vpObj.eleContentByFac.click();

	}

	@Then("^Select the tabs and verify text change$")
	public void select_the_tabs_and_verify_text_change() throws Throwable {

		// verify tab1 selected by default
		Assert.assertEquals(vpObj.btnTab1.getAttribute("selected"), "true");

		// click on tab2
		vpObj.btnTab2.click();
		Thread.sleep(1000);

		// get the text from UI
		String tab2Content = vpObj.eleTabText.getAttribute("text");

		// Click on Tab3
		vpObj.btnTab3.click();
		Thread.sleep(1000);

		// get text from UI
		String tab3Content = vpObj.eleTabText.getAttribute("text");

		// verify text change
		Assert.assertFalse(!(tab2Content.equalsIgnoreCase(tab3Content)), "Text not chnaging even tabs changed");

	}

}
