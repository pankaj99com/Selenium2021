package ListenerDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerDemo.TestNGListner.class)
public class MyFirstTestcase {

	@Test
	public void GoogleTitleverify() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com");
		System.out.println("Google tile is:---> "+ driver.getTitle());
		driver.close();

	}
	
	@Test
	public void TitleVerify(){
		
		System.out.println("Test dummy Test");
		Assert.assertTrue(false);
	}
}
