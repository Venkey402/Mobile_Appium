package com.Appium.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class Dialer_HomePage {
	
	AndroidDriver<WebElement> driver;

	public Dialer_HomePage(AndroidDriver<WebElement> driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//************************ Locator Strategies *********************************
	//1. Tabs
	@FindBy(how=How.ID,using="com.android.dialer:id/contacts_tab")
	WebElement ContactsTab;
	@FindBy(how=How.ID,using="com.android.dialer:id/speed_dial_tab")
	WebElement Speed_Dial_Tab;
	@FindBy(how=How.ID,using="com.android.dialer:id/call_log_tab")
	WebElement Call_Log_Tab;
	@FindBy(how=How.ID,using="com.android.dialer:id/voicemail_tab")
	WebElement Voicemail_Tab;
	@FindBy(how=How.ID,using="com.android.dialer:id/empty_list_view_action")
	WebElement btnContactsEmptyList;
	@FindBy(how=How.ID,using="com.android.contacts:id/right_button")
	WebElement btnAddContacts;	
	@FindBy(how=How.ID, using ="com.android.dialer:id/fab")
	WebElement icnDialerPad;
	@FindBy(how=How.ID, using ="com.android.dialer:id/dialpad_floating_action_button")
	WebElement icnDial;
	@FindBy(how=How.ID, using ="com.android.dialer:id/incall_end_call")
	WebElement btnEndCall;
	
	
	//2. Numbers
	@FindBy(how=How.ID,using="com.android.dialer:id/zero")
	WebElement Num_Zero;
	@FindBy(how=How.ID,using="com.android.dialer:id/one")
	WebElement Num_One;	
	@FindBy(how=How.ID,using="com.android.dialer:id/two")
	WebElement Num_Two;
	@FindBy(how=How.ID,using="com.android.dialer:id/three")
	WebElement Num_Three;
	@FindBy(how=How.ID,using="com.android.dialer:id/four")
	WebElement Num_Four;
	@FindBy(how=How.ID,using="com.android.dialer:id/five")
	WebElement Num_Five;
	@FindBy(how=How.ID,using="com.android.dialer:id/six")
	WebElement Num_Six;	
	@FindBy(how=How.ID,using="com.android.dialer:id/seven")
	WebElement Num_Seven;	
	@FindBy(how=How.ID,using="com.android.dialer:id/eight")
	WebElement Num_Eight;
	@FindBy(how=How.ID,using="com.android.dialer:id/nine")
	WebElement Num_Nine;
	
	
	

	
	// ************************ Action methods *********************************
	// 1. Digits
	public void ClickContacts_Tab()
	{
		ContactsTab.click();
	}	
	public void ClickSpeed_Dial_Tab()
	{
		Speed_Dial_Tab.click();
	}
	public void ClickCall_Log_Tab()
	{
		Call_Log_Tab.click();
	}	
	public void ClickVoicemail_Tab()
	{
		Voicemail_Tab.click();
	}	
	public void ClickCreateNewContact()
	{
		btnContactsEmptyList.click();
	}
	public void ClickAddNewContact()
	{
		btnContactsEmptyList.click();
	}
	public void ClickDialPad()
	{
		icnDialerPad.click();
	}
	public void ClickDialerIcon()
	{
		icnDial.click();
	}
	public void btnEndCall()
	{
		icnDial.click();
	}
	
	// 2. Digits
	
		public void PressOne()
		{
			Num_One.click();
		}	
		public void PressTwo()
		{
			Num_Two.click();
		}
		public void PressThree()
		{
			Num_Three.click();
		}	
		public void PressFour()
		{
			Num_Four.click();
		}
		public void PressFive()
		{
			Num_Five.click();
		}	
		public void PressSix()
		{
			Num_Six.click();
		}
		public void PressSeven()
		{
			Num_Seven.click();
		}	
		public void PressEight()
		{
			Num_Eight.click();
		}
		public void PressNine()
		{
			Num_Nine.click();
		}	
		public void PressZero()
		{
			Num_Zero.click();
		}
}
