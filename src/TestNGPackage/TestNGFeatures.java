package TestNGPackage;

import org.testng.annotations.Test;

public class TestNGFeatures {
	@Test
	public void loginTest() {
		System.out.println("Login test");
		//int i=9/0;
	}

	@Test(dependsOnMethods = "loginTest")
	public void homepageTest() {
		System.out.println("Home page test");

	}
	
	@Test(dependsOnMethods = "loginTest")
	public void searchPage(){
		
		System.out.println(" search page test");
	}
}
