package TestNgConcepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//Every annotations should be associated with method
public class TestNgAnnotations {
	// Preconditions annotations-starting @Before

	/*
	 * setting system properties for chrome 
	 * launch Chrome Browser 
	 * login 
	 * enter url 
	 * Google title test 
	 * logout method 
	 * closing browser 
	 * delete all cookies
	 */

	// 1
	@BeforeSuite
	public void setup() {
		System.out.println("BeforeSuite:----setting system properties for chrome ");
	}

	// 2
	@BeforeTest
	public void lauchBrowser() {
		System.out.println("BeforeTest:-----launch Chrome Browser");
	}

	// 3
	@BeforeClass
	public void login() {
		System.out.println("BeforeClass:-----login");
	}
    //4
	@BeforeMethod

	public void enterurl() {
		System.out.println("BeforeMethod:----enter url");
	}
   //5
	// test cases--starting with @Test
	@Test
	public void googleTitleTest() {
		System.out.println("Test1:-----Google title test");
	}
	
	
	@Test
	public void googlesearch() {
		System.out.println("Test2:-----Google search test");
	}
	
	@Test
	public void googlelogoTest() {
		System.out.println("Test3:-----Google logo test");
	}
//6
	// post conditions--starting with @After
	@AfterMethod
	public void logout() {

		System.out.println("AfterMethod:------logout method");
	}
	
	//7
	@AfterClass
	public void closeBrowser() {
		System.out.println("AfterClass:----closing browser");
	}
	
	//8
	@AfterTest
	public void deleteAllCookies() {
		System.out.println("AfterTest:------ delete all cookies");
	}

	
//9
	@AfterSuite
	public void generateTestReport() {
		System.out.println("AfterSuite:-----Generating reports");
	}

}
