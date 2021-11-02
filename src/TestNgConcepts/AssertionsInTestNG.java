package TestNgConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertionsInTestNG {
	WebDriver driver;
	@BeforeMethod
	
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pankaj.kumar\\workspace\\Selenium2021\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
	}
	
	@Test(priority=1,groups="Title")
	public void titleTest() {
		
		String title=driver.getTitle();
		//Assert.assertEquals(title,"Google","Title is not mached");
		Assert.assertEquals(title,"Google123","Title is not mached");
		//java.lang.AssertionError: Title is not mached expected [Google123] but found [Google]
	}
	
	@Test(priority=3,groups="logo")
	public void logoTest() {
		boolean logo=driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		Assert.assertTrue(logo);
		Assert.assertEquals(logo, true);
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}


