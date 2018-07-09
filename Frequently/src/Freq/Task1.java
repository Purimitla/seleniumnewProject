package Freq;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import screen.Screenshots;

public class Task1 {
	@Test
	public void task() throws Exception {
		 System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
		 FirefoxDriver driver = new FirefoxDriver();
		 driver.get("http://live.guru99.com/");
		 System.out.println(driver.getTitle());
		 String title=driver.findElement(By.tagName("h2")).getText();
		 Assert.assertTrue(title.contains("THIS IS DEMO SITE FOR"));
		 WebDriverWait wait = new WebDriverWait(driver, 30);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='http://live.guru99.com/index.php/mobile.html']"))).click();
		 Screenshots.capturescreenshots(driver, "mobile");
		 Select Drpdn = new Select(driver.findElement(By.xpath("//select[@title='Sort By']"))); 
		 Drpdn.selectByVisibleText("Name");
		 Thread.sleep(3000);
		 Screenshots.capturescreenshots(driver, "NamingOrder");
		   
	}

}
