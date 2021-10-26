package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_PageObjects {
	
	@FindBy(xpath = "//h3[contains(text(),'Bible Study')]")
	public static WebElement BibleStudyText;

}
