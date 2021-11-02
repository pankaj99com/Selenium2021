package com.DataDriven.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import SeleniumUtility.ExcelUtils;
import SeleniumUtility.TestUtil;
import SeleniumUtility.XLUtility;

public class LoginTest  {

	WebDriver driver;
	Logger log=Logger.getAnonymousLogger();

	int counter=0;
	int retryLimit=2;

	@BeforeMethod

	public void setup() {
		driver = new ChromeDriver();
		log.info("Launching chrome browser");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		log.info("waiting for page to load");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		log.info("waiting for element to load");
		driver.manage().deleteAllCookies();
		log.info("Deleting all cookies");
		driver.manage().window().maximize();
		log.info("maximizing windows");
		driver.get("https://classic.freecrm.com/login.cfm");
		log.info("Launching Free CRM  test url");

	}

	@Test(dataProvider = "login")
	public void loginTest(String name, String pwd, String res) throws IOException {
		// System.out.println(name+pwd+res);
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.clear();
		email.sendKeys(name);
		TestUtil util=new TestUtil();
		util.highLightElement(driver, email);
		log.info("Highlighting element");
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.clear();
		password.sendKeys(pwd);
		util.highLightElement(driver, password);
		log.info("Highlighting element");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String validTitle = "CRMPRO";
		String actualTitle = driver.getTitle();
		//Assert.assertEquals(validTitle, actualTitle);
		

		if (res.equals("valid")) {
			if (validTitle.equals(actualTitle)) {
				driver.switchTo().frame("mainpanel");
				
				log.info("Switching to frame");
			
				
				driver.findElement(By.linkText("Logout")).click();
				
				
				Assert.assertTrue(true);
				
				
			} else {
				Assert.assertTrue(false);
				
			}
		} else if (res.equals("invalid")) {
			if (validTitle.equals(actualTitle)) {
				
				log.info("Going to Logout");
				driver.findElement(By.linkText("Logout")).click();
				
				
				Assert.assertTrue(false);
				
			} else {
				Assert.assertTrue(true);
				
			}
		}
		
	}
	
	@DataProvider(name = "login")
	public String[][] getData() throws Exception {
//		String loginData[][] = { 
//		                          { "pankajkumar", "1234", " invalid" }, 
//		                          { "pankajk", "1223", " invalid" },
//			                      { "pank", "1223", " invalid" }, 
//		                          { "Naveenk", "test@123", "valid" } 
//		};
		
          String projectPath = System.getProperty("user.dir");
          String path=projectPath+("\\src\\com\\DataDriven\\test\\TestData.xlsx");
		  XLUtility xlutil=new XLUtility(path);
		  int totalrows=xlutil.getRowCount("sheet1");
		  int totalcols=xlutil.getCellCount("sheet1", 1);
		  String loginData[][]=new String[totalrows][totalcols];
		  for(int i=1;i<=totalrows;i++){
			  for(int j=0;j<totalcols;j++){
				  loginData[i-1][j]=xlutil.getCellData("sheet1",i,j);
				
			  }
		  }
		
		return loginData;
	}

	// @Test
	// public void logintest(String username,String password){
	// driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
	// driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
	// driver.findElement(By.xpath("//input[@type='submit']")).click();
	@AfterMethod
	public void teardown() {
		driver.close();
	}
	
}
