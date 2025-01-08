package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselectors {

	public static void main(String[] args) {

		
		WebDriver driver=new ChromeDriver();
	    driver.get("https://demo.opencart.com/");
	    driver.manage().window().maximize();
	    
//	    1)tag#id
	    driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("tshirt");
	    
//	    2)tag.classname
	    driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("tshirt");
	    
//	    3)tag[attribut='value']
	    driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("tshirt");
	    
//	    4)2)tag.classname and attribute
driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("tshirt");
	    

	    

	    

	}

}
