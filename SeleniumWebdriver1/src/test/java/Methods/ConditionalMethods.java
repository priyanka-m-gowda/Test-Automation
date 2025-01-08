package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
     
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
//		1)isdiaplayed()
//		boolean displaystatus= driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img")).isDisplayed();
//		   System.out.println("displaystaus:"+displaystatus);
//		   
//		 2)isSelected()  
		WebElement selected=   driver.findElement(By.xpath("//*[@id=\"pollanswers-1\"]"));
		selected.click();
		System.out.println(selected.isSelected());
		   
		   
//		 3)isEnabled()  
//		 boolean enabled= driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]")).isEnabled();
//		  System.out.println("status:"+enabled);
	}
	

}
