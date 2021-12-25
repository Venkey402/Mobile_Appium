package com.Appium.Testcases;

import org.testng.annotations.Test;
import com.Appium.BaseClass.BaseClass;
import com.Appium.PageObjects.Dialer_HomePage;

public class TC_Dialer_002 extends BaseClass{		
	
	@Test
	public void DailingANumber() throws InterruptedException 
	{
		Dialer_HomePage dhp = new Dialer_HomePage(driver);		
		dhp.ClickContacts_Tab();
		Thread.sleep(5000);
		dhp.ClickDialPad();
		Thread.sleep(5000);
		dhp.PressNine();
		dhp.PressZero();
		dhp.PressThree();
		dhp.PressZero();
		dhp.PressOne();
		dhp.PressNine();
		dhp.PressSix();
		dhp.PressNine();
		dhp.PressZero();
		dhp.PressSeven();
		dhp.ClickDialerIcon();
		dhp.btnEndCall();		
	}
	

}
