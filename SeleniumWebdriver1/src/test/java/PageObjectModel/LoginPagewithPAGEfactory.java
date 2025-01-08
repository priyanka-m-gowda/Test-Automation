package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagewithPAGEfactory {

	WebDriver driver;
	
//	1)constructor
	LoginPagewithPAGEfactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//	2)Locators
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement text_username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement text_password;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btn_login;
	
//	3)Action methods
	public void setUserName(String user) {
		text_username.sendKeys(user);
	}
	
	public void setPassword(String pswd) {
		text_password.sendKeys(pswd);
	}
	
	public void clicklogin() {
		btn_login.click();
	}
}
