package SeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import SeleniumUtility.TestUtil;

public class LocatorLearning {

	public static void main(String[] args) {

		WebDriver driver;

		driver = new FirefoxDriver();
		driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F");

		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);

		// 1.Xpath--priority2
		// driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Pankaj");
		// driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kumar");

		// //2.id--priority 1
		// driver.findElement(By.id("firstname")).sendKeys("Pankaj");
		// driver.findElement(By.id("lastname")).sendKeys("Kumar");
	
		// 3.name--priority 3

		driver.findElement(By.name("firstname")).sendKeys("Pannkaj");
		TestUtil.highLightElement(driver, driver.findElement(By.name("firstname")));
		driver.findElement(By.name("lastname")).sendKeys("kumar");
		TestUtil.highLightElement(driver, driver.findElement(By.name("lastname")));
		
		//4.linkText-only for links--priority 4
		//driver.findElement(By.linkText("Sign in")).click();
		
		//5.partiallinkText
		//driver.findElement(By.partialLinkText("Notice")).click();
		
		//6.CSSSelector--priority 2
		//driver.findElement(By.cssSelector("#businessaccount-radio")).click();
		
		//7.ClassName
		driver.findElement(By.className("checkbox__control")).click();
		
		
	}
}
