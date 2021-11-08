package appiumProject_StepDefFiles;

import org.apache.commons.lang3.time.DateUtils;
import org.testng.Assert;

import appiumProject_pageClasses.BaseClass;
import appiumProject_pageClasses.ViewsPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;

public class ViewsDateWidgets {

	// Create Object for Appium
	AppiumDriver driver;
	// Create Obj for Page class
	ViewsPage vpObj;

	@When("^User Click on Date Widgets$")
	public void user_Click_on_Date_Widgets() throws Throwable {

		// Create object for driver and Views Page class
		driver = BaseClass.baseDriver;
		vpObj = new ViewsPage(driver);
		// Click on Date Widgets
		vpObj.eleDateWidgets.click();

	}

	@When("^User Click on Dialog$")
	public void user_Click_on_Dialog() throws Throwable {

		// Click on dialog
		vpObj.eleDialog.click();

	}

	@Then("^Change date and verify the results$")
	public void change_date_and_verify_the_results() throws Throwable {

		// Get the date before changing
		String dtBefore = vpObj.eleDate.getAttribute("text");
		// Click on Change the date
		vpObj.btnChangeDate.click();
		vpObj.dtCalender.click();
		vpObj.btnOK.click();
		// get the date after changing
		String dtAfter = vpObj.eleDate.getAttribute("text");
		System.out.println(dtAfter);
		// Change before and after dates to date format
		Assert.assertEquals(dtAfter.split("-")[1], "10");

	}

}
