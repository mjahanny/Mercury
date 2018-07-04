/**
 * 
 */
package com.mercury.librery;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 * @author 92BD
 *
 */
public class TakeScreenShot {
	
public static void screenshot(WebDriver driver, String screeenshotname) 
	
	{
		
		try {
			TakesScreenshot tke = (TakesScreenshot)driver;
			File source = tke.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source,new File ("./ScreenShot/"+screeenshotname+".png"));
		} catch (Exception e) {
			
			
		}
		
	}

}

	
	


