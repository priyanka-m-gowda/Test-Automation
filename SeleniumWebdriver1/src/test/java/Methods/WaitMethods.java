package Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitMethods {

	public static void main(String[] args) throws InterruptedException {

		
//		1)implicit wait
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
	    
//	    2)Thread.sleep is a method in Java used to pause the execution of the current thread for a specified duration.
//	    While it can be used in Selenium for adding delays, it is generally not recommended because it causes unnecessary pauses regardless of whether the condition is met earlier.
//	    Instead, Selenium provides explicit waits like WebDriverWait or FluentWait, which are more efficient.
	    
	    Thread.sleep(2000);
	    
//	    3)Explicit wait
	    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
	    
	    
	}

}
