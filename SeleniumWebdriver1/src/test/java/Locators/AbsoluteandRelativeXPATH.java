package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteandRelativeXPATH {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
	    driver.get("https://demo.opencart.com/");
	    driver.manage().window().maximize();
	     
//	    1)absolute XPATH
	    WebElement search=driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/input"));
	    search.sendKeys("Mac");
	    search.sendKeys(Keys.ENTER);
	    
//	    1)Relative XPATH
	    WebElement searchh=driver.findElement(By.xpath("//*[@id=\"search\"]/input"));
	    searchh.sendKeys("Mac");
	    searchh.sendKeys(Keys.ENTER);
	}

}
