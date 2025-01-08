package DropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestedDropdowns {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.google.co.in/");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.name("q")).sendKeys("selenium");
	    Thread.sleep(5000);
	    
	    List <WebElement> Lists=driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
	    System.out.println(Lists.size());
	    
	    for(int i=0;i<Lists.size();i++)
	    {
	    	System.out.println(Lists.get(i).getText());
	    	if(Lists.get(i).getText().equals("selenium"))
	    	{
	    		Lists.get(i).click();
	    		break;
	    	}
	    }
	}

}
