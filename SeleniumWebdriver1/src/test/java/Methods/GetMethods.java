package Methods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) {
      
		WebDriver driver=new ChromeDriver();
		
//		1)get url()-opens the url on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
//		2)getcurrenturl()
		System.out.println(driver.getCurrentUrl());
		
//		3)gettitle()->returns title of the page
		System.out.println(driver.getTitle());
		
//		4)getpagesource(
		System.out.println(driver.getPageSource());
		
//		5)getwindowhandles()->returns id of the single browser window
		String windowID=driver.getWindowHandle();
		System.out.println("ID:"+windowID);
		
//		6)getwindowhandles()->returns id of the single browser window
		driver.get("https://www.orangehrm.com/");
		Set<String> windowIDs=driver.getWindowHandles();
		System.out.println("ID:"+windowIDs);
	}

}
