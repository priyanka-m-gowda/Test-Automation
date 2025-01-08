package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
//	    driver.get("https://demo.opencart.com/");
//	    driver.manage().window().maximize();
	    Actions act=new Actions(driver);
	    
//	    1)Mouse Hover
//        WebElement Desktop=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
//        WebElement Mac=driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
//        act.moveToElement(Desktop).moveToElement(Mac).click().build().perform();
	    
//	    2)Right click
//	    driver.get("https://swisnl.github.io/jQuery-contextMenu/demo/input.html");
//	    driver.manage().window().maximize();
//	    WebElement button=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
//	    act.contextClick(button).perform();
	    
//	    3)Double click
//	    act.doubleClick(doubleclick element).perform();
	    
//	    4)Drag&Drop
	    driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
	    driver.manage().window().maximize();
	    WebElement Rome=driver.findElement(By.xpath("//*[@id=\"box6\"]"));
	    WebElement Italy=driver.findElement(By.xpath("//*[@id=\"box106\"]"));
	    
	    act.dragAndDrop(Rome, Italy).perform();

	    
	}

}
