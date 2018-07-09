package Freq;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.Drivercreation;

public class Task2 extends Drivercreation {

	@Test
	public void SecondTestcase() {
	WebDriverWait wait = new WebDriverWait(driver, 30);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='http://live.guru99.com/index.php/mobile.html']"))).click();
	String readValue = driver.findElement(By.xpath("//span[@id='product-price-1']")).getText();
	System.out.println(readValue);
	driver.findElement(By.xpath("//img[@id='product-collection-image-1']")).click();
	String detailValue = driver.findElement(By.xpath("//span[@id='product-price-1']")).getText();
	System.out.println(detailValue);
	Assert.assertEquals(readValue, detailValue);

	}
}
