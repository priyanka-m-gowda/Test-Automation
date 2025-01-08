package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {

	WebDriver driver;
//	1)//constructor->this will initiate the driver automatically
	//constructor name should be same as classname
	
	Loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
//	2)//Locators
	
	
//	to set Multiple locators path at a time
//	1)in selectorhub ->2nd option->set driver command to append on selectors->set the format to By.xpath("xpathvalue")
//    2)3rd option->click on POM page->take the selector hub inspect arrow and click in the webpage 
	
	By text_username_loc=By.xpath("//input[@placeholder='Username']");
	By text_password_loc=By.xpath("//input[@placeholder='Password']");
	By btn_login_loc=By.xpath("//button[normalize-space()='Login']");
	
//	3)//Action methods->to perform actions
	
	public void setUserName(String user) {
		driver.findElement(text_username_loc).sendKeys(user);
	}
	
	public void setPassword(String pswd) {
		driver.findElement(text_password_loc).sendKeys(pswd);
	}
	
	public void clicklogin() {
		driver.findElement(btn_login_loc).click();
	}


	
	
}
