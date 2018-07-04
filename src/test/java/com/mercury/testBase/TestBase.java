/**
 * 
 */
package com.mercury.testBase;





import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.demoaut.excelReader.Excel_Reader;




/**
 * @author 92BD
 *
 */
public class TestBase {
	Excel_Reader excel;
	protected WebDriver driver;
	protected String baseUrl = "http://newtours.demoaut.com/";
	@BeforeSuite
	public void setUp(){
		//System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		//driver = new ChromeDriver();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseUrl);		
	}
	@AfterSuite
	public void closeBrowser(){
		 driver.quit();
	}
	
	
}




