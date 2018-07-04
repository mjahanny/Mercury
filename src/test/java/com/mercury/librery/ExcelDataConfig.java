/**
 * 
 */
package com.mercury.librery;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * @author 92BD
 *
 */
public class ExcelDataConfig {
	HSSFWorkbook wb;
	HSSFSheet sheet1;
	public ExcelDataConfig(String excelPath) {
		
		try {
			File src = new File(excelPath);
			FileInputStream fls = new FileInputStream(src);
			wb = new HSSFWorkbook(fls);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
			
			
		}
	public String getData(int sheetnumber, int row, int colunm) {
		sheet1 = wb.getSheetAt(sheetnumber);
		String data =sheet1.getRow(row).getCell(colunm).getStringCellValue();
		return data;
		
		
			
		}

   public int getRowCount(int sheetIndex) {
	   int row =wb.getSheetAt(sheetIndex).getLastRowNum();
	   row = row+1;
	   return row;
	   
	   
   }
   
}
