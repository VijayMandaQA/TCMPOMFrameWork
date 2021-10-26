package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import commonFunctions.CommonFunctions;
import pageObjects.Videos_PageObjects;

public class Test_VideosVerification extends CommonFunctions{
	
    static Logger logger =Logger.getLogger(Test_VideosVerification.class);
	
	public void navigatingToVideosTab() {
		logger.info("Navigating to the Videos Tab");
		PageFactory.initElements(driver, Videos_PageObjects.class);
		Videos_PageObjects.VideosTab.click();	
	}
	
	
	@Test
	public void watchingVideo() {
		navigatingToVideosTab();
		logger.info("Watching the Video");
		PageFactory.initElements(driver, Videos_PageObjects.class);
		Videos_PageObjects.VideoView.click();
	}

}
