package TestNgConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsGoogleTest {
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
		
		System.out.println("Title of the Page is "+driver.getTitle());
	}
	
	@Test(priority=3,groups="logo")
	public void logoTest() {
		boolean logo=driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		Assert.assertTrue(logo);
	}
	
	@Test(priority=2,groups="link")
	public void linkTest() {
		boolean link=driver.findElement(By.xpath("//a[normalize-space()='Gmail']")).isDisplayed();
		Assert.assertTrue(link);
	}
	
	@Test(priority=4,groups="Test")
	public void test1() {
		System.out.println("Test1");
	}
	@Test(priority=5,groups="Test")
	public void test2() {
		System.out.println("Test2");
	}
	@Test(priority=6,groups="Test")
	public void test3() {
		System.out.println("Test3");
	}
	@Test(priority=7,groups="Test")
	public void test4() {
		System.out.println("Test4");
	}
	@Test(priority=8,groups="Test")
	public void test5() {
		System.out.println("Test5");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
