package Freq;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.Drivercreation;

public class Task4 extends Drivercreation {
	String currentwindow;
	@Test
	public void fourthTestcase() throws Exception{
		
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='http://live.guru99.com/index.php/mobile.html']"))).click();	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,1000)");
	driver.findElement(By.xpath("(//a[@class='link-compare'])[1]")).click();
	String Sony = driver.findElement(By.xpath("//a[@title='Sony Xperia']")).getText();
	driver.findElement(By.xpath("(//a[@class='link-compare'])[2]")).click();
	//(//h2[@class='product-name']/following-sibling::div[@class='actions']/button[@title='Add to Cart'])[2]    this is for add to cart
	String iphone  = driver.findElement(By.xpath("//h2/a[@title='IPhone']")).getText();
	String HomePage = driver.getWindowHandle();
//	System.out.println(HomePage);
	driver.findElement(By.xpath("//button[@title='Compare']")).click();
	Set<String> windows = driver.getWindowHandles();
//	System.out.println(windows);
	//(//li/span[@class='separator']/following-sibling::a[@class='link-compare'])[1],, (//a[@class='link-compare'])[1]
	Iterator<String> itr = windows.iterator();
	while(itr.hasNext())
	{
		currentwindow = itr.next().toString();
	}
	if(!currentwindow.equals(HomePage))
	{
		driver.switchTo().window(currentwindow);
		String exptd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Compare Products')]"))).getText();
		try {
		    Assert.assertTrue(exptd.equalsIgnoreCase("Compare Products"));
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}
			
		String ExpectedSony = driver.findElement(By.xpath("//h2/a[@title='Sony Xperia']")).getText();
		try {
		    Assert.assertEquals(ExpectedSony, Sony);
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}
		
		String Expectiphone = driver.findElement(By.xpath("//h2/a[@title='IPhone']")).getText();
		try {
		    Assert.assertEquals(Expectiphone, iphone);
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}
		
	    driver.close();
	}
	driver.switchTo().window(HomePage);
	System.out.println(driver.getTitle());
	driver.quit();
	
	
	
}
}