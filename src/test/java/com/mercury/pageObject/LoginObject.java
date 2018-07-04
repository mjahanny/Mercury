/**
 * 
 */
package com.mercury.pageObject;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;



/**
 * @author 92BD
 *
 */
public class LoginObject extends com.mercury.pageModel.LoginPage {
	String ffExpectedTitle = "Find a Flight: Mercury Tours:";
	String ffActualTitle = "";

	public LoginObject(WebDriver driver) {
		super(driver);
		com.mercury.pageModel.LoginPage lPage = null;
		
	}
	
	public void loginCredentials(String uName, String pass) {
		com.mercury.pageModel.LoginPage lPage = new com.mercury.pageModel.LoginPage(driver);
		lPage.uName().sendKeys(uName);
		lPage.pWord().sendKeys(pass);
		lPage.clickSubmit().click();
		
		
		
		
		
		
		
	}
	public void verifyTitle() {
		ffActualTitle = driver.getTitle();
		Assert.assertEquals(ffActualTitle, ffExpectedTitle);
		System.out.println("Title is correct");
		
	}

}
