package api;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class output0 {

public static void predict() throws IOException {
		
		FileInputStream excelFileInputStream = new FileInputStream("C:\\Users\\PC\\Desktop\\a.xls");
		HSSFWorkbook workbook = new HSSFWorkbook(excelFileInputStream);
		excelFileInputStream.close();
		HSSFSheet sheet = workbook.getSheetAt(14);
		
		
		for (int i = 0; i < 10;i++) {
			
		HSSFRow row = sheet.getRow(i+9);
		HSSFCell cell = row.getCell(3);
		
		System.out.println(cell);

		System.out.println(cell.getCellType());
		}
}
}