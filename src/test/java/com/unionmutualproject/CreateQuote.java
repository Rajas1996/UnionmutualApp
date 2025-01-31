package com.unionmutualproject;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;

public class CreateQuote extends Login {
	
	
	@Test
	public void createQuote() throws InterruptedException
	{
		//Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc=\"Open navigation menu\"]")));
		element.click();
		

		//android.widget.Button[@content-desc="Open navigation menu"]
		//ele.click();

		//actions.moveToElement(menu).click().perform();
		/*
		 * Thread.sleep(2000); WebElement quotebtn = driver.findElement(By.
		 * xpath("//android.view.View[@content-desc=\"Get a Quote\"]"));
		 * quotebtn.click(); Thread.sleep(2000); WebElement quotefield =
		 * driver.findElement(By.xpath("//android.widget.EditText"));
		 * //actions.moveToElement(quotefield).click().perform();
		 * 
		 * quotefield.sendKeys("11515");
		 */
	}

	

}
