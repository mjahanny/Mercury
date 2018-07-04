/**
 * 
 */
package com.mercury.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.mercury.pageModel.LogOutPage;



/**
 * @author 92BD
 * //font[@color='#FFFFFF']
 */
public class LogOutObject extends com.mercury.pageModel.LogOutPage{
	
	

	public LogOutObject(WebDriver driver) {
		super(driver);
		LogOutPage lpage = null;
	}
	public void loggOut() {
		LogOutPage lpage = new LogOutPage(driver);
		lpage.logOut().click();
	}
	
	
			
		
		
	}

