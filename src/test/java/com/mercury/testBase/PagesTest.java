/**
 * 
 */
package com.mercury.testBase;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mercury.librery.ExcelDataConfig;
import com.mercury.librery.TakeScreenShot;
import com.mercury.pageObject.BookFlightObject;
import com.mercury.pageObject.FindFlightObject;
import com.mercury.pageObject.LogOutObject;
import com.mercury.pageObject.LoginObject;
import com.mercury.pageObject.SelectFlightObgect;





/**
 * @author 92BD
 *
 */
public class PagesTest extends TestBase {
	
	com.mercury.pageObject.LoginObject login = null;
	com.mercury.pageObject.FindFlightObject fFlight = null;
	com.mercury.pageObject.SelectFlightObgect sf = null;
	com.mercury.pageObject.BookFlightObject purchase = null;
	com.mercury.pageObject.LogOutObject signoff = null;
	
	
	ExcelDataConfig config = null;
	
	@Test(dataProvider="login1", priority=0)
	public void verifyLogin(String userName , String password) {
		LoginObject login = new LoginObject(driver);
		login.loginCredentials(userName, password);
		
		login.verifyTitle();		
	
	}
	
	@DataProvider(name = "login1")

	public static Object[][] testdata() throws IOException {
		// return new Object[][] {
		// [row][col]
		String SourceFile = "Data/Marcury.xls";

		FileInputStream file = new FileInputStream(SourceFile);

		HSSFWorkbook wb = new HSSFWorkbook(file);
		Sheet sheet = wb.getSheetAt(0);
		int row_size = 1;
		int col_size = 2;
		Object[][] value = new Object[row_size][col_size];

		int i = 0;
		String val = null;
		for (Row row : sheet) {

			for (Cell cell : row) {
				switch (cell.getCellType()) {
				case Cell.CELL_TYPE_STRING:
					val = cell.getStringCellValue();
					System.out.println(val);
					value[0][i] = val;
					break;
				}
				i++;
				
				
			}
		}
		return value;

	}
	
	
	
	
	
	//@DataProvider(name="login")
	//public static Object[][] testData() throws Exception{
		//String file1 ="Data/Marcury.xls";
		//String sheet3 = "Sheet1";
		//Object [][] dataSet = Excel.tableArray(file1, sheet3);
		//return dataSet;
		
	
	
	@Test(priority=1)
	public void findFlight() {
		FindFlightObject fFlight = new FindFlightObject(driver);
		fFlight.avaibleFlight();
		fFlight.verifyTitle();
		
			
		
	}
	@Test(priority=2)
	public void selectTheFlight() {
		SelectFlightObgect sf = new SelectFlightObgect(driver);
		sf.selectFlight();
		sf.verifyTitle();
		
		
	}
	@Test(dataProvider="purchaseFlight", priority=3)
	public void purchaseTicket(String firstName, String lastName,String rele,String cNumber,
			String bAddress, String bCity, String bState, String bZip) {
		
		BookFlightObject purchase = new BookFlightObject(driver);
		purchase.bookTheFlight(firstName, lastName,rele,cNumber,
				bAddress, bCity, bState, bZip);
		purchase.verifyBooking();
		
		
		
		
	}
	
	@DataProvider(name = "purchaseFlight")

	public static Object[][] purchase() throws IOException {
		// return new Object[][] {
		// [row][col]
		String SourceFile = "Data/Marcury.xls";

		FileInputStream file = new FileInputStream(SourceFile);

		HSSFWorkbook wb = new HSSFWorkbook(file);
		Sheet sheet = wb.getSheetAt(1);
		int row_size = 1;
		int col_size = 8;
		Object[][] value = new Object[row_size][col_size];

		int i = 0;
		String val = null;
		for (Row row : sheet) {

			for (Cell cell : row) {
				switch (cell.getCellType()) {
				case Cell.CELL_TYPE_STRING:
					val = cell.getStringCellValue();
					System.out.println(val);
					value[0][i] = val;
					break;
				}
				i++;
				
				
			}
		}
		return value;

	}
	
		
	
	@Test(priority=4)
	public void signingOff() {
		LogOutObject signOff = new LogOutObject(driver);
		signOff.loggOut();
		
		
		
		
		
		 
	}
	//@AfterMethod
	//public void failedTCresult(ITestResult result) {
		
		//if(ITestResult.FAILURE==result.getStatus()) {
			//TakeScreenShot.screenshot(driver, result.getName());
	
		
	}
