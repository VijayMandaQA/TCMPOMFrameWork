package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Videos_PageObjects {
	
	@FindBy(xpath = "//body/div[@id='page-wrapper']/div[@id='header']/nav[@id='nav']/ul[1]/li[5]/a[1]")
	public static WebElement VideosTab;
	
	@FindBy(xpath = "//body[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/article[1]/section[1]/table[1]/tbody[1]/tr[2]/td[4]/a[1]")
	public static WebElement VideoView;

}
