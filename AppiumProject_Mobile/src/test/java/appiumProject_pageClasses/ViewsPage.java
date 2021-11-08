package appiumProject_pageClasses;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ViewsPage {

	// Add Elements
	@FindBy(xpath = "//*[@text='Views']")
	public MobileElement viewsOption;

	@FindBy(xpath = "//*[@text='Chronometer']")
	public MobileElement ChronometerOption;

	@FindBy(xpath = "//*[contains(@text,'Initial format:')]")
	public MobileElement intialTime;

	@FindBy(xpath = "//*[@text='START']")
	public MobileElement btnStart;

	@FindBy(xpath = "//*[@text='STOP']")
	public MobileElement btnStop;

	@FindBy(xpath = "//*[@text='RESET']")
	public MobileElement btnReset;

	@FindBy(xpath = "//*[@text='Controls']")
	public MobileElement ControlsOption;

	@FindBy(xpath = "//*[@text='6. Holo or Old Theme']")
	public MobileElement HoloOldTheme;

	@FindBy(xpath = "//*[@text='Checkbox 1']")
	public MobileElement chkBox;

	@FindBy(xpath = "//*[@text='RadioButton 2']")
	public MobileElement rdoBtn;

	@FindBy(xpath = "//*[@resource-id='android:id/text1']")
	public MobileElement lstDropDown;

	@FindBy(xpath = "//*[@text='Earth']")
	public MobileElement eleEarth;

	@FindBy(xpath = "//*[@text='Date Widgets']")
	public MobileElement eleDateWidgets;

	@FindBy(xpath = "//*[@text='1. Dialog']")
	public MobileElement eleDialog;

	@FindBy(xpath = "//*[@resource-id='io.appium.android.apis:id/dateDisplay']")
	public MobileElement eleDate;

	@FindBy(xpath = "//*[@text='CHANGE THE DATE']")
	public MobileElement btnChangeDate;
	
	@FindBy(xpath = "//*[@text='10']")
	public MobileElement dtCalender;
	
	@FindBy(xpath = "//*[@text='OK']")
	public MobileElement btnOK;
	
	@FindBy(xpath = "//*[@text='Tabs']")
	public MobileElement btnTabs;
	
	@FindBy(xpath = "//*[@text='2. Content By Factory']")
	public MobileElement eleContentByFac;
	
	@FindBy(xpath = "//*[@text='TAB1']")
	public MobileElement btnTab1;
	
	@FindBy(xpath = "//*[@text='TAB2']")
	public MobileElement btnTab2;
	
	@FindBy(xpath = "//*[@text='TAB3']")
	public MobileElement btnTab3;
	
	@FindBy(xpath = "//*[@resource-id='android:id/tabcontent']")
	public MobileElement eleTabText;
	
	

	public ViewsPage(AppiumDriver appiumDriver) {

		// Initiate Page elements
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);

	}

}
