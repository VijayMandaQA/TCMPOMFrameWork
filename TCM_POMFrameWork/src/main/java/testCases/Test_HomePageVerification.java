package testCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageObjects.Home_PageObjects;

public class Test_HomePageVerification extends CommonFunctions{
	
	static Logger logger=Logger.getLogger(Test_HomePageVerification.class);
	
	String actualMessage;
	public void getHomePageTitle() {
		logger.info("Getting the BibleStudy Text");
		PageFactory.initElements(driver, Home_PageObjects.class);
	     actualMessage=Home_PageObjects.BibleStudyText.getText();
		
	}
	
	@Test
	public void verifyingHomePageTitle() {
		getHomePageTitle();
		logger.info("Verifying the Bible Study Text");
		Assert.assertEquals(actualMessage, "Bible Study");
		
	}

}
