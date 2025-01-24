package com.unionmutualproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login extends BaseClass 

{
	@Test
	public static void login() throws InterruptedException
	{
	 WebElement loginfield = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
	 loginfield.click();
	 Thread.sleep(2000);
	 loginfield.sendKeys("wipic16903@bawsny.com");
	 Thread.sleep(2000);
	 WebElement passwordfield = driver.findElement(By.xpath("//android.widget.ScrollView/android.widget.EditText[2]"));
	 passwordfield.click();
	 Thread.sleep(2000);
	 passwordfield.sendKeys("Rajas@123");
	 Thread.sleep(2000);
	 WebElement loginbutton = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Login\"]"));
	 Thread.sleep(2000);
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
