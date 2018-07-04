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
public class LogOutPage extends ModelBase{

	public LogOutPage(WebDriver driver) {
		super(driver);
		
	}
	public WebElement logOut() {
		WebElement lOut = driver.findElement(By.xpath("//img[@src='/images/forms/Logout.gif']"));
		return lOut;
	}
	

}
