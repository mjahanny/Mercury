/**
 * 
 */
package com.mercury.pageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author 92BD
 *
 */
public class FindFlightPage extends ModelBase{

	public FindFlightPage(WebDriver driver) {
		super(driver);
		
	}
	public WebElement tType() {
		WebElement ele = driver.findElement(By.xpath("//input[@name='tripType' and @value='oneway']"));
		return ele;
	}
	public WebElement pessengers() {
		WebElement pas = driver.findElement(By.xpath("//select[@name='passCount'] "));
		return pas;
				
	}
	public WebElement fromPort() {
		WebElement fPort = driver.findElement(By.xpath("//select[@name='fromPort']"));
		return fPort;
	}
	public WebElement fromMonth() {
		WebElement fMonth = driver.findElement(By.xpath("//select[@name='fromMonth']"));
		return fMonth;
	}
	public WebElement fromDay() {
		WebElement fDay = driver.findElement(By.xpath("//select[@name='fromDay']"));
		return fDay;
	}
	public WebElement toPort() {
		WebElement tPort = driver.findElement(By.xpath("//select[@name='toPort']"));
		return tPort;
	}
	public WebElement toMonth() {
		WebElement tMonth = driver.findElement(By.xpath("//select[@name='toMonth']"));
		return tMonth;
	}
	public WebElement toDay() {
		WebElement tDay = driver.findElement(By.xpath("//select[@name='toDay']"));
		return tDay;
	}
	public WebElement serviceClass() {
		WebElement sClass = driver.findElement(By.xpath("//input[@value='Business']"));
		return sClass;
	}
	public WebElement airline() {
		WebElement tAirline = driver.findElement(By.xpath("//select[@name='airline']"));
		return tAirline;
	}
	public WebElement cont() {
		WebElement cn = driver.findElement(By.xpath("//input[@name='findFlights']"));
		return cn;
	}
	

}
