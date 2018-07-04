/**
 * 
 */
package com.mercury.pageObject;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.mercury.pageModel.SelectFlight;



/**
 * @author 92BD
 * Book a Flight: Mercury Tours
 */
public class SelectFlightObgect extends SelectFlight {
	
	String ffExpectedTitle = "Book a Flight: Mercury Tours";
	String ffActualTitle = "";

	public SelectFlightObgect(WebDriver driver) {
		super(driver);
		SelectFlight selectfl = null;
	}
	public void selectFlight() {
		SelectFlight selectff = new SelectFlight(driver);
		selectff.dPart().click();
		selectff.reTurn().click();
		selectff.conn().click();
	}
	public void verifyTitle() {
		ffActualTitle = driver.getTitle();
		Assert.assertEquals(ffActualTitle, ffExpectedTitle);
		System.out.println("Title is correct");
	}

}
