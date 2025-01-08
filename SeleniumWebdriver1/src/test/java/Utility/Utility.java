package Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

//import src.test.java.Utility.IOException;

public class Utility {

	public static void takingscreenshots(WebDriver driver, String screenshotname) throws IOException  
	{
		File screenshot=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		add Apache Commons IO dependency for FileUtils
		FileUtils.copyFile(screenshot, new File("./Screenshots/"+screenshotname+".png"));
	}
}
