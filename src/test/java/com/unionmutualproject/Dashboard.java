package com.unionmutualproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Dashboard extends Login {
	
	@Test
	public void DashboardPage() throws InterruptedException {
		Thread.sleep(4000);
		WebElement agent = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Agent\"]"));
		agent.click();
		if(driver.getPageSource().contains("LISA SWEENEY"))
		 {
			 System.out.println("Page loaded Successful");
		 }
		 
		 else {
			 System.out.println("Page not loaded successfully");
			 
		 }
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("android.widget.Button[@content-desc=\"Shortcuts\"]")).click();//android.widget.Button[@content-desc="Shortcuts"]
		Thread.sleep(2000);
		driver.findElement(By.xpath("android.view.View[@content-desc=\"My Claims\"]")).click();//android.view.View[@content-desc="My Claims"]
		if(driver.getPageSource().contains("U20240005"))
		 {
			 System.out.println("Claims Page loaded Successful");
		 }
		 
		 else {
			 System.out.println("Claims Page not loaded successfully");
			 
		 }
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("android.widget.Button[@content-desc=\"Shortcuts\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Policies\"]")).click();
		if(driver.getPageSource().contains("8704901950"))
		 {
			 System.out.println("Policy loaded Successful");
		 }
		 
		 else {
			 System.out.println("Policy not loaded successfully");
			 
		 }
		
		driver.navigate().back();
		
		
		
	}
	@Test
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