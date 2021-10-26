package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import commonFunctions.CommonFunctions;
import pageObjects.LiveStream_PageObjects;

public class Test_LiveStream extends CommonFunctions {
	
    static Logger logger =Logger.getLogger(Test_LiveStream.class);
	@Test
	public void navigatingLiveStreamTab() {
		logger.info("Navigating to the Live Stream Tab");
		PageFactory.initElements(driver, LiveStream_PageObjects.class);
		LiveStream_PageObjects.LiveStreamTab.click();		
	}

}
