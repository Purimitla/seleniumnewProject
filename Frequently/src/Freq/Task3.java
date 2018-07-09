package Freq;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Drivercreation;

public class Task3 extends Drivercreation {
	@Test
	public void Thirdtestcase() throws Exception {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='http://live.guru99.com/index.php/mobile.html']"))).click();
	     Thread.sleep(3000);
		 driver.findElement(By.xpath("(//h2[@class='product-name']/following-sibling::div[@class='actions']/button[@title='Add to Cart'])[1]")).click();
		 System.out.println(driver.getTitle());
		 driver.findElement(By.xpath("//input[@title='Qty']")).clear();
		 driver.findElement(By.xpath("//input[@title='Qty']")).sendKeys("1000");
		 driver.findElement(By.xpath("//button[@title='Update']")).click();
		 System.out.println(driver.getTitle());
		 String ErrorMsg = driver.findElement(By.xpath("//p[@class='item-msg error']")).getText();
		 System.out.println(ErrorMsg);
//       Assert statement		 
		 driver.findElement(By.xpath("//button[@id='empty_cart_button']")).click();
		 String VerifyCart = driver.findElement(By.tagName("h1")).getText();
		 System.out.println(VerifyCart);
		 Assert.assertEquals(VerifyCart,"SHOPPING CART IS EMPTY");
		 
		 
		 
		 
		
		 
	}

}
