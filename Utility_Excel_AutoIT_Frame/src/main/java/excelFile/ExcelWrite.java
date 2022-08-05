package excelFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ExcelWrite {
	Sheet sh = null;
	Row row = null;
	Cell cell = null;

	@Test
	public void writeExcelCode() throws Exception {
		FileInputStream fis = new FileInputStream("demo.xlsx");
		Workbook wb = WorkbookFactory.create(fis);

		if (wb.getSheet("jbk") == null) {
			// it ll check the sheet name jbk if nt there then ll create

			sh = wb.createSheet("jbk"); // create sheet , row and col (cell)
			row = sh.createRow(3);
			cell = row.createCell(4);// there is no column so we create a cell by row reference
			System.out.println("outer if ===>jbk sheet created ");

		} // outer if closes
		else {// SHEET name jbk present
			sh = wb.getSheet("jbk");
			if (sh.getRow(2) == null) {
				row = sh.createRow(2);
				cell = row.createCell(4);
				System.out.println("1st inner if ==>Sheet JBK present but row and column created");
			} // 1st inner if closed
			else {
				row = sh.getRow(3);
				if (row.getCell(4) == null) { 
					cell = row.createCell(4);
					System.out.println("2nd if ==>cell created ");
				} // 2nd if closed
				else {
					cell = row.getCell(4);
					
				} // 2nd closed

			} // 1st inner else

		} // outer else closed
		cell.setCellValue("write code successfull");
		FileOutputStream fos= new FileOutputStream("maven excel file.xlsx");
		wb.write(fos);
		wb.close();
		fos.close();
	}//test case ends
}// class end 
