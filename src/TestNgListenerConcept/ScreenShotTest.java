package TestNgListenerConcept;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomeListener.class)
public class ScreenShotTest extends Base {

	@BeforeMethod
	public void setup() {
		initialization();
		
	}
	
	@Test
	public void TakeScreenshot() {
		String actual="Google1";
		String exp=driver.getTitle();
		Assert.assertEquals(actual, exp);
	}
	@Test
	public void TakeScreenshot1() {
		String actual="Google1";
		String exp=driver.getTitle();
		Assert.assertEquals(actual, exp);
	}
	
	@Test
	public void TakeScreenshot2() {
		String actual="Google1";
		String exp=driver.getTitle();
		Assert.assertEquals(actual, exp);
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
