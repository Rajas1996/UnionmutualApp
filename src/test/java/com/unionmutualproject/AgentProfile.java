package com.unionmutualproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AgentProfile extends Dashboard {
	
	@Test (priority = 4)
	public void Profile() throws InterruptedException
	{
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]")).click();
		Thread.sleep(2000);
		WebElement e1 = driver.findElement(By.xpath("//android.widget.EditText[@text=\"(603) 809-9365\"]"));
		Thread.sleep(2000);
		e1.click();
		e1.clear();
	
		Thread.sleep(2000);
		e1.sendKeys("1111111111");
		//driver.navigate().back();
	}

}
