package DropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	    driver.get("https://testautomationpractice.blogspot.com/");
	    driver.manage().window().maximize();
	    
	    WebElement Dropdown=driver.findElement(By.xpath("//*[@id=\"country\"]"));
	    Select Dropdowns=new Select(Dropdown);
	    
//	    Dropdowns.selectByIndex(3);
//	    Dropdowns.selectByValue("germany");
//	    Dropdowns.selectByVisibleText("Germany");
//	    Dropdowns.deselectByIndex(3);
	    
//	    2)total no. of options in dropdown
	    List <WebElement> totaloptions=Dropdowns.getOptions();
	    System.out.println("total:"+totaloptions.size());
	    
//	    3)to print all options
//	    for(WebElement drop:totaloptions)
//	    {
//	    	System.out.println(drop.getText());
//	    }
	    
	    for(int i=0;i<totaloptions.size();i++)
	    {
	    	totaloptions.get(i).getText();
	    }
	}

}
