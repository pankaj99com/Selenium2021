package com.DataDriven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class rough {
	WebDriver driver;
	@Test
	public void login(){
		
		driver=new ChromeDriver();
		driver.get("https://classic.freecrm.com/login.cfm");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("naveenk");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println(driver.getTitle());
		driver.switchTo().frame("mainpanel");
		
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		WebElement m = driver.findElement(By.xpath("//a"));
		System.out.println("Element identified with xpath: " +m.getText());
 		//driver.findElement(By.xpath("a[@href='https://classic.freecrm.com/index.cfm?logout=1']")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		driver.quit();

		
		
		
	}

}
