package com.fb.qa.testutil;

import com.fb.qa.testbase.TestBase;

public class TestUtil extends TestBase {
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;

	public void switchToFrame() {
		driver.switchTo().frame("//span[contains(text(), 'Ashwini Shirsath')]");
	}

	public static void runTimeInfo(String string, String string2) {
		// TODO Auto-generated method stub
		
	}

}

