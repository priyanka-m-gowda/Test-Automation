package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
	    driver.get("https://demo.opencart.com/");
	    driver.manage().window().maximize();
	    
//	    1)close()->close single browser
//	    driver.close();
	    
//	    2)quit()->close the multiple browser windows
	    driver.quit();
	}

}
