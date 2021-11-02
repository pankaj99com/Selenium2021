package SeleniumConcepts;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		//setting firefox profile
		ProfilesIni prof = new ProfilesIni();
		FirefoxProfile profile = prof.getProfile("PANKAJ");
		
		
		WebDriver driver = new FirefoxDriver();// launching firefox
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		if (title.equals("Google")){
			
			System.out.println("Test case passed");
			
		} else {
			
			System.out.println("Test case failed");
		}

		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElement(By.name("q")).sendKeys("Browserstack Guide");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Seleniumhq");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// String pagesource=driver.getPageSource();
		
		// System.out.println(pagesource);
		
		driver.quit();
	}
	
	

}
