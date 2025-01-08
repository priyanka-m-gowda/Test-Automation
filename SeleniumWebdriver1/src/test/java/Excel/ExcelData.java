package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelData {
 WebDriver driver;
 
 @Test(dataProvider= "Credentials")
 public void login(String username, String password)
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		System.out.println(username+"----"+password);
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
   
   @DataProvider(name= "Credentials")
   public Object[][] dataSupplier() throws IOException
   {
	   File excelFile=new File(System.getProperty("user.dir")+"\\TestData.xlsx");
	   FileInputStream fis=new FileInputStream(excelFile);
	   XSSFWorkbook workbook=new XSSFWorkbook(fis);
	   
	   XSSFSheet sheet=workbook.getSheet("Login");
	     int RowCount=  sheet.getLastRowNum();
	     int ColCount =sheet.getRow(0).getLastCellNum();
	     
	     Object[][] data=new Object[RowCount][ColCount];
	     
	     for(int r=0;r<RowCount;r++)
	     {
	    	XSSFRow row= sheet.getRow(r+1);
	    	
	    	for(int c=0;c<ColCount;c++)
	    	{
	    		XSSFCell cell=row.getCell(c);
	    		CellType CellType = cell.getCellType();
	    		
	    		switch(CellType)
	    		{
	    		case STRING:
	    			data[r][c]=cell.getStringCellValue();
	    			break;
	    			
	    		case NUMERIC:
	    			data[r][c]=Integer.toString((int) cell.getNumericCellValue());
	    			break;
	    			
	    		case BOOLEAN:
	    			data[r][c]=cell.getBooleanCellValue();
	    			break;
	    		}
	    	}
	    		
	     }
	     return data;
	     
   }
}
