package iFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {
	
//	indexing starts from 0(first frame)
//	before switching frames-> driver.switchTo().frame(0);

	public static void main(String[] args) {
		
     
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id=\"id1\"]/div/input")).sendKeys("WELCOME");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(3);
		driver.findElement(By.xpath("//*[@id=\"id4\"]/div/input")).sendKeys("Hello");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("//*[@id=\"id3\"]/div/input")).sendKeys("SELENIUM");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//*[@id=\"id2\"]/div/input")).sendKeys("SELE");

		
		
	}

}
