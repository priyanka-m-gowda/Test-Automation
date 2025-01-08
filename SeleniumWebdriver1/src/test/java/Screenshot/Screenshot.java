package Screenshot;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.Utility;

public class Screenshot {

WebDriver driver;

   @BeforeTest
   public void customerdemo()
   {
	   driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.headspace.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
   }
   
   @Test
	public void verifylogin() 
   {
		driver.findElement(By.id("email-input")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("password-input")).sendKeys("cghgd456");
		driver.findElement(By.id("terms-and-conditionss")).click();
		driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
	}
   
   @AfterMethod
   public void failedTests(ITestResult result) throws IOException {
	   if(ITestResult.FAILURE==result.getStatus())
	   {
		  Utility.takingscreenshots(driver, result.getName());
	   }
	   
   }
   
}
