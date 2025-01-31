package com.unionmutualproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import variable.configProperties;

public class Login extends BaseClass 

{
	@SuppressWarnings("deprecation")
	@Test (priority=1)
	public static void login() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 WebElement loginfield = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
	 loginfield.click();
	 //Thread.sleep(1000);
	 loginfield.sendKeys(configProperties.property.getProperty("username"));
	// Thread.sleep(1000);
	 WebElement passwordfield = driver.findElement(By.xpath("//android.widget.ScrollView/android.widget.EditText[2]"));
	 passwordfield.click();
	 //Thread.sleep(1000);
	 passwordfield.sendKeys(configProperties.property.getProperty("password"));
	 //Thread.sleep(1000);
	 WebElement loginbutton = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Login\"]"));
	 //Thread.sleep(1000);
	 loginbutton.click();
	 Thread.sleep(8000);
	 
	 if(driver.getPageSource().contains("Hi, CHRISTINE MCINTYRE"))
	 {
		 System.out.println("Login Successful");
	 }
	 
	 else {
		 System.out.println("Login Unsuccesssful");
		 
	 }
	 
	
	}
	
	
}
	
