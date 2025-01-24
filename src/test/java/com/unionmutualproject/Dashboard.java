package com.unionmutualproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Dashboard extends Login {
	
	@Test (priority = 2)
	public void DashboardPage() throws InterruptedException {
		Thread.sleep(4000);
		WebElement slider = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View"));

	    for (int i = 1; i <= 2 ; i++) {
	            slider.sendKeys(Keys.ARROW_RIGHT);
	    }
		
	            
		WebElement agent = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Agent\"]"));
		agent.click();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("LISA SWEENEY"))
		 {
			 System.out.println("Page loaded Successful");
		 }
		 
		 else {
			 System.out.println("Page not loaded successfully");
			 
		 }
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		
		
		/*WebElement shortcut = driver.findElement(By.xpath("android.widget.Button[@content-desc=\"Shortcuts\"]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", shortcut);
		Thread.sleep(3000);
		WebElement claims = driver.findElement(By.xpath("android.view.View[@content-desc=\"My Claims\"]"));
		claims.click();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("U20240005"))
		 {
			 System.out.println("Claims Page loaded Successful");
		 }
		 
		 else {
			 System.out.println("Claims Page not loaded successfully");
			 
		 }
		driver.navigate().back();
		Thread.sleep(2000);
		shortcut.click();
		Thread.sleep(3000);
		WebElement policies = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Policies\"]"));
		policies.click();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("8704901950"))
		 {
			 System.out.println("Policy loaded Successful");
		 }
		 
		 else {
			 System.out.println("Policy not loaded successfully");
			 
		 }
		
		driver.navigate().back();
		*/
		
		
		}
	@Test (priority = 3)
	public void Transaction() throws InterruptedException {
		Thread.sleep(2000);
		if(driver.getPageSource().contains("INV00004313"))
		 {
			 System.out.println("Transactions loaded Successful");
		 }
		 
		 else {
			 System.out.println("Transactions not loaded successfully");
		
		
	}

}}