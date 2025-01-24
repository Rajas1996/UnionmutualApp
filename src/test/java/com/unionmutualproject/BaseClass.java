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

public class BaseClass {
	
static AppiumDriver driver;
	
	
	public static void main(String args[]) throws MalformedURLException, InterruptedException {
		
		
		
		setup();
	}
	
	
	
	
	@BeforeTest
	public static AppiumDriver setup() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("platformName", "ANDROID");
		caps.setCapability("deviceName", "Nothing phone(1)");
		caps.setCapability("uuid", "192.168.0.108:5555");
		caps.setCapability("platformversion", "14");
		caps.setCapability("automationName", "uiAutomator2");
		caps.setCapability("appPackage", "com.odysseynext.unionmutual");
		caps.setCapability("appActivity", "com.odysseynext.unionmutual.MainActivity");
		
		
		URL uri = URI.create("http://127.0.0.1:4723").toURL();
		driver = new AppiumDriver(uri,caps);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		System.out.println("Application started");
		Thread.sleep(4000);
		//driver.close();
		return driver;

}
	
}