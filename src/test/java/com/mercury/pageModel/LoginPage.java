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
public class LoginPage extends ModelBase{

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	public WebElement uName() {
		WebElement userName = driver.findElement(By.xpath("//input[@name='userName']"));
		return userName;
	}
	public WebElement pWord() {
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		return password;
		
	}
	public WebElement clickSubmit() {
		WebElement ele = driver.findElement(By.xpath("//input[@name='login']"));
		return ele;
	}
	
	}
	


