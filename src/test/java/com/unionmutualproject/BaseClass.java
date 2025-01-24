package com.unionmutualproject;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import variable.configProperties;

public class BaseClass {
	
static AndroidDriver driver;
	
	
	public static void main(String args[]) throws MalformedURLException, InterruptedException {
		
		
		
		setup();
	}
	
	
	
	
	@BeforeTest
	public static AndroidDriver setup() throws MalformedURLException, InterruptedException {
		
		configProperties.initializePropertyFile();
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("platformName", "ANDROID");
		caps.setCapability("deviceName", "Test Device");
		caps.setCapability("uuid", "emulator-5554");
		caps.setCapability("platformversion", "14");
		caps.setCapability("automationName", "uiAutomator2");
		caps.setCapability("appPackage", configProperties.property.getProperty("unionmutualPackage"));
		caps.setCapability("appActivity", configProperties.property.getProperty("unionmutualActivity"));
		
		
		URL uri = URI.create("http://127.0.0.1:4723").toURL();
		driver = new AndroidDriver(uri,caps);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS)Nothing 
		
		System.out.println("Application started");
		Thread.sleep(4000);
		//driver.close();
		return driver;

}
	
}