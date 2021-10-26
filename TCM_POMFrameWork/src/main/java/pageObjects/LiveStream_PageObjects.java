package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LiveStream_PageObjects {
	
	
	@FindBy(xpath = "//body/div[@id='page-wrapper']/div[@id='header']/nav[@id='nav']/ul[1]/li[3]/a[1]")
	public static WebElement LiveStreamTab;
	
	

}
