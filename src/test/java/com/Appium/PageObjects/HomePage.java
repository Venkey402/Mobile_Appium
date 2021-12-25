package com.Appium.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class HomePage {
	
	AndroidDriver<WebElement> driver;

	public HomePage(AndroidDriver<WebElement> driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="com.google.android.calculator:id/digit_7")
	WebElement Num_Seven;
	@FindBy(how=How.ID,using="com.google.android.calculator:id/op_add")
	WebElement Num_Add;
	@FindBy(how=How.ID,using="com.google.android.calculator:id/digit_8")
	WebElement Num_Eight;
	@FindBy(how=How.ID,using="com.google.android.calculator:id/eq")
	WebElement Num_EqualsTo;
	
	
	// Action methods 
	
	public void PressSeven()
	{
		Num_Seven.click();
	}
	public void PressAdd()
	{
		Num_Add.click();
	}
	public void PressEight()
	{
		Num_Eight.click();
	}
	public void PressEqualsTo()
	{
		Num_EqualsTo.click();
	}
	
	
}
