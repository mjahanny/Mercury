/**
 * 
 */
package com.mercury.librery;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * @author 92BD
 *
 */
public class Excel {
	
	
	private static HSSFWorkbook workbook;
	private static HSSFSheet sheet;
	private static HSSFCell cell;
	private static HSSFRow row;
	
	public static Object[][] tableArray(String fileName, String sheetName) throws Exception{
		
		Object[][] tabArray = null;
		
		FileInputStream file = new FileInputStream(fileName);
		workbook = new HSSFWorkbook(file);
		sheet = workbook.getSheet(sheetName);
		
		int totalRows = sheet.getPhysicalNumberOfRows();
		int totalCols = sheet.getRow(0).getPhysicalNumberOfCells();
				
		tabArray = new Object[totalRows-1][totalCols];
		
		for(int i=1; i<totalRows; i++) {
			for(int j=0; j<totalCols; j++) {
				
				tabArray[i-1][j] = getTableArray(i, j);
			}
			
		}
		return tabArray;
		
	}
	
	public static String getTableArray(int row, int col) {
		cell = sheet.getRow(row).getCell(col);
		String cellValue = cell.getStringCellValue().trim();
		System.out.println(cellValue);
		return cellValue;
	}

}
