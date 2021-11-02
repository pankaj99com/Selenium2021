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

import SeleniumUtility.XLUtility;


public class DataProviderTestWithExcel {
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
		
		XLUtility excel=new XLUtility("C:\\Users\\pankaj.kumar\\workspace\\Selenium2021\\src\\com\\DataDriven\\test\\TestData.xlsx");
		int rows=excel.getRowCount("sheet1");
		
		int cols=excel.getCellCount("sheet1", 1);
		
		String data[][]=new String[rows][cols];
		
		for(int i=1;i<=rows;i++){
			
			for(int j=0;j<cols;j++) {
				
				data[i-1][j]=excel.getCellData("sheet1",i,j);
			}
			
		}
		
		return data;
		
	}

	@AfterMethod
	public void teardown() {
		driver.close();
	}
}