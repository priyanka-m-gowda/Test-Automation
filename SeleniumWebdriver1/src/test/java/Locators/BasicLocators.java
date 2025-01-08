package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
	    driver.get("https://demo.opencart.com/");
	    driver.manage().window().maximize();
	    
//	    1)id
//	   boolean displaystatus= driver.findElement(By.id("logo")).isDisplayed();
//	   System.out.println("displaystaus:"+displaystatus);
	    
//	    2)name
//	    WebElement search=driver.findElement(By.name("search"));
//	    search.sendKeys("Mac");
//	    search.sendKeys(Keys.ENTER);
//	    
	    
        
//	    3)Linktext
//	    driver.findElement(By.linkText("Tablets")).click();
	    
//	    4)partialLinktext
//	    driver.findElement(By.partialLinkText("Tablet")).click();
	    
//	    5)tagname
	   List<WebElement> alinks= driver.findElements(By.tagName("a"));
	   System.out.println("total links:"+alinks.size());
//	    
//	    6)classname
//	   List<WebElement> dropdownitems= driver.findElements(By.className("nav-item"));
//	   System.out.println("total items:"+dropdownitems.size());
	    
	   



	}

}
