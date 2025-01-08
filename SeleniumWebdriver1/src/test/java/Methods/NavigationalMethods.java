package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalMethods {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();

//		1)navigateTo()
	     driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	     driver.navigate().to("https://demo.nopcommerce.com/register?returnUrl=%2F");
	     
//	     2)navigate.back()
	     driver.navigate().back();
	     System.out.println(driver.getCurrentUrl());
//	     3)2)navigate.forward()
	     driver.navigate().forward();
	     System.out.println(driver.getCurrentUrl());

//	     4)2)navigate.refresh()
	     driver.navigate().refresh();
	     
	}

}
