package mobilePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class Page1 {
	//Approach 1 with static object
	public static String buttonContent = "//*[@text='Content']";
	//Approach 2 with Page factory
	@FindBy(xpath="//*[@text='Content']")
	public WebElement buttonContent2;
	

	public Page1(AppiumDriver driver) {
		
		Page1 objPage = new Page1(driver);
		PageFactory.initElements(driver, objPage);
		
	}
}
