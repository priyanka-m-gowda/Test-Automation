package Alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
	    driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	    driver.manage().window().maximize();
	    
//	    1)Alerts with just ok button
//	    driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	    driver.switchTo().alert().accept();
	    
//	    2)Alerts with ok and cancel button
//	    driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	    driver.switchTo().alert().dismiss();
	    
//	    3)Alerts with some input text and then accept
	    driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	    
	    Alert myAlert=driver.switchTo().alert();
	    myAlert.sendKeys("Welcome");
	    myAlert.accept();

	}

}
