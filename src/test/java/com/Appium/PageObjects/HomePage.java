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
	//************************ Locator Strategies *********************************
	//1. Digits
	@FindBy(how=How.ID,using="com.google.android.calculator:id/digit_0")
	WebElement Num_Zero;
	@FindBy(how=How.ID,using="com.google.android.calculator:id/digit_1")
	WebElement Num_One;	
	@FindBy(how=How.ID,using="com.google.android.calculator:id/digit_2")
	WebElement Num_Two;
	@FindBy(how=How.ID,using="com.google.android.calculator:id/digit_3")
	WebElement Num_Three;
	@FindBy(how=How.ID,using="com.google.android.calculator:id/digit_4")
	WebElement Num_Four;
	@FindBy(how=How.ID,using="com.google.android.calculator:id/digit_5")
	WebElement Num_Five;
	@FindBy(how=How.ID,using="com.google.android.calculator:id/digit_6")
	WebElement Num_Six;	
	@FindBy(how=How.ID,using="com.google.android.calculator:id/digit_7")
	WebElement Num_Seven;	
	@FindBy(how=How.ID,using="com.google.android.calculator:id/digit_8")
	WebElement Num_Eight;
	@FindBy(how=How.ID,using="com.google.android.calculator:id/digit_9")
	WebElement Num_Nine;	
	
	//2. Operators
	@FindBy(how=How.ID,using="com.google.android.calculator:id/eq")
	WebElement Num_EqualsTo;
	@FindBy(how=How.ID,using="com.google.android.calculator:id/op_add")
	WebElement Num_Add;
	@FindBy(how=How.ID,using="com.google.android.calculator:id/op_sub")
	WebElement Num_Substract;
	@FindBy(how=How.ID,using="com.google.android.calculator:id/op_mul")
	WebElement Num_Multiply;
	@FindBy(how=How.ID,using="com.google.android.calculator:id/op_div")
	WebElement Num_Division;
	
	
	// ************************ Action methods *********************************
	// 1. Digits
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
	
	
	//2. Operations
	public void PressAdd()
	{
		Num_Add.click();
	}
	public void PressSubstract()
	{
		Num_Substract.click();
	}
	public void PressMultiply()
	{
		Num_Multiply.click();
	}
	public void PressDividision()
	{
		Num_Division.click();
	}
	public void PressEqualsTo()
	{
		Num_EqualsTo.click();
	}		
}
