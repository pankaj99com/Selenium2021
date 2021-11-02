package TestNGPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {

	@BeforeSuite // 1
	public void setup() {
		System.out.println("enter the setup");
	}

	@BeforeMethod
	public void login() {
		System.out.println("login");
	}

	@BeforeClass
	public void enterURL() {
		System.out.println("enter url");

	}

	@BeforeTest // 2
	public void launchbrowser() {
		System.out.println("launch firefox browser");
	}

	@Test
	public void googletiletest() {

		System.out.println("tile test");

	}

	@Test
	public void googletiletest1() {

		System.out.println("tile test");
	}

	@AfterMethod
	public void logout() {
		System.out.println("logout");
	}

	@AfterTest
	public void deleteallcookies() {
		System.out.println("delete all cookies");
	}

	@AfterSuite

	public void generatereport() {

		System.out.println("generate report");
	}
}
