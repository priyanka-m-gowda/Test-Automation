package KeyBoardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) {
    
		WebDriver driver=new ChromeDriver();
	    driver.get("https://text-compare.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@id=\"inputText1\"]")).sendKeys("WELCOME");
	    Actions act=new Actions(driver);
	    
//	    1)ctrl+a ->select text
	    act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
	    
//	    2)ctrl+c ->copy text
	    act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
	    
//	    3)shift to 2nd tab to paste
	    act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
	    
//	    4)ctrl+v ->paste in 2nd tab
	    act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
	}

}
