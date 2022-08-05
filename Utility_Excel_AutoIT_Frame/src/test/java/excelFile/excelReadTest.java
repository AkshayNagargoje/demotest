package excelFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class excelReadTest {
	@Test
	public void loginExcelData() throws Exception {
		DataFormatter data = new DataFormatter();
		System.setProperty("WebDrive.chromedriver,driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// wait = 2sec
		driver.get("file:///E:/JBK/software/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.manage().window().maximize();

		FileInputStream file = new FileInputStream("maven excel file.xlsx");
		Workbook wb = WorkbookFactory.create(file);
		Sheet sh = wb.getSheet("Sheet1");
		//email id 
		Row rw = sh.getRow(1);
		Cell c = sh.getRow(1).getCell(1);
		String s = data.formatCellValue(c);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(s);
       // password
		Row rw1 = sh.getRow(1);
		Cell c1 = sh.getRow(1).getCell(2);
		String s1 = data.formatCellValue(c1);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(s1);
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
	}
}
