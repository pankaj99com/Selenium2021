package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessBrowser {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("Headless");
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("Https://www.google.com");
		
		System.out.println(driver.getTitle());
		
		
		
		
		FirefoxOptions options1=new FirefoxOptions();
		//options1.addArguments("--Headless");
		
		options1.setHeadless(true);
		
		WebDriver driver1=new FirefoxDriver(options1);
		
		
		driver1.get("Https://www.google.com");
		System.out.println(driver1.getTitle());
		
		
	}

}
