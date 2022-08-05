package excelFile;

import org.testng.annotations.Test;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DataProviderExcelFileRead {
  @Test(dataProvider = "dp")
  public void f(String uname, String pass) {
//	  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
//	  WebDriver wd= new ChromeDriver();
//	  wd.get("file:///E:/JBK)");
//	  
//	  ///software/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
//	  wd.findElement(By.id("email")).sendKeys(uname);
//	  wd.findElement(By.id("password")).sendKeys(pass);
//	  wd.findElement(By.xpath("//button")).click();
	 
 //   System.out.print(sr+" ");
	  System.out.print(uname+" ");
	  System.out.println(pass);
	//System.out.println(sr+" ");
  }

  @DataProvider
  public String[][] dp() throws Exception {
	  
	  DataFormatter df = new DataFormatter();
	  FileInputStream file = new FileInputStream("demo.xlsx");
	  Workbook wb = WorkbookFactory.create(file);
	  
	  Sheet sh = wb.getSheet("Sheet1");
	  int rows = sh.getLastRowNum(); //3
	  System.out.println(rows);
	 // int rows =3;
    String[][] data = new String[rows][2]; //[3][3] // we have create String Array to store data of row and column 
    for(int i =1;i<=rows; i++){
    	//data[i-0][0]=df.formatCellValue(sh.getRow(i).getCell(0));
    	data[i-0][0]=df.formatCellValue(sh.getRow(i).getCell(0));//uname [0][0]==> [r1][c0]
    	data[i-1][1]= df.formatCellValue(sh.getRow(i).getCell(1));//pass [0][1]
    	//data[i-1][2]= df.formatCellValue(sh.getRow(i).getCell(2));
    }
    return data;
  }
}
