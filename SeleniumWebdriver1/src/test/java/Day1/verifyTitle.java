package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyTitle {

	public static void main(String[] args) {

    WebDriver driver=new ChromeDriver();
    driver.get("https://demo.opencart.com/");
    driver.manage().window().maximize();
    
    String act_title=driver.getTitle();
    if(act_title.equals("Your Store"))
    	{
    	System.out.println("test passed");
    	}
    else
    	{
    	System.out.println("test failed");
    	}
    
    driver.close(); 
//    ->will close the single window
//    driver.quit();  ->close multiple window;
	}
	

}
