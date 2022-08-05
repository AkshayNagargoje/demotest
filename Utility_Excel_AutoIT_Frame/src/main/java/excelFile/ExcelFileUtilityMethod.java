package excelFile;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExcelFileUtilityMethod {
	
	public static FileInputStream  fis  =null;
    public static  Workbook wb = null;
// utility method 
public static String getCellData(int row,int col) throws Exception{
	DataFormatter data = new DataFormatter();
	FileInputStream fis = new FileInputStream("maven excel file.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh =wb.getSheet("Sheet1");
	Cell c = sh.getRow(row).getCell(col);
	return data.formatCellValue(c);
	 
}
@Test
public void excelCode() throws Exception {
	// calling the utility method 
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("file:///E:/JBK/software/javabykiran-Selenium-Softwares/Offline%20Website/index.html");

	// calling the utility method 
	String uname = ExcelFileUtilityMethod.getCellData(1, 1);
	String pass = ExcelFileUtilityMethod.getCellData(1, 2);
	
	driver.findElement(By.id("email")).sendKeys(uname);
	driver.findElement(By.id("password")).sendKeys(pass);
	driver.findElement(By.xpath("")).click();
}
public static String tryCatchExceptions(int rows, int cols) {
	DataFormatter data = new DataFormatter();
	try {
		
	    fis = new FileInputStream("maven excel file.xlsx");
	     wb = WorkbookFactory.create(fis);
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	Sheet sh =wb.getSheet("Sheet1");
	Cell c = sh.getRow(rows).getCell(cols);
	return data.formatCellValue(c);
	
}

}