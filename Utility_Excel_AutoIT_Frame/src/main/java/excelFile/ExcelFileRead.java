package excelFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ExcelFileRead {
	@Test
	public void excelFileRead() throws Exception {
		DataFormatter data = new DataFormatter();
		FileInputStream file = new FileInputStream("demo.xlsx");
		Workbook wb = WorkbookFactory.create(file); // workbook access 
		Sheet sh = wb.getSheet("Sheet1");            // sheet access 
		int rows = sh.getLastRowNum();  // provides roww num  3
		System.out.println(rows +"gfgf");
		for (int i = 0; i <= rows; i++)
		{// outter loop row
			int cols = sh.getRow(i).getLastCellNum();
			 for (int j = 0; j <= cols; j++)
			{// innner loop cell
				Cell c = sh.getRow(i).getCell(j);
				Cell ch = sh.getRow(1).getCell(1);
				
				String sss = data.formatCellValue(ch); 
				String ss = data.formatCellValue(c);
			System.out.print(ss+ " ");
				// System.out.print(sss+"1111111");
			}
			
			 System.out.println();
		}
		

	}
}
