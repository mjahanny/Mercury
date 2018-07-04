/**
 * 
 */
package com.mercury.failedTCRunner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

/**
 * @author 92BD
 *
 */
public class RunnerFailedTC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestNG runner = new TestNG();
		List<String> list=new ArrayList<String>();
		list.add("C:\\Users\\jahan\\eclipse-workspace\\release1\\test-output\\Suite\\testng-failed.xml");
		
		runner.setTestSuites(list);
		runner.run();

	}

}
