package excelFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;
 
public class ExcelFileWriteUtilityMethod {

	//file name, sheet, row col and data
	public static Sheet sh=null;
	public static Row row=null;
	public static Cell cell=null;
	
	  
	public static void writeExcel(String sheetName, int rowNum, int colNum, String data)throws Exception {
		FileInputStream fis = new FileInputStream("maven excel file.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
		if(wb.getSheet(sheetName)==null) {
			sh= wb.createSheet(sheetName);
			row= sh.createRow(rowNum);
			cell= row.createCell(colNum);
		}
		else {
			sh= wb.getSheet(sheetName);
			if(sh.getRow(rowNum)==null) {
				row= sh.createRow(rowNum);
				cell= row.createCell(colNum);
			}
			else {
				row=sh.getRow(rowNum);
				if(row.getCell(colNum)==null) 
					cell=row.createCell(colNum);
				else
					cell=row.getCell(colNum);
			}
		}
		cell.setCellValue(data);
		FileOutputStream fos = new FileOutputStream("maven excel file.xlsx");
		wb.write(fos);
		wb.close();
		fos.close();
	}
	
	@Test
	public void test1()throws Exception {
		writeExcel("Test", 4, 6, "Utility Method test");
	}
}


 