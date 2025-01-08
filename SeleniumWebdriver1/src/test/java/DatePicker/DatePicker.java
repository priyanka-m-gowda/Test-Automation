package DatePicker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DatePicker {
	WebDriver driver;
	@BeforeClass
	void setup() {
		driver=new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
    
	@Test
	public void calender()
	{
		driver.findElement(By.id("datepicker")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
		String currentmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		String currentyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		
		while(!(currentmonth.equals("March") && currentyear.equals("2025")))
		{
			driver.findElement(By.cssSelector(".ui-datepicker-next.ui-corner-all")).click();
			currentmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
			currentyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		}
         
		driver.findElement(By.xpath("//*[@data-handler=\"selectDay\"]/a[text()='23']")).click();
	}
}
