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
public class SelectFlight extends ModelBase{

	public SelectFlight(WebDriver driver) {
		super(driver);
		
	}
	public WebElement dPart() {
		WebElement dpart = driver.findElement(By.xpath("//input[@value='Unified Airlines$363$281$11:24']"));
		return dpart;
	}
	public WebElement reTurn() {
		WebElement retur = driver.findElement(By.xpath("//input[@value='Unified Airlines$633$303$18:44']"));
		return retur;
	}
	public WebElement conn() {
		WebElement cont = driver.findElement(By.xpath("//input[@name='reserveFlights']"));
		return cont;
		
	}

}
