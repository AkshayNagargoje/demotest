package excelFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExcelReadLoop {
@Test
public void excelLoopRead() throws Exception {
	DataFormatter data = new DataFormatter()	;
	int rows;
	String id;
	String pass;
	System.setProperty("WebDrive.chromedriver,driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	// 
	driver.get("file:///E:/JBK/software/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	driver.manage().window().maximize(); 
	
	FileInputStream file = new FileInputStream("maven excel file.xlsx")	;
	Workbook wb = WorkbookFactory.create(file);
	Sheet sh = wb.getSheet("Sheet1");
	rows= sh.getLastRowNum();
	for(int i =1 ;i<=rows; i++)
	{ int cols =sh.getRow(i).getLastCellNum();
	    for(int j = 1; j<=cols; j++)
	    {
	    	Cell c=sh.getRow(i).getCell(j);
	    	id=data.formatCellValue(c);
	    	
	    	System.out.print(id);
	    
	    	Cell c1= sh.getRow(i).getCell(j+1);
	    	 pass = data.formatCellValue(c1);
	    	
	    	
	    }
	    //driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(id); // email 
	  //  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pass);//pass
	    driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
	    Thread.sleep(10000); 
	    System.out.println();
	}
	
	

}
}
