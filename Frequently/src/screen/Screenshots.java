package screen;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Screenshots {
	
	public static void capturescreenshots(WebDriver driver, String ScreenshotName) throws Exception {
		
		 TakesScreenshot ts = (TakesScreenshot)driver;
		 File src = ts.getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFileToDirectory(src, new File("./Screenshots/"+ScreenshotName+".png"));
		 //	 FileUtils.copyDirectory(src, new File("C:\\Users\\Sumathi Usha\\workspace\\Frequently\\Screenshots\\"+ Name + ".png"));
	}
    
}
