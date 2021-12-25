package com.Appium.BaseClass;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import java.util.logging.Logger;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	public AndroidDriver<WebElement> driver;
	public Logger logger;
	public DesiredCapabilities  dc;
	public URL url;
	
	@BeforeClass
	@Parameters("AppName")
	public void Setup(String Appname) throws MalformedURLException
	{
		logger = Logger.getLogger("Mobile - Appium");
		PropertyConfigurator.configure("log4j.properties");		
		dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		logger.info("Setting the automation Name for the Automation using Desired capabilities..");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		logger.info("Setting the Platform Name using Desired capabilities..");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11.0");
		logger.info("Setting the Platform Version using Desired capabilities..");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");	
		logger.info("Setting the Deive Name using Desired capabilities..");	
		if(Appname.equals("Calculator"))
		{
			dc.setCapability(MobileCapabilityType.APP,"C:\\Venkat_Personal\\calculator.apk");
			logger.info("Setting the Apk file location using Desired capabilities..");
			dc.setCapability("appPackage","com.google.android.calculator");
			logger.info("Setting the app package Desired capabilities..");
			dc.setCapability("appActivity","com.android.calculator2.Calculator");
			logger.info("Setting the app Activity using Desired capabilities..");			
		}		
		else if(Appname.equals("Dialer"))
		{
			dc.setCapability("appPackage","com.android.dialer");
			logger.info("Setting the app package Desired capabilities..");
			dc.setCapability("appActivity","com.android.dialer.app.DialtactsActivity");
			logger.info("Setting the app Activity using Desired capabilities..");
		}
		url = new URL("http://127.0.0.1:4723/wd/hub");
		logger.info("Created the URL ..");
		driver = new AndroidDriver<WebElement>(url,dc);
		logger.info("Created the Android driver..");			
	}
	
	
	@AfterClass
	public void tearDown() 
	{
		driver.quit();
		logger.info("Quitting the App..");
	}
	
	public void takescreenshot()
	{
		TakesScreenshot tss = (TakesScreenshot)driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir")+"//Screenshots//s1.png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
