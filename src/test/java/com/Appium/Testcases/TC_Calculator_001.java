package com.Appium.Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.Appium.BaseClass.BaseClass;
import com.Appium.PageObjects.HomePage;
import junit.framework.Assert;

public class TC_Calculator_001 extends BaseClass{
	
	@Test
	public void ValidateAdditionOf7and8() throws InterruptedException{
		
		HomePage hp = new HomePage(driver);	
		String Expected_Sum="15";		
		
		hp.PressSeven();
		logger.info("Pressing 7 in the calculator..");
		hp.PressAdd();
		logger.info("Pressing + in the calculator..");
		hp.PressEight();
		logger.info("Pressing 8 in the calculator..");
		hp.PressEqualsTo();
		logger.info("Pressing = in the calculator..");
		
		WebElement Num_Result=driver.findElement(By.id("com.google.android.calculator:id/result_final"));
		String Actual_Sum = Num_Result.getText();		
		System.out.println("Total is : "+Actual_Sum);					
		Thread.sleep(5000);		
		Assert.assertEquals(Expected_Sum, Actual_Sum);		
		System.out.println("Completed");	
		takescreenshot();
	}
	@Test
	public void ValidateMultiplicationOf9and8() throws InterruptedException{
		
		HomePage hp = new HomePage(driver);	
		String Expected_Sum="72";		
		
		hp.PressNine();
		logger.info("Pressing 9 in the calculator..");
		hp.PressMultiply();
		logger.info("Pressing * in the calculator..");
		hp.PressEight();
		logger.info("Pressing 8 in the calculator..");
		hp.PressEqualsTo();
		logger.info("Pressing = in the calculator..");
		
		WebElement Num_Result=driver.findElement(By.id("com.google.android.calculator:id/result_final"));
		String Actual_Sum = Num_Result.getText();		
		System.out.println("Total is : "+Actual_Sum);					
		Thread.sleep(5000);		
		Assert.assertEquals(Expected_Sum, Actual_Sum);		
		System.out.println("Completed");	
		takescreenshot();
	}

}
