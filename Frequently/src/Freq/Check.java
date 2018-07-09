package Freq;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Check {
	
 @Test
 public void Chrome() throws Exception {
	
	 System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://gmail.com");
	 System.out.println(driver.getTitle());
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
	 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sumathi.p42@gmail.com");
	 driver.findElement(By.xpath("//span[@class='RveJvd snByac' and contains(text(),'Next')]")).click();
	 WebDriverWait wait = new WebDriverWait(driver,20);
	 WebElement Pwd=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
	 Pwd.sendKeys("@Sumathi123");
	 Thread.sleep(3000);
	 driver.findElement(By.className("RveJvd snByac")).click();
//	 driver.findElement(By.xpath("//span[@class='RveJvd snByac' and contains(text(),'Next')]")).click();
	 driver.findElement(By.xpath("//span[@class='gb_db gbii']")).click();
	 driver.findElement(By.xpath("//a[@class='gb_Ea gb_Xf gb_5f gb_Me gb_Jb']")).click();
	 
}

}
