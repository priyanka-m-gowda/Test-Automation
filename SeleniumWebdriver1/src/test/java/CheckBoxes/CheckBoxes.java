package CheckBoxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException  {

		WebDriver driver=new ChromeDriver();
	    driver.get("https://testautomationpractice.blogspot.com/");
	    driver.manage().window().maximize();
	    
//	    1)selecting particular checkbox
//	    driver.findElement(By.id("sunday")).click();
	    
//	    2)Select all the checkboxes
	    List <WebElement> Checkbox=driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type=\"checkbox\"]"));
	    
//	    for(int i=0; i<Checkbox.size();i++)
//	    {
//	    	Checkbox.get(i).click();
//	    }
	    
//	    enhanced for loop
//	    for(WebElement box:Checkbox)
//	    {
//	    	box.click();
//	    }
	    
//	    3)select last 3 checkboxes
//	    total checkbox=7, so 7-3=4  ->i[4],i[5],i[6]
	    
//	    for(int i=4;i<Checkbox.size();i++)
//	    {
//	    	Checkbox.get(i).click();
//	    }
	    
//	    4)select first 4 checkboxes
//	    for(int i=0; i<4; i++)
//	    {
//	    	Checkbox.get(i).click();
//	    }
	    
//	    5)unselect all the checkboxes if its selected
	    for(int i=4;i<Checkbox.size();i++)
		    {
		    	Checkbox.get(i).click();
		    }
	    Thread.sleep(3000);
	    for(int i=0; i<Checkbox.size(); i++)
	    {
	    	if(Checkbox.get(i).isSelected())
	    	{
	    		Checkbox.get(i).click();
	    	}
	    }
	    
	    
		
	}

}
