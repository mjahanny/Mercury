/**
 * 
 */
package com.mercury.librery;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

/**
 * @author 92BD
 *
 */
public class ItestResult {
	WebDriver driver;
	
	@AfterMethod
	public void failedTCresult(ITestResult result) {
		
		if(ITestResult.FAILURE==result.getStatus()) {
			TakeScreenShot.screenshot(driver, result.getName());
			
		}
		
	}

}
