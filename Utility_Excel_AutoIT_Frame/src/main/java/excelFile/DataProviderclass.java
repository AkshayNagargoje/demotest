package excelFile;

import java.io.FileInputStream;



import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderclass {
@Test(dataProvider = "dp")
public void test(String sr,String uName ,String password){
	 System.setProperty("webdriver.chrome.driver","chromedriver.exe");
    WebDriver wd= new ChromeDriver();
    wd.get("file:///F:/JBK/software/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
    System.out.println("sr"+sr+" ");
    wd.findElement(By.id("email")).sendKeys(uName);
   System.out.print("uName"+uName +" ");
   wd.findElement(By.id("password")).sendKeys(password);
   System.out.print("password"+password);
   wd.findElement(By.xpath("//button")).click();
	System.out.println();
}

@DataProvider
public String[][] dp() throws Exception {
	  
	  DataFormatter df = new DataFormatter();
	  FileInputStream file = new FileInputStream("demo.xlsx");
	  Workbook wb = WorkbookFactory.create(file);
	  
	  Sheet sh = wb.getSheet("Sheet1");
	  int rows= sh.getLastRowNum();
	  String[][] data =new String[rows][3];
	  for(int i=1;i<=rows;i++) {
		  data[i-1][0] = df.formatCellValue(sh.getRow(i).getCell(0));
		data[i-1][1] = df.formatCellValue(sh.getRow(i).getCell(1));
	   data [i-1][2] = df.formatCellValue(sh.getRow(i).getCell(2));
	  }
	  return data;
	  
}
}
