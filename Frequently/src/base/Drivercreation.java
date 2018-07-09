package base;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Drivercreation {
	
	String loginURL = "http://live.guru99.com/";
	public static FirefoxDriver driver;
	public static final String cdName = "webdriver.gecko.driver";
	public static final String cdPath = "E:\\geckodriver.exe";
	
	@BeforeMethod
	public void setDriver(){
		
		System.setProperty(cdName, cdPath);
		driver = new FirefoxDriver();
		driver.get(loginURL);
	}
	
	@AfterMethod
	public void afterTest(){
//	    chromeDriver.close();
	}

}
