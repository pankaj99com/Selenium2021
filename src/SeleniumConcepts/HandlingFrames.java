package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingFrames {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new FirefoxDriver();
		// driver.get("https://www.outsystems.com/p/modern-development/?utm_source=google&utm_medium=cpc&utm_campaign=Aquisition_G_APAC_Search_AppDev&utm_term=app%20development%20software&utm_content=Try-for-free&gclid=EAIaIQobChMIh6mWq8ni8gIV7JhmAh0CFQPgEAAYASAAEgLOl_D_BwE");
		driver.get("https://classic.freecrm.com/login.cfm");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("naveenk");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
	}

}
