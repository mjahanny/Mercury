/**
 * 
 */
package com.mercury.pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



/**
 * @author 92BD
 *
 */
public class FindFlightObject extends com.mercury.pageModel.FindFlightPage{
	
	String ffExpectedTitle = "Select a Flight: Mercury Tours";
	String ffActualTitle = "";

	public FindFlightObject(WebDriver driver) {
		super(driver);
		com.mercury.pageModel.FindFlightPage ffPage = null;
	}
	public void avaibleFlight() {
		com.mercury.pageModel.FindFlightPage ffPage = new com.mercury.pageModel.FindFlightPage(driver);
		ffPage.tType().click();
		WebElement pas = ffPage.pessengers();
		Select s_pas = new Select(pas);
		s_pas.selectByVisibleText("1");
		
		WebElement fPort = ffPage.fromPort();
		Select s_D_Port = new Select(fPort);
		s_D_Port.selectByVisibleText("New York");
		
		WebElement fMonth = ffPage.fromMonth();
		Select s_Month = new Select(fMonth);
		s_Month.selectByVisibleText("December");
		
		WebElement fDay = ffPage.fromDay();
		Select s_Day = new Select(fDay);
		s_Day.selectByVisibleText("12");
		
		WebElement tPort = ffPage.toPort();
		Select s_A_Port = new Select(tPort);
		s_A_Port.selectByVisibleText("London");
		
		WebElement tMonth = ffPage.toMonth();
		Select s_T_Month = new Select(tMonth);
		s_T_Month.selectByVisibleText("April");
		
		WebElement tDay = ffPage.toDay();
		Select s_T_Day = new Select(tDay);
		s_T_Day.selectByVisibleText("25");
		ffPage.serviceClass().click();
		WebElement tAirline = ffPage.airline();
		Select s_Airline = new Select(tAirline);
		s_Airline.selectByIndex(3);
		ffPage.cont().click();
		
	
	}
	
	public void verifyTitle() {
		ffActualTitle = driver.getTitle();
		Assert.assertEquals(ffActualTitle, ffExpectedTitle);
		System.out.println("Title correct");

}
}
