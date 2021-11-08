package appiumProject_StepDefFiles;

import org.testng.Assert;

import appiumProject_pageClasses.BaseClass;
import appiumProject_pageClasses.ViewsPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;

public class ViewsControls {

	// Create Object for Appium
	AppiumDriver driver;
	// Create Obj for Page class
	ViewsPage vpObj;

	@When("^User Click on Controls$")
	public void user_Click_on_Controls() throws Throwable {

		// Create object for driver and Views Page class
		driver = BaseClass.baseDriver;
		vpObj = new ViewsPage(driver);
		// Tap on Controls
		vpObj.ControlsOption.click();

	}

	@When("^User Click on Holo or old theme$")
	public void user_Click_on_Holo_or_old_theme() throws Throwable {

		// Click on Holo or old theme
		vpObj.HoloOldTheme.click();

	}

	@Then("^Verify Check box selection and Radio button$")
	public void verify_Check_box_selection_and_Radio_button() throws Throwable {

		// click on check box
		vpObj.chkBox.click();
		Thread.sleep(2000);
		// Verify whether check box is selected
		Assert.assertEquals(vpObj.chkBox.getAttribute("checked"), "true");
		// Select radio button
		vpObj.rdoBtn.click();
		Thread.sleep(2000);
		// Verify whether radio button is selected
		Assert.assertEquals(vpObj.rdoBtn.getAttribute("checked"), "true");
		// Click on drop down and select an element
		vpObj.lstDropDown.click();
		// Select earth element
		vpObj.eleEarth.click();
		Thread.sleep(2000);
		// Verify earth is selected or not
		// Assert.assertEquals(vpObj.lstDropDown.getAttribute("text"), "Earth");

	}

}
