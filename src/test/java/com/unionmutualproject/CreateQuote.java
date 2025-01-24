package com.unionmutualproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;

public class CreateQuote extends Dashboard {
	
	@Test
	public static void createQuote() throws InterruptedException
	{
		Actions actions = new Actions(driver);
		Thread.sleep(2000);
		
		
		String selector = "new UiSelector().description(\"Open navigation menu\")";

				WebElement element = (WebElement) driver.findElement(MobileBy.AndroidUIAutomator(selector));
				element.click();
		 
		


		//actions.moveToElement(menu).click().perform();
		Thread.sleep(2000);
		WebElement quotebtn = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Get a Quote\"]"));
		quotebtn.click();
		Thread.sleep(2000);
		WebElement quotefield = driver.findElement(By.xpath("//android.widget.EditText"));
		//actions.moveToElement(quotefield).click().perform();
		
		quotefield.sendKeys("11515");
	}

}
