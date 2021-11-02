package TestNGPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://www.google.com");

	}

	@Test(priority = 2,groups="google")
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	@Test(priority=1,groups="google")
	public void logoTest(){
		System.out.println(driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed());
	}

	@Test(priority = 3,groups="google")
	public void gmailtextvalidation() {
		String text = driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).getText();
		System.out.println(text);
		Assert.assertEquals(text, "mail");
	}

	@Test(priority = 4,groups="test")

	public void test1() {
		System.out.println("test1");
	}

	@Test(priority = 5,groups="test")

	public void test2() {
		System.out.println("test2");
	}

	@Test(priority = 6,groups="test")

	public void test3() {
		System.out.println("test1");
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
