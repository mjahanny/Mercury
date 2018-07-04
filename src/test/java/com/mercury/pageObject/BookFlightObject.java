/**
 * 
 */
package com.mercury.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

/**
 * @author 92BD
 *
 */
public class BookFlightObject extends com.mercury.pageModel.BookFlightPage{
	
	String fcExpected = " Flight Confirmation # 2018-06-09202433";
	String fcActual = "";
	String ffExpectedTitle = "Flight Confirmation: Mercury Tours";
	String ffActualTitle = "";

	public BookFlightObject(WebDriver driver) {
		super(driver);
		com.mercury.pageModel.BookFlightPage bfp = null;
		
	}
	public void bookTheFlight(String firstName, String lastName,String rele,String cNumber,
			String bAddress, String bCity, String bState, String bZip) {
		com.mercury.pageModel.BookFlightPage bfp = new com.mercury.pageModel.BookFlightPage(driver);
		
		
		bfp.fName().sendKeys(firstName);
		bfp.lName().sendKeys(lastName);
		WebElement pMeal = bfp.meal();
		Select pmeal = new Select(pMeal);
		pmeal.selectByVisibleText(rele);
		WebElement cType = bfp.cardType();
		Select ctype = new Select(cType);
		ctype.selectByIndex(1);
		bfp.cardNumber().sendKeys(cNumber);
		bfp.bllingAddress().clear();
		bfp.bllingAddress().sendKeys(bAddress);
		bfp.billingCity().clear();
		bfp.billingCity().sendKeys(bCity);
		bfp.billingState().clear();
		bfp.billingState().sendKeys(bState);
		bfp.billingZip().clear();
		bfp.billingZip().sendKeys(bZip);
		WebElement bCountry = bfp.billingCountry();
		Select bcountry = new Select(bCountry);
		bcountry.selectByVisibleText("TOGO");
		bfp.clickPurchase().click();
		
				
		


	

}
	public void verifyBooking() {
		fcActual = driver.findElement(By.xpath("//font[@color='#FFFFFF']")).getText();
		if(fcExpected.matches("Flight[A-Z]...201[0-9].*")) {
			Assert.assertEquals(fcActual, fcExpected);
			System.out.println("correct");
}
	}
		
		public void verifyTitle() {
			ffActualTitle = driver.getTitle();
			Assert.assertEquals(ffActualTitle, ffExpectedTitle);
			System.out.println("Title is correct");
	}
}

