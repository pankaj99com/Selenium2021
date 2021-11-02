package TestNgConcepts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviderTestWithoutExcel {
	WebDriver driver;

	@BeforeMethod

	public void setup() {
		driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		driver.get("https://classic.freecrm.com/login.cfm");

	}

	@Test(dataProvider = "login")
	public void loginTest(String name, String pwd, String res) throws IOException {

		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.clear();
		email.sendKeys(name);

		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.clear();
		password.sendKeys(pwd);

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String validTitle = "CRMPRO";
		String actualTitle = driver.getTitle();

		if (res.equals("valid")) {
			if (validTitle.equals(actualTitle)) {
				driver.switchTo().frame("mainpanel");

				driver.findElement(By.linkText("Logout")).click();

				Assert.assertTrue(true);

			} else {
				Assert.assertTrue(false);

			}
		} else if (res.equals("invalid")) {
			if (validTitle.equals(actualTitle)) {

				driver.findElement(By.linkText("Logout")).click();

				Assert.assertTrue(false);

			} else {
				Assert.assertTrue(true);

			}
		}

	}

	@DataProvider(name = "login")
	public Object[][] getData() throws Exception {
		String loginData[][] = { { "pankajkumar", "1234", " invalid" }, { "pankajk", "1223", " invalid" },
				{ "pank", "1223", " invalid" }, { "Naveenk", "test@123", "valid" } };
		return loginData;

	}

	@AfterMethod
	public void teardown() {
		driver.close();
	}
}