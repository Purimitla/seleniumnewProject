package pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class GmailLogin extends Drivercreation {
	@Test
	public void login(String Username , String Password) {
		 driver.get("https://gmail.com");
		 System.out.println(driver.getTitle());
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		 driver.findElement(By.xpath("//input[@type='email']")).sendKeys(Username);
		 driver.findElement(By.xpath("//span[@class='RveJvd snByac' and contains(text(),'Next')]")).click();
		 WebDriverWait wait = new WebDriverWait(driver,20);
		 WebElement Pwd=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
		 Pwd.sendKeys(Password);
		 driver.findElement(By.xpath("//span[@class='RveJvd snByac' and contains(text(),'Next')]")).click();
	}

}
