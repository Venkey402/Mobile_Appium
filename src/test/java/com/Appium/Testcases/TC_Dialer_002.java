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
		logger.info("Clicked on the contacts tab..");
		Thread.sleep(2000);
		logger.info("Waited for 2 secs..");
		dhp.ClickDialPad();
		logger.info("Clicked on the Dial pad..");
		Thread.sleep(5000);
		logger.info("Waited for 5 secs..");
		dhp.PressNine();
		logger.info("Pressed 9 in the dialer pad..");
		dhp.PressZero();
		logger.info("Pressed 0 in the dialer pad..");
		dhp.PressThree();
		logger.info("Pressed 3 in the dialer pad..");
		dhp.PressZero();
		logger.info("Pressed 0 in the dialer pad..");
		dhp.PressOne();
		logger.info("Pressed 1 in the dialer pad..");
		dhp.PressNine();
		logger.info("Pressed 9 in the dialer pad..");
		dhp.PressSix();
		logger.info("Pressed 6 in the dialer pad..");
		dhp.PressNine();
		logger.info("Pressed 9 in the dialer pad..");
		dhp.PressZero();
		logger.info("Pressed 0 in the dialer pad..");
		dhp.PressSeven();
		logger.info("Pressed 7 in the dialer pad..");
		dhp.ClickDialerIcon();
		logger.info("Cliked on the dialer icon..");
		Thread.sleep(10000);
		logger.info("Waited for 10 secs..");
		dhp.btnEndCall();	
		logger.info("Cliked on the End call button..");
	}
	

}
