package Parameterization;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters; // Correct for TestNG


import com.beust.jcommander.Parameter;

import Utility.Utility;

//parameterization->passind data during runtime
//1)using DataProvider
//2)using xml file ->Parallel testing

public class DataProviderANDparalleltesting {
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})
	void setup(String br)
	{
		switch(br)
		{
		case "chrome":driver=new ChromeDriver();break;
		case "edge":driver=new EdgeDriver();break;
		case "Firefox":driver=new FirefoxDriver();break;
		default:System.out.println("default browser");return;


		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	}
	
	
	@Test(dataProvider="dp")
	void login(String mail, String pswd)
	{
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("input-email")).sendKeys(mail);
		driver.findElement(By.id("input-passwordd")).sendKeys(pswd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
	}
	
	@DataProvider(name="dp",indices= {2,3})
	Object[][] logindata(){
		Object data[][]= {
				{"abc@gmail.com","fgh456"},
				{"bbb@gmail.com","fgh666"},
				{"jjk@gmail.com","fgh444"},
				{"ujh@gmail.com","fgh555"},
				{"ddd@gmail.com","fgh789"},
				
		};
		return data;
		
	}
	
	   @AfterMethod
	   public void failedTests(ITestResult result) throws IOException {
		   if(ITestResult.FAILURE==result.getStatus())
		   {
			  Utility.takingscreenshots(driver, result.getName());
		   }
		   System.out.println("hello");
	   }

	
	
	
	
	
	
	
}
