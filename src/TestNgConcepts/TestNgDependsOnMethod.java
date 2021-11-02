package TestNgConcepts;

import org.testng.annotations.Test;

public class TestNgDependsOnMethod {
	
	@Test
	public void loginTest() {
//		int a=9;
//		int b=a/0;
//		System.out.println(b);
		System.out.println("Login test method");
	}
	@Test(dependsOnMethods="loginTest")
	public void HomePageTest() {
		System.out.println("Home Page method");
	}

	@Test(dependsOnMethods="loginTest")
	public void SearchPageTest() {
		System.out.println("Search Page method");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void RegPageTest() {
		System.out.println("Reg Page method");
	}
}
