package TestNgConcepts;

import org.testng.annotations.Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {
	static SoftAssert softAssert=new SoftAssert();
	
	@Test
	public static void setup() {
		System.out.println("open browser");
		
		softAssert.assertEquals(true, true);
		System.out.println("enter username");
		System.out.println("enter password");
		System.out.println("click o signing button");
		
		
		softAssert.assertEquals(true, true);
		System.out.println("validate home page");
		softAssert.assertEquals(true,false,"validation of home page failed");
		
		System.out.println("got to deal page");
		System.out.println("create deal");
		softAssert.assertEquals(true,false,"Unable to create deal");
		
		System.out.println("go to contact page");
		System.out.println("create contact");
		softAssert.assertEquals(true,false,"Unable to create contact");
		softAssert.assertAll();
	}

}
