package mobilePages;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class FindElements {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		String sFile = "C:\\Users\\Swathi\\Downloads\\ApiDemos-debug.apk";
		
		// To create an object of Desired Capabilities
		DesiredCapabilities capability = new DesiredCapabilities();
		// OS Name
		capability.setCapability("device", "Android");
		capability.setCapability(CapabilityType.BROWSER_NAME, "");
		// Mobile OS version. In My case its running on Android 4.2
		capability.setCapability(CapabilityType.VERSION, "11.0");
		capability.setCapability("app", sFile);
		// To Setup the device name
		capability.setCapability("deviceName", "Pixel 2 API 30 2");
		capability.setCapability("platformName", "Android");
		// set the package name of the app
		capability.setCapability("app-package", "io.appium.android.apis");
		// set the Launcher activity name of the app
		capability.setCapability("app-activity", ".ApiDemos");
		// driver object with new Url and Capabilities
		AppiumDriver driver = new AppiumDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capability);
		
		//object for page 1
		Page1 obj = new Page1(driver);
		Thread.sleep(2000);
		//Approach 1 with static object
		driver.findElement(MobileBy.xpath(Page1.buttonContent)).click();
		//Approach 2 with page factory
		obj.buttonContent2.click();
		
		
		// driver.findElement(MobileBy.id("android:id/text1")).click();
		// driver.findElement(MobileBy.xpath("//*[@text='Content']")).click();

		// driver.findElementById("android:id/text1").click();
		// driver.findElementByXPath("//*[@text='Content']").click();

		/*for (MobileElement eachElement : (List<MobileElement>) driver.findElementsById("android:id/text1")) {
			System.out.println(eachElement.getAttribute("text"));
		}*/

		Thread.sleep(2000);
	}
}
