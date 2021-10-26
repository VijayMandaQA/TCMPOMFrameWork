package commonFunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.log4testng.Logger;



public class CommonFunctions {
	
       public static Properties properties=null;
       public static WebDriver driver=null;
       
      static Logger logger =Logger.getLogger(CommonFunctions.class);
	
	public Properties loadPropertyFile() throws IOException {
		FileInputStream fis=new FileInputStream("config.properties");
		 properties=new Properties();
		properties.load(fis);
		return properties;	
		}
	
	
	@SuppressWarnings("deprecation")
	@BeforeSuite
	public void launchBrowser() throws IOException {
		 PropertyConfigurator.configure("log4j.properties");
		 logger.info("TCM Test Begins");
		 logger.info("Loading the Property File");
		loadPropertyFile();
		String browser=properties.getProperty("browser");
		String url=properties.getProperty("url");
		String driverLocation=properties.getProperty("DriverLocation");
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", driverLocation);
			 logger.info("Launching the Chrome");
			driver=new ChromeDriver();
			
		}
		driver.manage().window().maximize();
		logger.info("Navigating to Application");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterSuite
	public void tearDown() {
		logger.info("Closing the browser");
		driver.quit();
	}
}
