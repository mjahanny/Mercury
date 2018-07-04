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
public class BookFlightPage extends ModelBase{

	public BookFlightPage(WebDriver driver) {
		super(driver);
		
	}
	public WebElement fName() {
		WebElement firstName = driver.findElement(By.name("passFirst0"));
		return firstName;
	}
	public WebElement lName() {
		WebElement lastName = driver.findElement(By.name("passLast0"));
		return lastName;
	}
	// Drop Dwon 
	public WebElement meal() {
		WebElement pMeal = driver.findElement(By.xpath("//select[@name='pass.0.meal']"));
		return pMeal;
	}
	// Drop Down
	public WebElement cardType() {
		WebElement cType = driver.findElement(By.xpath("//select[@name='creditCard']"));
		return cType;
	}
	public WebElement cardNumber() {
		WebElement cNumber = driver.findElement(By.xpath("//input[@name='creditnumber']"));
		return cNumber;
	}
	public WebElement bllingAddress() {
		WebElement bAddress = driver.findElement(By.xpath("//input[@name='billAddress1']"));
		return bAddress;
	}
	public WebElement billingCity() {
		WebElement bCity = driver.findElement(By.xpath("//input[@name='billCity']"));
		return bCity;
	}
	public WebElement billingState() {
		WebElement bState = driver.findElement(By.xpath("//input[@name='billState']"));
		return bState;
	}
	public WebElement billingZip() {
		WebElement bZip = driver.findElement(By.xpath("//input[@name='billZip']"));
		return bZip;
	}
	// Drop down
	public WebElement billingCountry() {
		WebElement bCountry = driver.findElement(By.xpath("//select[@name='billCountry']"));
		return bCountry;
	}
	public WebElement clickPurchase(){
		WebElement cPurchase = driver.findElement(By.xpath("//input[@name='buyFlights']"));
		return cPurchase;	

}
}