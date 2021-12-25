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
	//1. Digits
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
}
